package typings.rcTree

import typings.rcTree.anon.Add
import typings.rcTree.interfaceMod.FlattenNode
import typings.rcTree.interfaceMod.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rc-tree/es/utils/diffUtil", JSImport.Namespace)
@js.native
object diffUtilMod extends js.Object {
  def findExpandedKeys(): Add = js.native
  def findExpandedKeys(prev: js.UndefOr[scala.Nothing], next: js.Array[Key]): Add = js.native
  def findExpandedKeys(prev: js.Array[Key]): Add = js.native
  def findExpandedKeys(prev: js.Array[Key], next: js.Array[Key]): Add = js.native
  def getExpandRange(shorter: js.Array[FlattenNode], longer: js.Array[FlattenNode], key: Key): js.Array[FlattenNode] = js.native
}

