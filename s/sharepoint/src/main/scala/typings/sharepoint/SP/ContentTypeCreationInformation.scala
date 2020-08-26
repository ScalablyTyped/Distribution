package typings.sharepoint.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContentTypeCreationInformation extends ClientValueObject {
  def get_description(): String = js.native
  def get_group(): String = js.native
  def get_name(): String = js.native
  def get_parentContentType(): ContentType = js.native
  def set_description(value: String): Unit = js.native
  def set_group(value: String): Unit = js.native
  def set_name(value: String): Unit = js.native
  def set_parentContentType(value: ContentType): Unit = js.native
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
  @scala.inline
  implicit class ContentTypeCreationInformationOps[Self <: ContentTypeCreationInformation] (val x: Self) extends AnyVal {
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
    def setGet_description(value: () => String): Self = this.set("get_description", js.Any.fromFunction0(value))
    @scala.inline
    def setGet_group(value: () => String): Self = this.set("get_group", js.Any.fromFunction0(value))
    @scala.inline
    def setGet_name(value: () => String): Self = this.set("get_name", js.Any.fromFunction0(value))
    @scala.inline
    def setGet_parentContentType(value: () => ContentType): Self = this.set("get_parentContentType", js.Any.fromFunction0(value))
    @scala.inline
    def setSet_description(value: String => Unit): Self = this.set("set_description", js.Any.fromFunction1(value))
    @scala.inline
    def setSet_group(value: String => Unit): Self = this.set("set_group", js.Any.fromFunction1(value))
    @scala.inline
    def setSet_name(value: String => Unit): Self = this.set("set_name", js.Any.fromFunction1(value))
    @scala.inline
    def setSet_parentContentType(value: ContentType => Unit): Self = this.set("set_parentContentType", js.Any.fromFunction1(value))
  }
  
}

