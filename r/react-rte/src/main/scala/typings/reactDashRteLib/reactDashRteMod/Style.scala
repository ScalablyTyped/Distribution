package typings
package reactDashRteLib.reactDashRteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Style extends js.Object {
  var style: java.lang.String
  var `type`: reactDashRteLib.reactDashRteLibStrings.STYLE
}

object Style {
  @scala.inline
  def apply(style: java.lang.String, `type`: reactDashRteLib.reactDashRteLibStrings.STYLE): Style = {
    val __obj = js.Dynamic.literal(style = style)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Style]
  }
}

