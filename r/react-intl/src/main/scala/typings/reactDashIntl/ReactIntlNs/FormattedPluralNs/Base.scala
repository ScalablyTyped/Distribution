package typings.reactDashIntl.ReactIntlNs.FormattedPluralNs

import typings.reactDashIntl.reactDashIntlStrings.cardinal
import typings.reactDashIntl.reactDashIntlStrings.ordinal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Base extends js.Object {
  /*
    * one of "cardinal" (default) | "ordinal"
    */
  var style: js.UndefOr[cardinal | ordinal] = js.undefined
}

object Base {
  @scala.inline
  def apply(style: cardinal | ordinal = null): Base = {
    val __obj = js.Dynamic.literal()
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[Base]
  }
}

