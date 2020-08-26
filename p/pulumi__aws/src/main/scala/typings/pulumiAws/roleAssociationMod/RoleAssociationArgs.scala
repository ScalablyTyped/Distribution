package typings.pulumiAws.roleAssociationMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RoleAssociationArgs extends js.Object {
  /**
    * DB Instance Identifier to associate with the IAM Role.
    */
  val dbInstanceIdentifier: Input[String] = js.native
  /**
    * Name of the feature for association. This can be found in the AWS documentation relevant to the integration or a full list is available in the `SupportedFeatureNames` list returned by [AWS CLI rds describe-db-engine-versions](https://docs.aws.amazon.com/cli/latest/reference/rds/describe-db-engine-versions.html).
    */
  val featureName: Input[String] = js.native
  /**
    * Amazon Resource Name (ARN) of the IAM Role to associate with the DB Instance.
    */
  val roleArn: Input[String] = js.native
}

object RoleAssociationArgs {
  @scala.inline
  def apply(dbInstanceIdentifier: Input[String], featureName: Input[String], roleArn: Input[String]): RoleAssociationArgs = {
    val __obj = js.Dynamic.literal(dbInstanceIdentifier = dbInstanceIdentifier.asInstanceOf[js.Any], featureName = featureName.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[RoleAssociationArgs]
  }
  @scala.inline
  implicit class RoleAssociationArgsOps[Self <: RoleAssociationArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDbInstanceIdentifier(value: Input[String]): Self = this.set("dbInstanceIdentifier", value.asInstanceOf[js.Any])
    @scala.inline
    def setFeatureName(value: Input[String]): Self = this.set("featureName", value.asInstanceOf[js.Any])
    @scala.inline
    def setRoleArn(value: Input[String]): Self = this.set("roleArn", value.asInstanceOf[js.Any])
  }
  
}

