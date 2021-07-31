package typings.rcTree

import typings.rcTree.anon.DragOver
import typings.rcTree.anon.Index
import typings.rcTree.anon.InitWrapper
import typings.rcTree.anon.KeyEntities
import typings.rcTree.interfaceMod.DataEntity
import typings.rcTree.interfaceMod.DataNode
import typings.rcTree.interfaceMod.EventDataNode
import typings.rcTree.interfaceMod.FlattenNode
import typings.rcTree.interfaceMod.GetKey
import typings.rcTree.interfaceMod.Key
import typings.rcTree.rcTreeBooleans.`true`
import typings.rcTree.treeNodeMod.TreeNodeProps
import typings.react.mod.ReactNode
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object treeUtilMod {
  
  @JSImport("rc-tree/es/utils/treeUtil", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def convertDataToEntities(dataNodes: js.Array[DataNode]): KeyEntities = ^.asInstanceOf[js.Dynamic].applyDynamic("convertDataToEntities")(dataNodes.asInstanceOf[js.Any]).asInstanceOf[KeyEntities]
  @scala.inline
  def convertDataToEntities(
    dataNodes: js.Array[DataNode],
    hasInitWrapperProcessEntityOnProcessFinished: Unit,
    externalGetKey: String
  ): KeyEntities = (^.asInstanceOf[js.Dynamic].applyDynamic("convertDataToEntities")(dataNodes.asInstanceOf[js.Any], hasInitWrapperProcessEntityOnProcessFinished.asInstanceOf[js.Any], externalGetKey.asInstanceOf[js.Any])).asInstanceOf[KeyEntities]
  @scala.inline
  def convertDataToEntities(
    dataNodes: js.Array[DataNode],
    hasInitWrapperProcessEntityOnProcessFinished: Unit,
    externalGetKey: GetKey[DataNode]
  ): KeyEntities = (^.asInstanceOf[js.Dynamic].applyDynamic("convertDataToEntities")(dataNodes.asInstanceOf[js.Any], hasInitWrapperProcessEntityOnProcessFinished.asInstanceOf[js.Any], externalGetKey.asInstanceOf[js.Any])).asInstanceOf[KeyEntities]
  @scala.inline
  def convertDataToEntities(dataNodes: js.Array[DataNode], hasInitWrapperProcessEntityOnProcessFinished: InitWrapper): KeyEntities = (^.asInstanceOf[js.Dynamic].applyDynamic("convertDataToEntities")(dataNodes.asInstanceOf[js.Any], hasInitWrapperProcessEntityOnProcessFinished.asInstanceOf[js.Any])).asInstanceOf[KeyEntities]
  @scala.inline
  def convertDataToEntities(
    dataNodes: js.Array[DataNode],
    hasInitWrapperProcessEntityOnProcessFinished: InitWrapper,
    externalGetKey: String
  ): KeyEntities = (^.asInstanceOf[js.Dynamic].applyDynamic("convertDataToEntities")(dataNodes.asInstanceOf[js.Any], hasInitWrapperProcessEntityOnProcessFinished.asInstanceOf[js.Any], externalGetKey.asInstanceOf[js.Any])).asInstanceOf[KeyEntities]
  @scala.inline
  def convertDataToEntities(
    dataNodes: js.Array[DataNode],
    hasInitWrapperProcessEntityOnProcessFinished: InitWrapper,
    externalGetKey: GetKey[DataNode]
  ): KeyEntities = (^.asInstanceOf[js.Dynamic].applyDynamic("convertDataToEntities")(dataNodes.asInstanceOf[js.Any], hasInitWrapperProcessEntityOnProcessFinished.asInstanceOf[js.Any], externalGetKey.asInstanceOf[js.Any])).asInstanceOf[KeyEntities]
  
  @scala.inline
  def convertNodePropsToEventData(props: TreeNodeProps): EventDataNode = ^.asInstanceOf[js.Dynamic].applyDynamic("convertNodePropsToEventData")(props.asInstanceOf[js.Any]).asInstanceOf[EventDataNode]
  
  @scala.inline
  def convertTreeToData(rootNodes: ReactNode): js.Array[DataNode] = ^.asInstanceOf[js.Dynamic].applyDynamic("convertTreeToData")(rootNodes.asInstanceOf[js.Any]).asInstanceOf[js.Array[DataNode]]
  
  @scala.inline
  def flattenTreeData(): js.Array[FlattenNode] = ^.asInstanceOf[js.Dynamic].applyDynamic("flattenTreeData")().asInstanceOf[js.Array[FlattenNode]]
  @scala.inline
  def flattenTreeData(treeNodeList: js.Array[DataNode]): js.Array[FlattenNode] = ^.asInstanceOf[js.Dynamic].applyDynamic("flattenTreeData")(treeNodeList.asInstanceOf[js.Any]).asInstanceOf[js.Array[FlattenNode]]
  @scala.inline
  def flattenTreeData(treeNodeList: js.Array[DataNode], expandedKeys: js.Array[Key]): js.Array[FlattenNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("flattenTreeData")(treeNodeList.asInstanceOf[js.Any], expandedKeys.asInstanceOf[js.Any])).asInstanceOf[js.Array[FlattenNode]]
  @scala.inline
  def flattenTreeData(treeNodeList: Unit, expandedKeys: js.Array[Key]): js.Array[FlattenNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("flattenTreeData")(treeNodeList.asInstanceOf[js.Any], expandedKeys.asInstanceOf[js.Any])).asInstanceOf[js.Array[FlattenNode]]
  
  @scala.inline
  def flattenTreeData_true(treeNodeList: js.Array[DataNode], expandedKeys: `true`): js.Array[FlattenNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("flattenTreeData")(treeNodeList.asInstanceOf[js.Any], expandedKeys.asInstanceOf[js.Any])).asInstanceOf[js.Array[FlattenNode]]
  @scala.inline
  def flattenTreeData_true(treeNodeList: Unit, expandedKeys: `true`): js.Array[FlattenNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("flattenTreeData")(treeNodeList.asInstanceOf[js.Any], expandedKeys.asInstanceOf[js.Any])).asInstanceOf[js.Array[FlattenNode]]
  
  @scala.inline
  def getKey(key: Key, pos: String): String | Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getKey")(key.asInstanceOf[js.Any], pos.asInstanceOf[js.Any])).asInstanceOf[String | Double]
  
  @scala.inline
  def getTreeNodeProps(
    key: Key,
    hasExpandedKeysSelectedKeysLoadedKeysLoadingKeysCheckedKeysHalfCheckedKeysDragOverNodeKeyDropPositionKeyEntities: TreeNodeRequiredProps
  ): DragOver = (^.asInstanceOf[js.Dynamic].applyDynamic("getTreeNodeProps")(key.asInstanceOf[js.Any], hasExpandedKeysSelectedKeysLoadedKeysLoadingKeysCheckedKeysHalfCheckedKeysDragOverNodeKeyDropPositionKeyEntities.asInstanceOf[js.Any])).asInstanceOf[DragOver]
  
  @scala.inline
  def traverseDataNodes(dataNodes: js.Array[DataNode], callback: js.Function1[/* data */ Index, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("traverseDataNodes")(dataNodes.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def traverseDataNodes(
    dataNodes: js.Array[DataNode],
    callback: js.Function1[/* data */ Index, Unit],
    externalGetKey: String
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("traverseDataNodes")(dataNodes.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], externalGetKey.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def traverseDataNodes(
    dataNodes: js.Array[DataNode],
    callback: js.Function1[/* data */ Index, Unit],
    externalGetKey: GetKey[DataNode]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("traverseDataNodes")(dataNodes.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], externalGetKey.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def warningWithoutKey(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("warningWithoutKey")().asInstanceOf[Unit]
  @scala.inline
  def warningWithoutKey(treeData: js.Array[DataNode]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("warningWithoutKey")(treeData.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  trait TreeNodeRequiredProps extends StObject {
    
    var checkedKeys: js.Array[Key]
    
    var dragOverNodeKey: Key
    
    var dropPosition: Double
    
    var expandedKeys: js.Array[Key]
    
    var halfCheckedKeys: js.Array[Key]
    
    var keyEntities: Record[Key, DataEntity]
    
    var loadedKeys: js.Array[Key]
    
    var loadingKeys: js.Array[Key]
    
    var selectedKeys: js.Array[Key]
  }
  object TreeNodeRequiredProps {
    
    @scala.inline
    def apply(
      checkedKeys: js.Array[Key],
      dragOverNodeKey: Key,
      dropPosition: Double,
      expandedKeys: js.Array[Key],
      halfCheckedKeys: js.Array[Key],
      keyEntities: Record[Key, DataEntity],
      loadedKeys: js.Array[Key],
      loadingKeys: js.Array[Key],
      selectedKeys: js.Array[Key]
    ): TreeNodeRequiredProps = {
      val __obj = js.Dynamic.literal(checkedKeys = checkedKeys.asInstanceOf[js.Any], dragOverNodeKey = dragOverNodeKey.asInstanceOf[js.Any], dropPosition = dropPosition.asInstanceOf[js.Any], expandedKeys = expandedKeys.asInstanceOf[js.Any], halfCheckedKeys = halfCheckedKeys.asInstanceOf[js.Any], keyEntities = keyEntities.asInstanceOf[js.Any], loadedKeys = loadedKeys.asInstanceOf[js.Any], loadingKeys = loadingKeys.asInstanceOf[js.Any], selectedKeys = selectedKeys.asInstanceOf[js.Any])
      __obj.asInstanceOf[TreeNodeRequiredProps]
    }
    
    @scala.inline
    implicit class TreeNodeRequiredPropsMutableBuilder[Self <: TreeNodeRequiredProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCheckedKeys(value: js.Array[Key]): Self = StObject.set(x, "checkedKeys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckedKeysVarargs(value: Key*): Self = StObject.set(x, "checkedKeys", js.Array(value :_*))
      
      @scala.inline
      def setDragOverNodeKey(value: Key): Self = StObject.set(x, "dragOverNodeKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDropPosition(value: Double): Self = StObject.set(x, "dropPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpandedKeys(value: js.Array[Key]): Self = StObject.set(x, "expandedKeys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpandedKeysVarargs(value: Key*): Self = StObject.set(x, "expandedKeys", js.Array(value :_*))
      
      @scala.inline
      def setHalfCheckedKeys(value: js.Array[Key]): Self = StObject.set(x, "halfCheckedKeys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHalfCheckedKeysVarargs(value: Key*): Self = StObject.set(x, "halfCheckedKeys", js.Array(value :_*))
      
      @scala.inline
      def setKeyEntities(value: Record[Key, DataEntity]): Self = StObject.set(x, "keyEntities", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadedKeys(value: js.Array[Key]): Self = StObject.set(x, "loadedKeys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadedKeysVarargs(value: Key*): Self = StObject.set(x, "loadedKeys", js.Array(value :_*))
      
      @scala.inline
      def setLoadingKeys(value: js.Array[Key]): Self = StObject.set(x, "loadingKeys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadingKeysVarargs(value: Key*): Self = StObject.set(x, "loadingKeys", js.Array(value :_*))
      
      @scala.inline
      def setSelectedKeys(value: js.Array[Key]): Self = StObject.set(x, "selectedKeys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedKeysVarargs(value: Key*): Self = StObject.set(x, "selectedKeys", js.Array(value :_*))
    }
  }
  
  trait Wrapper extends StObject {
    
    var keyEntities: Record[Key, DataEntity]
    
    var posEntities: Record[String, DataEntity]
  }
  object Wrapper {
    
    @scala.inline
    def apply(keyEntities: Record[Key, DataEntity], posEntities: Record[String, DataEntity]): Wrapper = {
      val __obj = js.Dynamic.literal(keyEntities = keyEntities.asInstanceOf[js.Any], posEntities = posEntities.asInstanceOf[js.Any])
      __obj.asInstanceOf[Wrapper]
    }
    
    @scala.inline
    implicit class WrapperMutableBuilder[Self <: Wrapper] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKeyEntities(value: Record[Key, DataEntity]): Self = StObject.set(x, "keyEntities", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPosEntities(value: Record[String, DataEntity]): Self = StObject.set(x, "posEntities", value.asInstanceOf[js.Any])
    }
  }
}
