package typings
package reactDashIntlLib.ReactIntlNs.FormattedPluralNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Base extends js.Object {
  /*
    * one of "cardinal" (default) | "ordinal"
    */
  var style: js.UndefOr[
    reactDashIntlLib.reactDashIntlLibStrings.cardinal | reactDashIntlLib.reactDashIntlLibStrings.ordinal
  ] = js.undefined
}

object Base {
  @scala.inline
  def apply(
    style: reactDashIntlLib.reactDashIntlLibStrings.cardinal | reactDashIntlLib.reactDashIntlLibStrings.ordinal = null
  ): Base = {
    val __obj = js.Dynamic.literal()
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[Base]
  }
}

