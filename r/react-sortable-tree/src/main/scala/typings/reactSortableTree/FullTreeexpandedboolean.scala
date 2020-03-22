package typings.reactSortableTree

import typings.reactSortableTree.mod.TreeItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-sortable-tree.react-sortable-tree.FullTree & {  expanded ? :boolean} */
trait FullTreeexpandedboolean extends js.Object {
  var expanded: js.UndefOr[Boolean] = js.undefined
  var treeData: js.Array[TreeItem]
}

object FullTreeexpandedboolean {
  @scala.inline
  def apply(treeData: js.Array[TreeItem], expanded: js.UndefOr[Boolean] = js.undefined): FullTreeexpandedboolean = {
    val __obj = js.Dynamic.literal(treeData = treeData.asInstanceOf[js.Any])
    if (!js.isUndefined(expanded)) __obj.updateDynamic("expanded")(expanded.asInstanceOf[js.Any])
    __obj.asInstanceOf[FullTreeexpandedboolean]
  }
}

