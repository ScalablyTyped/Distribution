package typings.reactDashDates

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Focused extends js.Object {
  var focused: Boolean | Null
}

object Anon_Focused {
  @scala.inline
  def apply(focused: js.UndefOr[Boolean] = js.undefined): Anon_Focused = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(focused)) __obj.updateDynamic("focused")(focused.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Focused]
  }
}

