package typings.sipDotJs.libApiEmitterMod

import typings.events.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/api/emitter", "makeEmitter")
@js.native
object makeEmitter extends js.Object {
  def apply[T](eventEmitter: EventEmitter): Emitter[T] = js.native
  def apply[T](eventEmitter: EventEmitter, eventName: String): Emitter[T] = js.native
}

