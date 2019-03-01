package typings
package reactDashDatesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Focused extends js.Object {
  var focused: scala.Boolean | scala.Null
}

object Anon_Focused {
  @scala.inline
  def apply(focused: js.UndefOr[scala.Boolean] = js.undefined): Anon_Focused = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(focused)) __obj.updateDynamic("focused")(focused)
    __obj.asInstanceOf[Anon_Focused]
  }
}

