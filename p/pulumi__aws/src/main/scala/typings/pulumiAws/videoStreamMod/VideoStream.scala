package typings.pulumiAws.videoStreamMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/kinesis/videoStream", "VideoStream")
@js.native
class VideoStream protected () extends CustomResource {
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
  /**
    * The Amazon Resource Name (ARN) specifying the Stream (same as `id`)
    */
  val arn: Output_[String] = js.native
  /**
    * A time stamp that indicates when the stream was created.
    */
  val creationTime: Output_[String] = js.native
  /**
    * The number of hours that you want to retain the data in the stream. Kinesis Video Streams retains the data in a data store that is associated with the stream. The default value is `0`, indicating that the stream does not persist data.
    */
  val dataRetentionInHours: Output_[js.UndefOr[Double]] = js.native
  /**
    * The name of the device that is writing to the stream. **In the current implementation, Kinesis Video Streams does not use this name.**
    */
  val deviceName: Output_[js.UndefOr[String]] = js.native
  /**
    * The ID of the AWS Key Management Service (AWS KMS) key that you want Kinesis Video Streams to use to encrypt stream data. If no key ID is specified, the default, Kinesis Video-managed key (`aws/kinesisvideo`) is used.
    */
  val kmsKeyId: Output_[String] = js.native
  /**
    * The media type of the stream. Consumers of the stream can use this information when processing the stream. For more information about media types, see [Media Types](http://www.iana.org/assignments/media-types/media-types.xhtml). If you choose to specify the MediaType, see [Naming Requirements](https://tools.ietf.org/html/rfc6838#section-4.2) for guidelines.
    */
  val mediaType: Output_[js.UndefOr[String]] = js.native
  /**
    * A name to identify the stream. This is unique to the
    * AWS account and region the Stream is created in.
    */
  val name: Output_[String] = js.native
  /**
    * A map of tags to assign to the resource.
    */
  val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
  /**
    * The version of the stream.
    */
  val version: Output_[String] = js.native
}

/* static members */
@JSImport("@pulumi/aws/kinesis/videoStream", "VideoStream")
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
  def get(name: String, id: Input[ID]): VideoStream = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): VideoStream = js.native
  def get(name: String, id: Input[ID], state: VideoStreamState): VideoStream = js.native
  def get(name: String, id: Input[ID], state: VideoStreamState, opts: CustomResourceOptions): VideoStream = js.native
  /**
    * Returns true if the given object is an instance of VideoStream.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/kinesis/videoStream.VideoStream */ Boolean = js.native
}

