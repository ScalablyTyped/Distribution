package typings.semanticUiDropdown.SemanticUI.Dropdown.RegExpSettings

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-dropdown.SemanticUI.Dropdown.RegExpSettings._Impl, 'escape'> & std.Partial<std.Pick<semantic-ui-dropdown.SemanticUI.Dropdown.RegExpSettings._Impl, keyof semantic-ui-dropdown.SemanticUI.Dropdown.RegExpSettings._Impl>> */
trait Param extends js.Object {
  var escape: js.UndefOr[RegExp] = js.undefined
}

object Param {
  @scala.inline
  def apply(escape: RegExp = null): Param = {
    val __obj = js.Dynamic.literal()
    if (escape != null) __obj.updateDynamic("escape")(escape.asInstanceOf[js.Any])
    __obj.asInstanceOf[Param]
  }
}

