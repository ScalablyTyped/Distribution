package typings.recurlyRecurlyJs.paypalMod

import typings.recurlyRecurlyJs.Emitter
import typings.recurlyRecurlyJs.errorMod.RecurlyError
import typings.recurlyRecurlyJs.tokenMod.TokenHandler
import typings.recurlyRecurlyJs.tokenMod.TokenPayload
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PayPalInstance extends Emitter[PayPalEvent] {
  @JSName("token")
  var token_Original: TokenHandler = js.native
  def start(): Unit = js.native
  def start(paypalStartOptions: PaypalStartOptions): Unit = js.native
  def token(error: Null, token: TokenPayload): Unit = js.native
  def token(error: RecurlyError, token: TokenPayload): Unit = js.native
}

