package typings.sharepoint.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RelatedItem
  extends StObject
     with ClientValueObject {
  
  def get_iconUrl(): String
  
  def get_itemId(): Double
  
  def get_listId(): String
  
  def get_title(): String
  
  def get_url(): String
  
  def get_webId(): String
  
  def set_iconUrl(value: String): Unit
  
  def set_itemId(value: Double): Unit
  
  def set_listId(value: String): Unit
  
  def set_title(value: String): Unit
  
  def set_url(value: String): Unit
  
  def set_webId(value: String): Unit
}
object RelatedItem {
  
  inline def apply(
    customFromJson: js.Any => Boolean,
    customWriteToXml: (XmlWriter, SerializationContext) => Boolean,
    fromJson: js.Any => Unit,
    get_iconUrl: () => String,
    get_itemId: () => Double,
    get_listId: () => String,
    get_title: () => String,
    get_typeId: () => String,
    get_url: () => String,
    get_webId: () => String,
    set_iconUrl: String => Unit,
    set_itemId: Double => Unit,
    set_listId: String => Unit,
    set_title: String => Unit,
    set_url: String => Unit,
    set_webId: String => Unit,
    writeToXml: (XmlWriter, SerializationContext) => Unit
  ): RelatedItem = {
    val __obj = js.Dynamic.literal(customFromJson = js.Any.fromFunction1(customFromJson), customWriteToXml = js.Any.fromFunction2(customWriteToXml), fromJson = js.Any.fromFunction1(fromJson), get_iconUrl = js.Any.fromFunction0(get_iconUrl), get_itemId = js.Any.fromFunction0(get_itemId), get_listId = js.Any.fromFunction0(get_listId), get_title = js.Any.fromFunction0(get_title), get_typeId = js.Any.fromFunction0(get_typeId), get_url = js.Any.fromFunction0(get_url), get_webId = js.Any.fromFunction0(get_webId), set_iconUrl = js.Any.fromFunction1(set_iconUrl), set_itemId = js.Any.fromFunction1(set_itemId), set_listId = js.Any.fromFunction1(set_listId), set_title = js.Any.fromFunction1(set_title), set_url = js.Any.fromFunction1(set_url), set_webId = js.Any.fromFunction1(set_webId), writeToXml = js.Any.fromFunction2(writeToXml))
    __obj.asInstanceOf[RelatedItem]
  }
  
  extension [Self <: RelatedItem](x: Self) {
    
    inline def setGet_iconUrl(value: () => String): Self = StObject.set(x, "get_iconUrl", js.Any.fromFunction0(value))
    
    inline def setGet_itemId(value: () => Double): Self = StObject.set(x, "get_itemId", js.Any.fromFunction0(value))
    
    inline def setGet_listId(value: () => String): Self = StObject.set(x, "get_listId", js.Any.fromFunction0(value))
    
    inline def setGet_title(value: () => String): Self = StObject.set(x, "get_title", js.Any.fromFunction0(value))
    
    inline def setGet_url(value: () => String): Self = StObject.set(x, "get_url", js.Any.fromFunction0(value))
    
    inline def setGet_webId(value: () => String): Self = StObject.set(x, "get_webId", js.Any.fromFunction0(value))
    
    inline def setSet_iconUrl(value: String => Unit): Self = StObject.set(x, "set_iconUrl", js.Any.fromFunction1(value))
    
    inline def setSet_itemId(value: Double => Unit): Self = StObject.set(x, "set_itemId", js.Any.fromFunction1(value))
    
    inline def setSet_listId(value: String => Unit): Self = StObject.set(x, "set_listId", js.Any.fromFunction1(value))
    
    inline def setSet_title(value: String => Unit): Self = StObject.set(x, "set_title", js.Any.fromFunction1(value))
    
    inline def setSet_url(value: String => Unit): Self = StObject.set(x, "set_url", js.Any.fromFunction1(value))
    
    inline def setSet_webId(value: String => Unit): Self = StObject.set(x, "set_webId", js.Any.fromFunction1(value))
  }
}
