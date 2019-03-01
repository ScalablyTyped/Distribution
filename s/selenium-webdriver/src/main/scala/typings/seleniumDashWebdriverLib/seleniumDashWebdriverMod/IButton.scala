package typings
package seleniumDashWebdriverLib.seleniumDashWebdriverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IButton extends js.Object {
  var LEFT: java.lang.String
  var MIDDLE: java.lang.String
  var RIGHT: java.lang.String
}

object IButton {
  @scala.inline
  def apply(LEFT: java.lang.String, MIDDLE: java.lang.String, RIGHT: java.lang.String): IButton = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("LEFT")(LEFT)
    __obj.updateDynamic("MIDDLE")(MIDDLE)
    __obj.updateDynamic("RIGHT")(RIGHT)
    __obj.asInstanceOf[IButton]
  }
}

