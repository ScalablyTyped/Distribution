package typings.recurlyRecurlyJs.indexMod

import typings.recurlyRecurlyJs.Emitter
import typings.std.VoidFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PricingInstance[PricingPromise] extends Emitter[PricingEvent] {
  @JSName("reset")
  var reset_Original: VoidFunction = js.native
  def remove(opts: js.Any, done: VoidFunction): PricingPromise = js.native
  def reprice(done: VoidFunction): PricingPromise = js.native
  def reset(): Unit = js.native
}

