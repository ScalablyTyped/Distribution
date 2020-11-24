package typings.pulumiAws.recorderMod

import typings.pulumiAws.outputMod.cfg.RecorderRecordingGroup
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/cfg/recorder", "Recorder")
@js.native
class Recorder protected () extends CustomResource {
  /**
    * Create a Recorder resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: RecorderArgs) = this()
  def this(name: String, args: RecorderArgs, opts: CustomResourceOptions) = this()
  
  /**
    * The name of the recorder. Defaults to `default`. Changing it recreates the resource.
    */
  val name: Output_[String] = js.native
  
  /**
    * Recording group - see below.
    */
  val recordingGroup: Output_[RecorderRecordingGroup] = js.native
  
  /**
    * Amazon Resource Name (ARN) of the IAM role. Used to make read or write requests to the delivery channel and to describe the AWS resources associated with the account. See [AWS Docs](http://docs.aws.amazon.com/config/latest/developerguide/iamrole-permissions.html) for more details.
    */
  val roleArn: Output_[String] = js.native
}
/* static members */
@JSImport("@pulumi/aws/cfg/recorder", "Recorder")
@js.native
object Recorder extends js.Object {
  
  /**
    * Get an existing Recorder resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): Recorder = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): Recorder = js.native
  def get(name: String, id: Input[ID], state: RecorderState): Recorder = js.native
  def get(name: String, id: Input[ID], state: RecorderState, opts: CustomResourceOptions): Recorder = js.native
  
  /**
    * Returns true if the given object is an instance of Recorder.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cfg/recorder.Recorder */ Boolean = js.native
}
