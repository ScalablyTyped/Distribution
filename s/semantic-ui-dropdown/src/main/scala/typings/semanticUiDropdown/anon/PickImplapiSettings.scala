package typings.semanticUiDropdown.anon

import typings.semanticUiApi.SemanticUI.ApiSettings
import typings.semanticUiDropdown.semanticUiDropdownBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-dropdown.SemanticUI.DropdownSettings._Impl, 'apiSettings'> */
trait PickImplapiSettings extends js.Object {
  var apiSettings: `false` | ApiSettings
}

object PickImplapiSettings {
  @scala.inline
  def apply(apiSettings: `false` | ApiSettings): PickImplapiSettings = {
    val __obj = js.Dynamic.literal(apiSettings = apiSettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplapiSettings]
  }
}

