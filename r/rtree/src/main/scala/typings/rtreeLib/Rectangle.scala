package typings
package rtreeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Rectangle extends js.Object {
  var h: scala.Double
  var w: scala.Double
  var x: scala.Double
  var y: scala.Double
}

object Rectangle {
  @scala.inline
  def apply(h: scala.Double, w: scala.Double, x: scala.Double, y: scala.Double): Rectangle = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("h")(h)
    __obj.updateDynamic("w")(w)
    __obj.updateDynamic("x")(x)
    __obj.updateDynamic("y")(y)
    __obj.asInstanceOf[Rectangle]
  }
}

