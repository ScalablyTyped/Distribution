package typings.schemaUtils.validateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Extend extends js.Object {
  var formatExclusiveMaximum: js.UndefOr[Boolean] = js.undefined
  var formatExclusiveMinimum: js.UndefOr[Boolean] = js.undefined
  var formatMaximum: js.UndefOr[Double] = js.undefined
  var formatMinimum: js.UndefOr[Double] = js.undefined
}

object Extend {
  @scala.inline
  def apply(
    formatExclusiveMaximum: js.UndefOr[Boolean] = js.undefined,
    formatExclusiveMinimum: js.UndefOr[Boolean] = js.undefined,
    formatMaximum: js.UndefOr[Double] = js.undefined,
    formatMinimum: js.UndefOr[Double] = js.undefined
  ): Extend = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(formatExclusiveMaximum)) __obj.updateDynamic("formatExclusiveMaximum")(formatExclusiveMaximum.get.asInstanceOf[js.Any])
    if (!js.isUndefined(formatExclusiveMinimum)) __obj.updateDynamic("formatExclusiveMinimum")(formatExclusiveMinimum.get.asInstanceOf[js.Any])
    if (!js.isUndefined(formatMaximum)) __obj.updateDynamic("formatMaximum")(formatMaximum.get.asInstanceOf[js.Any])
    if (!js.isUndefined(formatMinimum)) __obj.updateDynamic("formatMinimum")(formatMinimum.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Extend]
  }
}

