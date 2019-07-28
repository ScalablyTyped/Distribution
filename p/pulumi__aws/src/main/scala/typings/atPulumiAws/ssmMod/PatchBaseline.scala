package typings.atPulumiAws.ssmMod

import typings.atPulumiAws.ssmPatchBaselineMod.PatchBaselineArgs
import typings.atPulumiAws.ssmPatchBaselineMod.PatchBaselineState
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/ssm", "PatchBaseline")
@js.native
class PatchBaseline protected ()
  extends typings.atPulumiAws.ssmPatchBaselineMod.PatchBaseline {
  /**
    * Create a PatchBaseline resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String) = this()
  def this(name: String, args: PatchBaselineArgs) = this()
  def this(name: String, args: PatchBaselineArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/ssm", "PatchBaseline")
@js.native
object PatchBaseline extends js.Object {
  /**
    * Get an existing PatchBaseline resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): typings.atPulumiAws.ssmPatchBaselineMod.PatchBaseline = js.native
  def get(name: String, id: Input[ID], state: PatchBaselineState): typings.atPulumiAws.ssmPatchBaselineMod.PatchBaseline = js.native
  def get(name: String, id: Input[ID], state: PatchBaselineState, opts: CustomResourceOptions): typings.atPulumiAws.ssmPatchBaselineMod.PatchBaseline = js.native
  /**
    * Returns true if the given object is an instance of PatchBaseline.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ssm/patchBaseline.PatchBaseline */ Boolean = js.native
}

