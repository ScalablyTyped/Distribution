package typings.sharepoint.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDataValidationFailure
  extends StObject
     with ClientValueObject {
  
  def get_displayName(): String
  
  def get_message(): String
  
  def get_name(): String
  
  def get_reason(): ListDataValidationFailureReason
  
  def get_validationType(): ListDataValidationType
}
object ListDataValidationFailure {
  
  @scala.inline
  def apply(
    customFromJson: js.Any => Boolean,
    customWriteToXml: (XmlWriter, SerializationContext) => Boolean,
    fromJson: js.Any => Unit,
    get_displayName: () => String,
    get_message: () => String,
    get_name: () => String,
    get_reason: () => ListDataValidationFailureReason,
    get_typeId: () => String,
    get_validationType: () => ListDataValidationType,
    writeToXml: (XmlWriter, SerializationContext) => Unit
  ): ListDataValidationFailure = {
    val __obj = js.Dynamic.literal(customFromJson = js.Any.fromFunction1(customFromJson), customWriteToXml = js.Any.fromFunction2(customWriteToXml), fromJson = js.Any.fromFunction1(fromJson), get_displayName = js.Any.fromFunction0(get_displayName), get_message = js.Any.fromFunction0(get_message), get_name = js.Any.fromFunction0(get_name), get_reason = js.Any.fromFunction0(get_reason), get_typeId = js.Any.fromFunction0(get_typeId), get_validationType = js.Any.fromFunction0(get_validationType), writeToXml = js.Any.fromFunction2(writeToXml))
    __obj.asInstanceOf[ListDataValidationFailure]
  }
  
  @scala.inline
  implicit class ListDataValidationFailureMutableBuilder[Self <: ListDataValidationFailure] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGet_displayName(value: () => String): Self = StObject.set(x, "get_displayName", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_message(value: () => String): Self = StObject.set(x, "get_message", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_name(value: () => String): Self = StObject.set(x, "get_name", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_reason(value: () => ListDataValidationFailureReason): Self = StObject.set(x, "get_reason", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_validationType(value: () => ListDataValidationType): Self = StObject.set(x, "get_validationType", js.Any.fromFunction0(value))
  }
}
