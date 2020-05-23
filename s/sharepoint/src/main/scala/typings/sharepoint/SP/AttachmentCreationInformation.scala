package typings.sharepoint.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AttachmentCreationInformation extends ClientValueObject {
  def get_contentStream(): Base64EncodedByteArray
  def get_fileName(): String
  def set_contentStream(value: Base64EncodedByteArray): Unit
  def set_fileName(value: String): Unit
}

object AttachmentCreationInformation {
  @scala.inline
  def apply(
    customFromJson: js.Any => Boolean,
    customWriteToXml: (XmlWriter, SerializationContext) => Boolean,
    fromJson: js.Any => Unit,
    get_contentStream: () => Base64EncodedByteArray,
    get_fileName: () => String,
    get_typeId: () => String,
    set_contentStream: Base64EncodedByteArray => Unit,
    set_fileName: String => Unit,
    writeToXml: (XmlWriter, SerializationContext) => Unit
  ): AttachmentCreationInformation = {
    val __obj = js.Dynamic.literal(customFromJson = js.Any.fromFunction1(customFromJson), customWriteToXml = js.Any.fromFunction2(customWriteToXml), fromJson = js.Any.fromFunction1(fromJson), get_contentStream = js.Any.fromFunction0(get_contentStream), get_fileName = js.Any.fromFunction0(get_fileName), get_typeId = js.Any.fromFunction0(get_typeId), set_contentStream = js.Any.fromFunction1(set_contentStream), set_fileName = js.Any.fromFunction1(set_fileName), writeToXml = js.Any.fromFunction2(writeToXml))
    __obj.asInstanceOf[AttachmentCreationInformation]
  }
}

