package typings.snazzyDashInfoDashWindow.snazzyDashInfoDashWindowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Border extends js.Object {
  var color: js.UndefOr[String] = js.undefined
  var width: String
}

object Border {
  @scala.inline
  def apply(width: String, color: String = null): Border = {
    val __obj = js.Dynamic.literal(width = width.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    __obj.asInstanceOf[Border]
  }
}

