package typings
package snazzyDashInfoDashWindowLib.snazzyDashInfoDashWindowMod.SnazzyInfoWindowNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Border extends js.Object {
  var color: js.UndefOr[java.lang.String] = js.undefined
  var width: java.lang.String
}

object Border {
  @scala.inline
  def apply(width: java.lang.String, color: java.lang.String = null): Border = {
    val __obj = js.Dynamic.literal(width = width)
    if (color != null) __obj.updateDynamic("color")(color)
    __obj.asInstanceOf[Border]
  }
}

