package typings.reactPlyr.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Focused extends js.Object {
  var focused: js.UndefOr[Boolean] = js.undefined
  var global: js.UndefOr[Boolean] = js.undefined
}

object Focused {
  @scala.inline
  def apply(focused: js.UndefOr[Boolean] = js.undefined, global: js.UndefOr[Boolean] = js.undefined): Focused = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(focused)) __obj.updateDynamic("focused")(focused.get.asInstanceOf[js.Any])
    if (!js.isUndefined(global)) __obj.updateDynamic("global")(global.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Focused]
  }
}

