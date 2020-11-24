package typings.recurlyRecurlyJs.pricingMod

import typings.recurlyRecurlyJs.emitterMod.Emitter
import typings.std.VoidFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PricingInstance[PricingPromise] extends Emitter[PricingEvent] {
  
  def remove(opts: js.Any, done: VoidFunction): PricingPromise = js.native
  
  def reprice(done: VoidFunction): PricingPromise = js.native
  
  def reset(): Unit = js.native
  @JSName("reset")
  var reset_Original: VoidFunction = js.native
}
