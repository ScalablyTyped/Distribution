package typings.pulumiAws.mod.wafregional

import typings.pulumiAws.sizeConstraintSetMod.SizeConstraintSetArgs
import typings.pulumiAws.sizeConstraintSetMod.SizeConstraintSetState
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "wafregional.SizeConstraintSet")
@js.native
class SizeConstraintSet protected ()
  extends typings.pulumiAws.wafregionalMod.SizeConstraintSet {
  /**
    * Create a SizeConstraintSet resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String) = this()
  def this(name: String, args: SizeConstraintSetArgs) = this()
  def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
  def this(name: String, args: SizeConstraintSetArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws", "wafregional.SizeConstraintSet")
@js.native
object SizeConstraintSet extends js.Object {
  /**
    * Get an existing SizeConstraintSet resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): typings.pulumiAws.sizeConstraintSetMod.SizeConstraintSet = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.sizeConstraintSetMod.SizeConstraintSet = js.native
  def get(name: String, id: Input[ID], state: SizeConstraintSetState): typings.pulumiAws.sizeConstraintSetMod.SizeConstraintSet = js.native
  def get(name: String, id: Input[ID], state: SizeConstraintSetState, opts: CustomResourceOptions): typings.pulumiAws.sizeConstraintSetMod.SizeConstraintSet = js.native
  /**
    * Returns true if the given object is an instance of SizeConstraintSet.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/wafregional/sizeConstraintSet.SizeConstraintSet */ Boolean = js.native
}

