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
    * The media type of the stream. Consumers of the stream can use this information when processing the stream. For more information about media types, see [Media Types](http://www.iana.org/assignments/media-types/media-types.xhtml). If you choose to specify the MediaType, see [Naming Requirements](https://tools.ietf.org/html/rfc6838#section-4.2) for guidelines.
    */
  val mediaType: js.UndefOr[Input[String]] = js.native
  /**
    * A name to identify the stream. This is unique to the
    * AWS account and region the Stream is created in.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * A map of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
}

object VideoStreamArgs {
  @scala.inline
  def apply(): VideoStreamArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VideoStreamArgs]
  }
  @scala.inline
  implicit class VideoStreamArgsOps[Self <: VideoStreamArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDataRetentionInHours(value: Input[Double]): Self = this.set("dataRetentionInHours", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataRetentionInHours: Self = this.set("dataRetentionInHours", js.undefined)
    @scala.inline
    def setDeviceName(value: Input[String]): Self = this.set("deviceName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeviceName: Self = this.set("deviceName", js.undefined)
    @scala.inline
    def setKmsKeyId(value: Input[String]): Self = this.set("kmsKeyId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKmsKeyId: Self = this.set("kmsKeyId", js.undefined)
    @scala.inline
    def setMediaType(value: Input[String]): Self = this.set("mediaType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMediaType: Self = this.set("mediaType", js.undefined)
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
  
}

