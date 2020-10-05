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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rc-tree/es/util", JSImport.Namespace)
@js.native
object utilMod extends js.Object {
  def arrAdd(list: js.Array[Key], value: Key): js.Array[String | Double] = js.native
  def arrDel(list: js.Array[Key], value: Key): js.Array[String | Double] = js.native
  def calcDropPosition(event: MouseEvent[Element, NativeMouseEvent], treeNode: NodeInstance): `1` | `-1` | `0` = js.native
  def calcSelectedKeys(selectedKeys: js.Array[Key], props: TreeProps): js.Array[String | Double] = js.native
  def conductExpandParent(keyList: js.Array[Key], keyEntities: Record[Key, DataEntity]): js.Array[Key] = js.native
  def convertDataToTree(treeData: js.Array[DataNode]): js.Array[NodeElement] = js.native
  def convertDataToTree(treeData: js.Array[DataNode], processor: ProcessProps): js.Array[NodeElement] = js.native
  def getDataAndAria(props: Partial[TreeProps | TreeNodeProps]): Record[String, String] = js.native
  def getDragNodesKeys(dragNodeKey: Key, keyEntities: Record[Key, DataEntity]): js.Array[Key] = js.native
  def getPosition(level: String, index: Double): String = js.native
  def getPosition(level: Double, index: Double): String = js.native
  def isTreeNode(node: NodeElement): Boolean = js.native
  def parseCheckedKeys(keys: js.Array[Key]): js.Any = js.native
  def parseCheckedKeys(keys: Checked): js.Any = js.native
  def posToArr(pos: String): js.Array[String] = js.native
}

