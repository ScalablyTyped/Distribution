package typings.reactNativeElements.mod

import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.ReactElement
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TooltipProps extends js.Object {
  
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
  implicit class TooltipPropsOps[Self <: TooltipProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setModalComponent(value: ComponentClass[js.Object, ComponentState]): Self = this.set("ModalComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModalComponent: Self = this.set("ModalComponent", js.undefined)
    
    @scala.inline
    def setBackgroundColor(value: String): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackgroundColor: Self = this.set("backgroundColor", js.undefined)
    
    @scala.inline
    def setCloseOnlyOnBackdropPress(value: Boolean): Self = this.set("closeOnlyOnBackdropPress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloseOnlyOnBackdropPress: Self = this.set("closeOnlyOnBackdropPress", js.undefined)
    
    @scala.inline
    def setContainerStyle(value: StyleProp[ViewStyle]): Self = this.set("containerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainerStyle: Self = this.set("containerStyle", js.undefined)
    
    @scala.inline
    def setContainerStyleNull: Self = this.set("containerStyle", null)
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setHighlightColor(value: String): Self = this.set("highlightColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHighlightColor: Self = this.set("highlightColor", js.undefined)
    
    @scala.inline
    def setOnClose(value: () => Unit): Self = this.set("onClose", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnClose: Self = this.set("onClose", js.undefined)
    
    @scala.inline
    def setOnOpen(value: () => Unit): Self = this.set("onOpen", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnOpen: Self = this.set("onOpen", js.undefined)
    
    @scala.inline
    def setOverlayColor(value: String): Self = this.set("overlayColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverlayColor: Self = this.set("overlayColor", js.undefined)
    
    @scala.inline
    def setPointerColor(value: String): Self = this.set("pointerColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePointerColor: Self = this.set("pointerColor", js.undefined)
    
    @scala.inline
    def setPopover(value: ReactElement): Self = this.set("popover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePopover: Self = this.set("popover", js.undefined)
    
    @scala.inline
    def setSkipAndroidStatusBar(value: Boolean): Self = this.set("skipAndroidStatusBar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkipAndroidStatusBar: Self = this.set("skipAndroidStatusBar", js.undefined)
    
    @scala.inline
    def setToggleAction(value: String): Self = this.set("toggleAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToggleAction: Self = this.set("toggleAction", js.undefined)
    
    @scala.inline
    def setToggleOnPress(value: Boolean): Self = this.set("toggleOnPress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToggleOnPress: Self = this.set("toggleOnPress", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
    
    @scala.inline
    def setWithOverlay(value: Boolean): Self = this.set("withOverlay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWithOverlay: Self = this.set("withOverlay", js.undefined)
    
    @scala.inline
    def setWithPointer(value: Boolean): Self = this.set("withPointer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWithPointer: Self = this.set("withPointer", js.undefined)
  }
}
