package typings
package ractiveLib.RactiveNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObserveOnceOptions extends js.Object {
  // Default Ractive
  var context: js.UndefOr[js.Any] = js.undefined
  // Default false
  var defer: js.UndefOr[scala.Boolean] = js.undefined
}

object ObserveOnceOptions {
  @scala.inline
  def apply(context: js.Any = null, defer: js.UndefOr[scala.Boolean] = js.undefined): ObserveOnceOptions = {
    val __obj = js.Dynamic.literal()
    if (context != null) __obj.updateDynamic("context")(context)
    if (!js.isUndefined(defer)) __obj.updateDynamic("defer")(defer)
    __obj.asInstanceOf[ObserveOnceOptions]
  }
}

