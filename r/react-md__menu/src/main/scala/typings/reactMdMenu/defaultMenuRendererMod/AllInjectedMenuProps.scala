package typings.reactMdMenu.defaultMenuRendererMod

import typings.react.mod.KeyboardEvent
import typings.react.mod.KeyboardEventHandler
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.reactMdMenu.reactMdMenuStrings.first
import typings.reactMdMenu.reactMdMenuStrings.last
import typings.reactMdPortal.conditionalPortalMod.RenderConditionalPortalProps
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AllInjectedMenuProps
  extends MenuPositionProps
     with RequiredMenuProps
     with RenderConditionalPortalProps {
  var `aria-label`: js.UndefOr[String] = js.native
  var `aria-labelledby`: js.UndefOr[String] = js.native
  var onClick: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
  var onKeyDown: js.UndefOr[KeyboardEventHandler[HTMLDivElement]] = js.native
}

object AllInjectedMenuProps {
  @scala.inline
  def apply(
    controlId: String,
    defaultFocus: first | last | String,
    id: String,
    onRequestClose: () => Unit,
    visible: Boolean
  ): AllInjectedMenuProps = {
    val __obj = js.Dynamic.literal(controlId = controlId.asInstanceOf[js.Any], defaultFocus = defaultFocus.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], onRequestClose = js.Any.fromFunction0(onRequestClose), visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllInjectedMenuProps]
  }
  @scala.inline
  implicit class AllInjectedMenuPropsOps[Self <: AllInjectedMenuProps] (val x: Self) extends AnyVal {
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
    def `setAria-label`(value: String): Self = this.set("aria-label", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-label`: Self = this.set("aria-label", js.undefined)
    @scala.inline
    def `setAria-labelledby`(value: String): Self = this.set("aria-labelledby", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-labelledby`: Self = this.set("aria-labelledby", js.undefined)
    @scala.inline
    def setOnClick(value: MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit): Self = this.set("onClick", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
    @scala.inline
    def setOnKeyDown(value: KeyboardEvent[HTMLDivElement] => Unit): Self = this.set("onKeyDown", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnKeyDown: Self = this.set("onKeyDown", js.undefined)
  }
  
}

