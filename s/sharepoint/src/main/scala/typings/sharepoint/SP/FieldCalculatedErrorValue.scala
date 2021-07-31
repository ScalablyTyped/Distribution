package typings.sharepoint.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FieldCalculatedErrorValue
  extends StObject
     with ClientValueObject {
  
  def get_errorMessage(): String
}
object FieldCalculatedErrorValue {
  
  @scala.inline
  def apply(
    customFromJson: js.Any => Boolean,
    customWriteToXml: (XmlWriter, SerializationContext) => Boolean,
    fromJson: js.Any => Unit,
    get_errorMessage: () => String,
    get_typeId: () => String,
    writeToXml: (XmlWriter, SerializationContext) => Unit
  ): FieldCalculatedErrorValue = {
    val __obj = js.Dynamic.literal(customFromJson = js.Any.fromFunction1(customFromJson), customWriteToXml = js.Any.fromFunction2(customWriteToXml), fromJson = js.Any.fromFunction1(fromJson), get_errorMessage = js.Any.fromFunction0(get_errorMessage), get_typeId = js.Any.fromFunction0(get_typeId), writeToXml = js.Any.fromFunction2(writeToXml))
    __obj.asInstanceOf[FieldCalculatedErrorValue]
  }
  
  @scala.inline
  implicit class FieldCalculatedErrorValueMutableBuilder[Self <: FieldCalculatedErrorValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGet_errorMessage(value: () => String): Self = StObject.set(x, "get_errorMessage", js.Any.fromFunction0(value))
  }
}
