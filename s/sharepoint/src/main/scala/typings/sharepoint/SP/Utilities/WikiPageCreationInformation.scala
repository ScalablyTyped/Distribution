package typings.sharepoint.SP.Utilities

import typings.sharepoint.SP.ClientValueObject
import typings.sharepoint.SP.SerializationContext
import typings.sharepoint.SP.XmlWriter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WikiPageCreationInformation
  extends StObject
     with ClientValueObject {
  
  def get_serverRelativeUrl(): String
  
  def get_wikiHtmlContent(): String
  
  def set_serverRelativeUrl(value: String): Unit
  
  def set_wikiHtmlContent(value: String): Unit
}
object WikiPageCreationInformation {
  
  inline def apply(
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
  
  extension [Self <: WikiPageCreationInformation](x: Self) {
    
    inline def setGet_serverRelativeUrl(value: () => String): Self = StObject.set(x, "get_serverRelativeUrl", js.Any.fromFunction0(value))
    
    inline def setGet_wikiHtmlContent(value: () => String): Self = StObject.set(x, "get_wikiHtmlContent", js.Any.fromFunction0(value))
    
    inline def setSet_serverRelativeUrl(value: String => Unit): Self = StObject.set(x, "set_serverRelativeUrl", js.Any.fromFunction1(value))
    
    inline def setSet_wikiHtmlContent(value: String => Unit): Self = StObject.set(x, "set_wikiHtmlContent", js.Any.fromFunction1(value))
  }
}
