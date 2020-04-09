package typings.pulumiAws.videoStreamMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VideoStreamState extends js.Object {
  /**
    * The Amazon Resource Name (ARN) specifying the Stream (same as `id`)
    */
  val arn: js.UndefOr[Input[String]] = js.native
  /**
    * A time stamp that indicates when the stream was created.
    */
  val creationTime: js.UndefOr[Input[String]] = js.native
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
  /**
    * The version of the stream.
    */
  val version: js.UndefOr[Input[String]] = js.native
}

object VideoStreamState {
  @scala.inline
  def apply(
    arn: Input[String] = null,
    creationTime: Input[String] = null,
    dataRetentionInHours: Input[Double] = null,
    deviceName: Input[String] = null,
    kmsKeyId: Input[String] = null,
    mediaType: Input[String] = null,
    name: Input[String] = null,
    tags: Input[StringDictionary[_]] = null,
    version: Input[String] = null
  ): VideoStreamState = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (creationTime != null) __obj.updateDynamic("creationTime")(creationTime.asInstanceOf[js.Any])
    if (dataRetentionInHours != null) __obj.updateDynamic("dataRetentionInHours")(dataRetentionInHours.asInstanceOf[js.Any])
    if (deviceName != null) __obj.updateDynamic("deviceName")(deviceName.asInstanceOf[js.Any])
    if (kmsKeyId != null) __obj.updateDynamic("kmsKeyId")(kmsKeyId.asInstanceOf[js.Any])
    if (mediaType != null) __obj.updateDynamic("mediaType")(mediaType.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoStreamState]
  }
}

