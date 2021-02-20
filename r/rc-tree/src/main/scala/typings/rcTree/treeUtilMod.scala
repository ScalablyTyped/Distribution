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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object treeUtilMod {
  
  @JSImport("rc-tree/es/utils/treeUtil", "convertDataToEntities")
  @js.native
  def convertDataToEntities(dataNodes: js.Array[DataNode]): KeyEntities = js.native
  @JSImport("rc-tree/es/utils/treeUtil", "convertDataToEntities")
  @js.native
  def convertDataToEntities(
    dataNodes: js.Array[DataNode],
    hasInitWrapperProcessEntityOnProcessFinished: js.UndefOr[scala.Nothing],
    externalGetKey: String
  ): KeyEntities = js.native
  @JSImport("rc-tree/es/utils/treeUtil", "convertDataToEntities")
  @js.native
  def convertDataToEntities(
    dataNodes: js.Array[DataNode],
    hasInitWrapperProcessEntityOnProcessFinished: js.UndefOr[scala.Nothing],
    externalGetKey: GetKey[DataNode]
  ): KeyEntities = js.native
  @JSImport("rc-tree/es/utils/treeUtil", "convertDataToEntities")
  @js.native
  def convertDataToEntities(dataNodes: js.Array[DataNode], hasInitWrapperProcessEntityOnProcessFinished: InitWrapper): KeyEntities = js.native
  @JSImport("rc-tree/es/utils/treeUtil", "convertDataToEntities")
  @js.native
  def convertDataToEntities(
    dataNodes: js.Array[DataNode],
    hasInitWrapperProcessEntityOnProcessFinished: InitWrapper,
    externalGetKey: String
  ): KeyEntities = js.native
  @JSImport("rc-tree/es/utils/treeUtil", "convertDataToEntities")
  @js.native
  def convertDataToEntities(
    dataNodes: js.Array[DataNode],
    hasInitWrapperProcessEntityOnProcessFinished: InitWrapper,
    externalGetKey: GetKey[DataNode]
  ): KeyEntities = js.native
  
  @JSImport("rc-tree/es/utils/treeUtil", "convertNodePropsToEventData")
  @js.native
  def convertNodePropsToEventData(props: TreeNodeProps): EventDataNode = js.native
  
  @JSImport("rc-tree/es/utils/treeUtil", "convertTreeToData")
  @js.native
  def convertTreeToData(rootNodes: ReactNode): js.Array[DataNode] = js.native
  
  @JSImport("rc-tree/es/utils/treeUtil", "flattenTreeData")
  @js.native
  def flattenTreeData(): js.Array[FlattenNode] = js.native
  @JSImport("rc-tree/es/utils/treeUtil", "flattenTreeData")
  @js.native
  def flattenTreeData(treeNodeList: js.UndefOr[scala.Nothing], expandedKeys: js.Array[Key]): js.Array[FlattenNode] = js.native
  @JSImport("rc-tree/es/utils/treeUtil", "flattenTreeData")
  @js.native
  def flattenTreeData(treeNodeList: js.Array[DataNode]): js.Array[FlattenNode] = js.native
  @JSImport("rc-tree/es/utils/treeUtil", "flattenTreeData")
  @js.native
  def flattenTreeData(treeNodeList: js.Array[DataNode], expandedKeys: js.Array[Key]): js.Array[FlattenNode] = js.native
  @JSImport("rc-tree/es/utils/treeUtil", "flattenTreeData")
  @js.native
  def flattenTreeData_true(treeNodeList: js.UndefOr[scala.Nothing], expandedKeys: `true`): js.Array[FlattenNode] = js.native
  @JSImport("rc-tree/es/utils/treeUtil", "flattenTreeData")
  @js.native
  def flattenTreeData_true(treeNodeList: js.Array[DataNode], expandedKeys: `true`): js.Array[FlattenNode] = js.native
  
  @JSImport("rc-tree/es/utils/treeUtil", "getKey")
  @js.native
  def getKey(key: Key, pos: String): String | Double = js.native
  
  @JSImport("rc-tree/es/utils/treeUtil", "getTreeNodeProps")
  @js.native
  def getTreeNodeProps(
    key: Key,
    hasExpandedKeysSelectedKeysLoadedKeysLoadingKeysCheckedKeysHalfCheckedKeysDragOverNodeKeyDropPositionKeyEntities: TreeNodeRequiredProps
  ): DragOver = js.native
  
  @JSImport("rc-tree/es/utils/treeUtil", "traverseDataNodes")
  @js.native
  def traverseDataNodes(dataNodes: js.Array[DataNode], callback: js.Function1[/* data */ Index, Unit]): Unit = js.native
  @JSImport("rc-tree/es/utils/treeUtil", "traverseDataNodes")
  @js.native
  def traverseDataNodes(
    dataNodes: js.Array[DataNode],
    callback: js.Function1[/* data */ Index, Unit],
    externalGetKey: String
  ): Unit = js.native
  @JSImport("rc-tree/es/utils/treeUtil", "traverseDataNodes")
  @js.native
  def traverseDataNodes(
    dataNodes: js.Array[DataNode],
    callback: js.Function1[/* data */ Index, Unit],
    externalGetKey: GetKey[DataNode]
  ): Unit = js.native
  
  @JSImport("rc-tree/es/utils/treeUtil", "warningWithoutKey")
  @js.native
  def warningWithoutKey(): Unit = js.native
  @JSImport("rc-tree/es/utils/treeUtil", "warningWithoutKey")
  @js.native
  def warningWithoutKey(treeData: js.Array[DataNode]): Unit = js.native
  
  @js.native
  trait TreeNodeRequiredProps extends StObject {
    
    var checkedKeys: js.Array[Key] = js.native
    
    var dragOverNodeKey: Key = js.native
    
    var dropPosition: Double = js.native
    
    var expandedKeys: js.Array[Key] = js.native
    
    var halfCheckedKeys: js.Array[Key] = js.native
    
    var keyEntities: Record[Key, DataEntity] = js.native
    
    var loadedKeys: js.Array[Key] = js.native
    
    var loadingKeys: js.Array[Key] = js.native
    
    var selectedKeys: js.Array[Key] = js.native
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
  
  @js.native
  trait Wrapper extends StObject {
    
    var keyEntities: Record[Key, DataEntity] = js.native
    
    var posEntities: Record[String, DataEntity] = js.native
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
