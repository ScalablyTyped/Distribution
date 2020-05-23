package typings.reactSortableTree.treeDataUtilsMod

import typings.reactSortableTree.anon.FlatData
import typings.reactSortableTree.mod.TreeItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-sortable-tree/utils/tree-data-utils", "getTreeFromFlatData")
@js.native
object getTreeFromFlatData extends js.Object {
  def apply[T, K /* <: /* keyof T */ String */, P /* <: /* keyof T */ String */, I /* <: String | Double */](data: FlatData[T, I, K, P]): js.Array[TreeItem] = js.native
}

