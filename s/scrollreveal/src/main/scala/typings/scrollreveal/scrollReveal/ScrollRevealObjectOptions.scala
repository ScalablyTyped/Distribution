package typings.scrollreveal.scrollReveal

import typings.std.Element
import typings.std.HTMLElement
import typings.std.NodeListOf
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScrollRevealObjectOptions extends js.Object {
  var afterReset: js.UndefOr[
    (js.Function1[/* domEl */ HTMLElement, Unit]) with (js.Function1[/* domEl */ NodeListOf[Element], Unit])
  ] = js.undefined
  var afterReveal: js.UndefOr[
    (js.Function1[/* domEl */ HTMLElement, Unit]) with (js.Function1[/* domEl */ NodeListOf[Element], Unit])
  ] = js.undefined
  var beforeReset: js.UndefOr[
    (js.Function1[/* domEl */ HTMLElement, Unit]) with (js.Function1[/* domEl */ NodeListOf[Element], Unit])
  ] = js.undefined
  var beforeReveal: js.UndefOr[
    (js.Function1[/* domEl */ HTMLElement, Unit]) with (js.Function1[/* domEl */ NodeListOf[Element], Unit])
  ] = js.undefined
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
    afterReset: (js.Function1[/* domEl */ HTMLElement, Unit]) with (js.Function1[/* domEl */ NodeListOf[Element], Unit]) = null,
    afterReveal: (js.Function1[/* domEl */ HTMLElement, Unit]) with (js.Function1[/* domEl */ NodeListOf[Element], Unit]) = null,
    beforeReset: (js.Function1[/* domEl */ HTMLElement, Unit]) with (js.Function1[/* domEl */ NodeListOf[Element], Unit]) = null,
    beforeReveal: (js.Function1[/* domEl */ HTMLElement, Unit]) with (js.Function1[/* domEl */ NodeListOf[Element], Unit]) = null,
    container: js.Any = null,
    delay: Int | Double = null,
    distance: String = null,
    duration: Int | Double = null,
    easing: String = null,
    interval: Int | Double = null,
    mobile: js.UndefOr[Boolean] = js.undefined,
    opacity: Int | Double = null,
    origin: String = null,
    reset: js.UndefOr[Boolean] = js.undefined,
    rotate: ScrollRevealRotateObject = null,
    scale: Int | Double = null,
    useDelay: String = null,
    viewFactor: Int | Double = null,
    viewOffset: ScrollRevealPositionObject = null
  ): ScrollRevealObjectOptions = {
    val __obj = js.Dynamic.literal()
    if (afterReset != null) __obj.updateDynamic("afterReset")(afterReset.asInstanceOf[js.Any])
    if (afterReveal != null) __obj.updateDynamic("afterReveal")(afterReveal.asInstanceOf[js.Any])
    if (beforeReset != null) __obj.updateDynamic("beforeReset")(beforeReset.asInstanceOf[js.Any])
    if (beforeReveal != null) __obj.updateDynamic("beforeReveal")(beforeReveal.asInstanceOf[js.Any])
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (distance != null) __obj.updateDynamic("distance")(distance.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(easing.asInstanceOf[js.Any])
    if (interval != null) __obj.updateDynamic("interval")(interval.asInstanceOf[js.Any])
    if (!js.isUndefined(mobile)) __obj.updateDynamic("mobile")(mobile.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (origin != null) __obj.updateDynamic("origin")(origin.asInstanceOf[js.Any])
    if (!js.isUndefined(reset)) __obj.updateDynamic("reset")(reset.asInstanceOf[js.Any])
    if (rotate != null) __obj.updateDynamic("rotate")(rotate.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (useDelay != null) __obj.updateDynamic("useDelay")(useDelay.asInstanceOf[js.Any])
    if (viewFactor != null) __obj.updateDynamic("viewFactor")(viewFactor.asInstanceOf[js.Any])
    if (viewOffset != null) __obj.updateDynamic("viewOffset")(viewOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollRevealObjectOptions]
  }
}

