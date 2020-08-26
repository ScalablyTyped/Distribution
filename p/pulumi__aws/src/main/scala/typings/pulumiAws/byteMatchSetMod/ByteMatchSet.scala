package typings.pulumiAws.byteMatchSetMod

import typings.pulumiAws.outputMod.wafregional.ByteMatchSetByteMatchTuple
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/wafregional/byteMatchSet", "ByteMatchSet")
@js.native
class ByteMatchSet protected () extends CustomResource {
  /**
    * Create a ByteMatchSet resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String) = this()
  def this(name: String, args: ByteMatchSetArgs) = this()
  def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
  def this(name: String, args: ByteMatchSetArgs, opts: CustomResourceOptions) = this()
  /**
    * Settings for the ByteMatchSet, such as the bytes (typically a string that corresponds with ASCII characters) that you want AWS WAF to search for in web requests. ByteMatchTuple documented below.
    */
  val byteMatchTuples: Output_[js.UndefOr[js.Array[ByteMatchSetByteMatchTuple]]] = js.native
  /**
    * The name or description of the ByteMatchSet.
    */
  val name: Output_[String] = js.native
}

/* static members */
@JSImport("@pulumi/aws/wafregional/byteMatchSet", "ByteMatchSet")
@js.native
object ByteMatchSet extends js.Object {
  /**
    * Get an existing ByteMatchSet resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): ByteMatchSet = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): ByteMatchSet = js.native
  def get(name: String, id: Input[ID], state: ByteMatchSetState): ByteMatchSet = js.native
  def get(name: String, id: Input[ID], state: ByteMatchSetState, opts: CustomResourceOptions): ByteMatchSet = js.native
  /**
    * Returns true if the given object is an instance of ByteMatchSet.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/wafregional/byteMatchSet.ByteMatchSet */ Boolean = js.native
}

