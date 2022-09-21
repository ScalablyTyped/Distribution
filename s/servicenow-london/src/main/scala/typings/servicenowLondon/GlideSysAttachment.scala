package typings.servicenowLondon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GlideSysAttachment extends StObject {
  
  def copy(sourceTable: String, sourceSysId: String, destinationTable: String, destinationSysId: String): Unit
  
  def deleteAttachment(sysId: String): Unit
  
  def getContent(record: ScopedGlideRecord): Any
  
  def getContentBase64(record: ScopedGlideRecord): String
  
  def getContentStream(sysId: String): js.Object
  
  def write(record: ScopedGlideRecord, fileName: String, contentType: String, data: Any): String
  
  def writeBase64(record: ScopedGlideRecord, fileName: String, contentType: String, base64Content: String): String
  
  def writeContentStream(record: ScopedGlideRecord, fileName: String, contentType: String, inputStream: js.Object): String
}
object GlideSysAttachment {
  
  inline def apply(
    copy: (String, String, String, String) => Unit,
    deleteAttachment: String => Unit,
    getContent: ScopedGlideRecord => Any,
    getContentBase64: ScopedGlideRecord => String,
    getContentStream: String => js.Object,
    write: (ScopedGlideRecord, String, String, Any) => String,
    writeBase64: (ScopedGlideRecord, String, String, String) => String,
    writeContentStream: (ScopedGlideRecord, String, String, js.Object) => String
  ): GlideSysAttachment = {
    val __obj = js.Dynamic.literal(copy = js.Any.fromFunction4(copy), deleteAttachment = js.Any.fromFunction1(deleteAttachment), getContent = js.Any.fromFunction1(getContent), getContentBase64 = js.Any.fromFunction1(getContentBase64), getContentStream = js.Any.fromFunction1(getContentStream), write = js.Any.fromFunction4(write), writeBase64 = js.Any.fromFunction4(writeBase64), writeContentStream = js.Any.fromFunction4(writeContentStream))
    __obj.asInstanceOf[GlideSysAttachment]
  }
  
  extension [Self <: GlideSysAttachment](x: Self) {
    
    inline def setCopy(value: (String, String, String, String) => Unit): Self = StObject.set(x, "copy", js.Any.fromFunction4(value))
    
    inline def setDeleteAttachment(value: String => Unit): Self = StObject.set(x, "deleteAttachment", js.Any.fromFunction1(value))
    
    inline def setGetContent(value: ScopedGlideRecord => Any): Self = StObject.set(x, "getContent", js.Any.fromFunction1(value))
    
    inline def setGetContentBase64(value: ScopedGlideRecord => String): Self = StObject.set(x, "getContentBase64", js.Any.fromFunction1(value))
    
    inline def setGetContentStream(value: String => js.Object): Self = StObject.set(x, "getContentStream", js.Any.fromFunction1(value))
    
    inline def setWrite(value: (ScopedGlideRecord, String, String, Any) => String): Self = StObject.set(x, "write", js.Any.fromFunction4(value))
    
    inline def setWriteBase64(value: (ScopedGlideRecord, String, String, String) => String): Self = StObject.set(x, "writeBase64", js.Any.fromFunction4(value))
    
    inline def setWriteContentStream(value: (ScopedGlideRecord, String, String, js.Object) => String): Self = StObject.set(x, "writeContentStream", js.Any.fromFunction4(value))
  }
}
