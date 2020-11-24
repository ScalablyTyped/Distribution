package typings.reactBootstrap.modalMod

import typings.react.mod.AllHTMLAttributes
import typings.react.mod.ClassAttributes
import typings.react.mod.ReactElement
import typings.reactBootstrap.mod.Sizes
import typings.reactBootstrap.mod.TransitionCallbacks
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModalProps
  extends AllHTMLAttributes[Modal]
     with TransitionCallbacks
     with ClassAttributes[Modal] {
  
  // Optional
  var animation: js.UndefOr[Boolean] = js.native
  
  var backdrop: js.UndefOr[Boolean | String] = js.native
  
  var backdropClassName: js.UndefOr[String] = js.native
  
  var backdropStyle: js.UndefOr[js.Any] = js.native
  
  var backdropTransitionTimeout: js.UndefOr[Double] = js.native
  
  var bsClass: js.UndefOr[String] = js.native
  
  var bsSize: js.UndefOr[Sizes] = js.native
  
  var container: js.UndefOr[js.Any] = js.native
  
   // TODO: Add more specific type
  var containerClassName: js.UndefOr[String] = js.native
  
  var dialogClassName: js.UndefOr[String] = js.native
  
  var dialogComponent: js.UndefOr[js.Any] = js.native
  
   // TODO: Add more specific type
  var dialogTransitionTimeout: js.UndefOr[Double] = js.native
  
  var enforceFocus: js.UndefOr[Boolean] = js.native
  
  var keyboard: js.UndefOr[Boolean] = js.native
  
  var onBackdropClick: js.UndefOr[js.Function1[/* node */ HTMLElement, _]] = js.native
  
  var onEscapeKeyDown: js.UndefOr[js.Function1[/* node */ HTMLElement, _]] = js.native
  
  /**
    * @deprecated since Sept 25, 2017, use onEscapeKeyDown instead
    **/
  var onEscapeKeyUp: js.UndefOr[js.Function1[/* node */ HTMLElement, _]] = js.native
  
  // Required
  var onHide: js.Function = js.native
  
  var onShow: js.UndefOr[js.Function1[/* node */ HTMLElement, _]] = js.native
  
  var restoreFocus: js.UndefOr[Boolean] = js.native
  
  var show: js.UndefOr[Boolean] = js.native
  
  var transition: js.UndefOr[ReactElement] = js.native
}
object ModalProps {
  
  @scala.inline
  def apply(onHide: js.Function): ModalProps = {
    val __obj = js.Dynamic.literal(onHide = onHide.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModalProps]
  }
  
  @scala.inline
  implicit class ModalPropsOps[Self <: ModalProps] (val x: Self) extends AnyVal {
    
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
    def setOnHide(value: js.Function): Self = this.set("onHide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimation(value: Boolean): Self = this.set("animation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimation: Self = this.set("animation", js.undefined)
    
    @scala.inline
    def setBackdrop(value: Boolean | String): Self = this.set("backdrop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackdrop: Self = this.set("backdrop", js.undefined)
    
    @scala.inline
    def setBackdropClassName(value: String): Self = this.set("backdropClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackdropClassName: Self = this.set("backdropClassName", js.undefined)
    
    @scala.inline
    def setBackdropStyle(value: js.Any): Self = this.set("backdropStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackdropStyle: Self = this.set("backdropStyle", js.undefined)
    
    @scala.inline
    def setBackdropTransitionTimeout(value: Double): Self = this.set("backdropTransitionTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackdropTransitionTimeout: Self = this.set("backdropTransitionTimeout", js.undefined)
    
    @scala.inline
    def setBsClass(value: String): Self = this.set("bsClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBsClass: Self = this.set("bsClass", js.undefined)
    
    @scala.inline
    def setBsSize(value: Sizes): Self = this.set("bsSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBsSize: Self = this.set("bsSize", js.undefined)
    
    @scala.inline
    def setContainer(value: js.Any): Self = this.set("container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainer: Self = this.set("container", js.undefined)
    
    @scala.inline
    def setContainerClassName(value: String): Self = this.set("containerClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainerClassName: Self = this.set("containerClassName", js.undefined)
    
    @scala.inline
    def setDialogClassName(value: String): Self = this.set("dialogClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDialogClassName: Self = this.set("dialogClassName", js.undefined)
    
    @scala.inline
    def setDialogComponent(value: js.Any): Self = this.set("dialogComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDialogComponent: Self = this.set("dialogComponent", js.undefined)
    
    @scala.inline
    def setDialogTransitionTimeout(value: Double): Self = this.set("dialogTransitionTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDialogTransitionTimeout: Self = this.set("dialogTransitionTimeout", js.undefined)
    
    @scala.inline
    def setEnforceFocus(value: Boolean): Self = this.set("enforceFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnforceFocus: Self = this.set("enforceFocus", js.undefined)
    
    @scala.inline
    def setKeyboard(value: Boolean): Self = this.set("keyboard", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyboard: Self = this.set("keyboard", js.undefined)
    
    @scala.inline
    def setOnBackdropClick(value: /* node */ HTMLElement => _): Self = this.set("onBackdropClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnBackdropClick: Self = this.set("onBackdropClick", js.undefined)
    
    @scala.inline
    def setOnEscapeKeyDown(value: /* node */ HTMLElement => _): Self = this.set("onEscapeKeyDown", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnEscapeKeyDown: Self = this.set("onEscapeKeyDown", js.undefined)
    
    @scala.inline
    def setOnEscapeKeyUp(value: /* node */ HTMLElement => _): Self = this.set("onEscapeKeyUp", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnEscapeKeyUp: Self = this.set("onEscapeKeyUp", js.undefined)
    
    @scala.inline
    def setOnShow(value: /* node */ HTMLElement => _): Self = this.set("onShow", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnShow: Self = this.set("onShow", js.undefined)
    
    @scala.inline
    def setRestoreFocus(value: Boolean): Self = this.set("restoreFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRestoreFocus: Self = this.set("restoreFocus", js.undefined)
    
    @scala.inline
    def setShow(value: Boolean): Self = this.set("show", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShow: Self = this.set("show", js.undefined)
    
    @scala.inline
    def setTransition(value: ReactElement): Self = this.set("transition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransition: Self = this.set("transition", js.undefined)
  }
}
