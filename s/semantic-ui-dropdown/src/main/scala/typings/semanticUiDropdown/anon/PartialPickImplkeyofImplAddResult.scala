package typings.semanticUiDropdown.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<std.Pick<semantic-ui-dropdown.SemanticUI.Dropdown.MessageSettings._Impl, keyof semantic-ui-dropdown.SemanticUI.Dropdown.MessageSettings._Impl>> */
trait PartialPickImplkeyofImplAddResult extends js.Object {
  var addResult: js.UndefOr[String] = js.undefined
  var count: js.UndefOr[String] = js.undefined
  var maxSelections: js.UndefOr[String] = js.undefined
  var noResults: js.UndefOr[String] = js.undefined
}

object PartialPickImplkeyofImplAddResult {
  @scala.inline
  def apply(
    addResult: String = null,
    count: String = null,
    maxSelections: String = null,
    noResults: String = null
  ): PartialPickImplkeyofImplAddResult = {
    val __obj = js.Dynamic.literal()
    if (addResult != null) __obj.updateDynamic("addResult")(addResult.asInstanceOf[js.Any])
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (maxSelections != null) __obj.updateDynamic("maxSelections")(maxSelections.asInstanceOf[js.Any])
    if (noResults != null) __obj.updateDynamic("noResults")(noResults.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialPickImplkeyofImplAddResult]
  }
}

