package typings.sharepoint.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FieldLookupValue
  extends StObject
     with ClientValueObject {
  
  def get_lookupId(): Double
  
  def get_lookupValue(): String
  
  def set_lookupId(value: Double): Unit
}
object FieldLookupValue {
  
  inline def apply(
    customFromJson: Any => Boolean,
    customWriteToXml: (XmlWriter, SerializationContext) => Boolean,
    fromJson: Any => Unit,
    get_lookupId: () => Double,
    get_lookupValue: () => String,
    get_typeId: () => String,
    set_lookupId: Double => Unit,
    writeToXml: (XmlWriter, SerializationContext) => Unit
  ): FieldLookupValue = {
    val __obj = js.Dynamic.literal(customFromJson = js.Any.fromFunction1(customFromJson), customWriteToXml = js.Any.fromFunction2(customWriteToXml), fromJson = js.Any.fromFunction1(fromJson), get_lookupId = js.Any.fromFunction0(get_lookupId), get_lookupValue = js.Any.fromFunction0(get_lookupValue), get_typeId = js.Any.fromFunction0(get_typeId), set_lookupId = js.Any.fromFunction1(set_lookupId), writeToXml = js.Any.fromFunction2(writeToXml))
    __obj.asInstanceOf[FieldLookupValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FieldLookupValue] (val x: Self) extends AnyVal {
    
    inline def setGet_lookupId(value: () => Double): Self = StObject.set(x, "get_lookupId", js.Any.fromFunction0(value))
    
    inline def setGet_lookupValue(value: () => String): Self = StObject.set(x, "get_lookupValue", js.Any.fromFunction0(value))
    
    inline def setSet_lookupId(value: Double => Unit): Self = StObject.set(x, "set_lookupId", js.Any.fromFunction1(value))
  }
}
