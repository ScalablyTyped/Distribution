package typings.recurlyRecurlyJs.applePayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.token
  - typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.error
  - typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.ready
  - typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.shippingContactSelected
  - typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.paymentAuthorized
  - typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.shippingMethodSelected
  - typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.cancel
*/
trait ApplePayEvent extends js.Object

object ApplePayEvent {
  @scala.inline
  def cancel: typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.cancel = this.cast("cancel")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def error: typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.error = this.cast("error")
  @scala.inline
  def paymentAuthorized: typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.paymentAuthorized = this.cast("paymentAuthorized")
  @scala.inline
  def ready: typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.ready = this.cast("ready")
  @scala.inline
  def shippingContactSelected: typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.shippingContactSelected = this.cast("shippingContactSelected")
  @scala.inline
  def shippingMethodSelected: typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.shippingMethodSelected = this.cast("shippingMethodSelected")
  @scala.inline
  def token: typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.token = this.cast("token")
}

