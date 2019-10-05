package typings.recharts.rechartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in keyof recharts.recharts.PresentationAttributes<number, number> ]:? recharts.recharts.PresentationAttributes<number, number>[P]} */ trait CellProps extends js.Object {
  var onClick: js.UndefOr[RechartsFunction] = js.undefined
}

object CellProps {
  @scala.inline
  def apply(onClick: /* repeated */ js.Any => Unit = null): CellProps = {
    val __obj = js.Dynamic.literal()
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    __obj.asInstanceOf[CellProps]
  }
}

