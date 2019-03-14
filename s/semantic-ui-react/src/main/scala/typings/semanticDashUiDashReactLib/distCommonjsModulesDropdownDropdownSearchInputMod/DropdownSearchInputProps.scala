package typings
package semanticDashUiDashReactLib.distCommonjsModulesDropdownDropdownSearchInputMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DropdownSearchInputProps
  extends StrictDropdownSearchInputProps
     with /* key */ org.scalablytyped.runtime.StringDictionary[js.Any]

object DropdownSearchInputProps {
  @scala.inline
  def apply(
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    as: js.Any = null,
    autoComplete: java.lang.String = null,
    className: java.lang.String = null,
    tabIndex: scala.Double | java.lang.String = null,
    `type`: java.lang.String = null,
    value: scala.Double | java.lang.String = null
  ): DropdownSearchInputProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (as != null) __obj.updateDynamic("as")(as)
    if (autoComplete != null) __obj.updateDynamic("autoComplete")(autoComplete)
    if (className != null) __obj.updateDynamic("className")(className)
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[DropdownSearchInputProps]
  }
}

