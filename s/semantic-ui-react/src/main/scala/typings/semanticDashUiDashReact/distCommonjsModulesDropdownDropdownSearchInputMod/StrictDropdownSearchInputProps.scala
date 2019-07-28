package typings.semanticDashUiDashReact.distCommonjsModulesDropdownDropdownSearchInputMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StrictDropdownSearchInputProps extends js.Object {
  /** An element type to render as (string or function). */
  var as: js.UndefOr[js.Any] = js.undefined
  /** An input can have the auto complete. */
  var autoComplete: js.UndefOr[String] = js.undefined
  /** Additional classes. */
  var className: js.UndefOr[String] = js.undefined
  /** An input can receive focus. */
  var tabIndex: js.UndefOr[Double | String] = js.undefined
  /** The HTML input type. */
  var `type`: js.UndefOr[String] = js.undefined
  /** Stored value. */
  var value: js.UndefOr[Double | String] = js.undefined
}

object StrictDropdownSearchInputProps {
  @scala.inline
  def apply(
    as: js.Any = null,
    autoComplete: String = null,
    className: String = null,
    tabIndex: Double | String = null,
    `type`: String = null,
    value: Double | String = null
  ): StrictDropdownSearchInputProps = {
    val __obj = js.Dynamic.literal()
    if (as != null) __obj.updateDynamic("as")(as)
    if (autoComplete != null) __obj.updateDynamic("autoComplete")(autoComplete)
    if (className != null) __obj.updateDynamic("className")(className)
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[StrictDropdownSearchInputProps]
  }
}

