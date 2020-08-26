package typings.sharepoint.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebCreationInformation extends ClientValueObject {
  def get_description(): String = js.native
  def get_language(): Double = js.native
  def get_title(): String = js.native
  def get_url(): String = js.native
  def get_useSamePermissionsAsParentSite(): Boolean = js.native
  def get_webTemplate(): String = js.native
  def set_description(value: String): Unit = js.native
  def set_language(value: Double): Unit = js.native
  def set_title(value: String): Unit = js.native
  def set_url(value: String): Unit = js.native
  def set_useSamePermissionsAsParentSite(value: Boolean): Unit = js.native
  def set_webTemplate(value: String): Unit = js.native
}

object WebCreationInformation {
  @scala.inline
  def apply(
    customFromJson: js.Any => Boolean,
    customWriteToXml: (XmlWriter, SerializationContext) => Boolean,
    fromJson: js.Any => Unit,
    get_description: () => String,
    get_language: () => Double,
    get_title: () => String,
    get_typeId: () => String,
    get_url: () => String,
    get_useSamePermissionsAsParentSite: () => Boolean,
    get_webTemplate: () => String,
    set_description: String => Unit,
    set_language: Double => Unit,
    set_title: String => Unit,
    set_url: String => Unit,
    set_useSamePermissionsAsParentSite: Boolean => Unit,
    set_webTemplate: String => Unit,
    writeToXml: (XmlWriter, SerializationContext) => Unit
  ): WebCreationInformation = {
    val __obj = js.Dynamic.literal(customFromJson = js.Any.fromFunction1(customFromJson), customWriteToXml = js.Any.fromFunction2(customWriteToXml), fromJson = js.Any.fromFunction1(fromJson), get_description = js.Any.fromFunction0(get_description), get_language = js.Any.fromFunction0(get_language), get_title = js.Any.fromFunction0(get_title), get_typeId = js.Any.fromFunction0(get_typeId), get_url = js.Any.fromFunction0(get_url), get_useSamePermissionsAsParentSite = js.Any.fromFunction0(get_useSamePermissionsAsParentSite), get_webTemplate = js.Any.fromFunction0(get_webTemplate), set_description = js.Any.fromFunction1(set_description), set_language = js.Any.fromFunction1(set_language), set_title = js.Any.fromFunction1(set_title), set_url = js.Any.fromFunction1(set_url), set_useSamePermissionsAsParentSite = js.Any.fromFunction1(set_useSamePermissionsAsParentSite), set_webTemplate = js.Any.fromFunction1(set_webTemplate), writeToXml = js.Any.fromFunction2(writeToXml))
    __obj.asInstanceOf[WebCreationInformation]
  }
  @scala.inline
  implicit class WebCreationInformationOps[Self <: WebCreationInformation] (val x: Self) extends AnyVal {
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
    def setGet_language(value: () => Double): Self = this.set("get_language", js.Any.fromFunction0(value))
    @scala.inline
    def setGet_title(value: () => String): Self = this.set("get_title", js.Any.fromFunction0(value))
    @scala.inline
    def setGet_url(value: () => String): Self = this.set("get_url", js.Any.fromFunction0(value))
    @scala.inline
    def setGet_useSamePermissionsAsParentSite(value: () => Boolean): Self = this.set("get_useSamePermissionsAsParentSite", js.Any.fromFunction0(value))
    @scala.inline
    def setGet_webTemplate(value: () => String): Self = this.set("get_webTemplate", js.Any.fromFunction0(value))
    @scala.inline
    def setSet_description(value: String => Unit): Self = this.set("set_description", js.Any.fromFunction1(value))
    @scala.inline
    def setSet_language(value: Double => Unit): Self = this.set("set_language", js.Any.fromFunction1(value))
    @scala.inline
    def setSet_title(value: String => Unit): Self = this.set("set_title", js.Any.fromFunction1(value))
    @scala.inline
    def setSet_url(value: String => Unit): Self = this.set("set_url", js.Any.fromFunction1(value))
    @scala.inline
    def setSet_useSamePermissionsAsParentSite(value: Boolean => Unit): Self = this.set("set_useSamePermissionsAsParentSite", js.Any.fromFunction1(value))
    @scala.inline
    def setSet_webTemplate(value: String => Unit): Self = this.set("set_webTemplate", js.Any.fromFunction1(value))
  }
  
}

