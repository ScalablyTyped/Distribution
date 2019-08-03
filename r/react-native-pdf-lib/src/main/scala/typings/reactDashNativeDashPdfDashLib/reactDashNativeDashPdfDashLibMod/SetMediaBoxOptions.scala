package typings.reactDashNativeDashPdfDashLib.reactDashNativeDashPdfDashLibMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetMediaBoxOptions extends js.Object {
  var x: js.UndefOr[Double] = js.undefined
  var y: js.UndefOr[Double] = js.undefined
}

object SetMediaBoxOptions {
  @scala.inline
  def apply(x: Int | Double = null, y: Int | Double = null): SetMediaBoxOptions = {
    val __obj = js.Dynamic.literal()
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetMediaBoxOptions]
  }
}

