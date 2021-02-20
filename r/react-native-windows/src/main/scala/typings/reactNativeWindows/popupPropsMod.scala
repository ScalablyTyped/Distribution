package typings.reactNativeWindows

import typings.react.mod.ReactNode
import typings.reactNative.mod.ViewProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object popupPropsMod {
  
  @js.native
  trait IPopupProps extends ViewProps {
    
    /**
      * Sets whether the Popup will automatically receive focus when opened.
      * Defaults to true. Always true when isLightDismissEnabled === true.
      */
    var autoFocus: js.UndefOr[Boolean] = js.native
    
    var horizontalOffset: js.UndefOr[Double] = js.native
    
    /**
      * Configures the Popup with a transparent backdrop.
      */
    var isLightDismissEnabled: js.UndefOr[Boolean] = js.native
    
    var isOpen: js.UndefOr[Boolean] = js.native
    
    var onDismiss: js.UndefOr[js.Function0[Unit]] = js.native
    
    /**
      * Sets a React element to use as an anchor point. When set, the popup will be positioned relative to it.
      */
    var target: js.UndefOr[ReactNode] = js.native
    
    var verticalOffset: js.UndefOr[Double] = js.native
  }
  object IPopupProps {
    
    @scala.inline
    def apply(): IPopupProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IPopupProps]
    }
    
    @scala.inline
    implicit class IPopupPropsMutableBuilder[Self <: IPopupProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      @scala.inline
      def setHorizontalOffset(value: Double): Self = StObject.set(x, "horizontalOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHorizontalOffsetUndefined: Self = StObject.set(x, "horizontalOffset", js.undefined)
      
      @scala.inline
      def setIsLightDismissEnabled(value: Boolean): Self = StObject.set(x, "isLightDismissEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsLightDismissEnabledUndefined: Self = StObject.set(x, "isLightDismissEnabled", js.undefined)
      
      @scala.inline
      def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsOpenUndefined: Self = StObject.set(x, "isOpen", js.undefined)
      
      @scala.inline
      def setOnDismiss(value: () => Unit): Self = StObject.set(x, "onDismiss", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnDismissUndefined: Self = StObject.set(x, "onDismiss", js.undefined)
      
      @scala.inline
      def setTarget(value: ReactNode): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      @scala.inline
      def setVerticalOffset(value: Double): Self = StObject.set(x, "verticalOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerticalOffsetUndefined: Self = StObject.set(x, "verticalOffset", js.undefined)
    }
  }
}
