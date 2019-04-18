package typings
package reactstrapLib.libAlertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AlertProps extends UncontrolledAlertProps {
  var isOpen: js.UndefOr[scala.Boolean] = js.undefined
  var toggle: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
}

object AlertProps {
  @scala.inline
  def apply(
    UncontrolledAlertProps: UncontrolledAlertProps = null,
    isOpen: js.UndefOr[scala.Boolean] = js.undefined,
    toggle: () => scala.Unit = null
  ): AlertProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, UncontrolledAlertProps)
    if (!js.isUndefined(isOpen)) __obj.updateDynamic("isOpen")(isOpen)
    if (toggle != null) __obj.updateDynamic("toggle")(js.Any.fromFunction0(toggle))
    __obj.asInstanceOf[AlertProps]
  }
}

