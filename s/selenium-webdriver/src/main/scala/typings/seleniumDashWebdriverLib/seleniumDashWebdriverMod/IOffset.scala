package typings
package seleniumDashWebdriverLib.seleniumDashWebdriverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOffset extends js.Object {
  var x: scala.Double
  var y: scala.Double
}

object IOffset {
  @scala.inline
  def apply(x: scala.Double, y: scala.Double): IOffset = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("x")(x)
    __obj.updateDynamic("y")(y)
    __obj.asInstanceOf[IOffset]
  }
}

