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
    val __obj = js.Dynamic.literal(buttonPositive = buttonPositive.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    if (buttonNegative != null) __obj.updateDynamic("buttonNegative")(buttonNegative.asInstanceOf[js.Any])
    if (buttonNeutral != null) __obj.updateDynamic("buttonNeutral")(buttonNeutral.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rationale]
  }
}

