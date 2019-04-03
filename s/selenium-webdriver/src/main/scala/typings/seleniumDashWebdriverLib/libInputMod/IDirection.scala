package typings
package seleniumDashWebdriverLib.libInputMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDirection extends js.Object {
  var duration: js.UndefOr[scala.Double] = js.undefined
  var origin: js.UndefOr[Origin | seleniumDashWebdriverLib.seleniumDashWebdriverMod.WebElement] = js.undefined
  var x: js.UndefOr[scala.Double] = js.undefined
  var y: js.UndefOr[scala.Double] = js.undefined
}

object IDirection {
  @scala.inline
  def apply(
    duration: scala.Int | scala.Double = null,
    origin: Origin | seleniumDashWebdriverLib.seleniumDashWebdriverMod.WebElement = null,
    x: scala.Int | scala.Double = null,
    y: scala.Int | scala.Double = null
  ): IDirection = {
    val __obj = js.Dynamic.literal()
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (origin != null) __obj.updateDynamic("origin")(origin.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDirection]
  }
}

