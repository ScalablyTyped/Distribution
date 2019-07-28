package typings.reactDashNavigation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Focused extends js.Object {
  var focused: Boolean
  var tintColor: String | Null
}

object Anon_Focused {
  @scala.inline
  def apply(focused: Boolean, tintColor: String = null): Anon_Focused = {
    val __obj = js.Dynamic.literal(focused = focused)
    if (tintColor != null) __obj.updateDynamic("tintColor")(tintColor)
    __obj.asInstanceOf[Anon_Focused]
  }
}

