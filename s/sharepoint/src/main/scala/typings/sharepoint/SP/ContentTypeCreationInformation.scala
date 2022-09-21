package typings.sharepoint.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentTypeCreationInformation
  extends StObject
     with ClientValueObject {
  
  def get_description(): String
  
  def get_group(): String
  
  def get_name(): String
  
  def get_parentContentType(): ContentType
  
  def set_description(value: String): Unit
  
  def set_group(value: String): Unit
  
  def set_name(value: String): Unit
  
  def set_parentContentType(value: ContentType): Unit
}
object ContentTypeCreationInformation {
  
  inline def apply(
    customFromJson: Any => Boolean,
    customWriteToXml: (XmlWriter, SerializationContext) => Boolean,
    fromJson: Any => Unit,
    get_description: () => String,
    get_group: () => String,
    get_name: () => String,
    get_parentContentType: () => ContentType,
    get_typeId: () => String,
    set_description: String => Unit,
    set_group: String => Unit,
    set_name: String => Unit,
    set_parentContentType: ContentType => Unit,
    writeToXml: (XmlWriter, SerializationContext) => Unit
  ): ContentTypeCreationInformation = {
    val __obj = js.Dynamic.literal(customFromJson = js.Any.fromFunction1(customFromJson), customWriteToXml = js.Any.fromFunction2(customWriteToXml), fromJson = js.Any.fromFunction1(fromJson), get_description = js.Any.fromFunction0(get_description), get_group = js.Any.fromFunction0(get_group), get_name = js.Any.fromFunction0(get_name), get_parentContentType = js.Any.fromFunction0(get_parentContentType), get_typeId = js.Any.fromFunction0(get_typeId), set_description = js.Any.fromFunction1(set_description), set_group = js.Any.fromFunction1(set_group), set_name = js.Any.fromFunction1(set_name), set_parentContentType = js.Any.fromFunction1(set_parentContentType), writeToXml = js.Any.fromFunction2(writeToXml))
    __obj.asInstanceOf[ContentTypeCreationInformation]
  }
  
  extension [Self <: ContentTypeCreationInformation](x: Self) {
    
    inline def setGet_description(value: () => String): Self = StObject.set(x, "get_description", js.Any.fromFunction0(value))
    
    inline def setGet_group(value: () => String): Self = StObject.set(x, "get_group", js.Any.fromFunction0(value))
    
    inline def setGet_name(value: () => String): Self = StObject.set(x, "get_name", js.Any.fromFunction0(value))
    
    inline def setGet_parentContentType(value: () => ContentType): Self = StObject.set(x, "get_parentContentType", js.Any.fromFunction0(value))
    
    inline def setSet_description(value: String => Unit): Self = StObject.set(x, "set_description", js.Any.fromFunction1(value))
    
    inline def setSet_group(value: String => Unit): Self = StObject.set(x, "set_group", js.Any.fromFunction1(value))
    
    inline def setSet_name(value: String => Unit): Self = StObject.set(x, "set_name", js.Any.fromFunction1(value))
    
    inline def setSet_parentContentType(value: ContentType => Unit): Self = StObject.set(x, "set_parentContentType", js.Any.fromFunction1(value))
  }
}
