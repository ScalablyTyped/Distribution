package typings.pulumiAws.kinesisMod

import typings.pulumiAws.videoStreamMod.VideoStreamArgs
import typings.pulumiAws.videoStreamMod.VideoStreamState
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/kinesis", "VideoStream")
@js.native
class VideoStream protected ()
  extends typings.pulumiAws.videoStreamMod.VideoStream {
  /**
    * Create a VideoStream resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String) = this()
  def this(name: String, args: VideoStreamArgs) = this()
  def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
  def this(name: String, args: VideoStreamArgs, opts: CustomResourceOptions) = this()
}
/* static members */
@JSImport("@pulumi/aws/kinesis", "VideoStream")
@js.native
object VideoStream extends js.Object {
  
  /**
    * Get an existing VideoStream resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): typings.pulumiAws.videoStreamMod.VideoStream = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.videoStreamMod.VideoStream = js.native
  def get(name: String, id: Input[ID], state: VideoStreamState): typings.pulumiAws.videoStreamMod.VideoStream = js.native
  def get(name: String, id: Input[ID], state: VideoStreamState, opts: CustomResourceOptions): typings.pulumiAws.videoStreamMod.VideoStream = js.native
  
  /**
    * Returns true if the given object is an instance of VideoStream.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/kinesis/videoStream.VideoStream */ Boolean = js.native
}
