package typings.reactNativeElements.mod

import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.ReactElement
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TooltipProps extends StObject {
  
  /**
    *  Override React Native `Modal` component (usable for web-platform)
    */
  var ModalComponent: js.UndefOr[ComponentClass[js.Object, ComponentState]] = js.native
  
  /**
    * sets backgroundColor of the tooltip and pointer.
    */
  var backgroundColor: js.UndefOr[String] = js.native
  
  /**
    * Disable auto hiding of tooltip when touching/scrolling anywhere inside the active tooltip popover container. Tooltip closes only when overlay backdrop is pressed (or) highlighted tooltip button is pressed
    */
  var closeOnlyOnBackdropPress: js.UndefOr[Boolean] = js.native
  
  /**
    * Passes style object to tooltip container
    */
  var containerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  /**
    * Tooltip container height. Necessary in order to render the container in the correct place. Pass height according to the size of the content rendered inside the container.
    * @default 40
    */
  var height: js.UndefOr[Double] = js.native
  
  /**
    * Color to highlight the item the tooltip is surrounding.
    */
  var highlightColor: js.UndefOr[String] = js.native
  
  /**
    * function which gets called on closing the tooltip.
    */
  var onClose: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * function which gets called on opening the tooltip.
    */
  var onOpen: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    *  Color of overlay shadow when tooltip is open.
    *
    * @default 'rgba(250, 250, 250, 0.70)'
    */
  var overlayColor: js.UndefOr[String] = js.native
  
  /**
    * Color of tooltip pointer, it defaults to the backgroundColor if none passed .
    */
  var pointerColor: js.UndefOr[String] = js.native
  
  /**
    * Component to be rendered as the display container.
    */
  var popover: js.UndefOr[ReactElement] = js.native
  
  /**
    * Force skip StatusBar height when calculating yOffset of element position (usable inside Modal on Android)
    */
  var skipAndroidStatusBar: js.UndefOr[Boolean] = js.native
  
  /**
    * To determine whether to activate tooltip by onPress or onLongPress.
    */
  var toggleAction: js.UndefOr[String] = js.native
  
  /**
    * Flag to determine to toggle or not the tooltip on press.
    */
  var toggleOnPress: js.UndefOr[Boolean] = js.native
  
  /**
    * Tooltip container width. Necessary in order to render the container in the correct place. Pass height according to the size of the content rendered inside the container.
    * @default 150
    */
  var width: js.UndefOr[Double] = js.native
  
  /**
    *  Flag to determine whether or not dislay overlay shadow when tooltip is open.
    *
    * @default true
    */
  var withOverlay: js.UndefOr[Boolean] = js.native
  
  /**
    * Flag to determine whether or not dislay pointer.
    */
  var withPointer: js.UndefOr[Boolean] = js.native
}
object TooltipProps {
  
  @scala.inline
  def apply(): TooltipProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TooltipProps]
  }
  
  @scala.inline
  implicit class TooltipPropsMutableBuilder[Self <: TooltipProps] (val x: Self) extends AnyVal {
    
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
