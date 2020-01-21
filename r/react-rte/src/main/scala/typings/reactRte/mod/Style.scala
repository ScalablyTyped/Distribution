package typings.reactRte.mod

import typings.reactRte.reactRteStrings.STYLE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Style extends js.Object {
  var style: String
  var `type`: STYLE
}

object Style {
  @scala.inline
  def apply(style: String, `type`: STYLE): Style = {
    val __obj = js.Dynamic.literal(style = style.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Style]
  }
}

