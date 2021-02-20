package typings.servicenow

import typings.servicenow.servicenow.GlideRecord
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GlideSysAttachment extends StObject {
  
  def copy(sourceTable: String, sourceSysId: String, destinationTable: String, destinationSysId: String): Unit = js.native
  
  def deleteAttachment(sysId: String): Unit = js.native
  
  def getContent(record: GlideRecord): js.Any = js.native
  
  def getContentBase64(record: GlideRecord): String = js.native
  
  def getContentStream(sysId: String): js.Object = js.native
  
  def write(record: GlideRecord, fileName: String, contentType: String, data: js.Any): String = js.native
  
  def writeBase64(record: GlideRecord, fileName: String, contentType: String, base64Content: String): String = js.native
  
  def writeContentStream(record: GlideRecord, fileName: String, contentType: String, inputStream: js.Object): String = js.native
}
object GlideSysAttachment {
  
  @scala.inline
  def apply(
    copy: (String, String, String, String) => Unit,
    deleteAttachment: String => Unit,
    getContent: GlideRecord => js.Any,
    getContentBase64: GlideRecord => String,
    getContentStream: String => js.Object,
    write: (GlideRecord, String, String, js.Any) => String,
    writeBase64: (GlideRecord, String, String, String) => String,
    writeContentStream: (GlideRecord, String, String, js.Object) => String
  ): GlideSysAttachment = {
    val __obj = js.Dynamic.literal(copy = js.Any.fromFunction4(copy), deleteAttachment = js.Any.fromFunction1(deleteAttachment), getContent = js.Any.fromFunction1(getContent), getContentBase64 = js.Any.fromFunction1(getContentBase64), getContentStream = js.Any.fromFunction1(getContentStream), write = js.Any.fromFunction4(write), writeBase64 = js.Any.fromFunction4(writeBase64), writeContentStream = js.Any.fromFunction4(writeContentStream))
    __obj.asInstanceOf[GlideSysAttachment]
  }
  
  @scala.inline
  implicit class GlideSysAttachmentMutableBuilder[Self <: GlideSysAttachment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCopy(value: (String, String, String, String) => Unit): Self = StObject.set(x, "copy", js.Any.fromFunction4(value))
    
    @scala.inline
    def setDeleteAttachment(value: String => Unit): Self = StObject.set(x, "deleteAttachment", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetContent(value: GlideRecord => js.Any): Self = StObject.set(x, "getContent", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetContentBase64(value: GlideRecord => String): Self = StObject.set(x, "getContentBase64", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetContentStream(value: String => js.Object): Self = StObject.set(x, "getContentStream", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWrite(value: (GlideRecord, String, String, js.Any) => String): Self = StObject.set(x, "write", js.Any.fromFunction4(value))
    
    @scala.inline
    def setWriteBase64(value: (GlideRecord, String, String, String) => String): Self = StObject.set(x, "writeBase64", js.Any.fromFunction4(value))
    
    @scala.inline
    def setWriteContentStream(value: (GlideRecord, String, String, js.Object) => String): Self = StObject.set(x, "writeContentStream", js.Any.fromFunction4(value))
  }
}
