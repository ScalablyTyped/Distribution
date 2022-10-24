package typings.reactTypesShared.srcDndMod

import typings.std.AsyncIterable
import typings.std.File
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.reactTypesShared.srcDndMod.TextItem
  - typings.reactTypesShared.srcDndMod.FileItem
  - typings.reactTypesShared.srcDndMod.DirectoryItem
*/
trait DropItem extends StObject
object DropItem {
  
  inline def DirectoryItem(
    getEntries: () => AsyncIterable[FileItem | typings.reactTypesShared.srcDndMod.DirectoryItem],
    name: String
  ): typings.reactTypesShared.srcDndMod.DirectoryItem = {
    val __obj = js.Dynamic.literal(getEntries = js.Any.fromFunction0(getEntries), kind = "directory", name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.reactTypesShared.srcDndMod.DirectoryItem]
  }
  
  inline def FileItem(getFile: () => js.Promise[File], getText: () => js.Promise[String], name: String, `type`: String): typings.reactTypesShared.srcDndMod.FileItem = {
    val __obj = js.Dynamic.literal(getFile = js.Any.fromFunction0(getFile), getText = js.Any.fromFunction0(getText), kind = "file", name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.reactTypesShared.srcDndMod.FileItem]
  }
  
  inline def TextItem(getText: String => js.Promise[String], types: Set[String]): typings.reactTypesShared.srcDndMod.TextItem = {
    val __obj = js.Dynamic.literal(getText = js.Any.fromFunction1(getText), kind = "text", types = types.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.reactTypesShared.srcDndMod.TextItem]
  }
}
