package typings.recurlyRecurlyJs.paypalMod

import typings.recurlyRecurlyJs.emitterMod.Emitter
import typings.std.VoidFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PayPalInstance extends Emitter[PayPalEvent] {
  
  def destroy(): Unit = js.native
  @JSName("destroy")
  var destroy_Original: VoidFunction = js.native
  
  /**
    * @see {@link https://developers.recurly.com/reference/recurly-js/index.html#fn-paypalstart|PayPal.start}
    */
  def start(): Unit = js.native
  def start(payPalStartOptions: PayPalStartOptions): Unit = js.native
}
