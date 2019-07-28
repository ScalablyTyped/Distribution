package typings.reactDashSDashAlert.reactDashSDashAlertMod.SAlertNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SAlertConfigProps extends js.Object {
  var beep: js.UndefOr[String | Boolean | SAlertBeepProps] = js.undefined
  var contentTemplate: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
  var customFields: js.UndefOr[js.Object] = js.undefined
  var effect: js.UndefOr[String] = js.undefined
  var html: js.UndefOr[Boolean] = js.undefined
  var offset: js.UndefOr[Double] = js.undefined
  var onClose: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onShow: js.UndefOr[js.Function0[Unit]] = js.undefined
  var position: js.UndefOr[String] = js.undefined
  var stack: js.UndefOr[Boolean | SAlertStackProps] = js.undefined
  var timeout: js.UndefOr[String | Double] = js.undefined
}

object SAlertConfigProps {
  @scala.inline
  def apply(
    beep: String | Boolean | SAlertBeepProps = null,
    contentTemplate: /* repeated */ js.Any => _ = null,
    customFields: js.Object = null,
    effect: String = null,
    html: js.UndefOr[Boolean] = js.undefined,
    offset: Int | Double = null,
    onClose: () => Unit = null,
    onShow: () => Unit = null,
    position: String = null,
    stack: Boolean | SAlertStackProps = null,
    timeout: String | Double = null
  ): SAlertConfigProps = {
    val __obj = js.Dynamic.literal()
    if (beep != null) __obj.updateDynamic("beep")(beep.asInstanceOf[js.Any])
    if (contentTemplate != null) __obj.updateDynamic("contentTemplate")(js.Any.fromFunction1(contentTemplate))
    if (customFields != null) __obj.updateDynamic("customFields")(customFields)
    if (effect != null) __obj.updateDynamic("effect")(effect)
    if (!js.isUndefined(html)) __obj.updateDynamic("html")(html)
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction0(onClose))
    if (onShow != null) __obj.updateDynamic("onShow")(js.Any.fromFunction0(onShow))
    if (position != null) __obj.updateDynamic("position")(position)
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[SAlertConfigProps]
  }
}

