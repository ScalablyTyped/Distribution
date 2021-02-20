package typings.reactNativeElements.anon

import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.ReactElement
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<react-native-elements.react-native-elements.TooltipProps> */
@js.native
trait PartialTooltipProps extends StObject {
  
  var ModalComponent: js.UndefOr[ComponentClass[js.Object, ComponentState]] = js.native
  
  var backgroundColor: js.UndefOr[String] = js.native
  
  var closeOnlyOnBackdropPress: js.UndefOr[Boolean] = js.native
  
  var containerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  var height: js.UndefOr[Double] = js.native
  
  var highlightColor: js.UndefOr[String] = js.native
  
  var onClose: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onOpen: js.UndefOr[js.Function0[Unit]] = js.native
  
  var overlayColor: js.UndefOr[String] = js.native
  
  var pointerColor: js.UndefOr[String] = js.native
  
  var popover: js.UndefOr[ReactElement] = js.native
  
  var skipAndroidStatusBar: js.UndefOr[Boolean] = js.native
  
  var toggleAction: js.UndefOr[String] = js.native
  
  var toggleOnPress: js.UndefOr[Boolean] = js.native
  
  var width: js.UndefOr[Double] = js.native
  
  var withOverlay: js.UndefOr[Boolean] = js.native
  
  var withPointer: js.UndefOr[Boolean] = js.native
}
object PartialTooltipProps {
  
  @scala.inline
  def apply(): PartialTooltipProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialTooltipProps]
  }
  
  @scala.inline
  implicit class PartialTooltipPropsMutableBuilder[Self <: PartialTooltipProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    @scala.inline
    def setCloseOnlyOnBackdropPress(value: Boolean): Self = StObject.set(x, "closeOnlyOnBackdropPress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloseOnlyOnBackdropPressUndefined: Self = StObject.set(x, "closeOnlyOnBackdropPress", js.undefined)
    
    @scala.inline
    def setContainerStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "containerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerStyleNull: Self = StObject.set(x, "containerStyle", null)
    
    @scala.inline
    def setContainerStyleUndefined: Self = StObject.set(x, "containerStyle", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setHighlightColor(value: String): Self = StObject.set(x, "highlightColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighlightColorUndefined: Self = StObject.set(x, "highlightColor", js.undefined)
    
    @scala.inline
    def setModalComponent(value: ComponentClass[js.Object, ComponentState]): Self = StObject.set(x, "ModalComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModalComponentUndefined: Self = StObject.set(x, "ModalComponent", js.undefined)
    
    @scala.inline
    def setOnClose(value: () => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
    
    @scala.inline
    def setOnOpen(value: () => Unit): Self = StObject.set(x, "onOpen", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnOpenUndefined: Self = StObject.set(x, "onOpen", js.undefined)
    
    @scala.inline
    def setOverlayColor(value: String): Self = StObject.set(x, "overlayColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverlayColorUndefined: Self = StObject.set(x, "overlayColor", js.undefined)
    
    @scala.inline
    def setPointerColor(value: String): Self = StObject.set(x, "pointerColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointerColorUndefined: Self = StObject.set(x, "pointerColor", js.undefined)
    
    @scala.inline
    def setPopover(value: ReactElement): Self = StObject.set(x, "popover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPopoverUndefined: Self = StObject.set(x, "popover", js.undefined)
    
    @scala.inline
    def setSkipAndroidStatusBar(value: Boolean): Self = StObject.set(x, "skipAndroidStatusBar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkipAndroidStatusBarUndefined: Self = StObject.set(x, "skipAndroidStatusBar", js.undefined)
    
    @scala.inline
    def setToggleAction(value: String): Self = StObject.set(x, "toggleAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToggleActionUndefined: Self = StObject.set(x, "toggleAction", js.undefined)
    
    @scala.inline
    def setToggleOnPress(value: Boolean): Self = StObject.set(x, "toggleOnPress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToggleOnPressUndefined: Self = StObject.set(x, "toggleOnPress", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    @scala.inline
    def setWithOverlay(value: Boolean): Self = StObject.set(x, "withOverlay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWithOverlayUndefined: Self = StObject.set(x, "withOverlay", js.undefined)
    
    @scala.inline
    def setWithPointer(value: Boolean): Self = StObject.set(x, "withPointer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWithPointerUndefined: Self = StObject.set(x, "withPointer", js.undefined)
  }
}
