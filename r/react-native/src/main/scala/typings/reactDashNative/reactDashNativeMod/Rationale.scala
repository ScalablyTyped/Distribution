package typings.reactDashNative.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Rationale extends js.Object {
  var buttonNegative: js.UndefOr[String] = js.undefined
  var buttonNeutral: js.UndefOr[String] = js.undefined
  var buttonPositive: String
  var message: String
  var title: String
}

object Rationale {
  @scala.inline
  def apply(
    buttonPositive: String,
    message: String,
    title: String,
    buttonNegative: String = null,
    buttonNeutral: String = null
  ): Rationale = {
    val __obj = js.Dynamic.literal(buttonPositive = buttonPositive, message = message, title = title)
    if (buttonNegative != null) __obj.updateDynamic("buttonNegative")(buttonNegative)
    if (buttonNeutral != null) __obj.updateDynamic("buttonNeutral")(buttonNeutral)
    __obj.asInstanceOf[Rationale]
  }
}

