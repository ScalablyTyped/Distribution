package typings.rcTree

import typings.rcTree.anon.Add
import typings.rcTree.interfaceMod.FlattenNode
import typings.rcTree.interfaceMod.Key
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object diffUtilMod {
  
  @JSImport("rc-tree/es/utils/diffUtil", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def findExpandedKeys(): Add = ^.asInstanceOf[js.Dynamic].applyDynamic("findExpandedKeys")().asInstanceOf[Add]
  @scala.inline
  def findExpandedKeys(prev: js.Array[Key]): Add = ^.asInstanceOf[js.Dynamic].applyDynamic("findExpandedKeys")(prev.asInstanceOf[js.Any]).asInstanceOf[Add]
  @scala.inline
  def findExpandedKeys(prev: js.Array[Key], next: js.Array[Key]): Add = (^.asInstanceOf[js.Dynamic].applyDynamic("findExpandedKeys")(prev.asInstanceOf[js.Any], next.asInstanceOf[js.Any])).asInstanceOf[Add]
  @scala.inline
  def findExpandedKeys(prev: Unit, next: js.Array[Key]): Add = (^.asInstanceOf[js.Dynamic].applyDynamic("findExpandedKeys")(prev.asInstanceOf[js.Any], next.asInstanceOf[js.Any])).asInstanceOf[Add]
  
  @scala.inline
  def getExpandRange(shorter: js.Array[FlattenNode], longer: js.Array[FlattenNode], key: Key): js.Array[FlattenNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("getExpandRange")(shorter.asInstanceOf[js.Any], longer.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Array[FlattenNode]]
}
