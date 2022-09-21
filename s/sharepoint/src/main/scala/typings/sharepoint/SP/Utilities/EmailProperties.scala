package typings.sharepoint.SP.Utilities

import typings.sharepoint.SP.ClientValueObject
import typings.sharepoint.SP.SerializationContext
import typings.sharepoint.SP.XmlWriter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EmailProperties
  extends StObject
     with ClientValueObject {
  
  def get_additionalHeaders(): Any
  
  def get_bCC(): js.Array[String]
  
  def get_body(): String
  
  def get_cC(): js.Array[String]
  
  def get_from(): String
  
  def get_subject(): String
  
  def get_to(): js.Array[String]
  
  def set_additionalHeaders(value: Any): Unit
  
  def set_bCC(value: js.Array[String]): Unit
  
  def set_body(value: String): Unit
  
  def set_cC(value: js.Array[String]): Unit
  
  def set_from(value: String): Unit
  
  def set_subject(value: String): Unit
  
  def set_to(value: js.Array[String]): Unit
}
object EmailProperties {
  
  inline def apply(
    customFromJson: Any => Boolean,
    customWriteToXml: (XmlWriter, SerializationContext) => Boolean,
    fromJson: Any => Unit,
    get_additionalHeaders: () => Any,
    get_bCC: () => js.Array[String],
    get_body: () => String,
    get_cC: () => js.Array[String],
    get_from: () => String,
    get_subject: () => String,
    get_to: () => js.Array[String],
    get_typeId: () => String,
    set_additionalHeaders: Any => Unit,
    set_bCC: js.Array[String] => Unit,
    set_body: String => Unit,
    set_cC: js.Array[String] => Unit,
    set_from: String => Unit,
    set_subject: String => Unit,
    set_to: js.Array[String] => Unit,
    writeToXml: (XmlWriter, SerializationContext) => Unit
  ): EmailProperties = {
    val __obj = js.Dynamic.literal(customFromJson = js.Any.fromFunction1(customFromJson), customWriteToXml = js.Any.fromFunction2(customWriteToXml), fromJson = js.Any.fromFunction1(fromJson), get_additionalHeaders = js.Any.fromFunction0(get_additionalHeaders), get_bCC = js.Any.fromFunction0(get_bCC), get_body = js.Any.fromFunction0(get_body), get_cC = js.Any.fromFunction0(get_cC), get_from = js.Any.fromFunction0(get_from), get_subject = js.Any.fromFunction0(get_subject), get_to = js.Any.fromFunction0(get_to), get_typeId = js.Any.fromFunction0(get_typeId), set_additionalHeaders = js.Any.fromFunction1(set_additionalHeaders), set_bCC = js.Any.fromFunction1(set_bCC), set_body = js.Any.fromFunction1(set_body), set_cC = js.Any.fromFunction1(set_cC), set_from = js.Any.fromFunction1(set_from), set_subject = js.Any.fromFunction1(set_subject), set_to = js.Any.fromFunction1(set_to), writeToXml = js.Any.fromFunction2(writeToXml))
    __obj.asInstanceOf[EmailProperties]
  }
  
  extension [Self <: EmailProperties](x: Self) {
    
    inline def setGet_additionalHeaders(value: () => Any): Self = StObject.set(x, "get_additionalHeaders", js.Any.fromFunction0(value))
    
    inline def setGet_bCC(value: () => js.Array[String]): Self = StObject.set(x, "get_bCC", js.Any.fromFunction0(value))
    
    inline def setGet_body(value: () => String): Self = StObject.set(x, "get_body", js.Any.fromFunction0(value))
    
    inline def setGet_cC(value: () => js.Array[String]): Self = StObject.set(x, "get_cC", js.Any.fromFunction0(value))
    
    inline def setGet_from(value: () => String): Self = StObject.set(x, "get_from", js.Any.fromFunction0(value))
    
    inline def setGet_subject(value: () => String): Self = StObject.set(x, "get_subject", js.Any.fromFunction0(value))
    
    inline def setGet_to(value: () => js.Array[String]): Self = StObject.set(x, "get_to", js.Any.fromFunction0(value))
    
    inline def setSet_additionalHeaders(value: Any => Unit): Self = StObject.set(x, "set_additionalHeaders", js.Any.fromFunction1(value))
    
    inline def setSet_bCC(value: js.Array[String] => Unit): Self = StObject.set(x, "set_bCC", js.Any.fromFunction1(value))
    
    inline def setSet_body(value: String => Unit): Self = StObject.set(x, "set_body", js.Any.fromFunction1(value))
    
    inline def setSet_cC(value: js.Array[String] => Unit): Self = StObject.set(x, "set_cC", js.Any.fromFunction1(value))
    
    inline def setSet_from(value: String => Unit): Self = StObject.set(x, "set_from", js.Any.fromFunction1(value))
    
    inline def setSet_subject(value: String => Unit): Self = StObject.set(x, "set_subject", js.Any.fromFunction1(value))
    
    inline def setSet_to(value: js.Array[String] => Unit): Self = StObject.set(x, "set_to", js.Any.fromFunction1(value))
  }
}
