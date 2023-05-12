package typings.reactTypesShared.srcDndMod

import typings.std.AsyncIterable
import typings.std.File
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.reactTypesShared.srcDndMod.TextDropItem
  - typings.reactTypesShared.srcDndMod.FileDropItem
  - typings.reactTypesShared.srcDndMod.DirectoryDropItem
*/
trait DropItem extends StObject
object DropItem {
  
  inline def DirectoryDropItem(
    getEntries: () => AsyncIterable[FileDropItem | typings.reactTypesShared.srcDndMod.DirectoryDropItem],
    name: String
  ): typings.reactTypesShared.srcDndMod.DirectoryDropItem = {
    val __obj = js.Dynamic.literal(getEntries = js.Any.fromFunction0(getEntries), kind = "directory", name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.reactTypesShared.srcDndMod.DirectoryDropItem]
  }
  
  inline def FileDropItem(getFile: () => js.Promise[File], getText: () => js.Promise[String], name: String, `type`: String): typings.reactTypesShared.srcDndMod.FileDropItem = {
    val __obj = js.Dynamic.literal(getFile = js.Any.fromFunction0(getFile), getText = js.Any.fromFunction0(getText), kind = "file", name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.reactTypesShared.srcDndMod.FileDropItem]
  }
  
  inline def TextDropItem(getText: String => js.Promise[String], types: Set[String]): typings.reactTypesShared.srcDndMod.TextDropItem = {
    val __obj = js.Dynamic.literal(getText = js.Any.fromFunction1(getText), kind = "text", types = types.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.reactTypesShared.srcDndMod.TextDropItem]
  }
}
