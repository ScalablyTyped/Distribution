package typings.reactstrap.modalMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.HTMLAttributes
import typings.react.mod.KeyboardEvent
import typings.react.mod.KeyboardEventHandler
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.react.mod.RefObject
import typings.reactstrap.fadeMod.FadeProps
import typings.reactstrap.mod.CSSModule
import typings.reactstrap.reactstrapStrings.static
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModalProps
  extends HTMLAttributes[HTMLElement]
     with /* key */ StringDictionary[js.Any] {
  var autoFocus: js.UndefOr[Boolean] = js.native
  var backdrop: js.UndefOr[Boolean | static] = js.native
  var backdropClassName: js.UndefOr[String] = js.native
  var backdropTransition: js.UndefOr[FadeProps] = js.native
  var centered: js.UndefOr[Boolean] = js.native
  var container: js.UndefOr[String | HTMLElement | RefObject[HTMLElement]] = js.native
  var contentClassName: js.UndefOr[String] = js.native
  var cssModule: js.UndefOr[CSSModule] = js.native
  var external: js.UndefOr[ReactNode] = js.native
  var fade: js.UndefOr[Boolean] = js.native
  var isOpen: js.UndefOr[Boolean] = js.native
  var keyboard: js.UndefOr[Boolean] = js.native
  var labelledBy: js.UndefOr[String] = js.native
  var modalClassName: js.UndefOr[String] = js.native
  var modalTransition: js.UndefOr[FadeProps] = js.native
  var onClosed: js.UndefOr[js.Function0[Unit]] = js.native
  var onEnter: js.UndefOr[js.Function0[Unit]] = js.native
  var onExit: js.UndefOr[js.Function0[Unit]] = js.native
  var onOpened: js.UndefOr[js.Function0[Unit]] = js.native
  var returnFocusAfterClose: js.UndefOr[Boolean] = js.native
  var scrollable: js.UndefOr[Boolean] = js.native
  var size: js.UndefOr[String] = js.native
  var toggle: js.UndefOr[KeyboardEventHandler[_] | MouseEventHandler[_]] = js.native
  var unmountOnClose: js.UndefOr[Boolean] = js.native
  var wrapClassName: js.UndefOr[String] = js.native
  var zIndex: js.UndefOr[Double | String] = js.native
}

object ModalProps {
  @scala.inline
  def apply(): ModalProps = {
    val __obj = js.Dynamic.literal()
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
    def setAutoFocus(value: Boolean): Self = this.set("autoFocus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoFocus: Self = this.set("autoFocus", js.undefined)
    @scala.inline
    def setBackdrop(value: Boolean | static): Self = this.set("backdrop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackdrop: Self = this.set("backdrop", js.undefined)
    @scala.inline
    def setBackdropClassName(value: String): Self = this.set("backdropClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackdropClassName: Self = this.set("backdropClassName", js.undefined)
    @scala.inline
    def setBackdropTransition(value: FadeProps): Self = this.set("backdropTransition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackdropTransition: Self = this.set("backdropTransition", js.undefined)
    @scala.inline
    def setCentered(value: Boolean): Self = this.set("centered", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCentered: Self = this.set("centered", js.undefined)
    @scala.inline
    def setContainer(value: String | HTMLElement | RefObject[HTMLElement]): Self = this.set("container", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainer: Self = this.set("container", js.undefined)
    @scala.inline
    def setContentClassName(value: String): Self = this.set("contentClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentClassName: Self = this.set("contentClassName", js.undefined)
    @scala.inline
    def setCssModule(value: CSSModule): Self = this.set("cssModule", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCssModule: Self = this.set("cssModule", js.undefined)
    @scala.inline
    def setExternal(value: ReactNode): Self = this.set("external", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExternal: Self = this.set("external", js.undefined)
    @scala.inline
    def setFade(value: Boolean): Self = this.set("fade", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFade: Self = this.set("fade", js.undefined)
    @scala.inline
    def setIsOpen(value: Boolean): Self = this.set("isOpen", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsOpen: Self = this.set("isOpen", js.undefined)
    @scala.inline
    def setKeyboard(value: Boolean): Self = this.set("keyboard", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyboard: Self = this.set("keyboard", js.undefined)
    @scala.inline
    def setLabelledBy(value: String): Self = this.set("labelledBy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelledBy: Self = this.set("labelledBy", js.undefined)
    @scala.inline
    def setModalClassName(value: String): Self = this.set("modalClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModalClassName: Self = this.set("modalClassName", js.undefined)
    @scala.inline
    def setModalTransition(value: FadeProps): Self = this.set("modalTransition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModalTransition: Self = this.set("modalTransition", js.undefined)
    @scala.inline
    def setOnClosed(value: () => Unit): Self = this.set("onClosed", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnClosed: Self = this.set("onClosed", js.undefined)
    @scala.inline
    def setOnEnter(value: () => Unit): Self = this.set("onEnter", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnEnter: Self = this.set("onEnter", js.undefined)
    @scala.inline
    def setOnExit(value: () => Unit): Self = this.set("onExit", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnExit: Self = this.set("onExit", js.undefined)
    @scala.inline
    def setOnOpened(value: () => Unit): Self = this.set("onOpened", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnOpened: Self = this.set("onOpened", js.undefined)
    @scala.inline
    def setReturnFocusAfterClose(value: Boolean): Self = this.set("returnFocusAfterClose", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReturnFocusAfterClose: Self = this.set("returnFocusAfterClose", js.undefined)
    @scala.inline
    def setScrollable(value: Boolean): Self = this.set("scrollable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScrollable: Self = this.set("scrollable", js.undefined)
    @scala.inline
    def setSize(value: String): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    @scala.inline
    def setToggle(value: KeyboardEvent[_] | (MouseEvent[_, NativeMouseEvent]) => Unit): Self = this.set("toggle", js.Any.fromFunction1(value))
    @scala.inline
    def deleteToggle: Self = this.set("toggle", js.undefined)
    @scala.inline
    def setUnmountOnClose(value: Boolean): Self = this.set("unmountOnClose", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnmountOnClose: Self = this.set("unmountOnClose", js.undefined)
    @scala.inline
    def setWrapClassName(value: String): Self = this.set("wrapClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWrapClassName: Self = this.set("wrapClassName", js.undefined)
    @scala.inline
    def setZIndex(value: Double | String): Self = this.set("zIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZIndex: Self = this.set("zIndex", js.undefined)
  }
  
}

