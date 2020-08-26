package typings.reactMdTree

import typings.reactMdTree.typesMod.BaseTreeItem
import typings.reactMdTree.typesMod.TreeData
import typings.reactMdTree.typesMod.TreeItemId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@react-md/tree/types/getChildItems", JSImport.Namespace)
@js.native
object getChildItemsMod extends js.Object {
  def default[T /* <: BaseTreeItem */](data: js.Array[T]): js.Array[T] = js.native
  def default[T /* <: BaseTreeItem */](data: js.Array[T], parentId: Null, recursive: Boolean): js.Array[T] = js.native
  def default[T /* <: BaseTreeItem */](data: js.Array[T], parentId: TreeItemId): js.Array[T] = js.native
  def default[T /* <: BaseTreeItem */](data: js.Array[T], parentId: TreeItemId, recursive: Boolean): js.Array[T] = js.native
  def default[T /* <: BaseTreeItem */](data: TreeData[T]): js.Array[T] = js.native
  def default[T /* <: BaseTreeItem */](data: TreeData[T], parentId: Null, recursive: Boolean): js.Array[T] = js.native
  def default[T /* <: BaseTreeItem */](data: TreeData[T], parentId: TreeItemId): js.Array[T] = js.native
  def default[T /* <: BaseTreeItem */](data: TreeData[T], parentId: TreeItemId, recursive: Boolean): js.Array[T] = js.native
}

