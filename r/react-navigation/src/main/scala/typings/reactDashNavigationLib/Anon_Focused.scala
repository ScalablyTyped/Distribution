package typings
package reactDashNavigationLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Focused extends js.Object {
  var focused: scala.Boolean
  var tintColor: java.lang.String | scala.Null
}

object Anon_Focused {
  @scala.inline
  def apply(focused: scala.Boolean, tintColor: java.lang.String = null): Anon_Focused = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("focused")(focused)
    if (tintColor != null) __obj.updateDynamic("tintColor")(tintColor)
    __obj.asInstanceOf[Anon_Focused]
  }
}

