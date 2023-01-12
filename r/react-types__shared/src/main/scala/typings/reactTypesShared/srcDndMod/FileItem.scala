package typings.reactTypesShared.srcDndMod

import typings.reactTypesShared.reactTypesSharedStrings.file
import typings.std.File
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileItem
  extends StObject
     with DropItem {
  
  /** Returns the contents of the file as a blob. */
  def getFile(): js.Promise[File]
  
  /** Returns the contents of the file as a string. */
  def getText(): js.Promise[String]
  
  /** The item kind. */
  var kind: file
  
  /** The file name. */
  var name: String
  
  /** The file type (usually a mime type). */
  var `type`: String
}
object FileItem {
  
  inline def apply(getFile: () => js.Promise[File], getText: () => js.Promise[String], name: String, `type`: String): FileItem = {
    val __obj = js.Dynamic.literal(getFile = js.Any.fromFunction0(getFile), getText = js.Any.fromFunction0(getText), kind = "file", name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FileItem] (val x: Self) extends AnyVal {
    
    inline def setGetFile(value: () => js.Promise[File]): Self = StObject.set(x, "getFile", js.Any.fromFunction0(value))
    
    inline def setGetText(value: () => js.Promise[String]): Self = StObject.set(x, "getText", js.Any.fromFunction0(value))
    
    inline def setKind(value: file): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
