package typings
package reactDashBootstrapLib.libToggleButtonGroupMod.ToggleButtonGroupNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CheckboxProps extends js.Object {
  var name: js.UndefOr[java.lang.String] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* values */ js.Array[_], scala.Unit]] = js.undefined
  var `type`: reactDashBootstrapLib.reactDashBootstrapLibStrings.checkbox
}

object CheckboxProps {
  @scala.inline
  def apply(
    `type`: reactDashBootstrapLib.reactDashBootstrapLibStrings.checkbox,
    name: java.lang.String = null,
    onChange: js.Function1[/* values */ js.Array[_], scala.Unit] = null
  ): CheckboxProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (name != null) __obj.updateDynamic("name")(name)
    if (onChange != null) __obj.updateDynamic("onChange")(onChange)
    __obj.asInstanceOf[CheckboxProps]
  }
}

