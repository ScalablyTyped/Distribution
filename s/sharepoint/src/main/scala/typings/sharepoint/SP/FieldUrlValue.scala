package typings.sharepoint.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FieldUrlValue extends ClientValueObject {
  def get_description(): String = js.native
  def get_url(): String = js.native
  def set_description(value: String): Unit = js.native
  def set_url(value: String): Unit = js.native
}

object FieldUrlValue {
  @scala.inline
  def apply(
    customFromJson: js.Any => Boolean,
    customWriteToXml: (XmlWriter, SerializationContext) => Boolean,
    fromJson: js.Any => Unit,
    get_description: () => String,
    get_typeId: () => String,
    get_url: () => String,
    set_description: String => Unit,
    set_url: String => Unit,
    writeToXml: (XmlWriter, SerializationContext) => Unit
  ): FieldUrlValue = {
    val __obj = js.Dynamic.literal(customFromJson = js.Any.fromFunction1(customFromJson), customWriteToXml = js.Any.fromFunction2(customWriteToXml), fromJson = js.Any.fromFunction1(fromJson), get_description = js.Any.fromFunction0(get_description), get_typeId = js.Any.fromFunction0(get_typeId), get_url = js.Any.fromFunction0(get_url), set_description = js.Any.fromFunction1(set_description), set_url = js.Any.fromFunction1(set_url), writeToXml = js.Any.fromFunction2(writeToXml))
    __obj.asInstanceOf[FieldUrlValue]
  }
  @scala.inline
  implicit class FieldUrlValueOps[Self <: FieldUrlValue] (val x: Self) extends AnyVal {
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
    def setGet_url(value: () => String): Self = this.set("get_url", js.Any.fromFunction0(value))
    @scala.inline
    def setSet_description(value: String => Unit): Self = this.set("set_description", js.Any.fromFunction1(value))
    @scala.inline
    def setSet_url(value: String => Unit): Self = this.set("set_url", js.Any.fromFunction1(value))
  }
  
}

