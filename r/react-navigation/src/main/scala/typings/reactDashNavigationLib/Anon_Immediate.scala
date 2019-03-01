package typings
package reactDashNavigationLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Immediate extends js.Object {
  var immediate: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_Immediate {
  @scala.inline
  def apply(immediate: js.UndefOr[scala.Boolean] = js.undefined): Anon_Immediate = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(immediate)) __obj.updateDynamic("immediate")(immediate)
    __obj.asInstanceOf[Anon_Immediate]
  }
}

