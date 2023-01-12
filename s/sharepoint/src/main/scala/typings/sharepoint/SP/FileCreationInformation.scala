package typings.sharepoint.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileCreationInformation
  extends StObject
     with ClientValueObject {
  
  def get_content(): Base64EncodedByteArray
  
  def get_overwrite(): Boolean
  
  def get_url(): String
  
  def set_content(value: Base64EncodedByteArray): Unit
  
  def set_overwrite(value: Boolean): Unit
  
  def set_url(value: String): Unit
}
object FileCreationInformation {
  
  inline def apply(
    customFromJson: Any => Boolean,
    customWriteToXml: (XmlWriter, SerializationContext) => Boolean,
    fromJson: Any => Unit,
    get_content: () => Base64EncodedByteArray,
    get_overwrite: () => Boolean,
    get_typeId: () => String,
    get_url: () => String,
    set_content: Base64EncodedByteArray => Unit,
    set_overwrite: Boolean => Unit,
    set_url: String => Unit,
    writeToXml: (XmlWriter, SerializationContext) => Unit
  ): FileCreationInformation = {
    val __obj = js.Dynamic.literal(customFromJson = js.Any.fromFunction1(customFromJson), customWriteToXml = js.Any.fromFunction2(customWriteToXml), fromJson = js.Any.fromFunction1(fromJson), get_content = js.Any.fromFunction0(get_content), get_overwrite = js.Any.fromFunction0(get_overwrite), get_typeId = js.Any.fromFunction0(get_typeId), get_url = js.Any.fromFunction0(get_url), set_content = js.Any.fromFunction1(set_content), set_overwrite = js.Any.fromFunction1(set_overwrite), set_url = js.Any.fromFunction1(set_url), writeToXml = js.Any.fromFunction2(writeToXml))
    __obj.asInstanceOf[FileCreationInformation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FileCreationInformation] (val x: Self) extends AnyVal {
    
    inline def setGet_content(value: () => Base64EncodedByteArray): Self = StObject.set(x, "get_content", js.Any.fromFunction0(value))
    
    inline def setGet_overwrite(value: () => Boolean): Self = StObject.set(x, "get_overwrite", js.Any.fromFunction0(value))
    
    inline def setGet_url(value: () => String): Self = StObject.set(x, "get_url", js.Any.fromFunction0(value))
    
    inline def setSet_content(value: Base64EncodedByteArray => Unit): Self = StObject.set(x, "set_content", js.Any.fromFunction1(value))
    
    inline def setSet_overwrite(value: Boolean => Unit): Self = StObject.set(x, "set_overwrite", js.Any.fromFunction1(value))
    
    inline def setSet_url(value: String => Unit): Self = StObject.set(x, "set_url", js.Any.fromFunction1(value))
  }
}
