package typings.sharepoint.Microsoft.SharePoint.Client.Search.Query

import typings.sharepoint.SP.ClientValueObject
import typings.sharepoint.SP.SerializationContext
import typings.sharepoint.SP.XmlWriter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PersonalResultSuggestion
  extends StObject
     with ClientValueObject {
  
  def get_highlightedTitle(): String
  
  def get_isBestBet(): Boolean
  
  def get_title(): String
  
  def get_url(): String
  
  def set_highlightedTitle(value: String): Unit
  
  def set_isBestBet(value: Boolean): Unit
  
  def set_title(value: String): Unit
  
  def set_url(value: String): Unit
}
object PersonalResultSuggestion {
  
  inline def apply(
    customFromJson: Any => Boolean,
    customWriteToXml: (XmlWriter, SerializationContext) => Boolean,
    fromJson: Any => Unit,
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
  implicit open class MutableBuilder[Self <: PersonalResultSuggestion] (val x: Self) extends AnyVal {
    
    inline def setGet_highlightedTitle(value: () => String): Self = StObject.set(x, "get_highlightedTitle", js.Any.fromFunction0(value))
    
    inline def setGet_isBestBet(value: () => Boolean): Self = StObject.set(x, "get_isBestBet", js.Any.fromFunction0(value))
    
    inline def setGet_title(value: () => String): Self = StObject.set(x, "get_title", js.Any.fromFunction0(value))
    
    inline def setGet_url(value: () => String): Self = StObject.set(x, "get_url", js.Any.fromFunction0(value))
    
    inline def setSet_highlightedTitle(value: String => Unit): Self = StObject.set(x, "set_highlightedTitle", js.Any.fromFunction1(value))
    
    inline def setSet_isBestBet(value: Boolean => Unit): Self = StObject.set(x, "set_isBestBet", js.Any.fromFunction1(value))
    
    inline def setSet_title(value: String => Unit): Self = StObject.set(x, "set_title", js.Any.fromFunction1(value))
    
    inline def setSet_url(value: String => Unit): Self = StObject.set(x, "set_url", js.Any.fromFunction1(value))
  }
}
