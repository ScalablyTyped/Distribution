package typings.sharepoint.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContentTypeCreationInformation extends ClientValueObject {
  def get_description(): String
  def get_group(): String
  def get_name(): String
  def get_parentContentType(): ContentType
  def set_description(value: String): Unit
  def set_group(value: String): Unit
  def set_name(value: String): Unit
  def set_parentContentType(value: ContentType): Unit
}

object ContentTypeCreationInformation {
  @scala.inline
  def apply(
    customFromJson: js.Any => Boolean,
    customWriteToXml: (XmlWriter, SerializationContext) => Boolean,
    fromJson: js.Any => Unit,
    get_description: () => String,
    get_group: () => String,
    get_name: () => String,
    get_parentContentType: () => ContentType,
    get_typeId: () => String,
    set_description: String => Unit,
    set_group: String => Unit,
    set_name: String => Unit,
    set_parentContentType: ContentType => Unit,
    writeToXml: (XmlWriter, SerializationContext) => Unit
  ): ContentTypeCreationInformation = {
    val __obj = js.Dynamic.literal(customFromJson = js.Any.fromFunction1(customFromJson), customWriteToXml = js.Any.fromFunction2(customWriteToXml), fromJson = js.Any.fromFunction1(fromJson), get_description = js.Any.fromFunction0(get_description), get_group = js.Any.fromFunction0(get_group), get_name = js.Any.fromFunction0(get_name), get_parentContentType = js.Any.fromFunction0(get_parentContentType), get_typeId = js.Any.fromFunction0(get_typeId), set_description = js.Any.fromFunction1(set_description), set_group = js.Any.fromFunction1(set_group), set_name = js.Any.fromFunction1(set_name), set_parentContentType = js.Any.fromFunction1(set_parentContentType), writeToXml = js.Any.fromFunction2(writeToXml))
    __obj.asInstanceOf[ContentTypeCreationInformation]
  }
}

