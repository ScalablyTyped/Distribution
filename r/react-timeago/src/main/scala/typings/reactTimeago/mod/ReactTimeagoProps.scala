package typings.reactTimeago.mod

import typings.react.mod.ComponentType
import typings.react.mod.ReactNode
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactTimeagoProps[T /* <: ComponentType[js.Object] */] extends js.Object {
  val component: js.UndefOr[String | T] = js.undefined
  val date: String | Double | Date
  val formatter: js.UndefOr[Formatter] = js.undefined
  val live: js.UndefOr[Boolean] = js.undefined
  val maxPeriod: js.UndefOr[Double] = js.undefined
  val minPeriod: js.UndefOr[Double] = js.undefined
  val now: js.UndefOr[js.Function0[Double]] = js.undefined
  val title: js.UndefOr[String] = js.undefined
}

object ReactTimeagoProps {
  @scala.inline
  def apply[T](
    date: String | Double | Date,
    component: String | T = null,
    formatter: (/* value */ Double, /* unit */ Unit, /* suffix */ Suffix, /* epochMiliseconds */ Double, /* nextFormatter */ js.UndefOr[
      /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias react-timeago.react-timeago.Formatter */ js.Object
    ]) => ReactNode = null,
    live: js.UndefOr[Boolean] = js.undefined,
    maxPeriod: js.UndefOr[Double] = js.undefined,
    minPeriod: js.UndefOr[Double] = js.undefined,
    now: () => Double = null,
    title: String = null
  ): ReactTimeagoProps[T] = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any])
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (formatter != null) __obj.updateDynamic("formatter")(js.Any.fromFunction5(formatter))
    if (!js.isUndefined(live)) __obj.updateDynamic("live")(live.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxPeriod)) __obj.updateDynamic("maxPeriod")(maxPeriod.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minPeriod)) __obj.updateDynamic("minPeriod")(minPeriod.get.asInstanceOf[js.Any])
    if (now != null) __obj.updateDynamic("now")(js.Any.fromFunction0(now))
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactTimeagoProps[T]]
  }
}

