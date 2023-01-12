package typings.rcMenu

import typings.rcMenu.esInterfaceMod.MenuMode
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esSubMenuPopupTriggerMod {
  
  @JSImport("rc-menu/es/SubMenu/PopupTrigger", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(param0: PopupTriggerProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait PopupTriggerProps extends StObject {
    
    var children: ReactElement
    
    var disabled: Boolean
    
    var mode: MenuMode
    
    def onVisibleChange(visible: Boolean): Unit
    
    var popup: ReactNode
    
    var popupClassName: js.UndefOr[String] = js.undefined
    
    var popupOffset: js.UndefOr[js.Array[Double]] = js.undefined
    
    var prefixCls: String
    
    var visible: Boolean
  }
  object PopupTriggerProps {
    
    inline def apply(
      children: ReactElement,
      disabled: Boolean,
      mode: MenuMode,
      onVisibleChange: Boolean => Unit,
      prefixCls: String,
      visible: Boolean
    ): PopupTriggerProps = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], onVisibleChange = js.Any.fromFunction1(onVisibleChange), prefixCls = prefixCls.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
      __obj.asInstanceOf[PopupTriggerProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PopupTriggerProps] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setMode(value: MenuMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setOnVisibleChange(value: Boolean => Unit): Self = StObject.set(x, "onVisibleChange", js.Any.fromFunction1(value))
      
      inline def setPopup(value: ReactNode): Self = StObject.set(x, "popup", value.asInstanceOf[js.Any])
      
      inline def setPopupClassName(value: String): Self = StObject.set(x, "popupClassName", value.asInstanceOf[js.Any])
      
      inline def setPopupClassNameUndefined: Self = StObject.set(x, "popupClassName", js.undefined)
      
      inline def setPopupOffset(value: js.Array[Double]): Self = StObject.set(x, "popupOffset", value.asInstanceOf[js.Any])
      
      inline def setPopupOffsetUndefined: Self = StObject.set(x, "popupOffset", js.undefined)
      
      inline def setPopupOffsetVarargs(value: Double*): Self = StObject.set(x, "popupOffset", js.Array(value*))
      
      inline def setPopupUndefined: Self = StObject.set(x, "popup", js.undefined)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    }
  }
}
