package typings.roxDashReactDashNative.roxDashReactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RoxFlagOptions extends js.Object {
  var freeze: js.UndefOr[FreezeOptions] = js.undefined
}

object RoxFlagOptions {
  @scala.inline
  def apply(freeze: FreezeOptions = null): RoxFlagOptions = {
    val __obj = js.Dynamic.literal()
    if (freeze != null) __obj.updateDynamic("freeze")(freeze.asInstanceOf[js.Any])
    __obj.asInstanceOf[RoxFlagOptions]
  }
}

