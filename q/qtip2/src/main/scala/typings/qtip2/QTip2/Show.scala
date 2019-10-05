package typings.qtip2.QTip2

import typings.qtip2.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * Show property
	 */
trait Show extends js.Object {
  var delay: js.UndefOr[Double] = js.undefined
  var effect: js.UndefOr[Boolean | (js.Function1[/* offset */ js.Any, Unit])] = js.undefined
  var event: js.UndefOr[String | Boolean] = js.undefined
  var modal: js.UndefOr[Boolean | Modal] = js.undefined
  var ready: js.UndefOr[Boolean] = js.undefined
  var solo: js.UndefOr[JQuery | String | Boolean] = js.undefined
  var target: js.UndefOr[JQuery | Boolean] = js.undefined
}

object Show {
  @scala.inline
  def apply(
    delay: Int | Double = null,
    effect: Boolean | (js.Function1[/* offset */ js.Any, Unit]) = null,
    event: String | Boolean = null,
    modal: Boolean | Modal = null,
    ready: js.UndefOr[Boolean] = js.undefined,
    solo: JQuery | String | Boolean = null,
    target: JQuery | Boolean = null
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

