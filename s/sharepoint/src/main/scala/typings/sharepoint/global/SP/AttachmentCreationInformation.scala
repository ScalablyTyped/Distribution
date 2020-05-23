package typings.sharepoint.global.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.AttachmentCreationInformation")
@js.native
class AttachmentCreationInformation ()
  extends typings.sharepoint.SP.AttachmentCreationInformation {
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
  override def get_contentStream(): typings.sharepoint.SP.Base64EncodedByteArray = js.native
  /* CompleteClass */
  override def get_fileName(): String = js.native
  /* CompleteClass */
  override def get_typeId(): String = js.native
  /* CompleteClass */
  override def set_contentStream(value: typings.sharepoint.SP.Base64EncodedByteArray): Unit = js.native
  /* CompleteClass */
  override def set_fileName(value: String): Unit = js.native
  /* CompleteClass */
  override def writeToXml(
    writer: typings.sharepoint.SP.XmlWriter,
    serializationContext: typings.sharepoint.SP.SerializationContext
  ): Unit = js.native
}

