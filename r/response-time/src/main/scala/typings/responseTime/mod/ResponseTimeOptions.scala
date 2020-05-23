package typings.responseTime.mod

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
  def apply(
    digits: js.UndefOr[Double] = js.undefined,
    header: String = null,
    suffix: js.UndefOr[Boolean] = js.undefined
  ): ResponseTimeOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(digits)) __obj.updateDynamic("digits")(digits.get.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (!js.isUndefined(suffix)) __obj.updateDynamic("suffix")(suffix.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseTimeOptions]
  }
}

