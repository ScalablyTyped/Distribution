package typings.atPulumiAws.rdsRoleAssociationMod

import typings.atPulumiPulumi.atPulumiPulumiMod.CustomResource
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.outputMod.Output
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/rds/roleAssociation", "RoleAssociation")
@js.native
class RoleAssociation protected () extends CustomResource {
  /**
    * Create a RoleAssociation resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: RoleAssociationArgs) = this()
  def this(name: String, args: RoleAssociationArgs, opts: CustomResourceOptions) = this()
  /**
    * DB Instance Identifier to associate with the IAM Role.
    */
  val dbInstanceIdentifier: Output[String] = js.native
  /**
    * Name of the feature for association. This can be found in the AWS documentation relevant to the integration or a full list is available in the `SupportedFeatureNames` list returned by [AWS CLI rds describe-db-engine-versions](https://docs.aws.amazon.com/cli/latest/reference/rds/describe-db-engine-versions.html).
    */
  val featureName: Output[String] = js.native
  /**
    * Amazon Resource Name (ARN) of the IAM Role to associate with the DB Instance.
    */
  val roleArn: Output[String] = js.native
}

/* static members */
@JSImport("@pulumi/aws/rds/roleAssociation", "RoleAssociation")
@js.native
object RoleAssociation extends js.Object {
  /**
    * Get an existing RoleAssociation resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): RoleAssociation = js.native
  def get(name: String, id: Input[ID], state: RoleAssociationState): RoleAssociation = js.native
  def get(name: String, id: Input[ID], state: RoleAssociationState, opts: CustomResourceOptions): RoleAssociation = js.native
  /**
    * Returns true if the given object is an instance of RoleAssociation.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/rds/roleAssociation.RoleAssociation */ Boolean = js.native
}

