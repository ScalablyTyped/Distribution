package typings.rockset.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SourceFileUpload extends StObject {
  
  // name of the file
  var file_name: String
  
  // size of the file in bytes
  var file_size: Double
  
  // time of file upload
  var file_upload_time: String
}
object SourceFileUpload {
  
  inline def apply(file_name: String, file_size: Double, file_upload_time: String): SourceFileUpload = {
    val __obj = js.Dynamic.literal(file_name = file_name.asInstanceOf[js.Any], file_size = file_size.asInstanceOf[js.Any], file_upload_time = file_upload_time.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceFileUpload]
  }
  
  extension [Self <: SourceFileUpload](x: Self) {
    
    inline def setFile_name(value: String): Self = StObject.set(x, "file_name", value.asInstanceOf[js.Any])
    
    inline def setFile_size(value: Double): Self = StObject.set(x, "file_size", value.asInstanceOf[js.Any])
    
    inline def setFile_upload_time(value: String): Self = StObject.set(x, "file_upload_time", value.asInstanceOf[js.Any])
  }
}
