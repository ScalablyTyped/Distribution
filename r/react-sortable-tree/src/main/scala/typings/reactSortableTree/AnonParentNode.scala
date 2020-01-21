package typings.reactSortableTree

import typings.reactSortableTree.mod.TreeItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonParentNode extends js.Object {
  var parentNode: TreeItem
}

object AnonParentNode {
  @scala.inline
  def apply(parentNode: TreeItem): AnonParentNode = {
    val __obj = js.Dynamic.literal(parentNode = parentNode.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonParentNode]
  }
}

