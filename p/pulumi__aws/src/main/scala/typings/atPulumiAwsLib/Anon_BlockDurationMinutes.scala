package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BlockDurationMinutes extends js.Object {
  var blockDurationMinutes: scala.Double
  var instanceInterruptionBehavior: java.lang.String
  var maxPrice: java.lang.String
  var spotInstanceType: java.lang.String
  var validUntil: java.lang.String
}

object Anon_BlockDurationMinutes {
  @scala.inline
  def apply(
    blockDurationMinutes: scala.Double,
    instanceInterruptionBehavior: java.lang.String,
    maxPrice: java.lang.String,
    spotInstanceType: java.lang.String,
    validUntil: java.lang.String
  ): Anon_BlockDurationMinutes = {
    val __obj = js.Dynamic.literal(blockDurationMinutes = blockDurationMinutes, instanceInterruptionBehavior = instanceInterruptionBehavior, maxPrice = maxPrice, spotInstanceType = spotInstanceType, validUntil = validUntil)
  
    __obj.asInstanceOf[Anon_BlockDurationMinutes]
  }
}

