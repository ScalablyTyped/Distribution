package typings.reactstrap.libAlertMod

import typings.react.NativeMouseEvent
import typings.react.reactMod.MouseEvent
import typings.react.reactMod.MouseEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AlertProps extends UncontrolledAlertProps {
  var isOpen: js.UndefOr[Boolean] = js.undefined
  var toggle: js.UndefOr[MouseEventHandler[_]] = js.undefined
}

object AlertProps {
  @scala.inline
  def apply(
    UncontrolledAlertProps: UncontrolledAlertProps = null,
    isOpen: js.UndefOr[Boolean] = js.undefined,
    toggle: MouseEvent[_, NativeMouseEvent] => Unit = null
  ): AlertProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, UncontrolledAlertProps)
    if (!js.isUndefined(isOpen)) __obj.updateDynamic("isOpen")(isOpen)
    if (toggle != null) __obj.updateDynamic("toggle")(js.Any.fromFunction1(toggle))
    __obj.asInstanceOf[AlertProps]
  }
}

