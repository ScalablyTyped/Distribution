package typings.pulumiAws.mod.ec2

import typings.pulumiAws.securityGroupMod.SecurityGroupArgs
import typings.pulumiAws.securityGroupMod.SecurityGroupState
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "ec2.SecurityGroup")
@js.native
class SecurityGroup protected ()
  extends typings.pulumiAws.ec2Mod.SecurityGroup {
  /**
    * Create a SecurityGroup resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String) = this()
  def this(name: String, args: SecurityGroupArgs) = this()
  def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
  def this(name: String, args: SecurityGroupArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws", "ec2.SecurityGroup")
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
  def get(name: String, id: Input[ID]): typings.pulumiAws.securityGroupMod.SecurityGroup = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.securityGroupMod.SecurityGroup = js.native
  def get(name: String, id: Input[ID], state: SecurityGroupState): typings.pulumiAws.securityGroupMod.SecurityGroup = js.native
  def get(name: String, id: Input[ID], state: SecurityGroupState, opts: CustomResourceOptions): typings.pulumiAws.securityGroupMod.SecurityGroup = js.native
  /**
    * Returns true if the given object is an instance of SecurityGroup.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/securityGroup.SecurityGroup */ Boolean = js.native
}

