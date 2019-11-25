package typings.squareDashConnect.squareDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.squareDashConnect.squareDashConnectStrings.FIXED_AMOUNT
  - typings.squareDashConnect.squareDashConnectStrings.FIXED_PERCENTAGE
  - typings.squareDashConnect.squareDashConnectStrings.VARIABLE_AMOUNT
  - typings.squareDashConnect.squareDashConnectStrings.VARIABLE_PERCENTAGE
  - typings.squareDashConnect.squareDashConnectStrings.UNKNOWN_DISCOUNT
*/
trait DiscountType extends js.Object

object DiscountType {
  @scala.inline
  def FIXED_AMOUNT: typings.squareDashConnect.squareDashConnectStrings.FIXED_AMOUNT = this.cast("FIXED_AMOUNT")
  @scala.inline
  def FIXED_PERCENTAGE: typings.squareDashConnect.squareDashConnectStrings.FIXED_PERCENTAGE = this.cast("FIXED_PERCENTAGE")
  @scala.inline
  def UNKNOWN_DISCOUNT: typings.squareDashConnect.squareDashConnectStrings.UNKNOWN_DISCOUNT = this.cast("UNKNOWN_DISCOUNT")
  @scala.inline
  def VARIABLE_AMOUNT: typings.squareDashConnect.squareDashConnectStrings.VARIABLE_AMOUNT = this.cast("VARIABLE_AMOUNT")
  @scala.inline
  def VARIABLE_PERCENTAGE: typings.squareDashConnect.squareDashConnectStrings.VARIABLE_PERCENTAGE = this.cast("VARIABLE_PERCENTAGE")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

