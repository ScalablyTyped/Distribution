package typings.semanticUiDropdown.anon

import typings.semanticUiDropdown.semanticUiDropdownBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<std.Pick<semantic-ui-dropdown.SemanticUI.Dropdown.LabelSettings._Impl, keyof semantic-ui-dropdown.SemanticUI.Dropdown.LabelSettings._Impl>> */
trait PartialPickImplkeyofImplDuration extends js.Object {
  var duration: js.UndefOr[Double] = js.undefined
  var transition: js.UndefOr[String] = js.undefined
  var variation: js.UndefOr[`false` | String] = js.undefined
}

object PartialPickImplkeyofImplDuration {
  @scala.inline
  def apply(
    duration: js.UndefOr[Double] = js.undefined,
    transition: String = null,
    variation: `false` | String = null
  ): PartialPickImplkeyofImplDuration = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(duration)) __obj.updateDynamic("duration")(duration.get.asInstanceOf[js.Any])
    if (transition != null) __obj.updateDynamic("transition")(transition.asInstanceOf[js.Any])
    if (variation != null) __obj.updateDynamic("variation")(variation.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialPickImplkeyofImplDuration]
  }
}

