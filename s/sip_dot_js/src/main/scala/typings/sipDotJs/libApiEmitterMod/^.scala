package typings.sipDotJs.libApiEmitterMod

import typings.events.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/api/emitter", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def makeEmitter[T](eventEmitter: EventEmitter): Emitter[T] = js.native
  def makeEmitter[T](eventEmitter: EventEmitter, eventName: String): Emitter[T] = js.native
}

