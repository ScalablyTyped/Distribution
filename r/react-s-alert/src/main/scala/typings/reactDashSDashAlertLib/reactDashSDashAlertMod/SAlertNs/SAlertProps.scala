package typings
package reactDashSDashAlertLib.reactDashSDashAlertMod.SAlertNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SAlertProps extends SAlertConfigProps {
  var message: js.UndefOr[java.lang.String] = js.undefined
}

object SAlertProps {
  @scala.inline
  def apply(
    beep: java.lang.String | scala.Boolean | SAlertBeepProps = null,
    contentTemplate: /* repeated */ js.Any => _ = null,
    customFields: js.Object = null,
    effect: java.lang.String = null,
    html: js.UndefOr[scala.Boolean] = js.undefined,
    message: java.lang.String = null,
    offset: scala.Int | scala.Double = null,
    onClose: () => scala.Unit = null,
    onShow: () => scala.Unit = null,
    position: java.lang.String = null,
    stack: scala.Boolean | SAlertStackProps = null,
    timeout: java.lang.String | scala.Double = null
  ): SAlertProps = {
    val __obj = js.Dynamic.literal()
    if (beep != null) __obj.updateDynamic("beep")(beep.asInstanceOf[js.Any])
    if (contentTemplate != null) __obj.updateDynamic("contentTemplate")(js.Any.fromFunction1(contentTemplate))
    if (customFields != null) __obj.updateDynamic("customFields")(customFields)
    if (effect != null) __obj.updateDynamic("effect")(effect)
    if (!js.isUndefined(html)) __obj.updateDynamic("html")(html)
    if (message != null) __obj.updateDynamic("message")(message)
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction0(onClose))
    if (onShow != null) __obj.updateDynamic("onShow")(js.Any.fromFunction0(onShow))
    if (position != null) __obj.updateDynamic("position")(position)
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[SAlertProps]
  }
}

