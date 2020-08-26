package typings.reactMdMenu.useMenuMod

import typings.react.mod.KeyboardEvent
import typings.react.mod.KeyboardEventHandler
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.Ref
import typings.reactMdMenu.reactMdMenuStrings.first
import typings.reactMdMenu.reactMdMenuStrings.last
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MenuOptions extends js.Object {
  /**
    * The id of the element that controls the menu's visibility. This is required
    * so that the menu won't be closed when the control element is clicked since
    * it'll have it's own toggle functionality built-in already.
    */
  var controlId: String = js.native
  /**
    * The default focusable element within the menu.
    */
  var defaultFocus: first | last | String = js.native
  /**
    * Boolean if the close on outside click logic should consider the control
    * element within the menu and not call the `onRequestClose` function when it
    * is been clicked. This should be enabled when creating a context menu but
    * normally should remain `false` otherwise since the control element has it's
    * own toggle logic that conflicts with this close click.
    */
  var disableControlClickOkay: js.UndefOr[Boolean] = js.native
  /**
    * Boolean if the menu is oriented horizontally instead of vertically.  This
    * will update the keydown handlers to use the `ArrowLeft` and `ArrowRight`
    * keys instead of `ArrowUp` and `ArrrowDown` to navigate.
    */
  var horizontal: js.UndefOr[Boolean] = js.native
  /**
    * An optional click handler to call when the `Menu` (or any child item) is
    * clicked. This will be merged with the default implementation to close the
    * menu once clicked.
    */
  var onClick: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
  /**
    * An optional keydown handler to call when the `Menu` (or any child item)
    * triggers a keydown event. This will be merged witht he default logic of
    * allowing items to be focused with the arrow keys or closing when the escape
    * or tab key is pressed.
    */
  var onKeyDown: js.UndefOr[KeyboardEventHandler[HTMLDivElement]] = js.native
  /**
    * Boolean if the menu has been portalled so that the tab keypress behavior
    * can be fixed since tab order is destroyed when portalling.
    */
  var portalled: js.UndefOr[Boolean] = js.native
  /**
    * An optional ref to be merged into the menu's required ref handler.
    */
  var ref: js.UndefOr[Ref[HTMLDivElement | Null]] = js.native
  /**
    * Boolean if the menu is currently visible.
    */
  var visible: Boolean = js.native
  /**
    * The function that should close the menu.
    */
  def onRequestClose(): Unit = js.native
}

object MenuOptions {
  @scala.inline
  def apply(
    controlId: String,
    defaultFocus: first | last | String,
    onRequestClose: () => Unit,
    visible: Boolean
  ): MenuOptions = {
    val __obj = js.Dynamic.literal(controlId = controlId.asInstanceOf[js.Any], defaultFocus = defaultFocus.asInstanceOf[js.Any], onRequestClose = js.Any.fromFunction0(onRequestClose), visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[MenuOptions]
  }
  @scala.inline
  implicit class MenuOptionsOps[Self <: MenuOptions] (val x: Self) extends AnyVal {
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
    def setControlId(value: String): Self = this.set("controlId", value.asInstanceOf[js.Any])
    @scala.inline
    def setDefaultFocus(value: first | last | String): Self = this.set("defaultFocus", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnRequestClose(value: () => Unit): Self = this.set("onRequestClose", js.Any.fromFunction0(value))
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisableControlClickOkay(value: Boolean): Self = this.set("disableControlClickOkay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableControlClickOkay: Self = this.set("disableControlClickOkay", js.undefined)
    @scala.inline
    def setHorizontal(value: Boolean): Self = this.set("horizontal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHorizontal: Self = this.set("horizontal", js.undefined)
    @scala.inline
    def setOnClick(value: MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit): Self = this.set("onClick", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
    @scala.inline
    def setOnKeyDown(value: KeyboardEvent[HTMLDivElement] => Unit): Self = this.set("onKeyDown", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnKeyDown: Self = this.set("onKeyDown", js.undefined)
    @scala.inline
    def setPortalled(value: Boolean): Self = this.set("portalled", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePortalled: Self = this.set("portalled", js.undefined)
    @scala.inline
    def setRefFunction1(value: /* instance */ (HTMLDivElement | Null) | Null => Unit): Self = this.set("ref", js.Any.fromFunction1(value))
    @scala.inline
    def setRef(value: Ref[HTMLDivElement | Null]): Self = this.set("ref", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRef: Self = this.set("ref", js.undefined)
    @scala.inline
    def setRefNull: Self = this.set("ref", null)
  }
  
}

