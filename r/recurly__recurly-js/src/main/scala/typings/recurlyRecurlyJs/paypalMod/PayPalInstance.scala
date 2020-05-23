package typings.recurlyRecurlyJs.paypalMod

import typings.recurlyRecurlyJs.emitterMod.Emitter
import typings.recurlyRecurlyJs.errorMod.RecurlyError
import typings.recurlyRecurlyJs.tokenMod.TokenHandler
import typings.recurlyRecurlyJs.tokenMod.TokenPayload
import typings.std.VoidFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PayPalInstance extends Emitter[PayPalEvent] {
  @JSName("destroy")
  var destroy_Original: VoidFunction = js.native
  @JSName("token")
  var token_Original: TokenHandler = js.native
  def destroy(): Unit = js.native
  def start(): Unit = js.native
  def start(payPalStartOptions: PayPalStartOptions): Unit = js.native
  def token(error: Null, token: TokenPayload): Unit = js.native
  def token(error: RecurlyError, token: TokenPayload): Unit = js.native
}

