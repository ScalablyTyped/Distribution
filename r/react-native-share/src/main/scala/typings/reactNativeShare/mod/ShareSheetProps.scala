package typings.reactNativeShare.mod

import typings.react.mod.ReactNode
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShareSheetProps extends StObject {
  
  var children: ReactNode
  
  def onCancel(): Unit
  
  var overlayStyle: js.UndefOr[StyleProp[ViewProps]] = js.undefined
  
  var style: js.UndefOr[StyleProp[ViewProps]] = js.undefined
  
  var visible: Boolean
}
object ShareSheetProps {
  
  inline def apply(onCancel: () => Unit, visible: Boolean): ShareSheetProps = {
    val __obj = js.Dynamic.literal(onCancel = js.Any.fromFunction0(onCancel), visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShareSheetProps]
  }
  
  extension [Self <: ShareSheetProps](x: Self) {
    
    inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setOnCancel(value: () => Unit): Self = StObject.set(x, "onCancel", js.Any.fromFunction0(value))
    
    inline def setOverlayStyle(value: StyleProp[ViewProps]): Self = StObject.set(x, "overlayStyle", value.asInstanceOf[js.Any])
    
    inline def setOverlayStyleNull: Self = StObject.set(x, "overlayStyle", null)
    
    inline def setOverlayStyleUndefined: Self = StObject.set(x, "overlayStyle", js.undefined)
    
    inline def setStyle(value: StyleProp[ViewProps]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleNull: Self = StObject.set(x, "style", null)
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
  }
}
