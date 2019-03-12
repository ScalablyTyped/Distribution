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
    onChange: /* value */ js.Any => scala.Unit = null
  ): RadioProps = {
    val __obj = js.Dynamic.literal(name = name)
    __obj.updateDynamic("type")(`type`)
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    __obj.asInstanceOf[RadioProps]
  }
}

