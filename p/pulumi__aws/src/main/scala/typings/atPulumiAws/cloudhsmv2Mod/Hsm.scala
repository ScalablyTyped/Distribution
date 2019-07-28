package typings.atPulumiAws.cloudhsmv2Mod

import typings.atPulumiAws.cloudhsmv2HsmMod.HsmArgs
import typings.atPulumiAws.cloudhsmv2HsmMod.HsmState
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/cloudhsmv2", "Hsm")
@js.native
class Hsm protected ()
  extends typings.atPulumiAws.cloudhsmv2HsmMod.Hsm {
  /**
    * Create a Hsm resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: HsmArgs) = this()
  def this(name: String, args: HsmArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/cloudhsmv2", "Hsm")
@js.native
object Hsm extends js.Object {
  /**
    * Get an existing Hsm resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): typings.atPulumiAws.cloudhsmv2HsmMod.Hsm = js.native
  def get(name: String, id: Input[ID], state: HsmState): typings.atPulumiAws.cloudhsmv2HsmMod.Hsm = js.native
  def get(name: String, id: Input[ID], state: HsmState, opts: CustomResourceOptions): typings.atPulumiAws.cloudhsmv2HsmMod.Hsm = js.native
  /**
    * Returns true if the given object is an instance of Hsm.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cloudhsmv2/hsm.Hsm */ Boolean = js.native
}

