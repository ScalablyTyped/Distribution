package typings.seleniumDashWebdriver.libInputMod

import typings.seleniumDashWebdriver.seleniumDashWebdriverMod.WebElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDirection extends js.Object {
  var duration: js.UndefOr[Double] = js.undefined
  var origin: js.UndefOr[Origin | WebElement] = js.undefined
  var x: js.UndefOr[Double] = js.undefined
  var y: js.UndefOr[Double] = js.undefined
}

object IDirection {
  @scala.inline
  def apply(
    duration: Int | Double = null,
    origin: Origin | WebElement = null,
    x: Int | Double = null,
    y: Int | Double = null
  ): IDirection = {
    val __obj = js.Dynamic.literal()
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (origin != null) __obj.updateDynamic("origin")(origin.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDirection]
  }
}

