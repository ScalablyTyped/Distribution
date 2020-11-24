package typings.reactMdTree.typesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UnknownTreeItem
  extends BaseTreeItem
     with /* key */ StringDictionary[js.Any]
object UnknownTreeItem {
  
  @scala.inline
  def apply(itemId: TreeItemId): UnknownTreeItem = {
    val __obj = js.Dynamic.literal(itemId = itemId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnknownTreeItem]
  }
}
