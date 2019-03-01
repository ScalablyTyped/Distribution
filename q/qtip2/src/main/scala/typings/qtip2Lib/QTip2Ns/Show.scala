package typings
package qtip2Lib.QTip2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * Show property
	 */
trait Show extends js.Object {
  var delay: js.UndefOr[scala.Double] = js.undefined
  var effect: js.UndefOr[scala.Boolean | (js.Function1[/* offset */ js.Any, scala.Unit])] = js.undefined
  var event: js.UndefOr[java.lang.String | scala.Boolean] = js.undefined
  var modal: js.UndefOr[scala.Boolean | Modal] = js.undefined
  var ready: js.UndefOr[scala.Boolean] = js.undefined
  var solo: js.UndefOr[qtip2Lib.JQuery | java.lang.String | scala.Boolean] = js.undefined
  var target: js.UndefOr[qtip2Lib.JQuery | scala.Boolean] = js.undefined
}

object Show {
  @scala.inline
  def apply(
    delay: scala.Int | scala.Double = null,
    effect: scala.Boolean | (js.Function1[/* offset */ js.Any, scala.Unit]) = null,
    event: java.lang.String | scala.Boolean = null,
    modal: scala.Boolean | Modal = null,
    ready: js.UndefOr[scala.Boolean] = js.undefined,
    solo: qtip2Lib.JQuery | java.lang.String | scala.Boolean = null,
    target: qtip2Lib.JQuery | scala.Boolean = null
  ): Show = {
    val __obj = js.Dynamic.literal()
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (effect != null) __obj.updateDynamic("effect")(effect.asInstanceOf[js.Any])
    if (event != null) __obj.updateDynamic("event")(event.asInstanceOf[js.Any])
    if (modal != null) __obj.updateDynamic("modal")(modal.asInstanceOf[js.Any])
    if (!js.isUndefined(ready)) __obj.updateDynamic("ready")(ready)
    if (solo != null) __obj.updateDynamic("solo")(solo.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    __obj.asInstanceOf[Show]
  }
}

