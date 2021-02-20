package typings.rcTree

import typings.rcTree.anon.Checked
import typings.rcTree.anon.ProcessProps
import typings.rcTree.interfaceMod.DataEntity
import typings.rcTree.interfaceMod.DataNode
import typings.rcTree.interfaceMod.Key
import typings.rcTree.interfaceMod.NodeElement
import typings.rcTree.interfaceMod.NodeInstance
import typings.rcTree.rcTreeNumbers.`-1`
import typings.rcTree.rcTreeNumbers.`0`
import typings.rcTree.rcTreeNumbers.`1`
import typings.rcTree.treeMod.TreeProps
import typings.rcTree.treeNodeMod.TreeNodeProps
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.std.Element
import typings.std.Partial
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilMod {
  
  @JSImport("rc-tree/es/util", "arrAdd")
  @js.native
  def arrAdd(list: js.Array[Key], value: Key): js.Array[String | Double] = js.native
  
  @JSImport("rc-tree/es/util", "arrDel")
  @js.native
  def arrDel(list: js.Array[Key], value: Key): js.Array[String | Double] = js.native
  
  @JSImport("rc-tree/es/util", "calcDropPosition")
  @js.native
  def calcDropPosition(event: MouseEvent[Element, NativeMouseEvent], treeNode: NodeInstance): `1` | `-1` | `0` = js.native
  
  @JSImport("rc-tree/es/util", "calcSelectedKeys")
  @js.native
  def calcSelectedKeys(selectedKeys: js.Array[Key], props: TreeProps): js.Array[String | Double] = js.native
  
  @JSImport("rc-tree/es/util", "conductExpandParent")
  @js.native
  def conductExpandParent(keyList: js.Array[Key], keyEntities: Record[Key, DataEntity]): js.Array[Key] = js.native
  
  @JSImport("rc-tree/es/util", "convertDataToTree")
  @js.native
  def convertDataToTree(treeData: js.Array[DataNode]): js.Array[NodeElement] = js.native
  @JSImport("rc-tree/es/util", "convertDataToTree")
  @js.native
  def convertDataToTree(treeData: js.Array[DataNode], processor: ProcessProps): js.Array[NodeElement] = js.native
  
  @JSImport("rc-tree/es/util", "getDataAndAria")
  @js.native
  def getDataAndAria(props: Partial[TreeProps | TreeNodeProps]): Record[String, String] = js.native
  
  @JSImport("rc-tree/es/util", "getDragNodesKeys")
  @js.native
  def getDragNodesKeys(dragNodeKey: Key, keyEntities: Record[Key, DataEntity]): js.Array[Key] = js.native
  
  @JSImport("rc-tree/es/util", "getPosition")
  @js.native
  def getPosition(level: String, index: Double): String = js.native
  @JSImport("rc-tree/es/util", "getPosition")
  @js.native
  def getPosition(level: Double, index: Double): String = js.native
  
  @JSImport("rc-tree/es/util", "isTreeNode")
  @js.native
  def isTreeNode(node: NodeElement): Boolean = js.native
  
  @JSImport("rc-tree/es/util", "parseCheckedKeys")
  @js.native
  def parseCheckedKeys(keys: js.Array[Key]): js.Any = js.native
  @JSImport("rc-tree/es/util", "parseCheckedKeys")
  @js.native
  def parseCheckedKeys(keys: Checked): js.Any = js.native
  
  @JSImport("rc-tree/es/util", "posToArr")
  @js.native
  def posToArr(pos: String): js.Array[String] = js.native
}
