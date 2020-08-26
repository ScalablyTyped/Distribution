package typings.reactMdTree

import typings.reactMdTree.typesMod.BaseTreeItem
import typings.reactMdTree.typesMod.TreeData
import typings.reactMdTree.typesMod.TreeItemId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@react-md/tree/types/getItemsFrom", JSImport.Namespace)
@js.native
object getItemsFromMod extends js.Object {
  def default[T /* <: BaseTreeItem */](data: TreeData[T]): js.Array[T] = js.native
  def default[T /* <: BaseTreeItem */](data: TreeData[T], itemId: TreeItemId): js.Array[T] = js.native
}

