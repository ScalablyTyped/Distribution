package typings.reactNativeFs.mod

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReadDirItem extends StObject {
  
  var ctime: js.UndefOr[Date] = js.undefined
  
  // Is the file just a file?
  def isDirectory(): Boolean
  
  // Size in bytes
  def isFile(): Boolean
  
  // The creation date of the file (iOS only)
  var mtime: js.UndefOr[Date] = js.undefined
  
  // The last modified date of the file
  var name: String
  
  // The name of the item
  var path: String
  
  // The absolute path to the item
  var size: String
}
object ReadDirItem {
  
  @scala.inline
  def apply(isDirectory: () => Boolean, isFile: () => Boolean, name: String, path: String, size: String): ReadDirItem = {
    val __obj = js.Dynamic.literal(isDirectory = js.Any.fromFunction0(isDirectory), isFile = js.Any.fromFunction0(isFile), name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadDirItem]
  }
  
  @scala.inline
  implicit class ReadDirItemMutableBuilder[Self <: ReadDirItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCtime(value: Date): Self = StObject.set(x, "ctime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCtimeUndefined: Self = StObject.set(x, "ctime", js.undefined)
    
    @scala.inline
    def setIsDirectory(value: () => Boolean): Self = StObject.set(x, "isDirectory", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsFile(value: () => Boolean): Self = StObject.set(x, "isFile", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMtime(value: Date): Self = StObject.set(x, "mtime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMtimeUndefined: Self = StObject.set(x, "mtime", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
  }
}
