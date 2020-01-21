package typings.reactSortableTree

import typings.reactSortableTree.mod.SearchData
import typings.reactSortableTree.mod.TreeIndex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-sortable-tree/utils/default-handlers", JSImport.Namespace)
@js.native
object defaultHandlersMod extends js.Object {
  def defaultGetNodeKey(data: TreeIndex): Double = js.native
  def defaultSearchMethod(data: SearchData): Boolean = js.native
}

