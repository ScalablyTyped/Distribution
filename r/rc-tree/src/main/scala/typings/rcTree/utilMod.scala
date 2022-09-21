package typings.rcTree

import typings.rcTree.anon.Checked
import typings.rcTree.anon.DragOverNodeKey
import typings.rcTree.anon.ProcessProps
import typings.rcTree.anon.X
import typings.rcTree.interfaceMod.BasicDataNode
import typings.rcTree.interfaceMod.DataEntity
import typings.rcTree.interfaceMod.DataNode
import typings.rcTree.interfaceMod.Direction
import typings.rcTree.interfaceMod.FlattenNode
import typings.rcTree.interfaceMod.Key
import typings.rcTree.interfaceMod.NodeElement
import typings.rcTree.interfaceMod.NodeInstance
import typings.rcTree.treeMod.AllowDrop
import typings.rcTree.treeMod.TreeProps
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.std.Element
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilMod {
  
  @JSImport("rc-tree/es/util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def arrAdd(list: js.Array[Key], value: Key): js.Array[Key] = (^.asInstanceOf[js.Dynamic].applyDynamic("arrAdd")(list.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Array[Key]]
  
  inline def arrDel(list: js.Array[Key], value: Key): js.Array[Key] = (^.asInstanceOf[js.Dynamic].applyDynamic("arrDel")(list.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Array[Key]]
  
  inline def calcDropPosition[TreeDataType /* <: BasicDataNode */](
    event: MouseEvent[Element, NativeMouseEvent],
    dragNode: NodeInstance[TreeDataType],
    targetNode: NodeInstance[TreeDataType],
    indent: Double,
    startMousePosition: X,
    allowDrop: AllowDrop[TreeDataType],
    flattenedNodes: js.Array[FlattenNode[TreeDataType]],
    keyEntities: Record[Key, DataEntity[TreeDataType]],
    expandKeys: js.Array[Key],
    direction: Direction
  ): DragOverNodeKey = (^.asInstanceOf[js.Dynamic].applyDynamic("calcDropPosition")(event.asInstanceOf[js.Any], dragNode.asInstanceOf[js.Any], targetNode.asInstanceOf[js.Any], indent.asInstanceOf[js.Any], startMousePosition.asInstanceOf[js.Any], allowDrop.asInstanceOf[js.Any], flattenedNodes.asInstanceOf[js.Any], keyEntities.asInstanceOf[js.Any], expandKeys.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[DragOverNodeKey]
  
  inline def calcSelectedKeys(selectedKeys: js.Array[Key], props: TreeProps[DataNode]): js.Array[Key] = (^.asInstanceOf[js.Dynamic].applyDynamic("calcSelectedKeys")(selectedKeys.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[js.Array[Key]]
  
  inline def conductExpandParent(keyList: js.Array[Key], keyEntities: Record[Key, DataEntity[DataNode]]): js.Array[Key] = (^.asInstanceOf[js.Dynamic].applyDynamic("conductExpandParent")(keyList.asInstanceOf[js.Any], keyEntities.asInstanceOf[js.Any])).asInstanceOf[js.Array[Key]]
  
  inline def convertDataToTree(treeData: js.Array[DataNode]): js.Array[NodeElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("convertDataToTree")(treeData.asInstanceOf[js.Any]).asInstanceOf[js.Array[NodeElement]]
  inline def convertDataToTree(treeData: js.Array[DataNode], processor: ProcessProps): js.Array[NodeElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("convertDataToTree")(treeData.asInstanceOf[js.Any], processor.asInstanceOf[js.Any])).asInstanceOf[js.Array[NodeElement]]
  
  inline def getDragChildrenKeys[TreeDataType /* <: BasicDataNode */](dragNodeKey: Key, keyEntities: Record[Key, DataEntity[TreeDataType]]): js.Array[Key] = (^.asInstanceOf[js.Dynamic].applyDynamic("getDragChildrenKeys")(dragNodeKey.asInstanceOf[js.Any], keyEntities.asInstanceOf[js.Any])).asInstanceOf[js.Array[Key]]
  
  inline def getPosition(level: String, index: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getPosition")(level.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def getPosition(level: Double, index: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getPosition")(level.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def isFirstChild[TreeDataType /* <: BasicDataNode */](treeNodeEntity: DataEntity[TreeDataType]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFirstChild")(treeNodeEntity.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isLastChild[TreeDataType /* <: BasicDataNode */](treeNodeEntity: DataEntity[TreeDataType]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLastChild")(treeNodeEntity.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isTreeNode(node: NodeElement): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTreeNode")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def parseCheckedKeys(keys: js.Array[Key]): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("parseCheckedKeys")(keys.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def parseCheckedKeys(keys: Checked): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("parseCheckedKeys")(keys.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def posToArr(pos: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("posToArr")(pos.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
}
