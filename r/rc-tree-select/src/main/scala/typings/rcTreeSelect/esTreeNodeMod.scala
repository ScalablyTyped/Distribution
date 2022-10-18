package typings.rcTreeSelect

import org.scalablytyped.runtime.Shortcut
import typings.rcTreeSelect.esInterfaceMod.Key
import typings.react.mod.FC
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esTreeNodeMod extends Shortcut {
  
  /** This is a placeholder, not real render in dom */
  @JSImport("rc-tree-select/es/TreeNode", JSImport.Default)
  @js.native
  val default: FC[TreeNodeProps] = js.native
  
  /* Inlined parent std.Omit<rc-tree-select.rc-tree-select/es/interface.DataNode, 'children'> */
  trait TreeNodeProps extends StObject {
    
    var checkable: js.UndefOr[Boolean] = js.undefined
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var disableCheckbox: js.UndefOr[Boolean] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var key: js.UndefOr[Key] = js.undefined
    
    var label: js.UndefOr[ReactNode] = js.undefined
    
    var title: js.UndefOr[ReactNode] = js.undefined
    
    var value: Key
  }
  object TreeNodeProps {
    
    inline def apply(value: Key): TreeNodeProps = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[TreeNodeProps]
    }
    
    extension [Self <: TreeNodeProps](x: Self) {
      
      inline def setCheckable(value: Boolean): Self = StObject.set(x, "checkable", value.asInstanceOf[js.Any])
      
      inline def setCheckableUndefined: Self = StObject.set(x, "checkable", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setDisableCheckbox(value: Boolean): Self = StObject.set(x, "disableCheckbox", value.asInstanceOf[js.Any])
      
      inline def setDisableCheckboxUndefined: Self = StObject.set(x, "disableCheckbox", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setLabel(value: ReactNode): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setTitle(value: ReactNode): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setValue(value: Key): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = FC[TreeNodeProps]
  
  /* This means you don't have to write `default`, but can instead just say `esTreeNodeMod.foo` */
  override def _to: FC[TreeNodeProps] = default
}
