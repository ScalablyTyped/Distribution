package typings.squareConnect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.squareConnect.squareConnectStrings.API_ERROR
  - typings.squareConnect.squareConnectStrings.AUTHENTICATION_ERROR
  - typings.squareConnect.squareConnectStrings.INVALID_REQUEST_ERROR
  - typings.squareConnect.squareConnectStrings.RATE_LIMIT_ERROR
  - typings.squareConnect.squareConnectStrings.PAYMENT_METHOD_ERROR
  - typings.squareConnect.squareConnectStrings.REFUND_ERROR
*/
trait ErrorCategoryType extends js.Object

object ErrorCategoryType {
  @scala.inline
  def API_ERROR: typings.squareConnect.squareConnectStrings.API_ERROR = this.cast("API_ERROR")
  @scala.inline
  def AUTHENTICATION_ERROR: typings.squareConnect.squareConnectStrings.AUTHENTICATION_ERROR = this.cast("AUTHENTICATION_ERROR")
  @scala.inline
  def INVALID_REQUEST_ERROR: typings.squareConnect.squareConnectStrings.INVALID_REQUEST_ERROR = this.cast("INVALID_REQUEST_ERROR")
  @scala.inline
  def PAYMENT_METHOD_ERROR: typings.squareConnect.squareConnectStrings.PAYMENT_METHOD_ERROR = this.cast("PAYMENT_METHOD_ERROR")
  @scala.inline
  def RATE_LIMIT_ERROR: typings.squareConnect.squareConnectStrings.RATE_LIMIT_ERROR = this.cast("RATE_LIMIT_ERROR")
  @scala.inline
  def REFUND_ERROR: typings.squareConnect.squareConnectStrings.REFUND_ERROR = this.cast("REFUND_ERROR")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

