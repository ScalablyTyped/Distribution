package typings.recurlyRecurlyJs.`3dSecureMod`

import typings.recurlyRecurlyJs.emitterMod.Emitter
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ThreeDSecureEmitter extends Emitter[ThreeDSecureEvent] {
  
  /**
    * @see {@link https://developers.recurly.com/reference/recurly-js/index.html#fn-threedsecureattach|ThreeDSecure.attach}
    */
  def attach(el: HTMLElement): Unit = js.native
}
