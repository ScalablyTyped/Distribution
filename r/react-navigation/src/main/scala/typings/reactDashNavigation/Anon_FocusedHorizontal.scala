package typings.reactDashNavigation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FocusedHorizontal extends js.Object {
  var focused: Boolean
  var horizontal: Boolean
  var tintColor: String | Null
}

object Anon_FocusedHorizontal {
  @scala.inline
  def apply(focused: Boolean, horizontal: Boolean, tintColor: String = null): Anon_FocusedHorizontal = {
    val __obj = js.Dynamic.literal(focused = focused, horizontal = horizontal)
    if (tintColor != null) __obj.updateDynamic("tintColor")(tintColor)
    __obj.asInstanceOf[Anon_FocusedHorizontal]
  }
}

