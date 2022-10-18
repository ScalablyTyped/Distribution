package typings.rcTree

import typings.rcTree.anon.Add
import typings.rcTree.esInterfaceMod.DataNode
import typings.rcTree.esInterfaceMod.FlattenNode
import typings.rcTree.esInterfaceMod.Key
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esUtilsDiffUtilMod {
  
  @JSImport("rc-tree/es/utils/diffUtil", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def findExpandedKeys(): Add = ^.asInstanceOf[js.Dynamic].applyDynamic("findExpandedKeys")().asInstanceOf[Add]
  inline def findExpandedKeys(prev: js.Array[Key]): Add = ^.asInstanceOf[js.Dynamic].applyDynamic("findExpandedKeys")(prev.asInstanceOf[js.Any]).asInstanceOf[Add]
  inline def findExpandedKeys(prev: js.Array[Key], next: js.Array[Key]): Add = (^.asInstanceOf[js.Dynamic].applyDynamic("findExpandedKeys")(prev.asInstanceOf[js.Any], next.asInstanceOf[js.Any])).asInstanceOf[Add]
  inline def findExpandedKeys(prev: Unit, next: js.Array[Key]): Add = (^.asInstanceOf[js.Dynamic].applyDynamic("findExpandedKeys")(prev.asInstanceOf[js.Any], next.asInstanceOf[js.Any])).asInstanceOf[Add]
  
  inline def getExpandRange(shorter: js.Array[FlattenNode[DataNode]], longer: js.Array[FlattenNode[DataNode]], key: Key): js.Array[FlattenNode[DataNode]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getExpandRange")(shorter.asInstanceOf[js.Any], longer.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Array[FlattenNode[DataNode]]]
}
