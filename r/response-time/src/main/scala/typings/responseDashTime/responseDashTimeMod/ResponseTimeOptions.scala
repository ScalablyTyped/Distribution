package typings.responseDashTime.responseDashTimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResponseTimeOptions extends js.Object {
  var digits: js.UndefOr[Double] = js.undefined
  var header: js.UndefOr[String] = js.undefined
  var suffix: js.UndefOr[Boolean] = js.undefined
}

object ResponseTimeOptions {
  @scala.inline
  def apply(digits: Int | Double = null, header: String = null, suffix: js.UndefOr[Boolean] = js.undefined): ResponseTimeOptions = {
    val __obj = js.Dynamic.literal()
    if (digits != null) __obj.updateDynamic("digits")(digits.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header)
    if (!js.isUndefined(suffix)) __obj.updateDynamic("suffix")(suffix)
    __obj.asInstanceOf[ResponseTimeOptions]
  }
}

