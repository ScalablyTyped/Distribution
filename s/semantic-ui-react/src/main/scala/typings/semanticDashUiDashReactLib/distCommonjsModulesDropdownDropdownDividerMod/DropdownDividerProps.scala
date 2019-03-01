package typings
package semanticDashUiDashReactLib.distCommonjsModulesDropdownDropdownDividerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DropdownDividerProps
  extends StrictDropdownDividerProps
     with /* key */ org.scalablytyped.runtime.StringDictionary[js.Any]

object DropdownDividerProps {
  @scala.inline
  def apply(
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    as: js.Any = null,
    className: java.lang.String = null
  ): DropdownDividerProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (as != null) __obj.updateDynamic("as")(as)
    if (className != null) __obj.updateDynamic("className")(className)
    __obj.asInstanceOf[DropdownDividerProps]
  }
}

