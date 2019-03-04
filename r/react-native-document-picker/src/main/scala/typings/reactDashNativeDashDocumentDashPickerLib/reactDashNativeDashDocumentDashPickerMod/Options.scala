package typings
package reactDashNativeDashDocumentDashPickerLib.reactDashNativeDashDocumentDashPickerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var filetype: js.Array[java.lang.String]
  var left: js.UndefOr[scala.Double] = js.undefined
  var top: js.UndefOr[scala.Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    filetype: js.Array[java.lang.String],
    left: scala.Int | scala.Double = null,
    top: scala.Int | scala.Double = null
  ): Options = {
    val __obj = js.Dynamic.literal(filetype = filetype)
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

