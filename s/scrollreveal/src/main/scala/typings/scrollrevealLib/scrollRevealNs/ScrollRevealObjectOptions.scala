package typings
package scrollrevealLib.scrollRevealNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScrollRevealObjectOptions extends js.Object {
  var afterReset: js.UndefOr[
    (js.Function1[/* domEl */ stdLib.HTMLElement, scala.Unit]) with (js.Function1[/* domEl */ stdLib.NodeListOf[stdLib.Element], scala.Unit])
  ] = js.undefined
  var afterReveal: js.UndefOr[
    (js.Function1[/* domEl */ stdLib.HTMLElement, scala.Unit]) with (js.Function1[/* domEl */ stdLib.NodeListOf[stdLib.Element], scala.Unit])
  ] = js.undefined
  var beforeReset: js.UndefOr[
    (js.Function1[/* domEl */ stdLib.HTMLElement, scala.Unit]) with (js.Function1[/* domEl */ stdLib.NodeListOf[stdLib.Element], scala.Unit])
  ] = js.undefined
  var beforeReveal: js.UndefOr[
    (js.Function1[/* domEl */ stdLib.HTMLElement, scala.Unit]) with (js.Function1[/* domEl */ stdLib.NodeListOf[stdLib.Element], scala.Unit])
  ] = js.undefined
  var container: js.UndefOr[js.Any] = js.undefined
  var delay: js.UndefOr[scala.Double] = js.undefined
  var distance: js.UndefOr[java.lang.String] = js.undefined
  var duration: js.UndefOr[scala.Double] = js.undefined
  var easing: js.UndefOr[java.lang.String] = js.undefined
  var mobile: js.UndefOr[scala.Boolean] = js.undefined
  var opacity: js.UndefOr[scala.Double] = js.undefined
  var origin: js.UndefOr[java.lang.String] = js.undefined
  var reset: js.UndefOr[scala.Boolean] = js.undefined
  var rotate: js.UndefOr[ScrollRevealRotateObject] = js.undefined
  var scale: js.UndefOr[scala.Double] = js.undefined
  var useDelay: js.UndefOr[java.lang.String] = js.undefined
  var viewFactor: js.UndefOr[scala.Double] = js.undefined
  var viewOffset: js.UndefOr[ScrollRevealPositionObject] = js.undefined
}

object ScrollRevealObjectOptions {
  @scala.inline
  def apply(
    afterReset: (js.Function1[/* domEl */ stdLib.HTMLElement, scala.Unit]) with (js.Function1[/* domEl */ stdLib.NodeListOf[stdLib.Element], scala.Unit]) = null,
    afterReveal: (js.Function1[/* domEl */ stdLib.HTMLElement, scala.Unit]) with (js.Function1[/* domEl */ stdLib.NodeListOf[stdLib.Element], scala.Unit]) = null,
    beforeReset: (js.Function1[/* domEl */ stdLib.HTMLElement, scala.Unit]) with (js.Function1[/* domEl */ stdLib.NodeListOf[stdLib.Element], scala.Unit]) = null,
    beforeReveal: (js.Function1[/* domEl */ stdLib.HTMLElement, scala.Unit]) with (js.Function1[/* domEl */ stdLib.NodeListOf[stdLib.Element], scala.Unit]) = null,
    container: js.Any = null,
    delay: scala.Int | scala.Double = null,
    distance: java.lang.String = null,
    duration: scala.Int | scala.Double = null,
    easing: java.lang.String = null,
    mobile: js.UndefOr[scala.Boolean] = js.undefined,
    opacity: scala.Int | scala.Double = null,
    origin: java.lang.String = null,
    reset: js.UndefOr[scala.Boolean] = js.undefined,
    rotate: ScrollRevealRotateObject = null,
    scale: scala.Int | scala.Double = null,
    useDelay: java.lang.String = null,
    viewFactor: scala.Int | scala.Double = null,
    viewOffset: ScrollRevealPositionObject = null
  ): ScrollRevealObjectOptions = {
    val __obj = js.Dynamic.literal()
    if (afterReset != null) __obj.updateDynamic("afterReset")(afterReset)
    if (afterReveal != null) __obj.updateDynamic("afterReveal")(afterReveal)
    if (beforeReset != null) __obj.updateDynamic("beforeReset")(beforeReset)
    if (beforeReveal != null) __obj.updateDynamic("beforeReveal")(beforeReveal)
    if (container != null) __obj.updateDynamic("container")(container)
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (distance != null) __obj.updateDynamic("distance")(distance)
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(easing)
    if (!js.isUndefined(mobile)) __obj.updateDynamic("mobile")(mobile)
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (origin != null) __obj.updateDynamic("origin")(origin)
    if (!js.isUndefined(reset)) __obj.updateDynamic("reset")(reset)
    if (rotate != null) __obj.updateDynamic("rotate")(rotate)
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (useDelay != null) __obj.updateDynamic("useDelay")(useDelay)
    if (viewFactor != null) __obj.updateDynamic("viewFactor")(viewFactor.asInstanceOf[js.Any])
    if (viewOffset != null) __obj.updateDynamic("viewOffset")(viewOffset)
    __obj.asInstanceOf[ScrollRevealObjectOptions]
  }
}

