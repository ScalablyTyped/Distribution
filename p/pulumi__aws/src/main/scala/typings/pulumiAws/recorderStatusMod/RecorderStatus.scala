package typings.pulumiAws.recorderStatusMod

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/cfg/recorderStatus", "RecorderStatus")
@js.native
class RecorderStatus protected () extends CustomResource {
  /**
    * Create a RecorderStatus resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: RecorderStatusArgs) = this()
  def this(name: String, args: RecorderStatusArgs, opts: CustomResourceOptions) = this()
  /**
    * Whether the configuration recorder should be enabled or disabled.
    */
  val isEnabled: Output_[Boolean] = js.native
  /**
    * The name of the recorder
    */
  val name: Output_[String] = js.native
}

/* static members */
@JSImport("@pulumi/aws/cfg/recorderStatus", "RecorderStatus")
@js.native
object RecorderStatus extends js.Object {
  /**
    * Get an existing RecorderStatus resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): RecorderStatus = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): RecorderStatus = js.native
  def get(name: String, id: Input[ID], state: RecorderStatusState): RecorderStatus = js.native
  def get(name: String, id: Input[ID], state: RecorderStatusState, opts: CustomResourceOptions): RecorderStatus = js.native
  /**
    * Returns true if the given object is an instance of RecorderStatus.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cfg/recorderStatus.RecorderStatus */ Boolean = js.native
}

