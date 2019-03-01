package typings
package slickgridLib.SlickNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Position extends js.Object {
  var left: scala.Double
  var top: scala.Double
}

object Position {
  @scala.inline
  def apply(left: scala.Double, top: scala.Double): Position = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("left")(left)
    __obj.updateDynamic("top")(top)
    __obj.asInstanceOf[Position]
  }
}

