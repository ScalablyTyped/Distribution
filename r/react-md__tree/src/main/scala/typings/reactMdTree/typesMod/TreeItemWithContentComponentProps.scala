package typings.reactMdTree.typesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TreeItemWithContentComponentProps
  extends TreeItemProps
     with /**
  * Since I allow the `contentComponent` prop for handling rendering `<a>` tags
  * from other routing libraries, I unfortunately need an index key so that
  * those props can be passed down correctly.
  */
/* key */ StringDictionary[js.Any]
object TreeItemWithContentComponentProps {
  
  @scala.inline
  def apply(
    depth: Double,
    expanded: Boolean,
    focused: Boolean,
    id: String,
    itemIndex: Double,
    listSize: Double,
    selected: Boolean
  ): TreeItemWithContentComponentProps = {
    val __obj = js.Dynamic.literal(depth = depth.asInstanceOf[js.Any], expanded = expanded.asInstanceOf[js.Any], focused = focused.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], itemIndex = itemIndex.asInstanceOf[js.Any], listSize = listSize.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeItemWithContentComponentProps]
  }
}
