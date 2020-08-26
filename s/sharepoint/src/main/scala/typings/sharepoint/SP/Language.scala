package typings.sharepoint.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Language extends ClientValueObject {
  def get_displayName(): String = js.native
  def get_languageTag(): String = js.native
  def get_lcid(): Double = js.native
}

object Language {
  @scala.inline
  def apply(
    customFromJson: js.Any => Boolean,
    customWriteToXml: (XmlWriter, SerializationContext) => Boolean,
    fromJson: js.Any => Unit,
    get_displayName: () => String,
    get_languageTag: () => String,
    get_lcid: () => Double,
    get_typeId: () => String,
    writeToXml: (XmlWriter, SerializationContext) => Unit
  ): Language = {
    val __obj = js.Dynamic.literal(customFromJson = js.Any.fromFunction1(customFromJson), customWriteToXml = js.Any.fromFunction2(customWriteToXml), fromJson = js.Any.fromFunction1(fromJson), get_displayName = js.Any.fromFunction0(get_displayName), get_languageTag = js.Any.fromFunction0(get_languageTag), get_lcid = js.Any.fromFunction0(get_lcid), get_typeId = js.Any.fromFunction0(get_typeId), writeToXml = js.Any.fromFunction2(writeToXml))
    __obj.asInstanceOf[Language]
  }
  @scala.inline
  implicit class LanguageOps[Self <: Language] (val x: Self) extends AnyVal {
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
    def setGet_displayName(value: () => String): Self = this.set("get_displayName", js.Any.fromFunction0(value))
    @scala.inline
    def setGet_languageTag(value: () => String): Self = this.set("get_languageTag", js.Any.fromFunction0(value))
    @scala.inline
    def setGet_lcid(value: () => Double): Self = this.set("get_lcid", js.Any.fromFunction0(value))
  }
  
}

