package typings.reactNavigationStack.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TintColor extends js.Object {
  var tintColor: js.UndefOr[String] = js.undefined
}

object TintColor {
  @scala.inline
  def apply(tintColor: String = null): TintColor = {
    val __obj = js.Dynamic.literal()
    if (tintColor != null) __obj.updateDynamic("tintColor")(tintColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[TintColor]
  }
}

