package typings
package reactDashNavigationLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FocusedHorizontal extends js.Object {
  var focused: scala.Boolean
  var horizontal: scala.Boolean
  var tintColor: java.lang.String | scala.Null
}

object Anon_FocusedHorizontal {
  @scala.inline
  def apply(focused: scala.Boolean, horizontal: scala.Boolean, tintColor: java.lang.String = null): Anon_FocusedHorizontal = {
    val __obj = js.Dynamic.literal(focused = focused, horizontal = horizontal)
    if (tintColor != null) __obj.updateDynamic("tintColor")(tintColor)
    __obj.asInstanceOf[Anon_FocusedHorizontal]
  }
}

