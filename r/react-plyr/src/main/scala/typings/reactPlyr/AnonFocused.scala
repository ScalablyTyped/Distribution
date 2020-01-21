package typings.reactPlyr

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFocused extends js.Object {
  var focused: js.UndefOr[Boolean] = js.undefined
  var global: js.UndefOr[Boolean] = js.undefined
}

object AnonFocused {
  @scala.inline
  def apply(focused: js.UndefOr[Boolean] = js.undefined, global: js.UndefOr[Boolean] = js.undefined): AnonFocused = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(focused)) __obj.updateDynamic("focused")(focused.asInstanceOf[js.Any])
    if (!js.isUndefined(global)) __obj.updateDynamic("global")(global.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFocused]
  }
}

