package typings.sharepoint.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FieldLinkCreationInformation
  extends StObject
     with ClientValueObject {
  
  def get_field(): Field
  
  def set_field(value: Field): Unit
}
object FieldLinkCreationInformation {
  
  @scala.inline
  def apply(
    customFromJson: js.Any => Boolean,
    customWriteToXml: (XmlWriter, SerializationContext) => Boolean,
    fromJson: js.Any => Unit,
    get_field: () => Field,
    get_typeId: () => String,
    set_field: Field => Unit,
    writeToXml: (XmlWriter, SerializationContext) => Unit
  ): FieldLinkCreationInformation = {
    val __obj = js.Dynamic.literal(customFromJson = js.Any.fromFunction1(customFromJson), customWriteToXml = js.Any.fromFunction2(customWriteToXml), fromJson = js.Any.fromFunction1(fromJson), get_field = js.Any.fromFunction0(get_field), get_typeId = js.Any.fromFunction0(get_typeId), set_field = js.Any.fromFunction1(set_field), writeToXml = js.Any.fromFunction2(writeToXml))
    __obj.asInstanceOf[FieldLinkCreationInformation]
  }
  
  @scala.inline
  implicit class FieldLinkCreationInformationMutableBuilder[Self <: FieldLinkCreationInformation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGet_field(value: () => Field): Self = StObject.set(x, "get_field", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSet_field(value: Field => Unit): Self = StObject.set(x, "set_field", js.Any.fromFunction1(value))
  }
}
