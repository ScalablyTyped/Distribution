package typings.reactDashPlyr

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Focused extends js.Object {
  var focused: js.UndefOr[Boolean] = js.undefined
  var global: js.UndefOr[Boolean] = js.undefined
}

object Anon_Focused {
  @scala.inline
  def apply(focused: js.UndefOr[Boolean] = js.undefined, global: js.UndefOr[Boolean] = js.undefined): Anon_Focused = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(focused)) __obj.updateDynamic("focused")(focused)
    if (!js.isUndefined(global)) __obj.updateDynamic("global")(global)
    __obj.asInstanceOf[Anon_Focused]
  }
}

