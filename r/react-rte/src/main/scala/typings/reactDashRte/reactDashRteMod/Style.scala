package typings.reactDashRte.reactDashRteMod

import typings.reactDashRte.reactDashRteStrings.STYLE
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
    val __obj = js.Dynamic.literal(style = style)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Style]
  }
}

