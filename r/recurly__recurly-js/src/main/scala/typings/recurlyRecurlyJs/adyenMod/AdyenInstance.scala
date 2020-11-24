package typings.recurlyRecurlyJs.adyenMod

import typings.recurlyRecurlyJs.emitterMod.Emitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AdyenInstance extends Emitter[AdyenEvent] {
  
  /**
    * Invokes the Adyen Payment Modal
    */
  def start(adyenOptions: AdyenOptions): Unit = js.native
}
