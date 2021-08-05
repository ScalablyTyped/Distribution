package typings.reactNativeElements.anon

import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.ReactElement
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<react-native-elements.react-native-elements.TooltipProps> */
trait PartialTooltipProps extends StObject {
  
  var ModalComponent: js.UndefOr[ComponentClass[js.Object, ComponentState]] = js.undefined
  
  var backgroundColor: js.UndefOr[String] = js.undefined
  
  var closeOnlyOnBackdropPress: js.UndefOr[Boolean] = js.undefined
  
  var containerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  var height: js.UndefOr[Double] = js.undefined
  
  var highlightColor: js.UndefOr[String] = js.undefined
  
  var onClose: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var onOpen: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var overlayColor: js.UndefOr[String] = js.undefined
  
  var pointerColor: js.UndefOr[String] = js.undefined
  
  var popover: js.UndefOr[ReactElement] = js.undefined
  
  var skipAndroidStatusBar: js.UndefOr[Boolean] = js.undefined
  
  var toggleAction: js.UndefOr[String] = js.undefined
  
  var toggleOnPress: js.UndefOr[Boolean] = js.undefined
  
  var width: js.UndefOr[Double] = js.undefined
  
  var withOverlay: js.UndefOr[Boolean] = js.undefined
  
  var withPointer: js.UndefOr[Boolean] = js.undefined
}
object PartialTooltipProps {
  
  inline def apply(): PartialTooltipProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialTooltipProps]
  }
  
  extension [Self <: PartialTooltipProps](x: Self) {
    
    inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    inline def setCloseOnlyOnBackdropPress(value: Boolean): Self = StObject.set(x, "closeOnlyOnBackdropPress", value.asInstanceOf[js.Any])
    
    inline def setCloseOnlyOnBackdropPressUndefined: Self = StObject.set(x, "closeOnlyOnBackdropPress", js.undefined)
    
    inline def setContainerStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "containerStyle", value.asInstanceOf[js.Any])
    
    inline def setContainerStyleNull: Self = StObject.set(x, "containerStyle", null)
    
    inline def setContainerStyleUndefined: Self = StObject.set(x, "containerStyle", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setHighlightColor(value: String): Self = StObject.set(x, "highlightColor", value.asInstanceOf[js.Any])
    
    inline def setHighlightColorUndefined: Self = StObject.set(x, "highlightColor", js.undefined)
    
    inline def setModalComponent(value: ComponentClass[js.Object, ComponentState]): Self = StObject.set(x, "ModalComponent", value.asInstanceOf[js.Any])
    
    inline def setModalComponentUndefined: Self = StObject.set(x, "ModalComponent", js.undefined)
    
    inline def setOnClose(value: () => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction0(value))
    
    inline def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
    
    inline def setOnOpen(value: () => Unit): Self = StObject.set(x, "onOpen", js.Any.fromFunction0(value))
    
    inline def setOnOpenUndefined: Self = StObject.set(x, "onOpen", js.undefined)
    
    inline def setOverlayColor(value: String): Self = StObject.set(x, "overlayColor", value.asInstanceOf[js.Any])
    
    inline def setOverlayColorUndefined: Self = StObject.set(x, "overlayColor", js.undefined)
    
    inline def setPointerColor(value: String): Self = StObject.set(x, "pointerColor", value.asInstanceOf[js.Any])
    
    inline def setPointerColorUndefined: Self = StObject.set(x, "pointerColor", js.undefined)
    
    inline def setPopover(value: ReactElement): Self = StObject.set(x, "popover", value.asInstanceOf[js.Any])
    
    inline def setPopoverUndefined: Self = StObject.set(x, "popover", js.undefined)
    
    inline def setSkipAndroidStatusBar(value: Boolean): Self = StObject.set(x, "skipAndroidStatusBar", value.asInstanceOf[js.Any])
    
    inline def setSkipAndroidStatusBarUndefined: Self = StObject.set(x, "skipAndroidStatusBar", js.undefined)
    
    inline def setToggleAction(value: String): Self = StObject.set(x, "toggleAction", value.asInstanceOf[js.Any])
    
    inline def setToggleActionUndefined: Self = StObject.set(x, "toggleAction", js.undefined)
    
    inline def setToggleOnPress(value: Boolean): Self = StObject.set(x, "toggleOnPress", value.asInstanceOf[js.Any])
    
    inline def setToggleOnPressUndefined: Self = StObject.set(x, "toggleOnPress", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    inline def setWithOverlay(value: Boolean): Self = StObject.set(x, "withOverlay", value.asInstanceOf[js.Any])
    
    inline def setWithOverlayUndefined: Self = StObject.set(x, "withOverlay", js.undefined)
    
    inline def setWithPointer(value: Boolean): Self = StObject.set(x, "withPointer", value.asInstanceOf[js.Any])
    
    inline def setWithPointerUndefined: Self = StObject.set(x, "withPointer", js.undefined)
  }
}
