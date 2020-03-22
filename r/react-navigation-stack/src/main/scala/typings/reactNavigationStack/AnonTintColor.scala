package typings.reactNavigationStack

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTintColor extends js.Object {
  var tintColor: js.UndefOr[String] = js.undefined
}

object AnonTintColor {
  @scala.inline
  def apply(tintColor: String = null): AnonTintColor = {
    val __obj = js.Dynamic.literal()
    if (tintColor != null) __obj.updateDynamic("tintColor")(tintColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTintColor]
  }
}

