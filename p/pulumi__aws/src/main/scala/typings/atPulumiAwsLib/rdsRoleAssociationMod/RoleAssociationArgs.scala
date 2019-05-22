package typings
package atPulumiAwsLib.rdsRoleAssociationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RoleAssociationArgs extends js.Object {
  /**
    * DB Instance Identifier to associate with the IAM Role.
    */
  val dbInstanceIdentifier: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * Name of the feature for association. This can be found in the AWS documentation relevant to the integration or a full list is available in the `SupportedFeatureNames` list returned by [AWS CLI rds describe-db-engine-versions](https://docs.aws.amazon.com/cli/latest/reference/rds/describe-db-engine-versions.html).
    */
  val featureName: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * Amazon Resource Name (ARN) of the IAM Role to associate with the DB Instance.
    */
  val roleArn: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

object RoleAssociationArgs {
  @scala.inline
  def apply(
    dbInstanceIdentifier: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    featureName: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    roleArn: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  ): RoleAssociationArgs = {
    val __obj = js.Dynamic.literal(dbInstanceIdentifier = dbInstanceIdentifier.asInstanceOf[js.Any], featureName = featureName.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RoleAssociationArgs]
  }
}

