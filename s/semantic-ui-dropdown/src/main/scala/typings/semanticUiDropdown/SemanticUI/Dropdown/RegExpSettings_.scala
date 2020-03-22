package typings.semanticUiDropdown.SemanticUI.Dropdown

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined semantic-ui-dropdown.SemanticUI.Dropdown.RegExpSettings.Param */
trait RegExpSettings_ extends js.Object {
  var escape: js.UndefOr[RegExp] = js.undefined
}

object RegExpSettings_ {
  @scala.inline
  def apply(escape: RegExp = null): RegExpSettings_ = {
    val __obj = js.Dynamic.literal()
    if (escape != null) __obj.updateDynamic("escape")(escape.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegExpSettings_]
  }
}

