package typings.recurlyRecurlyJs.paypalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.error
  - typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.token
*/
trait PayPalEvent extends js.Object

object PayPalEvent {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def error: typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.error = this.cast("error")
  @scala.inline
  def token: typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.token = this.cast("token")
}

