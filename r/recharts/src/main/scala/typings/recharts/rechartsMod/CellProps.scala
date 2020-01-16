package typings.recharts.rechartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in keyof recharts.recharts.PresentationAttributes<number, number> ]:? recharts.recharts.PresentationAttributes<number, number>[P]} */ trait CellProps extends js.Object {
  var onClick: js.UndefOr[RechartsFunction] = js.undefined
  var onMouseEnter: js.UndefOr[RechartsFunction] = js.undefined
  var onMouseLeave: js.UndefOr[RechartsFunction] = js.undefined
}

object CellProps {
  @scala.inline
  def apply(
    onClick: /* repeated */ js.Any => Unit = null,
    onMouseEnter: /* repeated */ js.Any => Unit = null,
    onMouseLeave: /* repeated */ js.Any => Unit = null
  ): CellProps = {
    val __obj = js.Dynamic.literal()
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(js.Any.fromFunction1(onMouseEnter))
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(js.Any.fromFunction1(onMouseLeave))
    __obj.asInstanceOf[CellProps]
  }
}

