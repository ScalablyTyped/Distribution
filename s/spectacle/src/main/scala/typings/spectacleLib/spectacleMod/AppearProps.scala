package typings
package spectacleLib.spectacleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppearProps extends js.Object {
  var easing: js.UndefOr[easeType] = js.undefined
  var endValue: js.UndefOr[js.Object] = js.undefined
  var fid: js.UndefOr[java.lang.String] = js.undefined
  var order: js.UndefOr[scala.Double] = js.undefined
  var startValue: js.UndefOr[js.Object] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var transitionDuration: js.UndefOr[scala.Double] = js.undefined
}

object AppearProps {
  @scala.inline
  def apply(
    easing: easeType = null,
    endValue: js.Object = null,
    fid: java.lang.String = null,
    order: scala.Int | scala.Double = null,
    startValue: js.Object = null,
    style: CSSProperties = null,
    transitionDuration: scala.Int | scala.Double = null
  ): AppearProps = {
    val __obj = js.Dynamic.literal()
    if (easing != null) __obj.updateDynamic("easing")(easing)
    if (endValue != null) __obj.updateDynamic("endValue")(endValue)
    if (fid != null) __obj.updateDynamic("fid")(fid)
    if (order != null) __obj.updateDynamic("order")(order.asInstanceOf[js.Any])
    if (startValue != null) __obj.updateDynamic("startValue")(startValue)
    if (style != null) __obj.updateDynamic("style")(style)
    if (transitionDuration != null) __obj.updateDynamic("transitionDuration")(transitionDuration.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppearProps]
  }
}

