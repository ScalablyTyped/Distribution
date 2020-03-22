package typings.reactBulmaComponents.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://github.com/couds/react-bulma-components/blob/master/src/components/form/components/select.js
trait SelectModifierProps extends js.Object {
  var color: js.UndefOr[Color] = js.undefined
}

object SelectModifierProps {
  @scala.inline
  def apply(color: Color = null): SelectModifierProps = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectModifierProps]
  }
}

