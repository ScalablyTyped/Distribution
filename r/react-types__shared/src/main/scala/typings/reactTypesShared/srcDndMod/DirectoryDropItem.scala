package typings.reactTypesShared.srcDndMod

import typings.reactTypesShared.reactTypesSharedStrings.directory
import typings.std.AsyncIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DirectoryDropItem
  extends StObject
     with DropItem {
  
  /** Returns the entries contained within the directory. */
  def getEntries(): AsyncIterable[FileDropItem | DirectoryDropItem]
  
  /** The item kind. */
  var kind: directory
  
  /** The directory name. */
  var name: String
}
object DirectoryDropItem {
  
  inline def apply(getEntries: () => AsyncIterable[FileDropItem | DirectoryDropItem], name: String): DirectoryDropItem = {
    val __obj = js.Dynamic.literal(getEntries = js.Any.fromFunction0(getEntries), kind = "directory", name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectoryDropItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DirectoryDropItem] (val x: Self) extends AnyVal {
    
    inline def setGetEntries(value: () => AsyncIterable[FileDropItem | DirectoryDropItem]): Self = StObject.set(x, "getEntries", js.Any.fromFunction0(value))
    
    inline def setKind(value: directory): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
