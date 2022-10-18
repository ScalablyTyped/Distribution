package typings.rcTreeSelect

import org.scalablytyped.runtime.Shortcut
import typings.rcTree.esInterfaceMod.DataEntity
import typings.rcTree.esInterfaceMod.DataNode
import typings.rcTree.esInterfaceMod.IconType
import typings.rcTree.esTreeNodeMod.TreeNodeProps
import typings.rcTreeSelect.esInterfaceMod.Key
import typings.rcTreeSelect.esInterfaceMod.LegacyDataNode
import typings.rcTreeSelect.esInterfaceMod.RawValueType
import typings.react.mod.Context
import typings.react.mod.ReactNode
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esLegacyContextMod extends Shortcut {
  
  @JSImport("rc-tree-select/es/LegacyContext", JSImport.Default)
  @js.native
  val default: Context[LegacyContextProps] = js.native
  
  trait LegacyContextProps extends StObject {
    
    var checkable: Boolean | ReactNode
    
    var checkedKeys: js.Array[Key]
    
    var halfCheckedKeys: js.Array[Key]
    
    var keyEntities: Record[RawValueType, DataEntity[Any]]
    
    def loadData(treeNode: LegacyDataNode): js.Promise[Any]
    
    def onTreeExpand(keys: js.Array[Key]): Unit
    
    def onTreeLoad(loadedKeys: js.Array[Key]): Unit
    
    var showTreeIcon: Boolean
    
    var switcherIcon: IconType
    
    var treeDefaultExpandAll: Boolean
    
    var treeDefaultExpandedKeys: js.Array[Key]
    
    var treeExpandedKeys: js.Array[Key]
    
    var treeIcon: IconType
    
    var treeLine: Boolean
    
    var treeLoadedKeys: js.Array[Key]
    
    var treeMotion: Any
    
    var treeNodeFilterProp: String
  }
  object LegacyContextProps {
    
    inline def apply(
      checkedKeys: js.Array[Key],
      halfCheckedKeys: js.Array[Key],
      keyEntities: Record[RawValueType, DataEntity[Any]],
      loadData: LegacyDataNode => js.Promise[Any],
      onTreeExpand: js.Array[Key] => Unit,
      onTreeLoad: js.Array[Key] => Unit,
      showTreeIcon: Boolean,
      treeDefaultExpandAll: Boolean,
      treeDefaultExpandedKeys: js.Array[Key],
      treeExpandedKeys: js.Array[Key],
      treeLine: Boolean,
      treeLoadedKeys: js.Array[Key],
      treeMotion: Any,
      treeNodeFilterProp: String
    ): LegacyContextProps = {
      val __obj = js.Dynamic.literal(checkedKeys = checkedKeys.asInstanceOf[js.Any], halfCheckedKeys = halfCheckedKeys.asInstanceOf[js.Any], keyEntities = keyEntities.asInstanceOf[js.Any], loadData = js.Any.fromFunction1(loadData), onTreeExpand = js.Any.fromFunction1(onTreeExpand), onTreeLoad = js.Any.fromFunction1(onTreeLoad), showTreeIcon = showTreeIcon.asInstanceOf[js.Any], treeDefaultExpandAll = treeDefaultExpandAll.asInstanceOf[js.Any], treeDefaultExpandedKeys = treeDefaultExpandedKeys.asInstanceOf[js.Any], treeExpandedKeys = treeExpandedKeys.asInstanceOf[js.Any], treeLine = treeLine.asInstanceOf[js.Any], treeLoadedKeys = treeLoadedKeys.asInstanceOf[js.Any], treeMotion = treeMotion.asInstanceOf[js.Any], treeNodeFilterProp = treeNodeFilterProp.asInstanceOf[js.Any])
      __obj.asInstanceOf[LegacyContextProps]
    }
    
    extension [Self <: LegacyContextProps](x: Self) {
      
      inline def setCheckable(value: Boolean | ReactNode): Self = StObject.set(x, "checkable", value.asInstanceOf[js.Any])
      
      inline def setCheckableUndefined: Self = StObject.set(x, "checkable", js.undefined)
      
      inline def setCheckedKeys(value: js.Array[Key]): Self = StObject.set(x, "checkedKeys", value.asInstanceOf[js.Any])
      
      inline def setCheckedKeysVarargs(value: Key*): Self = StObject.set(x, "checkedKeys", js.Array(value*))
      
      inline def setHalfCheckedKeys(value: js.Array[Key]): Self = StObject.set(x, "halfCheckedKeys", value.asInstanceOf[js.Any])
      
      inline def setHalfCheckedKeysVarargs(value: Key*): Self = StObject.set(x, "halfCheckedKeys", js.Array(value*))
      
      inline def setKeyEntities(value: Record[RawValueType, DataEntity[Any]]): Self = StObject.set(x, "keyEntities", value.asInstanceOf[js.Any])
      
      inline def setLoadData(value: LegacyDataNode => js.Promise[Any]): Self = StObject.set(x, "loadData", js.Any.fromFunction1(value))
      
      inline def setOnTreeExpand(value: js.Array[Key] => Unit): Self = StObject.set(x, "onTreeExpand", js.Any.fromFunction1(value))
      
      inline def setOnTreeLoad(value: js.Array[Key] => Unit): Self = StObject.set(x, "onTreeLoad", js.Any.fromFunction1(value))
      
      inline def setShowTreeIcon(value: Boolean): Self = StObject.set(x, "showTreeIcon", value.asInstanceOf[js.Any])
      
      inline def setSwitcherIcon(value: IconType): Self = StObject.set(x, "switcherIcon", value.asInstanceOf[js.Any])
      
      inline def setSwitcherIconFunction1(value: /* props */ TreeNodeProps[DataNode] => ReactNode): Self = StObject.set(x, "switcherIcon", js.Any.fromFunction1(value))
      
      inline def setSwitcherIconUndefined: Self = StObject.set(x, "switcherIcon", js.undefined)
      
      inline def setTreeDefaultExpandAll(value: Boolean): Self = StObject.set(x, "treeDefaultExpandAll", value.asInstanceOf[js.Any])
      
      inline def setTreeDefaultExpandedKeys(value: js.Array[Key]): Self = StObject.set(x, "treeDefaultExpandedKeys", value.asInstanceOf[js.Any])
      
      inline def setTreeDefaultExpandedKeysVarargs(value: Key*): Self = StObject.set(x, "treeDefaultExpandedKeys", js.Array(value*))
      
      inline def setTreeExpandedKeys(value: js.Array[Key]): Self = StObject.set(x, "treeExpandedKeys", value.asInstanceOf[js.Any])
      
      inline def setTreeExpandedKeysVarargs(value: Key*): Self = StObject.set(x, "treeExpandedKeys", js.Array(value*))
      
      inline def setTreeIcon(value: IconType): Self = StObject.set(x, "treeIcon", value.asInstanceOf[js.Any])
      
      inline def setTreeIconFunction1(value: /* props */ TreeNodeProps[DataNode] => ReactNode): Self = StObject.set(x, "treeIcon", js.Any.fromFunction1(value))
      
      inline def setTreeIconUndefined: Self = StObject.set(x, "treeIcon", js.undefined)
      
      inline def setTreeLine(value: Boolean): Self = StObject.set(x, "treeLine", value.asInstanceOf[js.Any])
      
      inline def setTreeLoadedKeys(value: js.Array[Key]): Self = StObject.set(x, "treeLoadedKeys", value.asInstanceOf[js.Any])
      
      inline def setTreeLoadedKeysVarargs(value: Key*): Self = StObject.set(x, "treeLoadedKeys", js.Array(value*))
      
      inline def setTreeMotion(value: Any): Self = StObject.set(x, "treeMotion", value.asInstanceOf[js.Any])
      
      inline def setTreeNodeFilterProp(value: String): Self = StObject.set(x, "treeNodeFilterProp", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = Context[LegacyContextProps]
  
  /* This means you don't have to write `default`, but can instead just say `esLegacyContextMod.foo` */
  override def _to: Context[LegacyContextProps] = default
}
