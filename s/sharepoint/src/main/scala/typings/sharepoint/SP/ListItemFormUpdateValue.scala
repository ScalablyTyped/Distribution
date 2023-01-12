package typings.sharepoint.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListItemFormUpdateValue
  extends StObject
     with ClientValueObject {
  
  def get_errorMessage(): String
  
  def get_fieldName(): String
  
  def get_fieldValue(): String
  
  def get_hasException(): Boolean
  
  def set_errorMessage(value: String): Unit
  
  def set_fieldName(value: String): Unit
  
  def set_fieldValue(value: String): Unit
  
  def set_hasException(value: Boolean): Unit
}
object ListItemFormUpdateValue {
  
  inline def apply(
    customFromJson: Any => Boolean,
    customWriteToXml: (XmlWriter, SerializationContext) => Boolean,
    fromJson: Any => Unit,
    get_errorMessage: () => String,
    get_fieldName: () => String,
    get_fieldValue: () => String,
    get_hasException: () => Boolean,
    get_typeId: () => String,
    set_errorMessage: String => Unit,
    set_fieldName: String => Unit,
    set_fieldValue: String => Unit,
    set_hasException: Boolean => Unit,
    writeToXml: (XmlWriter, SerializationContext) => Unit
  ): ListItemFormUpdateValue = {
    val __obj = js.Dynamic.literal(customFromJson = js.Any.fromFunction1(customFromJson), customWriteToXml = js.Any.fromFunction2(customWriteToXml), fromJson = js.Any.fromFunction1(fromJson), get_errorMessage = js.Any.fromFunction0(get_errorMessage), get_fieldName = js.Any.fromFunction0(get_fieldName), get_fieldValue = js.Any.fromFunction0(get_fieldValue), get_hasException = js.Any.fromFunction0(get_hasException), get_typeId = js.Any.fromFunction0(get_typeId), set_errorMessage = js.Any.fromFunction1(set_errorMessage), set_fieldName = js.Any.fromFunction1(set_fieldName), set_fieldValue = js.Any.fromFunction1(set_fieldValue), set_hasException = js.Any.fromFunction1(set_hasException), writeToXml = js.Any.fromFunction2(writeToXml))
    __obj.asInstanceOf[ListItemFormUpdateValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListItemFormUpdateValue] (val x: Self) extends AnyVal {
    
    inline def setGet_errorMessage(value: () => String): Self = StObject.set(x, "get_errorMessage", js.Any.fromFunction0(value))
    
    inline def setGet_fieldName(value: () => String): Self = StObject.set(x, "get_fieldName", js.Any.fromFunction0(value))
    
    inline def setGet_fieldValue(value: () => String): Self = StObject.set(x, "get_fieldValue", js.Any.fromFunction0(value))
    
    inline def setGet_hasException(value: () => Boolean): Self = StObject.set(x, "get_hasException", js.Any.fromFunction0(value))
    
    inline def setSet_errorMessage(value: String => Unit): Self = StObject.set(x, "set_errorMessage", js.Any.fromFunction1(value))
    
    inline def setSet_fieldName(value: String => Unit): Self = StObject.set(x, "set_fieldName", js.Any.fromFunction1(value))
    
    inline def setSet_fieldValue(value: String => Unit): Self = StObject.set(x, "set_fieldValue", js.Any.fromFunction1(value))
    
    inline def setSet_hasException(value: Boolean => Unit): Self = StObject.set(x, "set_hasException", js.Any.fromFunction1(value))
  }
}
