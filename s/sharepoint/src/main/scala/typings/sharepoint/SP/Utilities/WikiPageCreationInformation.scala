package typings.sharepoint.SP.Utilities

import typings.sharepoint.SP.ClientValueObject
import typings.sharepoint.SP.SerializationContext
import typings.sharepoint.SP.XmlWriter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WikiPageCreationInformation extends ClientValueObject {
  def get_serverRelativeUrl(): String = js.native
  def get_wikiHtmlContent(): String = js.native
  def set_serverRelativeUrl(value: String): Unit = js.native
  def set_wikiHtmlContent(value: String): Unit = js.native
}

object WikiPageCreationInformation {
  @scala.inline
  def apply(
    customFromJson: js.Any => Boolean,
    customWriteToXml: (XmlWriter, SerializationContext) => Boolean,
    fromJson: js.Any => Unit,
    get_serverRelativeUrl: () => String,
    get_typeId: () => String,
    get_wikiHtmlContent: () => String,
    set_serverRelativeUrl: String => Unit,
    set_wikiHtmlContent: String => Unit,
    writeToXml: (XmlWriter, SerializationContext) => Unit
  ): WikiPageCreationInformation = {
    val __obj = js.Dynamic.literal(customFromJson = js.Any.fromFunction1(customFromJson), customWriteToXml = js.Any.fromFunction2(customWriteToXml), fromJson = js.Any.fromFunction1(fromJson), get_serverRelativeUrl = js.Any.fromFunction0(get_serverRelativeUrl), get_typeId = js.Any.fromFunction0(get_typeId), get_wikiHtmlContent = js.Any.fromFunction0(get_wikiHtmlContent), set_serverRelativeUrl = js.Any.fromFunction1(set_serverRelativeUrl), set_wikiHtmlContent = js.Any.fromFunction1(set_wikiHtmlContent), writeToXml = js.Any.fromFunction2(writeToXml))
    __obj.asInstanceOf[WikiPageCreationInformation]
  }
  @scala.inline
  implicit class WikiPageCreationInformationOps[Self <: WikiPageCreationInformation] (val x: Self) extends AnyVal {
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
    def setGet_serverRelativeUrl(value: () => String): Self = this.set("get_serverRelativeUrl", js.Any.fromFunction0(value))
    @scala.inline
    def setGet_wikiHtmlContent(value: () => String): Self = this.set("get_wikiHtmlContent", js.Any.fromFunction0(value))
    @scala.inline
    def setSet_serverRelativeUrl(value: String => Unit): Self = this.set("set_serverRelativeUrl", js.Any.fromFunction1(value))
    @scala.inline
    def setSet_wikiHtmlContent(value: String => Unit): Self = this.set("set_wikiHtmlContent", js.Any.fromFunction1(value))
  }
  
}

