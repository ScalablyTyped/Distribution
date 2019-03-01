package typings
package slimerjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TopLeft extends js.Object {
  var left: scala.Double
  var top: scala.Double
}

object TopLeft {
  @scala.inline
  def apply(left: scala.Double, top: scala.Double): TopLeft = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("left")(left)
    __obj.updateDynamic("top")(top)
    __obj.asInstanceOf[TopLeft]
  }
}

