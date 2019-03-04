package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BlockDurationMinutesInstanceInterruptionBehavior extends js.Object {
  var blockDurationMinutes: js.UndefOr[scala.Double] = js.undefined
  var instanceInterruptionBehavior: js.UndefOr[java.lang.String] = js.undefined
  var maxPrice: js.UndefOr[java.lang.String] = js.undefined
  var spotInstanceType: js.UndefOr[java.lang.String] = js.undefined
  var validUntil: java.lang.String
}

object Anon_BlockDurationMinutesInstanceInterruptionBehavior {
  @scala.inline
  def apply(
    validUntil: java.lang.String,
    blockDurationMinutes: scala.Int | scala.Double = null,
    instanceInterruptionBehavior: java.lang.String = null,
    maxPrice: java.lang.String = null,
    spotInstanceType: java.lang.String = null
  ): Anon_BlockDurationMinutesInstanceInterruptionBehavior = {
    val __obj = js.Dynamic.literal(validUntil = validUntil)
    if (blockDurationMinutes != null) __obj.updateDynamic("blockDurationMinutes")(blockDurationMinutes.asInstanceOf[js.Any])
    if (instanceInterruptionBehavior != null) __obj.updateDynamic("instanceInterruptionBehavior")(instanceInterruptionBehavior)
    if (maxPrice != null) __obj.updateDynamic("maxPrice")(maxPrice)
    if (spotInstanceType != null) __obj.updateDynamic("spotInstanceType")(spotInstanceType)
    __obj.asInstanceOf[Anon_BlockDurationMinutesInstanceInterruptionBehavior]
  }
}

