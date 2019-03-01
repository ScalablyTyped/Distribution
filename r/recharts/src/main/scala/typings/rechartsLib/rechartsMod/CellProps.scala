package typings
package rechartsLib.rechartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in keyof recharts.recharts.PresentationAttributes<number, number> ]:? recharts.recharts.PresentationAttributes<number, number>[P]} */ trait CellProps extends js.Object {
  var onClick: js.UndefOr[RechartsFunction] = js.undefined
}

object CellProps {
  @scala.inline
  def apply(onClick: RechartsFunction = null): CellProps = {
    val __obj = js.Dynamic.literal()
    if (onClick != null) __obj.updateDynamic("onClick")(onClick)
    __obj.asInstanceOf[CellProps]
  }
}

