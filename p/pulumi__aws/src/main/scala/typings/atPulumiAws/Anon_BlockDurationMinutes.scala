package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BlockDurationMinutes extends js.Object {
  var blockDurationMinutes: Double
  var instanceInterruptionBehavior: String
  var maxPrice: String
  var spotInstanceType: String
  var validUntil: String
}

object Anon_BlockDurationMinutes {
  @scala.inline
  def apply(
    blockDurationMinutes: Double,
    instanceInterruptionBehavior: String,
    maxPrice: String,
    spotInstanceType: String,
    validUntil: String
  ): Anon_BlockDurationMinutes = {
    val __obj = js.Dynamic.literal(blockDurationMinutes = blockDurationMinutes, instanceInterruptionBehavior = instanceInterruptionBehavior, maxPrice = maxPrice, spotInstanceType = spotInstanceType, validUntil = validUntil)
  
    __obj.asInstanceOf[Anon_BlockDurationMinutes]
  }
}

