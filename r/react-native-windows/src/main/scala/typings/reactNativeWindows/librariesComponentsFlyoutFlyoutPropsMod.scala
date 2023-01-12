package typings.reactNativeWindows

import typings.react.mod.ReactNode
import typings.reactNative.mod.ViewProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object librariesComponentsFlyoutFlyoutPropsMod {
  
  trait IFlyoutProps
    extends StObject
       with ViewProps {
    
    var autoFocus: js.UndefOr[Boolean] = js.undefined
    
    var horizontalOffset: js.UndefOr[Double] = js.undefined
    
    var isLightDismissEnabled: js.UndefOr[Boolean] = js.undefined
    
    var isOpen: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Specifies whether the area outside the flyout is darkened
      */
    var isOverlayEnabled: js.UndefOr[Boolean] = js.undefined
    
    var onDismiss: js.UndefOr[js.Function1[/* isOpen */ Boolean, Unit]] = js.undefined
    
    var placement: js.UndefOr[Placement] = js.undefined
    
    var shouldConstrainToRootBounds: js.UndefOr[Boolean] = js.undefined
    
    var showMode: js.UndefOr[ShowMode] = js.undefined
    
    var target: js.UndefOr[ReactNode] = js.undefined
    
    var verticalOffset: js.UndefOr[Double] = js.undefined
  }
  object IFlyoutProps {
    
    inline def apply(): IFlyoutProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IFlyoutProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IFlyoutProps] (val x: Self) extends AnyVal {
      
      inline def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      inline def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      inline def setHorizontalOffset(value: Double): Self = StObject.set(x, "horizontalOffset", value.asInstanceOf[js.Any])
      
      inline def setHorizontalOffsetUndefined: Self = StObject.set(x, "horizontalOffset", js.undefined)
      
      inline def setIsLightDismissEnabled(value: Boolean): Self = StObject.set(x, "isLightDismissEnabled", value.asInstanceOf[js.Any])
      
      inline def setIsLightDismissEnabledUndefined: Self = StObject.set(x, "isLightDismissEnabled", js.undefined)
      
      inline def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
      
      inline def setIsOpenUndefined: Self = StObject.set(x, "isOpen", js.undefined)
      
      inline def setIsOverlayEnabled(value: Boolean): Self = StObject.set(x, "isOverlayEnabled", value.asInstanceOf[js.Any])
      
      inline def setIsOverlayEnabledUndefined: Self = StObject.set(x, "isOverlayEnabled", js.undefined)
      
      inline def setOnDismiss(value: /* isOpen */ Boolean => Unit): Self = StObject.set(x, "onDismiss", js.Any.fromFunction1(value))
      
      inline def setOnDismissUndefined: Self = StObject.set(x, "onDismiss", js.undefined)
      
      inline def setPlacement(value: Placement): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      inline def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
      
      inline def setShouldConstrainToRootBounds(value: Boolean): Self = StObject.set(x, "shouldConstrainToRootBounds", value.asInstanceOf[js.Any])
      
      inline def setShouldConstrainToRootBoundsUndefined: Self = StObject.set(x, "shouldConstrainToRootBounds", js.undefined)
      
      inline def setShowMode(value: ShowMode): Self = StObject.set(x, "showMode", value.asInstanceOf[js.Any])
      
      inline def setShowModeUndefined: Self = StObject.set(x, "showMode", js.undefined)
      
      inline def setTarget(value: ReactNode): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setVerticalOffset(value: Double): Self = StObject.set(x, "verticalOffset", value.asInstanceOf[js.Any])
      
      inline def setVerticalOffsetUndefined: Self = StObject.set(x, "verticalOffset", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactNativeWindows.reactNativeWindowsStrings.top
    - typings.reactNativeWindows.reactNativeWindowsStrings.bottom
    - typings.reactNativeWindows.reactNativeWindowsStrings.left
    - typings.reactNativeWindows.reactNativeWindowsStrings.right
    - typings.reactNativeWindows.reactNativeWindowsStrings.full
    - typings.reactNativeWindows.reactNativeWindowsStrings.`top-edge-aligned-left`
    - typings.reactNativeWindows.reactNativeWindowsStrings.`top-edge-aligned-right`
    - typings.reactNativeWindows.reactNativeWindowsStrings.`bottom-edge-aligned-left`
    - typings.reactNativeWindows.reactNativeWindowsStrings.`bottom-edge-aligned-right`
    - typings.reactNativeWindows.reactNativeWindowsStrings.`left-edge-aligned-top`
    - typings.reactNativeWindows.reactNativeWindowsStrings.`right-edge-aligned-top`
    - typings.reactNativeWindows.reactNativeWindowsStrings.`left-edge-aligned-bottom`
    - typings.reactNativeWindows.reactNativeWindowsStrings.`right-edge-aligned-bottom`
  */
  trait Placement extends StObject
  object Placement {
    
    inline def bottom: typings.reactNativeWindows.reactNativeWindowsStrings.bottom = "bottom".asInstanceOf[typings.reactNativeWindows.reactNativeWindowsStrings.bottom]
    
    inline def `bottom-edge-aligned-left`: typings.reactNativeWindows.reactNativeWindowsStrings.`bottom-edge-aligned-left` = "bottom-edge-aligned-left".asInstanceOf[typings.reactNativeWindows.reactNativeWindowsStrings.`bottom-edge-aligned-left`]
    
    inline def `bottom-edge-aligned-right`: typings.reactNativeWindows.reactNativeWindowsStrings.`bottom-edge-aligned-right` = "bottom-edge-aligned-right".asInstanceOf[typings.reactNativeWindows.reactNativeWindowsStrings.`bottom-edge-aligned-right`]
    
    inline def full: typings.reactNativeWindows.reactNativeWindowsStrings.full = "full".asInstanceOf[typings.reactNativeWindows.reactNativeWindowsStrings.full]
    
    inline def left: typings.reactNativeWindows.reactNativeWindowsStrings.left = "left".asInstanceOf[typings.reactNativeWindows.reactNativeWindowsStrings.left]
    
    inline def `left-edge-aligned-bottom`: typings.reactNativeWindows.reactNativeWindowsStrings.`left-edge-aligned-bottom` = "left-edge-aligned-bottom".asInstanceOf[typings.reactNativeWindows.reactNativeWindowsStrings.`left-edge-aligned-bottom`]
    
    inline def `left-edge-aligned-top`: typings.reactNativeWindows.reactNativeWindowsStrings.`left-edge-aligned-top` = "left-edge-aligned-top".asInstanceOf[typings.reactNativeWindows.reactNativeWindowsStrings.`left-edge-aligned-top`]
    
    inline def right: typings.reactNativeWindows.reactNativeWindowsStrings.right = "right".asInstanceOf[typings.reactNativeWindows.reactNativeWindowsStrings.right]
    
    inline def `right-edge-aligned-bottom`: typings.reactNativeWindows.reactNativeWindowsStrings.`right-edge-aligned-bottom` = "right-edge-aligned-bottom".asInstanceOf[typings.reactNativeWindows.reactNativeWindowsStrings.`right-edge-aligned-bottom`]
    
    inline def `right-edge-aligned-top`: typings.reactNativeWindows.reactNativeWindowsStrings.`right-edge-aligned-top` = "right-edge-aligned-top".asInstanceOf[typings.reactNativeWindows.reactNativeWindowsStrings.`right-edge-aligned-top`]
    
    inline def top: typings.reactNativeWindows.reactNativeWindowsStrings.top = "top".asInstanceOf[typings.reactNativeWindows.reactNativeWindowsStrings.top]
    
    inline def `top-edge-aligned-left`: typings.reactNativeWindows.reactNativeWindowsStrings.`top-edge-aligned-left` = "top-edge-aligned-left".asInstanceOf[typings.reactNativeWindows.reactNativeWindowsStrings.`top-edge-aligned-left`]
    
    inline def `top-edge-aligned-right`: typings.reactNativeWindows.reactNativeWindowsStrings.`top-edge-aligned-right` = "top-edge-aligned-right".asInstanceOf[typings.reactNativeWindows.reactNativeWindowsStrings.`top-edge-aligned-right`]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactNativeWindows.reactNativeWindowsStrings.auto
    - typings.reactNativeWindows.reactNativeWindowsStrings.standard
    - typings.reactNativeWindows.reactNativeWindowsStrings.transient
    - typings.reactNativeWindows.reactNativeWindowsStrings.`transient-with-dismiss-on-pointer-move-away`
  */
  trait ShowMode extends StObject
  object ShowMode {
    
    inline def auto: typings.reactNativeWindows.reactNativeWindowsStrings.auto = "auto".asInstanceOf[typings.reactNativeWindows.reactNativeWindowsStrings.auto]
    
    inline def standard: typings.reactNativeWindows.reactNativeWindowsStrings.standard = "standard".asInstanceOf[typings.reactNativeWindows.reactNativeWindowsStrings.standard]
    
    inline def transient: typings.reactNativeWindows.reactNativeWindowsStrings.transient = "transient".asInstanceOf[typings.reactNativeWindows.reactNativeWindowsStrings.transient]
    
    inline def `transient-with-dismiss-on-pointer-move-away`: typings.reactNativeWindows.reactNativeWindowsStrings.`transient-with-dismiss-on-pointer-move-away` = "transient-with-dismiss-on-pointer-move-away".asInstanceOf[typings.reactNativeWindows.reactNativeWindowsStrings.`transient-with-dismiss-on-pointer-move-away`]
  }
}
