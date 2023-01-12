package typings.sphereEngineBrowser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Describes a file or subdirectory as yielded by a `DirectoryStream`.
  */
trait DirectoryEntry extends StObject {
  
  /** Path of the file or subdirectory, relative to the directory being enumerated. */
  var fileName: String
  
  /** Full SphereFS path to the file or subdirectory. */
  var fullPath: String
  
  /** `true` if the entry names a subdirectory, otherwise `false`. */
  var isDirectory: Boolean
}
object DirectoryEntry {
  
  inline def apply(fileName: String, fullPath: String, isDirectory: Boolean): DirectoryEntry = {
    val __obj = js.Dynamic.literal(fileName = fileName.asInstanceOf[js.Any], fullPath = fullPath.asInstanceOf[js.Any], isDirectory = isDirectory.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectoryEntry]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DirectoryEntry] (val x: Self) extends AnyVal {
    
    inline def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
    
    inline def setFullPath(value: String): Self = StObject.set(x, "fullPath", value.asInstanceOf[js.Any])
    
    inline def setIsDirectory(value: Boolean): Self = StObject.set(x, "isDirectory", value.asInstanceOf[js.Any])
  }
}
