package typings.rsocketCore.rsocketencodingMod

import typings.rsocketTypes.reactiveSocketTypesMod.Encodable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Encoders[T /* <: Encodable */] extends js.Object {
  var data: Encoder[T] = js.native
  var dataMimeType: Encoder[String] = js.native
  var message: Encoder[String] = js.native
  var metadata: Encoder[T] = js.native
  var metadataMimeType: Encoder[String] = js.native
  var resumeToken: Encoder[T] = js.native
}

object Encoders {
  @scala.inline
  def apply[/* <: typings.rsocketTypes.reactiveSocketTypesMod.Encodable */ T](
    data: Encoder[T],
    dataMimeType: Encoder[String],
    message: Encoder[String],
    metadata: Encoder[T],
    metadataMimeType: Encoder[String],
    resumeToken: Encoder[T]
  ): Encoders[T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], dataMimeType = dataMimeType.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], metadataMimeType = metadataMimeType.asInstanceOf[js.Any], resumeToken = resumeToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[Encoders[T]]
  }
  @scala.inline
  implicit class EncodersOps[Self <: Encoders[_], /* <: typings.rsocketTypes.reactiveSocketTypesMod.Encodable */ T] (val x: Self with Encoders[T]) extends AnyVal {
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
    def setData(value: Encoder[T]): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setDataMimeType(value: Encoder[String]): Self = this.set("dataMimeType", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessage(value: Encoder[String]): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def setMetadata(value: Encoder[T]): Self = this.set("metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def setMetadataMimeType(value: Encoder[String]): Self = this.set("metadataMimeType", value.asInstanceOf[js.Any])
    @scala.inline
    def setResumeToken(value: Encoder[T]): Self = this.set("resumeToken", value.asInstanceOf[js.Any])
  }
  
}

