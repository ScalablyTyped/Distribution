package typings
package reactDashBootstrapLib.libToggleButtonGroupMod.ToggleButtonGroupNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RadioProps extends js.Object {
  /** Required if `type` is set to "radio" */
  var name: java.lang.String
  var onChange: js.UndefOr[js.Function1[/* value */ js.Any, scala.Unit]] = js.undefined
  var `type`: reactDashBootstrapLib.reactDashBootstrapLibStrings.radio
}

object RadioProps {
  @scala.inline
  def apply(
    name: java.lang.String,
    `type`: reactDashBootstrapLib.reactDashBootstrapLibStrings.radio,
    onChange: js.Function1[/* value */ js.Any, scala.Unit] = null
  ): RadioProps = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("name")(name)
    if (onChange != null) __obj.updateDynamic("onChange")(onChange)
    __obj.asInstanceOf[RadioProps]
  }
}

