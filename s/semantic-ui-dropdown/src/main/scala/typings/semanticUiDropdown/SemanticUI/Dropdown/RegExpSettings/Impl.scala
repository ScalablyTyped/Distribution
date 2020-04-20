package typings.semanticUiDropdown.SemanticUI.Dropdown.RegExpSettings

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Impl extends js.Object {
  /**
    * @default /[-[\]{}()*+?.,\\^$|#\s]/g
    */
  var escape: RegExp
}

object Impl {
  @scala.inline
  def apply(escape: RegExp): Impl = {
    val __obj = js.Dynamic.literal(escape = escape.asInstanceOf[js.Any])
    __obj.asInstanceOf[Impl]
  }
}

