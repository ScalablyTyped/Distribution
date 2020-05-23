package typings.recurlyRecurlyJs.adyenMod

import typings.recurlyRecurlyJs.emitterMod.Emitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdyenInstance extends Emitter[AdyenEvent] {
  def start(adyenOptions: AdyenOptions): Unit = js.native
}

