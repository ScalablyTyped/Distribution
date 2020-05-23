package typings.sharepoint.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileSaveBinaryInformation extends ClientValueObject {
  def get_checkRequiredFields(): Boolean
  def get_content(): Base64EncodedByteArray
  def get_eTag(): String
  def get_fieldValues(): js.Any
  def set_checkRequiredFields(value: Boolean): Unit
  def set_content(value: Base64EncodedByteArray): Unit
  def set_eTag(value: String): Unit
  def set_fieldValues(value: js.Any): Unit
}

object FileSaveBinaryInformation {
  @scala.inline
  def apply(
    customFromJson: js.Any => Boolean,
    customWriteToXml: (XmlWriter, SerializationContext) => Boolean,
    fromJson: js.Any => Unit,
    get_checkRequiredFields: () => Boolean,
    get_content: () => Base64EncodedByteArray,
    get_eTag: () => String,
    get_fieldValues: () => js.Any,
    get_typeId: () => String,
    set_checkRequiredFields: Boolean => Unit,
    set_content: Base64EncodedByteArray => Unit,
    set_eTag: String => Unit,
    set_fieldValues: js.Any => Unit,
    writeToXml: (XmlWriter, SerializationContext) => Unit
  ): FileSaveBinaryInformation = {
    val __obj = js.Dynamic.literal(customFromJson = js.Any.fromFunction1(customFromJson), customWriteToXml = js.Any.fromFunction2(customWriteToXml), fromJson = js.Any.fromFunction1(fromJson), get_checkRequiredFields = js.Any.fromFunction0(get_checkRequiredFields), get_content = js.Any.fromFunction0(get_content), get_eTag = js.Any.fromFunction0(get_eTag), get_fieldValues = js.Any.fromFunction0(get_fieldValues), get_typeId = js.Any.fromFunction0(get_typeId), set_checkRequiredFields = js.Any.fromFunction1(set_checkRequiredFields), set_content = js.Any.fromFunction1(set_content), set_eTag = js.Any.fromFunction1(set_eTag), set_fieldValues = js.Any.fromFunction1(set_fieldValues), writeToXml = js.Any.fromFunction2(writeToXml))
    __obj.asInstanceOf[FileSaveBinaryInformation]
  }
}

