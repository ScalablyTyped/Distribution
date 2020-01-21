package typings.spectacle.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnimProps extends js.Object {
  var easing: easeType
  var fromStyle: CSSProperties | js.Array[CSSProperties]
  var onAnim: js.UndefOr[
    js.Function2[/* forwards */ js.UndefOr[Boolean], /* animIndex */ js.UndefOr[Double], Unit]
  ] = js.undefined
  var order: js.UndefOr[Double] = js.undefined
  var route: js.UndefOr[js.Object] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var toStyle: CSSProperties | js.Array[CSSProperties]
  var transitionDuration: Double
}

object AnimProps {
  @scala.inline
  def apply(
    easing: easeType,
    fromStyle: CSSProperties | js.Array[CSSProperties],
    toStyle: CSSProperties | js.Array[CSSProperties],
    transitionDuration: Double,
    onAnim: (/* forwards */ js.UndefOr[Boolean], /* animIndex */ js.UndefOr[Double]) => Unit = null,
    order: Int | Double = null,
    route: js.Object = null,
    style: CSSProperties = null
  ): AnimProps = {
    val __obj = js.Dynamic.literal(easing = easing.asInstanceOf[js.Any], fromStyle = fromStyle.asInstanceOf[js.Any], toStyle = toStyle.asInstanceOf[js.Any], transitionDuration = transitionDuration.asInstanceOf[js.Any])
    if (onAnim != null) __obj.updateDynamic("onAnim")(js.Any.fromFunction2(onAnim))
    if (order != null) __obj.updateDynamic("order")(order.asInstanceOf[js.Any])
    if (route != null) __obj.updateDynamic("route")(route.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimProps]
  }
}

