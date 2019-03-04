package typings
package spectacleLib.spectacleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnimProps extends js.Object {
  var easing: easeType
  var fromStyle: CSSProperties | coreDashJsLib.Array[CSSProperties]
  var onAnim: js.UndefOr[
    js.Function2[
      /* forwards */ js.UndefOr[scala.Boolean], 
      /* animIndex */ js.UndefOr[scala.Double], 
      scala.Unit
    ]
  ] = js.undefined
  var order: js.UndefOr[scala.Double] = js.undefined
  var route: js.UndefOr[js.Object] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var toStyle: CSSProperties | coreDashJsLib.Array[CSSProperties]
  var transitionDuration: scala.Double
}

object AnimProps {
  @scala.inline
  def apply(
    easing: easeType,
    fromStyle: CSSProperties | coreDashJsLib.Array[CSSProperties],
    toStyle: CSSProperties | coreDashJsLib.Array[CSSProperties],
    transitionDuration: scala.Double,
    onAnim: js.Function2[
      /* forwards */ js.UndefOr[scala.Boolean], 
      /* animIndex */ js.UndefOr[scala.Double], 
      scala.Unit
    ] = null,
    order: scala.Int | scala.Double = null,
    route: js.Object = null,
    style: CSSProperties = null
  ): AnimProps = {
    val __obj = js.Dynamic.literal(easing = easing, fromStyle = fromStyle.asInstanceOf[js.Any], toStyle = toStyle.asInstanceOf[js.Any], transitionDuration = transitionDuration)
    if (onAnim != null) __obj.updateDynamic("onAnim")(onAnim)
    if (order != null) __obj.updateDynamic("order")(order.asInstanceOf[js.Any])
    if (route != null) __obj.updateDynamic("route")(route)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[AnimProps]
  }
}

