package typings.sharepoint.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDataValidationExceptionValue
  extends StObject
     with ClientValueObject {
  
  def get_fieldFailures(): js.Array[ListDataValidationFailure]
  
  def get_itemFailure(): ListDataValidationFailure
}
object ListDataValidationExceptionValue {
  
  inline def apply(
    customFromJson: js.Any => Boolean,
    customWriteToXml: (XmlWriter, SerializationContext) => Boolean,
    fromJson: js.Any => Unit,
    get_fieldFailures: () => js.Array[ListDataValidationFailure],
    get_itemFailure: () => ListDataValidationFailure,
    get_typeId: () => String,
    writeToXml: (XmlWriter, SerializationContext) => Unit
  ): ListDataValidationExceptionValue = {
    val __obj = js.Dynamic.literal(customFromJson = js.Any.fromFunction1(customFromJson), customWriteToXml = js.Any.fromFunction2(customWriteToXml), fromJson = js.Any.fromFunction1(fromJson), get_fieldFailures = js.Any.fromFunction0(get_fieldFailures), get_itemFailure = js.Any.fromFunction0(get_itemFailure), get_typeId = js.Any.fromFunction0(get_typeId), writeToXml = js.Any.fromFunction2(writeToXml))
    __obj.asInstanceOf[ListDataValidationExceptionValue]
  }
  
  extension [Self <: ListDataValidationExceptionValue](x: Self) {
    
    inline def setGet_fieldFailures(value: () => js.Array[ListDataValidationFailure]): Self = StObject.set(x, "get_fieldFailures", js.Any.fromFunction0(value))
    
    inline def setGet_itemFailure(value: () => ListDataValidationFailure): Self = StObject.set(x, "get_itemFailure", js.Any.fromFunction0(value))
  }
}
