package typings.squareConnect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.squareConnect.squareConnectStrings.FIXED_PRICING
  - typings.squareConnect.squareConnectStrings.VARIABLE_PRICING
*/
trait PricingType extends js.Object

object PricingType {
  @scala.inline
  def FIXED_PRICING: typings.squareConnect.squareConnectStrings.FIXED_PRICING = this.cast("FIXED_PRICING")
  @scala.inline
  def VARIABLE_PRICING: typings.squareConnect.squareConnectStrings.VARIABLE_PRICING = this.cast("VARIABLE_PRICING")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

