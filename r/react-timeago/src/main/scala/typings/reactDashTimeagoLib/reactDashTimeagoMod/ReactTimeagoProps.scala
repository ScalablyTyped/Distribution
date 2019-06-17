package typings
package reactDashTimeagoLib.reactDashTimeagoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactTimeagoProps[T /* <: reactLib.reactMod.ComponentType[js.Object] */] extends js.Object {
  val component: js.UndefOr[java.lang.String | T] = js.undefined
  val date: java.lang.String | scala.Double | stdLib.Date
  val formatter: js.UndefOr[Formatter] = js.undefined
  val live: js.UndefOr[scala.Boolean] = js.undefined
  val maxPeriod: js.UndefOr[scala.Double] = js.undefined
  val minPeriod: js.UndefOr[scala.Double] = js.undefined
  val now: js.UndefOr[js.Function0[scala.Double]] = js.undefined
  val title: js.UndefOr[java.lang.String] = js.undefined
}

object ReactTimeagoProps {
  @scala.inline
  def apply[T /* <: reactLib.reactMod.ComponentType[js.Object] */](
    date: java.lang.String | scala.Double | stdLib.Date,
    component: java.lang.String | T = null,
    formatter: Formatter = null,
    live: js.UndefOr[scala.Boolean] = js.undefined,
    maxPeriod: scala.Int | scala.Double = null,
    minPeriod: scala.Int | scala.Double = null,
    now: () => scala.Double = null,
    title: java.lang.String = null
  ): ReactTimeagoProps[T] = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any])
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (formatter != null) __obj.updateDynamic("formatter")(formatter)
    if (!js.isUndefined(live)) __obj.updateDynamic("live")(live)
    if (maxPeriod != null) __obj.updateDynamic("maxPeriod")(maxPeriod.asInstanceOf[js.Any])
    if (minPeriod != null) __obj.updateDynamic("minPeriod")(minPeriod.asInstanceOf[js.Any])
    if (now != null) __obj.updateDynamic("now")(js.Any.fromFunction0(now))
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[ReactTimeagoProps[T]]
  }
}

