package typings.pulumiAws.rdsSecurityGroupMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.rds.SecurityGroupIngress
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/rds/securityGroup", "SecurityGroup")
@js.native
class SecurityGroup protected () extends CustomResource {
  /**
    * Create a SecurityGroup resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: SecurityGroupArgs) = this()
  def this(name: String, args: SecurityGroupArgs, opts: CustomResourceOptions) = this()
  /**
    * The arn of the DB security group.
    */
  val arn: Output_[String] = js.native
  /**
    * The description of the DB security group. Defaults to "Managed by Pulumi".
    */
  val description: Output_[String] = js.native
  /**
    * A list of ingress rules.
    */
  val ingress: Output_[js.Array[SecurityGroupIngress]] = js.native
  /**
    * The name of the DB security group.
    */
  val name: Output_[String] = js.native
  /**
    * A map of tags to assign to the resource.
    */
  val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
}

/* static members */
@JSImport("@pulumi/aws/rds/securityGroup", "SecurityGroup")
@js.native
object SecurityGroup extends js.Object {
  /**
    * Get an existing SecurityGroup resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): SecurityGroup = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): SecurityGroup = js.native
  def get(name: String, id: Input[ID], state: SecurityGroupState): SecurityGroup = js.native
  def get(name: String, id: Input[ID], state: SecurityGroupState, opts: CustomResourceOptions): SecurityGroup = js.native
  /**
    * Returns true if the given object is an instance of SecurityGroup.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/rds/securityGroup.SecurityGroup */ Boolean = js.native
}

