package typings.pulumiAws.videoStreamMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VideoStreamArgs extends js.Object {
  /**
    * The number of hours that you want to retain the data in the stream. Kinesis Video Streams retains the data in a data store that is associated with the stream. The default value is `0`, indicating that the stream does not persist data.
    */
  val dataRetentionInHours: js.UndefOr[Input[Double]] = js.native
  /**
    * The name of the device that is writing to the stream. **In the current implementation, Kinesis Video Streams does not use this name.**
    */
  val deviceName: js.UndefOr[Input[String]] = js.native
  /**
    * The ID of the AWS Key Management Service (AWS KMS) key that you want Kinesis Video Streams to use to encrypt stream data. If no key ID is specified, the default, Kinesis Video-managed key (`aws/kinesisvideo`) is used.
    */
  val kmsKeyId: js.UndefOr[Input[String]] = js.native
  /**
    * The media type of the stream. Consumers of the stream can use this information when processing the stream. For more information about media types, see [Media Types][2]. If you choose to specify the MediaType, see [Naming Requirements][3] for guidelines.
    */
  val mediaType: js.UndefOr[Input[String]] = js.native
  /**
    * A name to identify the stream. This is unique to the
    * AWS account and region the Stream is created in.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
}

object VideoStreamArgs {
  @scala.inline
  def apply(
    dataRetentionInHours: Input[Double] = null,
    deviceName: Input[String] = null,
    kmsKeyId: Input[String] = null,
    mediaType: Input[String] = null,
    name: Input[String] = null,
    tags: Input[StringDictionary[_]] = null
  ): VideoStreamArgs = {
    val __obj = js.Dynamic.literal()
    if (dataRetentionInHours != null) __obj.updateDynamic("dataRetentionInHours")(dataRetentionInHours.asInstanceOf[js.Any])
    if (deviceName != null) __obj.updateDynamic("deviceName")(deviceName.asInstanceOf[js.Any])
    if (kmsKeyId != null) __obj.updateDynamic("kmsKeyId")(kmsKeyId.asInstanceOf[js.Any])
    if (mediaType != null) __obj.updateDynamic("mediaType")(mediaType.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoStreamArgs]
  }
}

