package typings.reactNativeFs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UploadFileItem extends StObject {
  
  // Name of the file, if not defined then filename is used
  var filename: String = js.native
  
  // Name of file
  var filepath: String = js.native
  
  // Path to file
  var filetype: String = js.native
  
  var name: String = js.native
}
object UploadFileItem {
  
  @scala.inline
  def apply(filename: String, filepath: String, filetype: String, name: String): UploadFileItem = {
    val __obj = js.Dynamic.literal(filename = filename.asInstanceOf[js.Any], filepath = filepath.asInstanceOf[js.Any], filetype = filetype.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadFileItem]
  }
  
  @scala.inline
  implicit class UploadFileItemMutableBuilder[Self <: UploadFileItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilepath(value: String): Self = StObject.set(x, "filepath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFiletype(value: String): Self = StObject.set(x, "filetype", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
