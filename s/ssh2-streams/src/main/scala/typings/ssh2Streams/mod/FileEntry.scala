package typings.ssh2Streams.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileEntry extends StObject {
  
  var attrs: Attributes
  
  var filename: String
  
  var longname: String
}
object FileEntry {
  
  @scala.inline
  def apply(attrs: Attributes, filename: String, longname: String): FileEntry = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], longname = longname.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileEntry]
  }
  
  @scala.inline
  implicit class FileEntryMutableBuilder[Self <: FileEntry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttrs(value: Attributes): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongname(value: String): Self = StObject.set(x, "longname", value.asInstanceOf[js.Any])
  }
}
