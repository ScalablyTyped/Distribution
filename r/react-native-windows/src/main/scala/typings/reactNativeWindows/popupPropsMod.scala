package typings.reactNativeWindows

import typings.react.mod.ReactNode
import typings.reactNative.mod.ViewProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object popupPropsMod {
  
  trait IPopupProps
    extends StObject
       with ViewProps {
    
    /**
      * Sets whether the Popup will automatically receive focus when opened.
      * Defaults to true. Always true when isLightDismissEnabled === true.
      */
    var autoFocus: js.UndefOr[Boolean] = js.undefined
    
    var horizontalOffset: js.UndefOr[Double] = js.undefined
    
    /**
      * Configures the Popup with a transparent backdrop.
      */
    var isLightDismissEnabled: js.UndefOr[Boolean] = js.undefined
    
    var isOpen: js.UndefOr[Boolean] = js.undefined
    
    var onDismiss: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * Sets a React element to use as an anchor point. When set, the popup will be positioned relative to it.
      */
    var target: js.UndefOr[ReactNode] = js.undefined
    
    var verticalOffset: js.UndefOr[Double] = js.undefined
  }
  object IPopupProps {
    
    inline def apply(): IPopupProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IPopupProps]
    }
    
    extension [Self <: IPopupProps](x: Self) {
      
      inline def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      inline def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      inline def setHorizontalOffset(value: Double): Self = StObject.set(x, "horizontalOffset", value.asInstanceOf[js.Any])
      
      inline def setHorizontalOffsetUndefined: Self = StObject.set(x, "horizontalOffset", js.undefined)
      
      inline def setIsLightDismissEnabled(value: Boolean): Self = StObject.set(x, "isLightDismissEnabled", value.asInstanceOf[js.Any])
      
      inline def setIsLightDismissEnabledUndefined: Self = StObject.set(x, "isLightDismissEnabled", js.undefined)
      
      inline def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
      
      inline def setIsOpenUndefined: Self = StObject.set(x, "isOpen", js.undefined)
      
      inline def setOnDismiss(value: () => Unit): Self = StObject.set(x, "onDismiss", js.Any.fromFunction0(value))
      
      inline def setOnDismissUndefined: Self = StObject.set(x, "onDismiss", js.undefined)
      
      inline def setTarget(value: ReactNode): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setVerticalOffset(value: Double): Self = StObject.set(x, "verticalOffset", value.asInstanceOf[js.Any])
      
      inline def setVerticalOffsetUndefined: Self = StObject.set(x, "verticalOffset", js.undefined)
    }
  }
}
