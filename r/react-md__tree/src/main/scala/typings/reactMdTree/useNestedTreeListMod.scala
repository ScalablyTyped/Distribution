package typings.reactMdTree

import typings.reactMdTree.anon.ChildItems
import typings.reactMdTree.typesMod.BaseTreeItem
import typings.reactMdTree.typesMod.TreeData
import typings.reactMdTree.typesMod.TreeItemId
import typings.reactMdTree.typesMod.TreeItemSorter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@react-md/tree/types/useNestedTreeList", JSImport.Namespace)
@js.native
object useNestedTreeListMod extends js.Object {
  def buildTree[T /* <: BaseTreeItem */](parentId: Null, items: js.Array[T]): js.UndefOr[js.Array[NestedTreeItem[T]]] = js.native
  def buildTree[T /* <: BaseTreeItem */](parentId: Null, items: js.Array[T], sort: TreeItemSorter[T]): js.UndefOr[js.Array[NestedTreeItem[T]]] = js.native
  def buildTree[T /* <: BaseTreeItem */](parentId: TreeItemId, items: js.Array[T]): js.UndefOr[js.Array[NestedTreeItem[T]]] = js.native
  def buildTree[T /* <: BaseTreeItem */](parentId: TreeItemId, items: js.Array[T], sort: TreeItemSorter[T]): js.UndefOr[js.Array[NestedTreeItem[T]]] = js.native
  def default[T /* <: BaseTreeItem */](tree: TreeData[T]): js.Array[NestedTreeItem[T]] = js.native
  def default[T /* <: BaseTreeItem */](tree: TreeData[T], sort: js.UndefOr[scala.Nothing], rootId: TreeItemId): js.Array[NestedTreeItem[T]] = js.native
  def default[T /* <: BaseTreeItem */](tree: TreeData[T], sort: TreeItemSorter[T]): js.Array[NestedTreeItem[T]] = js.native
  def default[T /* <: BaseTreeItem */](tree: TreeData[T], sort: TreeItemSorter[T], rootId: TreeItemId): js.Array[NestedTreeItem[T]] = js.native
  type NestedTreeItem[T /* <: BaseTreeItem */] = T with ChildItems
}

