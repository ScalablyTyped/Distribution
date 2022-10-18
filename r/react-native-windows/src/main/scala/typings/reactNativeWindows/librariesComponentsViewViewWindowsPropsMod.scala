package typings.reactNativeWindows

import typings.reactNative.mod.NativeSyntheticEvent
import typings.reactNative.mod.ViewProps
import typings.reactNativeWindows.librariesComponentsKeyboardKeyboardExtPropsMod.IKeyboardProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object librariesComponentsViewViewWindowsPropsMod {
  
  type IMouseEvent = NativeSyntheticEvent[INativeMouseEvent]
  
  trait INativeMouseEvent extends StObject {
    
    var altKey: Boolean
    
    var ctrlKey: Boolean
    
    var force: Double
    
    var identifier: Double
    
    var isBarrelButtonPressed: Boolean
    
    var isEraser: Boolean
    
    var isHorizontalScrollWheel: Boolean
    
    var isLeftButton: Boolean
    
    var isMiddleButton: Boolean
    
    var isRightButton: Boolean
    
    var locationX: Double
    
    var locationY: Double
    
    var pageX: Double
    
    var pageY: Double
    
    var pointerType: String
    
    var shiftKey: Boolean
    
    var target: Double
    
    var timestamp: Double
  }
  object INativeMouseEvent {
    
    inline def apply(
      altKey: Boolean,
      ctrlKey: Boolean,
      force: Double,
      identifier: Double,
      isBarrelButtonPressed: Boolean,
      isEraser: Boolean,
      isHorizontalScrollWheel: Boolean,
      isLeftButton: Boolean,
      isMiddleButton: Boolean,
      isRightButton: Boolean,
      locationX: Double,
      locationY: Double,
      pageX: Double,
      pageY: Double,
      pointerType: String,
      shiftKey: Boolean,
      target: Double,
      timestamp: Double
    ): INativeMouseEvent = {
      val __obj = js.Dynamic.literal(altKey = altKey.asInstanceOf[js.Any], ctrlKey = ctrlKey.asInstanceOf[js.Any], force = force.asInstanceOf[js.Any], identifier = identifier.asInstanceOf[js.Any], isBarrelButtonPressed = isBarrelButtonPressed.asInstanceOf[js.Any], isEraser = isEraser.asInstanceOf[js.Any], isHorizontalScrollWheel = isHorizontalScrollWheel.asInstanceOf[js.Any], isLeftButton = isLeftButton.asInstanceOf[js.Any], isMiddleButton = isMiddleButton.asInstanceOf[js.Any], isRightButton = isRightButton.asInstanceOf[js.Any], locationX = locationX.asInstanceOf[js.Any], locationY = locationY.asInstanceOf[js.Any], pageX = pageX.asInstanceOf[js.Any], pageY = pageY.asInstanceOf[js.Any], pointerType = pointerType.asInstanceOf[js.Any], shiftKey = shiftKey.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
      __obj.asInstanceOf[INativeMouseEvent]
    }
    
    extension [Self <: INativeMouseEvent](x: Self) {
      
      inline def setAltKey(value: Boolean): Self = StObject.set(x, "altKey", value.asInstanceOf[js.Any])
      
      inline def setCtrlKey(value: Boolean): Self = StObject.set(x, "ctrlKey", value.asInstanceOf[js.Any])
      
      inline def setForce(value: Double): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
      
      inline def setIdentifier(value: Double): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
      
      inline def setIsBarrelButtonPressed(value: Boolean): Self = StObject.set(x, "isBarrelButtonPressed", value.asInstanceOf[js.Any])
      
      inline def setIsEraser(value: Boolean): Self = StObject.set(x, "isEraser", value.asInstanceOf[js.Any])
      
      inline def setIsHorizontalScrollWheel(value: Boolean): Self = StObject.set(x, "isHorizontalScrollWheel", value.asInstanceOf[js.Any])
      
      inline def setIsLeftButton(value: Boolean): Self = StObject.set(x, "isLeftButton", value.asInstanceOf[js.Any])
      
      inline def setIsMiddleButton(value: Boolean): Self = StObject.set(x, "isMiddleButton", value.asInstanceOf[js.Any])
      
      inline def setIsRightButton(value: Boolean): Self = StObject.set(x, "isRightButton", value.asInstanceOf[js.Any])
      
      inline def setLocationX(value: Double): Self = StObject.set(x, "locationX", value.asInstanceOf[js.Any])
      
      inline def setLocationY(value: Double): Self = StObject.set(x, "locationY", value.asInstanceOf[js.Any])
      
      inline def setPageX(value: Double): Self = StObject.set(x, "pageX", value.asInstanceOf[js.Any])
      
      inline def setPageY(value: Double): Self = StObject.set(x, "pageY", value.asInstanceOf[js.Any])
      
      inline def setPointerType(value: String): Self = StObject.set(x, "pointerType", value.asInstanceOf[js.Any])
      
      inline def setShiftKey(value: Boolean): Self = StObject.set(x, "shiftKey", value.asInstanceOf[js.Any])
      
      inline def setTarget(value: Double): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    }
  }
  
  trait IViewWindowsProps
    extends StObject
       with IKeyboardProps
       with ViewProps {
    
    /**
      * Indicates to accessibility services that the UI Component is within a set and has the given numbered position.
      *
      * See https://github.com/ReactWindows/discussions-and-proposals/blob/harinik-accessibility/proposals/0000-accessibilityapis-lists.md
      */
    var accessibilityPosInSet: js.UndefOr[Double] = js.undefined
    
    /**
      * Indicates to accessibility services that the UI Component is within a set with the given size.
      *
      * See https://github.com/ReactWindows/discussions-and-proposals/blob/harinik-accessibility/proposals/0000-accessibilityapis-lists.md
      */
    var accessibilitySetSize: js.UndefOr[Double] = js.undefined
    
    @JSName("children")
    var children_IViewWindowsProps: js.UndefOr[Any] = js.undefined
    
    /**
      * Specifies if the control should show System focus visuals
      */
    var enableFocusRing: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Event fired when the mouse enters the view
      */
    var onMouseEnter: js.UndefOr[js.Function1[/* args */ IMouseEvent, Unit]] = js.undefined
    
    /**
      * Event fired when the mouse leaves the view
      */
    var onMouseLeave: js.UndefOr[js.Function1[/* args */ IMouseEvent, Unit]] = js.undefined
    
    /**
      * Indicates the TabIndex to use for this view
      */
    var tabIndex: js.UndefOr[Double] = js.undefined
    
    /**
      * Specifies the Tooltip for the view
      */
    var tooltip: js.UndefOr[String] = js.undefined
  }
  object IViewWindowsProps {
    
    inline def apply(): IViewWindowsProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IViewWindowsProps]
    }
    
    extension [Self <: IViewWindowsProps](x: Self) {
      
      inline def setAccessibilityPosInSet(value: Double): Self = StObject.set(x, "accessibilityPosInSet", value.asInstanceOf[js.Any])
      
      inline def setAccessibilityPosInSetUndefined: Self = StObject.set(x, "accessibilityPosInSet", js.undefined)
      
      inline def setAccessibilitySetSize(value: Double): Self = StObject.set(x, "accessibilitySetSize", value.asInstanceOf[js.Any])
      
      inline def setAccessibilitySetSizeUndefined: Self = StObject.set(x, "accessibilitySetSize", js.undefined)
      
      inline def setChildren(value: Any): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setEnableFocusRing(value: Boolean): Self = StObject.set(x, "enableFocusRing", value.asInstanceOf[js.Any])
      
      inline def setEnableFocusRingUndefined: Self = StObject.set(x, "enableFocusRing", js.undefined)
      
      inline def setOnMouseEnter(value: /* args */ IMouseEvent => Unit): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1(value))
      
      inline def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
      
      inline def setOnMouseLeave(value: /* args */ IMouseEvent => Unit): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1(value))
      
      inline def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
      
      inline def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
      inline def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
      
      inline def setTooltip(value: String): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
      
      inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
    }
  }
}
