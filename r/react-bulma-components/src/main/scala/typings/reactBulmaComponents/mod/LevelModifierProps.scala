package typings.reactBulmaComponents.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*** Level ***/
// https://github.com/couds/react-bulma-components/blob/master/src/components/level/level.js
trait LevelModifierProps extends js.Object {
  var breakpoint: js.UndefOr[Breakpoint] = js.undefined
}

object LevelModifierProps {
  @scala.inline
  def apply(breakpoint: Breakpoint = null): LevelModifierProps = {
    val __obj = js.Dynamic.literal()
    if (breakpoint != null) __obj.updateDynamic("breakpoint")(breakpoint.asInstanceOf[js.Any])
    __obj.asInstanceOf[LevelModifierProps]
  }
}

