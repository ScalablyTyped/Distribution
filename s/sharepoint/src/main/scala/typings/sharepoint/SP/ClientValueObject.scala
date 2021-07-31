package typings.sharepoint.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClientValueObject extends StObject {
  
  def customFromJson(obj: js.Any): Boolean
  
  def customWriteToXml(writer: XmlWriter, serializationContext: SerializationContext): Boolean
  
  def fromJson(obj: js.Any): Unit
  
  def get_typeId(): String
  
  def writeToXml(writer: XmlWriter, serializationContext: SerializationContext): Unit
}
object ClientValueObject {
  
  @scala.inline
  def apply(
    customFromJson: js.Any => Boolean,
    customWriteToXml: (XmlWriter, SerializationContext) => Boolean,
    fromJson: js.Any => Unit,
    get_typeId: () => String,
    writeToXml: (XmlWriter, SerializationContext) => Unit
  ): ClientValueObject = {
    val __obj = js.Dynamic.literal(customFromJson = js.Any.fromFunction1(customFromJson), customWriteToXml = js.Any.fromFunction2(customWriteToXml), fromJson = js.Any.fromFunction1(fromJson), get_typeId = js.Any.fromFunction0(get_typeId), writeToXml = js.Any.fromFunction2(writeToXml))
    __obj.asInstanceOf[ClientValueObject]
  }
  
  @scala.inline
  implicit class ClientValueObjectMutableBuilder[Self <: ClientValueObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCustomFromJson(value: js.Any => Boolean): Self = StObject.set(x, "customFromJson", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCustomWriteToXml(value: (XmlWriter, SerializationContext) => Boolean): Self = StObject.set(x, "customWriteToXml", js.Any.fromFunction2(value))
    
    @scala.inline
    def setFromJson(value: js.Any => Unit): Self = StObject.set(x, "fromJson", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGet_typeId(value: () => String): Self = StObject.set(x, "get_typeId", js.Any.fromFunction0(value))
    
    @scala.inline
    def setWriteToXml(value: (XmlWriter, SerializationContext) => Unit): Self = StObject.set(x, "writeToXml", js.Any.fromFunction2(value))
  }
}
