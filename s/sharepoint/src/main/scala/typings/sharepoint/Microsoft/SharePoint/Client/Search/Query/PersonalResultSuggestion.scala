package typings.sharepoint.Microsoft.SharePoint.Client.Search.Query

import typings.sharepoint.SP.ClientValueObject
import typings.sharepoint.SP.SerializationContext
import typings.sharepoint.SP.XmlWriter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PersonalResultSuggestion extends ClientValueObject {
  
  def get_highlightedTitle(): String = js.native
  
  def get_isBestBet(): Boolean = js.native
  
  def get_title(): String = js.native
  
  def get_url(): String = js.native
  
  def set_highlightedTitle(value: String): Unit = js.native
  
  def set_isBestBet(value: Boolean): Unit = js.native
  
  def set_title(value: String): Unit = js.native
  
  def set_url(value: String): Unit = js.native
}
object PersonalResultSuggestion {
  
  @scala.inline
  def apply(
    customFromJson: js.Any => Boolean,
    customWriteToXml: (XmlWriter, SerializationContext) => Boolean,
    fromJson: js.Any => Unit,
    get_highlightedTitle: () => String,
    get_isBestBet: () => Boolean,
    get_title: () => String,
    get_typeId: () => String,
    get_url: () => String,
    set_highlightedTitle: String => Unit,
    set_isBestBet: Boolean => Unit,
    set_title: String => Unit,
    set_url: String => Unit,
    writeToXml: (XmlWriter, SerializationContext) => Unit
  ): PersonalResultSuggestion = {
    val __obj = js.Dynamic.literal(customFromJson = js.Any.fromFunction1(customFromJson), customWriteToXml = js.Any.fromFunction2(customWriteToXml), fromJson = js.Any.fromFunction1(fromJson), get_highlightedTitle = js.Any.fromFunction0(get_highlightedTitle), get_isBestBet = js.Any.fromFunction0(get_isBestBet), get_title = js.Any.fromFunction0(get_title), get_typeId = js.Any.fromFunction0(get_typeId), get_url = js.Any.fromFunction0(get_url), set_highlightedTitle = js.Any.fromFunction1(set_highlightedTitle), set_isBestBet = js.Any.fromFunction1(set_isBestBet), set_title = js.Any.fromFunction1(set_title), set_url = js.Any.fromFunction1(set_url), writeToXml = js.Any.fromFunction2(writeToXml))
    __obj.asInstanceOf[PersonalResultSuggestion]
  }
  
  @scala.inline
  implicit class PersonalResultSuggestionOps[Self <: PersonalResultSuggestion] (val x: Self) extends AnyVal {
    
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
    def setGet_highlightedTitle(value: () => String): Self = this.set("get_highlightedTitle", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_isBestBet(value: () => Boolean): Self = this.set("get_isBestBet", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_title(value: () => String): Self = this.set("get_title", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_url(value: () => String): Self = this.set("get_url", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSet_highlightedTitle(value: String => Unit): Self = this.set("set_highlightedTitle", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSet_isBestBet(value: Boolean => Unit): Self = this.set("set_isBestBet", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSet_title(value: String => Unit): Self = this.set("set_title", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSet_url(value: String => Unit): Self = this.set("set_url", js.Any.fromFunction1(value))
  }
}
