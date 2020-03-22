package typings.reactBulmaComponents.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://github.com/couds/react-bulma-components/blob/master/src/components/level/components/level-side.js
trait LevelSideModifierProps extends js.Object {
  var align: js.UndefOr[String] = js.undefined
}

object LevelSideModifierProps {
  @scala.inline
  def apply(align: String = null): LevelSideModifierProps = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    __obj.asInstanceOf[LevelSideModifierProps]
  }
}

