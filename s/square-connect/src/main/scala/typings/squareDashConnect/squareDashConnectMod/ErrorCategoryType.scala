package typings.squareDashConnect.squareDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.squareDashConnect.squareDashConnectStrings.API_ERROR
  - typings.squareDashConnect.squareDashConnectStrings.AUTHENTICATION_ERROR
  - typings.squareDashConnect.squareDashConnectStrings.INVALID_REQUEST_ERROR
  - typings.squareDashConnect.squareDashConnectStrings.RATE_LIMIT_ERROR
  - typings.squareDashConnect.squareDashConnectStrings.PAYMENT_METHOD_ERROR
  - typings.squareDashConnect.squareDashConnectStrings.REFUND_ERROR
*/
trait ErrorCategoryType extends js.Object

object ErrorCategoryType {
  @scala.inline
  def API_ERROR: typings.squareDashConnect.squareDashConnectStrings.API_ERROR = this.cast("API_ERROR")
  @scala.inline
  def AUTHENTICATION_ERROR: typings.squareDashConnect.squareDashConnectStrings.AUTHENTICATION_ERROR = this.cast("AUTHENTICATION_ERROR")
  @scala.inline
  def INVALID_REQUEST_ERROR: typings.squareDashConnect.squareDashConnectStrings.INVALID_REQUEST_ERROR = this.cast("INVALID_REQUEST_ERROR")
  @scala.inline
  def PAYMENT_METHOD_ERROR: typings.squareDashConnect.squareDashConnectStrings.PAYMENT_METHOD_ERROR = this.cast("PAYMENT_METHOD_ERROR")
  @scala.inline
  def RATE_LIMIT_ERROR: typings.squareDashConnect.squareDashConnectStrings.RATE_LIMIT_ERROR = this.cast("RATE_LIMIT_ERROR")
  @scala.inline
  def REFUND_ERROR: typings.squareDashConnect.squareDashConnectStrings.REFUND_ERROR = this.cast("REFUND_ERROR")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

