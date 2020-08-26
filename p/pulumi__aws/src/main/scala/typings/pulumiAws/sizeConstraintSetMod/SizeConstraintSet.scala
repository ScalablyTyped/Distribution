package typings.pulumiAws.sizeConstraintSetMod

import typings.pulumiAws.outputMod.wafregional.SizeConstraintSetSizeConstraint
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/wafregional/sizeConstraintSet", "SizeConstraintSet")
@js.native
class SizeConstraintSet protected () extends CustomResource {
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
  val arn: Output_[String] = js.native
  /**
    * The name or description of the Size Constraint Set.
    */
  val name: Output_[String] = js.native
  /**
    * Specifies the parts of web requests that you want to inspect the size of.
    */
  val sizeConstraints: Output_[js.UndefOr[js.Array[SizeConstraintSetSizeConstraint]]] = js.native
}

/* static members */
@JSImport("@pulumi/aws/wafregional/sizeConstraintSet", "SizeConstraintSet")
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
  def get(name: String, id: Input[ID]): SizeConstraintSet = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): SizeConstraintSet = js.native
  def get(name: String, id: Input[ID], state: SizeConstraintSetState): SizeConstraintSet = js.native
  def get(name: String, id: Input[ID], state: SizeConstraintSetState, opts: CustomResourceOptions): SizeConstraintSet = js.native
  /**
    * Returns true if the given object is an instance of SizeConstraintSet.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/wafregional/sizeConstraintSet.SizeConstraintSet */ Boolean = js.native
}

