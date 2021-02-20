package typings.sharepoint.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AttachmentCreationInformation extends ClientValueObject {
  
  def get_contentStream(): Base64EncodedByteArray = js.native
  
  def get_fileName(): String = js.native
  
  def set_contentStream(value: Base64EncodedByteArray): Unit = js.native
  
  def set_fileName(value: String): Unit = js.native
}
object AttachmentCreationInformation {
  
  @scala.inline
  def apply(
    customFromJson: js.Any => Boolean,
    customWriteToXml: (XmlWriter, SerializationContext) => Boolean,
    fromJson: js.Any => Unit,
    get_contentStream: () => Base64EncodedByteArray,
    get_fileName: () => String,
    get_typeId: () => String,
    set_contentStream: Base64EncodedByteArray => Unit,
    set_fileName: String => Unit,
    writeToXml: (XmlWriter, SerializationContext) => Unit
  ): AttachmentCreationInformation = {
    val __obj = js.Dynamic.literal(customFromJson = js.Any.fromFunction1(customFromJson), customWriteToXml = js.Any.fromFunction2(customWriteToXml), fromJson = js.Any.fromFunction1(fromJson), get_contentStream = js.Any.fromFunction0(get_contentStream), get_fileName = js.Any.fromFunction0(get_fileName), get_typeId = js.Any.fromFunction0(get_typeId), set_contentStream = js.Any.fromFunction1(set_contentStream), set_fileName = js.Any.fromFunction1(set_fileName), writeToXml = js.Any.fromFunction2(writeToXml))
    __obj.asInstanceOf[AttachmentCreationInformation]
  }
  
  @scala.inline
  implicit class AttachmentCreationInformationMutableBuilder[Self <: AttachmentCreationInformation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGet_contentStream(value: () => Base64EncodedByteArray): Self = StObject.set(x, "get_contentStream", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_fileName(value: () => String): Self = StObject.set(x, "get_fileName", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSet_contentStream(value: Base64EncodedByteArray => Unit): Self = StObject.set(x, "set_contentStream", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSet_fileName(value: String => Unit): Self = StObject.set(x, "set_fileName", js.Any.fromFunction1(value))
  }
}
