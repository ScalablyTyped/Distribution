package typings
package responseDashTimeLib.responseDashTimeMod.responseTimeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResponseTimeOptions extends js.Object {
  var digits: js.UndefOr[scala.Double] = js.undefined
  var header: js.UndefOr[java.lang.String] = js.undefined
  var suffix: js.UndefOr[scala.Boolean] = js.undefined
}

object ResponseTimeOptions {
  @scala.inline
  def apply(
    digits: scala.Int | scala.Double = null,
    header: java.lang.String = null,
    suffix: js.UndefOr[scala.Boolean] = js.undefined
  ): ResponseTimeOptions = {
    val __obj = js.Dynamic.literal()
    if (digits != null) __obj.updateDynamic("digits")(digits.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header)
    if (!js.isUndefined(suffix)) __obj.updateDynamic("suffix")(suffix)
    __obj.asInstanceOf[ResponseTimeOptions]
  }
}

