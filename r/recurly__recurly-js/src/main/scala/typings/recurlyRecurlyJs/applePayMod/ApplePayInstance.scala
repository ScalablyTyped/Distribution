package typings.recurlyRecurlyJs.applePayMod

import typings.recurlyRecurlyJs.emitterMod.Emitter
import typings.std.VoidFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApplePayInstance extends Emitter[ApplePayEvent] {
  def begin(): Unit = js.native
  def begin(cb: VoidFunction): Unit = js.native
  def ready(): Unit = js.native
  def ready(cb: VoidFunction): Unit = js.native
}

