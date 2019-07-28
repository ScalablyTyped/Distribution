package typings.atPulumiAws.ec2Mod

import typings.atPulumiAws.ec2EipMod.EipArgs
import typings.atPulumiAws.ec2EipMod.EipState
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/ec2", "Eip")
@js.native
class Eip protected ()
  extends typings.atPulumiAws.ec2EipMod.Eip {
  /**
    * Create a Eip resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String) = this()
  def this(name: String, args: EipArgs) = this()
  def this(name: String, args: EipArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/ec2", "Eip")
@js.native
object Eip extends js.Object {
  /**
    * Get an existing Eip resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): typings.atPulumiAws.ec2EipMod.Eip = js.native
  def get(name: String, id: Input[ID], state: EipState): typings.atPulumiAws.ec2EipMod.Eip = js.native
  def get(name: String, id: Input[ID], state: EipState, opts: CustomResourceOptions): typings.atPulumiAws.ec2EipMod.Eip = js.native
  /**
    * Returns true if the given object is an instance of Eip.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/eip.Eip */ Boolean = js.native
}

