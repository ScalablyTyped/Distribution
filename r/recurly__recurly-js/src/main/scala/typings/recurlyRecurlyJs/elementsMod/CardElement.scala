package typings.recurlyRecurlyJs.elementsMod

import typings.recurlyRecurlyJs.emitterMod.Emitter
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CardElement extends Emitter[ElementEvent] {
  
  /**
    * Attaches an Element to the DOM, as a child of the specified parent target.
    *
    * @see {@link https://developers.recurly.com/reference/recurly-js/index.html#fn-elementattach|Element.attach}
    */
  def attach(el: String): CardElement = js.native
  def attach(el: HTMLElement): CardElement = js.native
  /**
    * Attaches an Element to the DOM, as a child of the specified parent target.
    *
    * @see {@link https://developers.recurly.com/reference/recurly-js/index.html#fn-elementattach|Element.attach}
    */
  @JSName("attach")
  var attach_Original: Attach[CardElement] = js.native
  
  /**
    * Updates the configuration of the Element.
    *
    * @see {@link https://developers.recurly.com/reference/recurly-js/index.html#fn-elementconfigure|Element.configure}
    */
  def configure(options: CardElementOptions): CardElement = js.native
  
  def focus(): CardElement = js.native
  
  /**
    * If an Element has been attached, removes the Element from the DOM. If it is not attached, does nothing.
    *
    * @see {@link https://developers.recurly.com/reference/recurly-js/index.html#fn-elementremove|Element.remove}
    */
  def remove(): CardElement = js.native
}
