package typings.rcTreeSelect

import typings.rcTree.interfaceMod.IconType
import typings.rcTree.treeNodeMod.TreeNodeProps
import typings.rcTreeSelect.interfaceMod.Key
import typings.rcTreeSelect.interfaceMod.LegacyDataNode
import typings.react.mod.Context
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object contextMod {
  
  @JSImport("rc-tree-select/es/Context", "SelectContext")
  @js.native
  val SelectContext: Context[ContextProps] = js.native
  
  @js.native
  trait ContextProps extends StObject {
    
    var checkable: Boolean | ReactNode = js.native
    
    var checkedKeys: js.Array[Key] = js.native
    
    var halfCheckedKeys: js.Array[Key] = js.native
    
    def loadData(treeNode: LegacyDataNode): js.Promise[_] = js.native
    
    def onTreeExpand(keys: js.Array[Key]): Unit = js.native
    
    def onTreeLoad(loadedKeys: js.Array[Key]): Unit = js.native
    
    var showTreeIcon: Boolean = js.native
    
    var switcherIcon: IconType = js.native
    
    var treeDefaultExpandAll: Boolean = js.native
    
    var treeDefaultExpandedKeys: js.Array[Key] = js.native
    
    var treeExpandedKeys: js.Array[Key] = js.native
    
    var treeIcon: IconType = js.native
    
    var treeLine: Boolean = js.native
    
    var treeLoadedKeys: js.Array[Key] = js.native
    
    var treeMotion: js.Any = js.native
    
    var treeNodeFilterProp: String = js.native
  }
  object ContextProps {
    
    @scala.inline
    def apply(
      checkedKeys: js.Array[Key],
      halfCheckedKeys: js.Array[Key],
      loadData: LegacyDataNode => js.Promise[_],
      onTreeExpand: js.Array[Key] => Unit,
      onTreeLoad: js.Array[Key] => Unit,
      showTreeIcon: Boolean,
      treeDefaultExpandAll: Boolean,
      treeDefaultExpandedKeys: js.Array[Key],
      treeExpandedKeys: js.Array[Key],
      treeLine: Boolean,
      treeLoadedKeys: js.Array[Key],
      treeMotion: js.Any,
      treeNodeFilterProp: String
    ): ContextProps = {
      val __obj = js.Dynamic.literal(checkedKeys = checkedKeys.asInstanceOf[js.Any], halfCheckedKeys = halfCheckedKeys.asInstanceOf[js.Any], loadData = js.Any.fromFunction1(loadData), onTreeExpand = js.Any.fromFunction1(onTreeExpand), onTreeLoad = js.Any.fromFunction1(onTreeLoad), showTreeIcon = showTreeIcon.asInstanceOf[js.Any], treeDefaultExpandAll = treeDefaultExpandAll.asInstanceOf[js.Any], treeDefaultExpandedKeys = treeDefaultExpandedKeys.asInstanceOf[js.Any], treeExpandedKeys = treeExpandedKeys.asInstanceOf[js.Any], treeLine = treeLine.asInstanceOf[js.Any], treeLoadedKeys = treeLoadedKeys.asInstanceOf[js.Any], treeMotion = treeMotion.asInstanceOf[js.Any], treeNodeFilterProp = treeNodeFilterProp.asInstanceOf[js.Any])
      __obj.asInstanceOf[ContextProps]
    }
    
    @scala.inline
    implicit class ContextPropsMutableBuilder[Self <: ContextProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCheckable(value: Boolean | ReactNode): Self = StObject.set(x, "checkable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckableUndefined: Self = StObject.set(x, "checkable", js.undefined)
      
      @scala.inline
      def setCheckedKeys(value: js.Array[Key]): Self = StObject.set(x, "checkedKeys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckedKeysVarargs(value: Key*): Self = StObject.set(x, "checkedKeys", js.Array(value :_*))
      
      @scala.inline
      def setHalfCheckedKeys(value: js.Array[Key]): Self = StObject.set(x, "halfCheckedKeys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHalfCheckedKeysVarargs(value: Key*): Self = StObject.set(x, "halfCheckedKeys", js.Array(value :_*))
      
      @scala.inline
      def setLoadData(value: LegacyDataNode => js.Promise[_]): Self = StObject.set(x, "loadData", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTreeExpand(value: js.Array[Key] => Unit): Self = StObject.set(x, "onTreeExpand", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTreeLoad(value: js.Array[Key] => Unit): Self = StObject.set(x, "onTreeLoad", js.Any.fromFunction1(value))
      
      @scala.inline
      def setShowTreeIcon(value: Boolean): Self = StObject.set(x, "showTreeIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSwitcherIcon(value: IconType): Self = StObject.set(x, "switcherIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSwitcherIconFunction1(value: /* props */ TreeNodeProps => ReactNode): Self = StObject.set(x, "switcherIcon", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSwitcherIconUndefined: Self = StObject.set(x, "switcherIcon", js.undefined)
      
      @scala.inline
      def setTreeDefaultExpandAll(value: Boolean): Self = StObject.set(x, "treeDefaultExpandAll", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTreeDefaultExpandedKeys(value: js.Array[Key]): Self = StObject.set(x, "treeDefaultExpandedKeys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTreeDefaultExpandedKeysVarargs(value: Key*): Self = StObject.set(x, "treeDefaultExpandedKeys", js.Array(value :_*))
      
      @scala.inline
      def setTreeExpandedKeys(value: js.Array[Key]): Self = StObject.set(x, "treeExpandedKeys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTreeExpandedKeysVarargs(value: Key*): Self = StObject.set(x, "treeExpandedKeys", js.Array(value :_*))
      
      @scala.inline
      def setTreeIcon(value: IconType): Self = StObject.set(x, "treeIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTreeIconFunction1(value: /* props */ TreeNodeProps => ReactNode): Self = StObject.set(x, "treeIcon", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTreeIconUndefined: Self = StObject.set(x, "treeIcon", js.undefined)
      
      @scala.inline
      def setTreeLine(value: Boolean): Self = StObject.set(x, "treeLine", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTreeLoadedKeys(value: js.Array[Key]): Self = StObject.set(x, "treeLoadedKeys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTreeLoadedKeysVarargs(value: Key*): Self = StObject.set(x, "treeLoadedKeys", js.Array(value :_*))
      
      @scala.inline
      def setTreeMotion(value: js.Any): Self = StObject.set(x, "treeMotion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTreeNodeFilterProp(value: String): Self = StObject.set(x, "treeNodeFilterProp", value.asInstanceOf[js.Any])
    }
  }
}
