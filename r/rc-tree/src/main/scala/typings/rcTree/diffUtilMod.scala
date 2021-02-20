package typings.rcTree

import typings.rcTree.anon.Add
import typings.rcTree.interfaceMod.FlattenNode
import typings.rcTree.interfaceMod.Key
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object diffUtilMod {
  
  @JSImport("rc-tree/es/utils/diffUtil", "findExpandedKeys")
  @js.native
  def findExpandedKeys(): Add = js.native
  @JSImport("rc-tree/es/utils/diffUtil", "findExpandedKeys")
  @js.native
  def findExpandedKeys(prev: js.UndefOr[scala.Nothing], next: js.Array[Key]): Add = js.native
  @JSImport("rc-tree/es/utils/diffUtil", "findExpandedKeys")
  @js.native
  def findExpandedKeys(prev: js.Array[Key]): Add = js.native
  @JSImport("rc-tree/es/utils/diffUtil", "findExpandedKeys")
  @js.native
  def findExpandedKeys(prev: js.Array[Key], next: js.Array[Key]): Add = js.native
  
  @JSImport("rc-tree/es/utils/diffUtil", "getExpandRange")
  @js.native
  def getExpandRange(shorter: js.Array[FlattenNode], longer: js.Array[FlattenNode], key: Key): js.Array[FlattenNode] = js.native
}
