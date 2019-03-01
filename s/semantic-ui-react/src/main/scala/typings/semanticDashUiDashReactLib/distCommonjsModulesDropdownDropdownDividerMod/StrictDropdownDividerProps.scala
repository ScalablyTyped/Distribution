package typings
package semanticDashUiDashReactLib.distCommonjsModulesDropdownDropdownDividerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StrictDropdownDividerProps extends js.Object {
  /** An element type to render as (string or function). */
  var as: js.UndefOr[js.Any] = js.undefined
  /** Additional classes. */
  var className: js.UndefOr[java.lang.String] = js.undefined
}

object StrictDropdownDividerProps {
  @scala.inline
  def apply(as: js.Any = null, className: java.lang.String = null): StrictDropdownDividerProps = {
    val __obj = js.Dynamic.literal()
    if (as != null) __obj.updateDynamic("as")(as)
    if (className != null) __obj.updateDynamic("className")(className)
    __obj.asInstanceOf[StrictDropdownDividerProps]
  }
}

