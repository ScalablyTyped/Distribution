package typings
package reactDashSDashAlertLib.reactDashSDashAlertMod.SAlertNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SAlertConfigProps extends js.Object {
  var beep: js.UndefOr[java.lang.String | scala.Boolean | SAlertBeepProps] = js.undefined
  var contentTemplate: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
  var customFields: js.UndefOr[js.Object] = js.undefined
  var effect: js.UndefOr[java.lang.String] = js.undefined
  var html: js.UndefOr[scala.Boolean] = js.undefined
  var offset: js.UndefOr[scala.Double] = js.undefined
  var onClose: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onShow: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var position: js.UndefOr[java.lang.String] = js.undefined
  var stack: js.UndefOr[scala.Boolean | SAlertStackProps] = js.undefined
  var timeout: js.UndefOr[java.lang.String | scala.Double] = js.undefined
}

object SAlertConfigProps {
  @scala.inline
  def apply(
    beep: java.lang.String | scala.Boolean | SAlertBeepProps = null,
    contentTemplate: js.Function1[/* repeated */ js.Any, _] = null,
    customFields: js.Object = null,
    effect: java.lang.String = null,
    html: js.UndefOr[scala.Boolean] = js.undefined,
    offset: scala.Int | scala.Double = null,
    onClose: js.Function0[scala.Unit] = null,
    onShow: js.Function0[scala.Unit] = null,
    position: java.lang.String = null,
    stack: scala.Boolean | SAlertStackProps = null,
    timeout: java.lang.String | scala.Double = null
  ): SAlertConfigProps = {
    val __obj = js.Dynamic.literal()
    if (beep != null) __obj.updateDynamic("beep")(beep.asInstanceOf[js.Any])
    if (contentTemplate != null) __obj.updateDynamic("contentTemplate")(contentTemplate)
    if (customFields != null) __obj.updateDynamic("customFields")(customFields)
    if (effect != null) __obj.updateDynamic("effect")(effect)
    if (!js.isUndefined(html)) __obj.updateDynamic("html")(html)
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (onClose != null) __obj.updateDynamic("onClose")(onClose)
    if (onShow != null) __obj.updateDynamic("onShow")(onShow)
    if (position != null) __obj.updateDynamic("position")(position)
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[SAlertConfigProps]
  }
}

