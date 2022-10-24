package typings.reactTypesShared.srcDndMod

import typings.react.mod.Key
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.reactTypesShared.srcDndMod.RootDropTarget
  - typings.reactTypesShared.srcDndMod.ItemDropTarget
*/
trait DropTarget extends StObject
object DropTarget {
  
  inline def ItemDropTarget(dropPosition: DropPosition, key: Key): typings.reactTypesShared.srcDndMod.ItemDropTarget = {
    val __obj = js.Dynamic.literal(dropPosition = dropPosition.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("item")
    __obj.asInstanceOf[typings.reactTypesShared.srcDndMod.ItemDropTarget]
  }
  
  inline def RootDropTarget(): typings.reactTypesShared.srcDndMod.RootDropTarget = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("root")
    __obj.asInstanceOf[typings.reactTypesShared.srcDndMod.RootDropTarget]
  }
}
