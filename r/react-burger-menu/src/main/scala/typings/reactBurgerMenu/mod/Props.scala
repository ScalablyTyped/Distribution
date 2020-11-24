package typings.reactBurgerMenu.mod

import typings.react.mod.KeyboardEvent
import typings.react.mod.global.JSX.Element
import typings.reactBurgerMenu.anon.PartialStyles
import typings.reactBurgerMenu.reactBurgerMenuBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Props extends js.Object {
  
  var bodyClassName: js.UndefOr[String] = js.native
  
  var burgerBarClassName: js.UndefOr[String] = js.native
  
  var burgerButtonClassName: js.UndefOr[String] = js.native
  
  var className: js.UndefOr[String] = js.native
  
  var crossButtonClassName: js.UndefOr[String] = js.native
  
  var crossClassName: js.UndefOr[String] = js.native
  
  var customBurgerIcon: js.UndefOr[Element | `false`] = js.native
  
  var customCrossIcon: js.UndefOr[Element | `false`] = js.native
  
  var customOnKeyDown: js.UndefOr[js.Function1[/* event */ KeyboardEvent[typings.std.Element], Unit]] = js.native
  
  var disableAutoFocus: js.UndefOr[Boolean] = js.native
  
  var disableCloseOnEsc: js.UndefOr[Boolean] = js.native
  
  var disableOverlayClick: js.UndefOr[Boolean | js.Function0[Boolean]] = js.native
  
  var htmlClassName: js.UndefOr[String] = js.native
  
  var id: js.UndefOr[String] = js.native
  
  var isOpen: js.UndefOr[Boolean] = js.native
  
  var itemClassName: js.UndefOr[String] = js.native
  
  var itemListClassName: js.UndefOr[String] = js.native
  
  var menuClassName: js.UndefOr[String] = js.native
  
  var morphShapeClassName: js.UndefOr[String] = js.native
  
  var noOverlay: js.UndefOr[Boolean] = js.native
  
  var noTransition: js.UndefOr[Boolean] = js.native
  
  var onClose: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onIconHoverChange: js.UndefOr[js.Function1[/* state */ HoverState, Unit]] = js.native
  
  var onOpen: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onStateChange: js.UndefOr[js.Function1[/* state */ State, Unit]] = js.native
  
  // TODO (Rajab) This can be improved, though I do not know how. From PropTypes:
  // styles && styles.outerContainer ? PropTypes.string.isRequired : PropTypes.string
  var outerContainerId: js.UndefOr[String] = js.native
  
  var overlayClassName: js.UndefOr[String] = js.native
  
  // TODO (Rajab) This can be improved, though I do not know how. From PropTypes:
  // styles && styles.pageWrap ? PropTypes.string.isRequired : PropTypes.string,
  var pageWrapId: js.UndefOr[String] = js.native
  
  var right: js.UndefOr[Boolean] = js.native
  
  var styles: js.UndefOr[PartialStyles] = js.native
  
  var width: js.UndefOr[Double | String] = js.native
}
object Props {
  
  @scala.inline
  def apply(): Props = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Props]
  }
  
  @scala.inline
  implicit class PropsOps[Self <: Props] (val x: Self) extends AnyVal {
    
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
    def setBodyClassName(value: String): Self = this.set("bodyClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBodyClassName: Self = this.set("bodyClassName", js.undefined)
    
    @scala.inline
    def setBurgerBarClassName(value: String): Self = this.set("burgerBarClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBurgerBarClassName: Self = this.set("burgerBarClassName", js.undefined)
    
    @scala.inline
    def setBurgerButtonClassName(value: String): Self = this.set("burgerButtonClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBurgerButtonClassName: Self = this.set("burgerButtonClassName", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setCrossButtonClassName(value: String): Self = this.set("crossButtonClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCrossButtonClassName: Self = this.set("crossButtonClassName", js.undefined)
    
    @scala.inline
    def setCrossClassName(value: String): Self = this.set("crossClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCrossClassName: Self = this.set("crossClassName", js.undefined)
    
    @scala.inline
    def setCustomBurgerIcon(value: Element | `false`): Self = this.set("customBurgerIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomBurgerIcon: Self = this.set("customBurgerIcon", js.undefined)
    
    @scala.inline
    def setCustomCrossIcon(value: Element | `false`): Self = this.set("customCrossIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomCrossIcon: Self = this.set("customCrossIcon", js.undefined)
    
    @scala.inline
    def setCustomOnKeyDown(value: /* event */ KeyboardEvent[typings.std.Element] => Unit): Self = this.set("customOnKeyDown", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCustomOnKeyDown: Self = this.set("customOnKeyDown", js.undefined)
    
    @scala.inline
    def setDisableAutoFocus(value: Boolean): Self = this.set("disableAutoFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableAutoFocus: Self = this.set("disableAutoFocus", js.undefined)
    
    @scala.inline
    def setDisableCloseOnEsc(value: Boolean): Self = this.set("disableCloseOnEsc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableCloseOnEsc: Self = this.set("disableCloseOnEsc", js.undefined)
    
    @scala.inline
    def setDisableOverlayClickFunction0(value: () => Boolean): Self = this.set("disableOverlayClick", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDisableOverlayClick(value: Boolean | js.Function0[Boolean]): Self = this.set("disableOverlayClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableOverlayClick: Self = this.set("disableOverlayClick", js.undefined)
    
    @scala.inline
    def setHtmlClassName(value: String): Self = this.set("htmlClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHtmlClassName: Self = this.set("htmlClassName", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setIsOpen(value: Boolean): Self = this.set("isOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsOpen: Self = this.set("isOpen", js.undefined)
    
    @scala.inline
    def setItemClassName(value: String): Self = this.set("itemClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItemClassName: Self = this.set("itemClassName", js.undefined)
    
    @scala.inline
    def setItemListClassName(value: String): Self = this.set("itemListClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItemListClassName: Self = this.set("itemListClassName", js.undefined)
    
    @scala.inline
    def setMenuClassName(value: String): Self = this.set("menuClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMenuClassName: Self = this.set("menuClassName", js.undefined)
    
    @scala.inline
    def setMorphShapeClassName(value: String): Self = this.set("morphShapeClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMorphShapeClassName: Self = this.set("morphShapeClassName", js.undefined)
    
    @scala.inline
    def setNoOverlay(value: Boolean): Self = this.set("noOverlay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoOverlay: Self = this.set("noOverlay", js.undefined)
    
    @scala.inline
    def setNoTransition(value: Boolean): Self = this.set("noTransition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoTransition: Self = this.set("noTransition", js.undefined)
    
    @scala.inline
    def setOnClose(value: () => Unit): Self = this.set("onClose", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnClose: Self = this.set("onClose", js.undefined)
    
    @scala.inline
    def setOnIconHoverChange(value: /* state */ HoverState => Unit): Self = this.set("onIconHoverChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnIconHoverChange: Self = this.set("onIconHoverChange", js.undefined)
    
    @scala.inline
    def setOnOpen(value: () => Unit): Self = this.set("onOpen", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnOpen: Self = this.set("onOpen", js.undefined)
    
    @scala.inline
    def setOnStateChange(value: /* state */ State => Unit): Self = this.set("onStateChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnStateChange: Self = this.set("onStateChange", js.undefined)
    
    @scala.inline
    def setOuterContainerId(value: String): Self = this.set("outerContainerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOuterContainerId: Self = this.set("outerContainerId", js.undefined)
    
    @scala.inline
    def setOverlayClassName(value: String): Self = this.set("overlayClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverlayClassName: Self = this.set("overlayClassName", js.undefined)
    
    @scala.inline
    def setPageWrapId(value: String): Self = this.set("pageWrapId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageWrapId: Self = this.set("pageWrapId", js.undefined)
    
    @scala.inline
    def setRight(value: Boolean): Self = this.set("right", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRight: Self = this.set("right", js.undefined)
    
    @scala.inline
    def setStyles(value: PartialStyles): Self = this.set("styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyles: Self = this.set("styles", js.undefined)
    
    @scala.inline
    def setWidth(value: Double | String): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
