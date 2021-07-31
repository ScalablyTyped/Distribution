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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilMod {
  
  @JSImport("rc-tree/es/util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def arrAdd(list: js.Array[Key], value: Key): js.Array[String | Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("arrAdd")(list.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Array[String | Double]]
  
  @scala.inline
  def arrDel(list: js.Array[Key], value: Key): js.Array[String | Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("arrDel")(list.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Array[String | Double]]
  
  @scala.inline
  def calcDropPosition(event: MouseEvent[Element, NativeMouseEvent], treeNode: NodeInstance): `1` | `-1` | `0` = (^.asInstanceOf[js.Dynamic].applyDynamic("calcDropPosition")(event.asInstanceOf[js.Any], treeNode.asInstanceOf[js.Any])).asInstanceOf[`1` | `-1` | `0`]
  
  @scala.inline
  def calcSelectedKeys(selectedKeys: js.Array[Key], props: TreeProps): js.Array[String | Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("calcSelectedKeys")(selectedKeys.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[js.Array[String | Double]]
  
  @scala.inline
  def conductExpandParent(keyList: js.Array[Key], keyEntities: Record[Key, DataEntity]): js.Array[Key] = (^.asInstanceOf[js.Dynamic].applyDynamic("conductExpandParent")(keyList.asInstanceOf[js.Any], keyEntities.asInstanceOf[js.Any])).asInstanceOf[js.Array[Key]]
  
  @scala.inline
  def convertDataToTree(treeData: js.Array[DataNode]): js.Array[NodeElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("convertDataToTree")(treeData.asInstanceOf[js.Any]).asInstanceOf[js.Array[NodeElement]]
  @scala.inline
  def convertDataToTree(treeData: js.Array[DataNode], processor: ProcessProps): js.Array[NodeElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("convertDataToTree")(treeData.asInstanceOf[js.Any], processor.asInstanceOf[js.Any])).asInstanceOf[js.Array[NodeElement]]
  
  @scala.inline
  def getDataAndAria(props: Partial[TreeProps | TreeNodeProps]): Record[String, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDataAndAria")(props.asInstanceOf[js.Any]).asInstanceOf[Record[String, String]]
  
  @scala.inline
  def getDragNodesKeys(dragNodeKey: Key, keyEntities: Record[Key, DataEntity]): js.Array[Key] = (^.asInstanceOf[js.Dynamic].applyDynamic("getDragNodesKeys")(dragNodeKey.asInstanceOf[js.Any], keyEntities.asInstanceOf[js.Any])).asInstanceOf[js.Array[Key]]
  
  @scala.inline
  def getPosition(level: String, index: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getPosition")(level.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def getPosition(level: Double, index: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getPosition")(level.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def isTreeNode(node: NodeElement): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTreeNode")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def parseCheckedKeys(keys: js.Array[Key]): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("parseCheckedKeys")(keys.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  @scala.inline
  def parseCheckedKeys(keys: Checked): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("parseCheckedKeys")(keys.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  @scala.inline
  def posToArr(pos: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("posToArr")(pos.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
}
