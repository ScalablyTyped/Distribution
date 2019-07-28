package typings.reactDashBootstrap.libModalDialogMod

import typings.react.reactMod.HTMLProps
import typings.reactDashBootstrap.reactDashBootstrapMod.Sizes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModalDialogProps extends HTMLProps[ModalDialog] {
  var bsClass: js.UndefOr[String] = js.undefined
  var bsSize: js.UndefOr[Sizes] = js.undefined
  var onEnter: js.UndefOr[js.Function] = js.undefined
  var onEntered: js.UndefOr[js.Function] = js.undefined
  var onEntering: js.UndefOr[js.Function] = js.undefined
  var onExit: js.UndefOr[js.Function] = js.undefined
  var onExited: js.UndefOr[js.Function] = js.undefined
  var onExiting: js.UndefOr[js.Function] = js.undefined
  // TODO: these props are not correct https://github.com/react-bootstrap/react-bootstrap/blob/v0.31.1/src/ModalDialog.js#L9
  var onHide: js.UndefOr[js.Function] = js.undefined
}

object ModalDialogProps {
  @scala.inline
  def apply(
    HTMLProps: HTMLProps[ModalDialog] = null,
    bsClass: String = null,
    bsSize: Sizes = null,
    onEnter: js.Function = null,
    onEntered: js.Function = null,
    onEntering: js.Function = null,
    onExit: js.Function = null,
    onExited: js.Function = null,
    onExiting: js.Function = null,
    onHide: js.Function = null
  ): ModalDialogProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLProps)
    if (bsClass != null) __obj.updateDynamic("bsClass")(bsClass)
    if (bsSize != null) __obj.updateDynamic("bsSize")(bsSize)
    if (onEnter != null) __obj.updateDynamic("onEnter")(onEnter)
    if (onEntered != null) __obj.updateDynamic("onEntered")(onEntered)
    if (onEntering != null) __obj.updateDynamic("onEntering")(onEntering)
    if (onExit != null) __obj.updateDynamic("onExit")(onExit)
    if (onExited != null) __obj.updateDynamic("onExited")(onExited)
    if (onExiting != null) __obj.updateDynamic("onExiting")(onExiting)
    if (onHide != null) __obj.updateDynamic("onHide")(onHide)
    __obj.asInstanceOf[ModalDialogProps]
  }
}

