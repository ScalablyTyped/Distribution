package typings.scrollreveal.scrollReveal

import typings.std.Element
import typings.std.HTMLElement
import typings.std.NodeListOf
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScrollRevealObjectOptions extends js.Object {
  var afterReset: js.UndefOr[js.Function1[/* domEl */ HTMLElement | NodeListOf[Element], Unit]] = js.undefined
  var afterReveal: js.UndefOr[js.Function1[/* domEl */ HTMLElement | NodeListOf[Element], Unit]] = js.undefined
  var beforeReset: js.UndefOr[js.Function1[/* domEl */ HTMLElement | NodeListOf[Element], Unit]] = js.undefined
  var beforeReveal: js.UndefOr[js.Function1[/* domEl */ HTMLElement | NodeListOf[Element], Unit]] = js.undefined
  var container: js.UndefOr[js.Any] = js.undefined
  var delay: js.UndefOr[Double] = js.undefined
  var distance: js.UndefOr[String] = js.undefined
  var duration: js.UndefOr[Double] = js.undefined
  var easing: js.UndefOr[String] = js.undefined
  var interval: js.UndefOr[Double] = js.undefined
  var mobile: js.UndefOr[Boolean] = js.undefined
  var opacity: js.UndefOr[Double] = js.undefined
  var origin: js.UndefOr[String] = js.undefined
  var reset: js.UndefOr[Boolean] = js.undefined
  var rotate: js.UndefOr[ScrollRevealRotateObject] = js.undefined
  var scale: js.UndefOr[Double] = js.undefined
  var useDelay: js.UndefOr[String] = js.undefined
  var viewFactor: js.UndefOr[Double] = js.undefined
  var viewOffset: js.UndefOr[ScrollRevealPositionObject] = js.undefined
}

object ScrollRevealObjectOptions {
  @scala.inline
  def apply(
    afterReset: /* domEl */ HTMLElement | NodeListOf[Element] => Unit = null,
    afterReveal: /* domEl */ HTMLElement | NodeListOf[Element] => Unit = null,
    beforeReset: /* domEl */ HTMLElement | NodeListOf[Element] => Unit = null,
    beforeReveal: /* domEl */ HTMLElement | NodeListOf[Element] => Unit = null,
    container: js.Any = null,
    delay: js.UndefOr[Double] = js.undefined,
    distance: String = null,
    duration: js.UndefOr[Double] = js.undefined,
    easing: String = null,
    interval: js.UndefOr[Double] = js.undefined,
    mobile: js.UndefOr[Boolean] = js.undefined,
    opacity: js.UndefOr[Double] = js.undefined,
    origin: String = null,
    reset: js.UndefOr[Boolean] = js.undefined,
    rotate: ScrollRevealRotateObject = null,
    scale: js.UndefOr[Double] = js.undefined,
    useDelay: String = null,
    viewFactor: js.UndefOr[Double] = js.undefined,
    viewOffset: ScrollRevealPositionObject = null
  ): ScrollRevealObjectOptions = {
    val __obj = js.Dynamic.literal()
    if (afterReset != null) __obj.updateDynamic("afterReset")(js.Any.fromFunction1(afterReset))
    if (afterReveal != null) __obj.updateDynamic("afterReveal")(js.Any.fromFunction1(afterReveal))
    if (beforeReset != null) __obj.updateDynamic("beforeReset")(js.Any.fromFunction1(beforeReset))
    if (beforeReveal != null) __obj.updateDynamic("beforeReveal")(js.Any.fromFunction1(beforeReveal))
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (!js.isUndefined(delay)) __obj.updateDynamic("delay")(delay.get.asInstanceOf[js.Any])
    if (distance != null) __obj.updateDynamic("distance")(distance.asInstanceOf[js.Any])
    if (!js.isUndefined(duration)) __obj.updateDynamic("duration")(duration.get.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(easing.asInstanceOf[js.Any])
    if (!js.isUndefined(interval)) __obj.updateDynamic("interval")(interval.get.asInstanceOf[js.Any])
    if (!js.isUndefined(mobile)) __obj.updateDynamic("mobile")(mobile.get.asInstanceOf[js.Any])
    if (!js.isUndefined(opacity)) __obj.updateDynamic("opacity")(opacity.get.asInstanceOf[js.Any])
    if (origin != null) __obj.updateDynamic("origin")(origin.asInstanceOf[js.Any])
    if (!js.isUndefined(reset)) __obj.updateDynamic("reset")(reset.get.asInstanceOf[js.Any])
    if (rotate != null) __obj.updateDynamic("rotate")(rotate.asInstanceOf[js.Any])
    if (!js.isUndefined(scale)) __obj.updateDynamic("scale")(scale.get.asInstanceOf[js.Any])
    if (useDelay != null) __obj.updateDynamic("useDelay")(useDelay.asInstanceOf[js.Any])
    if (!js.isUndefined(viewFactor)) __obj.updateDynamic("viewFactor")(viewFactor.get.asInstanceOf[js.Any])
    if (viewOffset != null) __obj.updateDynamic("viewOffset")(viewOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollRevealObjectOptions]
  }
}

