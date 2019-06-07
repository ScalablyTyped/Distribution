package typings
package atPulumiAwsLib.rdsRoleAssociationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/rds/roleAssociation", "RoleAssociation")
@js.native
class RoleAssociation protected ()
  extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
  /**
    * Create a RoleAssociation resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: RoleAssociationArgs) = this()
  def this(name: java.lang.String, args: RoleAssociationArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  /**
    * DB Instance Identifier to associate with the IAM Role.
    */
  val dbInstanceIdentifier: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * Name of the feature for association. This can be found in the AWS documentation relevant to the integration or a full list is available in the `SupportedFeatureNames` list returned by [AWS CLI rds describe-db-engine-versions](https://docs.aws.amazon.com/cli/latest/reference/rds/describe-db-engine-versions.html).
    */
  val featureName: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * Amazon Resource Name (ARN) of the IAM Role to associate with the DB Instance.
    */
  val roleArn: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
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
  def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.rdsRoleAssociationMod.RoleAssociation = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.rdsRoleAssociationMod.RoleAssociationState
  ): atPulumiAwsLib.rdsRoleAssociationMod.RoleAssociation = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.rdsRoleAssociationMod.RoleAssociationState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.rdsRoleAssociationMod.RoleAssociation = js.native
  /**
    * Returns true if the given object is an instance of RoleAssociation.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/rds/roleAssociation.RoleAssociation */ scala.Boolean = js.native
}

