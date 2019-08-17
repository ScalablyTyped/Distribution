package typings.rsocketDashCore.rSocketEncodingMod

import typings.rsocketDashTypes.reactiveSocketTypesMod.Encodable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Encoders[T /* <: Encodable */] extends js.Object {
  var data: Encoder[T]
  var dataMimeType: Encoder[String]
  var message: Encoder[String]
  var metadata: Encoder[T]
  var metadataMimeType: Encoder[String]
  var resumeToken: Encoder[T]
}

object Encoders {
  @scala.inline
  def apply[T /* <: Encodable */](
    data: Encoder[T],
    dataMimeType: Encoder[String],
    message: Encoder[String],
    metadata: Encoder[T],
    metadataMimeType: Encoder[String],
    resumeToken: Encoder[T]
  ): Encoders[T] = {
    val __obj = js.Dynamic.literal(data = data, dataMimeType = dataMimeType, message = message, metadata = metadata, metadataMimeType = metadataMimeType, resumeToken = resumeToken)
  
    __obj.asInstanceOf[Encoders[T]]
  }
}

