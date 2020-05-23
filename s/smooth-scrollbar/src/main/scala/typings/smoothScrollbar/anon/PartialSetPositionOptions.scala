package typings.smoothScrollbar.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<smooth-scrollbar.smooth-scrollbar/interfaces.SetPositionOptions> */
trait PartialSetPositionOptions extends js.Object {
  var withoutCallbacks: js.UndefOr[Boolean] = js.undefined
}

object PartialSetPositionOptions {
  @scala.inline
  def apply(withoutCallbacks: js.UndefOr[Boolean] = js.undefined): PartialSetPositionOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(withoutCallbacks)) __obj.updateDynamic("withoutCallbacks")(withoutCallbacks.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialSetPositionOptions]
  }
}

