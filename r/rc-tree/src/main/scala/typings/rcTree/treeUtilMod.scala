package typings.rcTree

import typings.rcTree.anon.ChildrenPropName
import typings.rcTree.anon.DragOver
import typings.rcTree.anon.Index
import typings.rcTree.anon.KeyEntities
import typings.rcTree.anon.RequiredFieldNames
import typings.rcTree.interfaceMod.BasicDataNode
import typings.rcTree.interfaceMod.DataEntity
import typings.rcTree.interfaceMod.DataNode
import typings.rcTree.interfaceMod.EventDataNode
import typings.rcTree.interfaceMod.FieldNames
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
  
  inline def convertDataToEntities(dataNodes: js.Array[DataNode]): KeyEntities = ^.asInstanceOf[js.Dynamic].applyDynamic("convertDataToEntities")(dataNodes.asInstanceOf[js.Any]).asInstanceOf[KeyEntities]
  inline def convertDataToEntities(
    dataNodes: js.Array[DataNode],
    hasInitWrapperProcessEntityOnProcessFinishedExternalGetKeyChildrenPropNameFieldNames: Unit,
    /** @deprecated Use `config.externalGetKey` instead */
  legacyExternalGetKey: ExternalGetKey
  ): KeyEntities = (^.asInstanceOf[js.Dynamic].applyDynamic("convertDataToEntities")(dataNodes.asInstanceOf[js.Any], hasInitWrapperProcessEntityOnProcessFinishedExternalGetKeyChildrenPropNameFieldNames.asInstanceOf[js.Any], legacyExternalGetKey.asInstanceOf[js.Any])).asInstanceOf[KeyEntities]
  inline def convertDataToEntities(
    dataNodes: js.Array[DataNode],
    hasInitWrapperProcessEntityOnProcessFinishedExternalGetKeyChildrenPropNameFieldNames: ChildrenPropName
  ): KeyEntities = (^.asInstanceOf[js.Dynamic].applyDynamic("convertDataToEntities")(dataNodes.asInstanceOf[js.Any], hasInitWrapperProcessEntityOnProcessFinishedExternalGetKeyChildrenPropNameFieldNames.asInstanceOf[js.Any])).asInstanceOf[KeyEntities]
  inline def convertDataToEntities(
    dataNodes: js.Array[DataNode],
    hasInitWrapperProcessEntityOnProcessFinishedExternalGetKeyChildrenPropNameFieldNames: ChildrenPropName,
    /** @deprecated Use `config.externalGetKey` instead */
  legacyExternalGetKey: ExternalGetKey
  ): KeyEntities = (^.asInstanceOf[js.Dynamic].applyDynamic("convertDataToEntities")(dataNodes.asInstanceOf[js.Any], hasInitWrapperProcessEntityOnProcessFinishedExternalGetKeyChildrenPropNameFieldNames.asInstanceOf[js.Any], legacyExternalGetKey.asInstanceOf[js.Any])).asInstanceOf[KeyEntities]
  
  inline def convertNodePropsToEventData[TreeDataType /* <: BasicDataNode */](props: TreeNodeProps[TreeDataType]): EventDataNode[TreeDataType] = ^.asInstanceOf[js.Dynamic].applyDynamic("convertNodePropsToEventData")(props.asInstanceOf[js.Any]).asInstanceOf[EventDataNode[TreeDataType]]
  
  inline def convertTreeToData(rootNodes: ReactNode): js.Array[DataNode] = ^.asInstanceOf[js.Dynamic].applyDynamic("convertTreeToData")(rootNodes.asInstanceOf[js.Any]).asInstanceOf[js.Array[DataNode]]
  
  inline def fillFieldNames(): RequiredFieldNames = ^.asInstanceOf[js.Dynamic].applyDynamic("fillFieldNames")().asInstanceOf[RequiredFieldNames]
  inline def fillFieldNames(fieldNames: FieldNames): RequiredFieldNames = ^.asInstanceOf[js.Dynamic].applyDynamic("fillFieldNames")(fieldNames.asInstanceOf[js.Any]).asInstanceOf[RequiredFieldNames]
  
  inline def flattenTreeData[TreeDataType /* <: BasicDataNode */](treeNodeList: js.Array[TreeDataType], expandedKeys: js.Array[Key], fieldNames: FieldNames): js.Array[FlattenNode[TreeDataType]] = (^.asInstanceOf[js.Dynamic].applyDynamic("flattenTreeData")(treeNodeList.asInstanceOf[js.Any], expandedKeys.asInstanceOf[js.Any], fieldNames.asInstanceOf[js.Any])).asInstanceOf[js.Array[FlattenNode[TreeDataType]]]
  
  inline def flattenTreeData_true[TreeDataType /* <: BasicDataNode */](treeNodeList: js.Array[TreeDataType], expandedKeys: `true`, fieldNames: FieldNames): js.Array[FlattenNode[TreeDataType]] = (^.asInstanceOf[js.Dynamic].applyDynamic("flattenTreeData")(treeNodeList.asInstanceOf[js.Any], expandedKeys.asInstanceOf[js.Any], fieldNames.asInstanceOf[js.Any])).asInstanceOf[js.Array[FlattenNode[TreeDataType]]]
  
  inline def getKey(key: Key, pos: String): Key = (^.asInstanceOf[js.Dynamic].applyDynamic("getKey")(key.asInstanceOf[js.Any], pos.asInstanceOf[js.Any])).asInstanceOf[Key]
  
  inline def getTreeNodeProps[TreeDataType /* <: BasicDataNode */](
    key: Key,
    hasExpandedKeysSelectedKeysLoadedKeysLoadingKeysCheckedKeysHalfCheckedKeysDragOverNodeKeyDropPositionKeyEntities: TreeNodeRequiredProps[TreeDataType]
  ): DragOver = (^.asInstanceOf[js.Dynamic].applyDynamic("getTreeNodeProps")(key.asInstanceOf[js.Any], hasExpandedKeysSelectedKeysLoadedKeysLoadingKeysCheckedKeysHalfCheckedKeysDragOverNodeKeyDropPositionKeyEntities.asInstanceOf[js.Any])).asInstanceOf[DragOver]
  
  inline def traverseDataNodes(dataNodes: js.Array[DataNode], callback: js.Function1[/* data */ Index, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("traverseDataNodes")(dataNodes.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def traverseDataNodes(dataNodes: js.Array[DataNode], callback: js.Function1[/* data */ Index, Unit], config: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("traverseDataNodes")(dataNodes.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def traverseDataNodes(
    dataNodes: js.Array[DataNode],
    callback: js.Function1[/* data */ Index, Unit],
    config: TraverseDataNodesConfig
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("traverseDataNodes")(dataNodes.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def warningWithoutKey(treeData: js.Array[DataNode], fieldNames: FieldNames): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("warningWithoutKey")(treeData.asInstanceOf[js.Any], fieldNames.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  type ExternalGetKey = GetKey[DataNode] | String
  
  trait TraverseDataNodesConfig extends StObject {
    
    var childrenPropName: js.UndefOr[String] = js.undefined
    
    var externalGetKey: js.UndefOr[ExternalGetKey] = js.undefined
    
    var fieldNames: js.UndefOr[FieldNames] = js.undefined
  }
  object TraverseDataNodesConfig {
    
    inline def apply(): TraverseDataNodesConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TraverseDataNodesConfig]
    }
    
    extension [Self <: TraverseDataNodesConfig](x: Self) {
      
      inline def setChildrenPropName(value: String): Self = StObject.set(x, "childrenPropName", value.asInstanceOf[js.Any])
      
      inline def setChildrenPropNameUndefined: Self = StObject.set(x, "childrenPropName", js.undefined)
      
      inline def setExternalGetKey(value: ExternalGetKey): Self = StObject.set(x, "externalGetKey", value.asInstanceOf[js.Any])
      
      inline def setExternalGetKeyFunction2(value: (DataNode, /* index */ js.UndefOr[Double]) => Key): Self = StObject.set(x, "externalGetKey", js.Any.fromFunction2(value))
      
      inline def setExternalGetKeyUndefined: Self = StObject.set(x, "externalGetKey", js.undefined)
      
      inline def setFieldNames(value: FieldNames): Self = StObject.set(x, "fieldNames", value.asInstanceOf[js.Any])
      
      inline def setFieldNamesUndefined: Self = StObject.set(x, "fieldNames", js.undefined)
    }
  }
  
  trait TreeNodeRequiredProps[TreeDataType /* <: BasicDataNode */] extends StObject {
    
    var checkedKeys: js.Array[Key]
    
    var dragOverNodeKey: Key
    
    var dropPosition: Double
    
    var expandedKeys: js.Array[Key]
    
    var halfCheckedKeys: js.Array[Key]
    
    var keyEntities: Record[Key, DataEntity[TreeDataType]]
    
    var loadedKeys: js.Array[Key]
    
    var loadingKeys: js.Array[Key]
    
    var selectedKeys: js.Array[Key]
  }
  object TreeNodeRequiredProps {
    
    inline def apply[TreeDataType /* <: BasicDataNode */](
      checkedKeys: js.Array[Key],
      dragOverNodeKey: Key,
      dropPosition: Double,
      expandedKeys: js.Array[Key],
      halfCheckedKeys: js.Array[Key],
      keyEntities: Record[Key, DataEntity[TreeDataType]],
      loadedKeys: js.Array[Key],
      loadingKeys: js.Array[Key],
      selectedKeys: js.Array[Key]
    ): TreeNodeRequiredProps[TreeDataType] = {
      val __obj = js.Dynamic.literal(checkedKeys = checkedKeys.asInstanceOf[js.Any], dragOverNodeKey = dragOverNodeKey.asInstanceOf[js.Any], dropPosition = dropPosition.asInstanceOf[js.Any], expandedKeys = expandedKeys.asInstanceOf[js.Any], halfCheckedKeys = halfCheckedKeys.asInstanceOf[js.Any], keyEntities = keyEntities.asInstanceOf[js.Any], loadedKeys = loadedKeys.asInstanceOf[js.Any], loadingKeys = loadingKeys.asInstanceOf[js.Any], selectedKeys = selectedKeys.asInstanceOf[js.Any])
      __obj.asInstanceOf[TreeNodeRequiredProps[TreeDataType]]
    }
    
    extension [Self <: TreeNodeRequiredProps[?], TreeDataType /* <: BasicDataNode */](x: Self & TreeNodeRequiredProps[TreeDataType]) {
      
      inline def setCheckedKeys(value: js.Array[Key]): Self = StObject.set(x, "checkedKeys", value.asInstanceOf[js.Any])
      
      inline def setCheckedKeysVarargs(value: Key*): Self = StObject.set(x, "checkedKeys", js.Array(value*))
      
      inline def setDragOverNodeKey(value: Key): Self = StObject.set(x, "dragOverNodeKey", value.asInstanceOf[js.Any])
      
      inline def setDropPosition(value: Double): Self = StObject.set(x, "dropPosition", value.asInstanceOf[js.Any])
      
      inline def setExpandedKeys(value: js.Array[Key]): Self = StObject.set(x, "expandedKeys", value.asInstanceOf[js.Any])
      
      inline def setExpandedKeysVarargs(value: Key*): Self = StObject.set(x, "expandedKeys", js.Array(value*))
      
      inline def setHalfCheckedKeys(value: js.Array[Key]): Self = StObject.set(x, "halfCheckedKeys", value.asInstanceOf[js.Any])
      
      inline def setHalfCheckedKeysVarargs(value: Key*): Self = StObject.set(x, "halfCheckedKeys", js.Array(value*))
      
      inline def setKeyEntities(value: Record[Key, DataEntity[TreeDataType]]): Self = StObject.set(x, "keyEntities", value.asInstanceOf[js.Any])
      
      inline def setLoadedKeys(value: js.Array[Key]): Self = StObject.set(x, "loadedKeys", value.asInstanceOf[js.Any])
      
      inline def setLoadedKeysVarargs(value: Key*): Self = StObject.set(x, "loadedKeys", js.Array(value*))
      
      inline def setLoadingKeys(value: js.Array[Key]): Self = StObject.set(x, "loadingKeys", value.asInstanceOf[js.Any])
      
      inline def setLoadingKeysVarargs(value: Key*): Self = StObject.set(x, "loadingKeys", js.Array(value*))
      
      inline def setSelectedKeys(value: js.Array[Key]): Self = StObject.set(x, "selectedKeys", value.asInstanceOf[js.Any])
      
      inline def setSelectedKeysVarargs(value: Key*): Self = StObject.set(x, "selectedKeys", js.Array(value*))
    }
  }
  
  trait Wrapper extends StObject {
    
    var keyEntities: Record[Key, DataEntity[DataNode]]
    
    var posEntities: Record[String, DataEntity[DataNode]]
  }
  object Wrapper {
    
    inline def apply(keyEntities: Record[Key, DataEntity[DataNode]], posEntities: Record[String, DataEntity[DataNode]]): Wrapper = {
      val __obj = js.Dynamic.literal(keyEntities = keyEntities.asInstanceOf[js.Any], posEntities = posEntities.asInstanceOf[js.Any])
      __obj.asInstanceOf[Wrapper]
    }
    
    extension [Self <: Wrapper](x: Self) {
      
      inline def setKeyEntities(value: Record[Key, DataEntity[DataNode]]): Self = StObject.set(x, "keyEntities", value.asInstanceOf[js.Any])
      
      inline def setPosEntities(value: Record[String, DataEntity[DataNode]]): Self = StObject.set(x, "posEntities", value.asInstanceOf[js.Any])
    }
  }
}
