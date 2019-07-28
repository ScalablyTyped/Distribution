package typings.atPulumiAws.wafSizeConstraintSetMod

import typings.atPulumiAws.Anon_ComparisonOperatorFieldToMatch
import typings.atPulumiPulumi.atPulumiPulumiMod.CustomResource
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.outputMod.Output
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/waf/sizeConstraintSet", "SizeConstraintSet")
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
  def this(name: String, args: SizeConstraintSetArgs, opts: CustomResourceOptions) = this()
  /**
    * The name or description of the Size Constraint Set.
    */
  val name: Output[String] = js.native
  /**
    * Specifies the parts of web requests that you want to inspect the size of.
    */
  val sizeConstraints: Output[js.UndefOr[js.Array[Anon_ComparisonOperatorFieldToMatch]]] = js.native
}

/* static members */
@JSImport("@pulumi/aws/waf/sizeConstraintSet", "SizeConstraintSet")
@js.native
object SizeConstraintSet extends js.Object {
  /**
    * Get an existing SizeConstraintSet resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): SizeConstraintSet = js.native
  def get(name: String, id: Input[ID], state: SizeConstraintSetState): SizeConstraintSet = js.native
  def get(name: String, id: Input[ID], state: SizeConstraintSetState, opts: CustomResourceOptions): SizeConstraintSet = js.native
  /**
    * Returns true if the given object is an instance of SizeConstraintSet.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/waf/sizeConstraintSet.SizeConstraintSet */ Boolean = js.native
}

