package typings.qtip2.QTip2

import typings.qtip2.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * Hide property
	 */
trait Hide extends js.Object {
  var delay: js.UndefOr[Double] = js.undefined
  var distance: js.UndefOr[Double | Boolean] = js.undefined
  var effect: js.UndefOr[Boolean | (js.Function1[/* offset */ js.Any, Unit])] = js.undefined
  var event: js.UndefOr[String | Boolean] = js.undefined
  var fixed: js.UndefOr[Boolean] = js.undefined
  var inactive: js.UndefOr[Double | Boolean] = js.undefined
  var leave: js.UndefOr[String | Boolean] = js.undefined
  var target: js.UndefOr[JQuery | Boolean] = js.undefined
}

object Hide {
  @scala.inline
  def apply(
    delay: Int | Double = null,
    distance: Double | Boolean = null,
    effect: Boolean | (js.Function1[/* offset */ js.Any, Unit]) = null,
    event: String | Boolean = null,
    fixed: js.UndefOr[Boolean] = js.undefined,
    inactive: Double | Boolean = null,
    leave: String | Boolean = null,
    target: JQuery | Boolean = null
  ): Hide = {
    val __obj = js.Dynamic.literal()
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (distance != null) __obj.updateDynamic("distance")(distance.asInstanceOf[js.Any])
    if (effect != null) __obj.updateDynamic("effect")(effect.asInstanceOf[js.Any])
    if (event != null) __obj.updateDynamic("event")(event.asInstanceOf[js.Any])
    if (!js.isUndefined(fixed)) __obj.updateDynamic("fixed")(fixed.asInstanceOf[js.Any])
    if (inactive != null) __obj.updateDynamic("inactive")(inactive.asInstanceOf[js.Any])
    if (leave != null) __obj.updateDynamic("leave")(leave.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hide]
  }
}

