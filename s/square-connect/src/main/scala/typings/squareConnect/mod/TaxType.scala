package typings.squareConnect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.squareConnect.squareConnectStrings.ADDITIVE
  - typings.squareConnect.squareConnectStrings.INCLUSIVE
  - typings.squareConnect.squareConnectStrings.UNKNOWN_TAX
*/
trait TaxType extends js.Object

object TaxType {
  @scala.inline
  def ADDITIVE: typings.squareConnect.squareConnectStrings.ADDITIVE = this.cast("ADDITIVE")
  @scala.inline
  def INCLUSIVE: typings.squareConnect.squareConnectStrings.INCLUSIVE = this.cast("INCLUSIVE")
  @scala.inline
  def UNKNOWN_TAX: typings.squareConnect.squareConnectStrings.UNKNOWN_TAX = this.cast("UNKNOWN_TAX")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

