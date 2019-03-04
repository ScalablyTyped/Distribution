package typings
package reactDashNativeLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Rationale extends js.Object {
  var buttonNegative: js.UndefOr[java.lang.String] = js.undefined
  var buttonNeutral: js.UndefOr[java.lang.String] = js.undefined
  var buttonPositive: java.lang.String
  var message: java.lang.String
  var title: java.lang.String
}

object Rationale {
  @scala.inline
  def apply(
    buttonPositive: java.lang.String,
    message: java.lang.String,
    title: java.lang.String,
    buttonNegative: java.lang.String = null,
    buttonNeutral: java.lang.String = null
  ): Rationale = {
    val __obj = js.Dynamic.literal(buttonPositive = buttonPositive, message = message, title = title)
    if (buttonNegative != null) __obj.updateDynamic("buttonNegative")(buttonNegative)
    if (buttonNeutral != null) __obj.updateDynamic("buttonNeutral")(buttonNeutral)
    __obj.asInstanceOf[Rationale]
  }
}

