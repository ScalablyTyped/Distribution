package typings.sharepoint.global.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.WebResponseInfo")
@js.native
class WebResponseInfo ()
  extends typings.sharepoint.SP.WebResponseInfo {
  /* CompleteClass */
  override def customFromJson(obj: js.Any): Boolean = js.native
  /* CompleteClass */
  override def customWriteToXml(
    writer: typings.sharepoint.SP.XmlWriter,
    serializationContext: typings.sharepoint.SP.SerializationContext
  ): Boolean = js.native
  /* CompleteClass */
  override def fromJson(obj: js.Any): Unit = js.native
  /* CompleteClass */
  override def get_body(): String = js.native
  /* CompleteClass */
  override def get_headers(): js.Any = js.native
  /* CompleteClass */
  override def get_statusCode(): Double = js.native
  /* CompleteClass */
  override def get_typeId(): String = js.native
  /* CompleteClass */
  override def set_body(value: String): Unit = js.native
  /* CompleteClass */
  override def set_headers(value: js.Any): Unit = js.native
  /* CompleteClass */
  override def set_statusCode(value: Double): Unit = js.native
  /* CompleteClass */
  override def writeToXml(
    writer: typings.sharepoint.SP.XmlWriter,
    serializationContext: typings.sharepoint.SP.SerializationContext
  ): Unit = js.native
}

