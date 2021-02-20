package typings.sharepoint.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FileCreationInformation extends ClientValueObject {
  
  def get_content(): Base64EncodedByteArray = js.native
  
  def get_overwrite(): Boolean = js.native
  
  def get_url(): String = js.native
  
  def set_content(value: Base64EncodedByteArray): Unit = js.native
  
  def set_overwrite(value: Boolean): Unit = js.native
  
  def set_url(value: String): Unit = js.native
}
object FileCreationInformation {
  
  @scala.inline
  def apply(
    customFromJson: js.Any => Boolean,
    customWriteToXml: (XmlWriter, SerializationContext) => Boolean,
    fromJson: js.Any => Unit,
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
  implicit class FileCreationInformationMutableBuilder[Self <: FileCreationInformation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGet_content(value: () => Base64EncodedByteArray): Self = StObject.set(x, "get_content", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_overwrite(value: () => Boolean): Self = StObject.set(x, "get_overwrite", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_url(value: () => String): Self = StObject.set(x, "get_url", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSet_content(value: Base64EncodedByteArray => Unit): Self = StObject.set(x, "set_content", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSet_overwrite(value: Boolean => Unit): Self = StObject.set(x, "set_overwrite", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSet_url(value: String => Unit): Self = StObject.set(x, "set_url", js.Any.fromFunction1(value))
  }
}
