package typings.reactCountTo.mod

import typings.react.mod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends js.Object {
  var children: js.UndefOr[js.Function1[/* value */ Double, ReactElement]] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var delay: js.UndefOr[Double] = js.undefined
  var digits: js.UndefOr[Double] = js.undefined
  var easing: js.UndefOr[js.Function1[/* progress */ Double, Double]] = js.undefined
  var from: js.UndefOr[Double] = js.undefined
  var onComplete: js.UndefOr[js.Function0[Unit]] = js.undefined
  var speed: Double
  var tagName: js.UndefOr[String] = js.undefined
  var to: Double
}

object Props {
  @scala.inline
  def apply(
    speed: Double,
    to: Double,
    children: /* value */ Double => ReactElement = null,
    className: String = null,
    delay: Int | Double = null,
    digits: Int | Double = null,
    easing: /* progress */ Double => Double = null,
    from: Int | Double = null,
    onComplete: () => Unit = null,
    tagName: String = null
  ): Props = {
    val __obj = js.Dynamic.literal(speed = speed.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(js.Any.fromFunction1(children))
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (digits != null) __obj.updateDynamic("digits")(digits.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(js.Any.fromFunction1(easing))
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (onComplete != null) __obj.updateDynamic("onComplete")(js.Any.fromFunction0(onComplete))
    if (tagName != null) __obj.updateDynamic("tagName")(tagName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
}

