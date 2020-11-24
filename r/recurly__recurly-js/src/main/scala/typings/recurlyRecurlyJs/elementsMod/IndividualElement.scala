package typings.recurlyRecurlyJs.elementsMod

import typings.recurlyRecurlyJs.emitterMod.Emitter
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IndividualElement extends Emitter[ElementEvent] {
  
  /**
    * @see {@link https://developers.recurly.com/reference/recurly-js/index.html#fn-elementattach|Element.attach}
    */
  def attach(el: String): IndividualElement = js.native
  def attach(el: HTMLElement): IndividualElement = js.native
  /**
    * @see {@link https://developers.recurly.com/reference/recurly-js/index.html#fn-elementattach|Element.attach}
    */
  @JSName("attach")
  var attach_Original: Attach[IndividualElement] = js.native
  
  /**
    * @see {@link https://developers.recurly.com/reference/recurly-js/index.html#fn-elementconfigure|Element.configure}
    */
  def configure(options: IndividualElementOptions): IndividualElement = js.native
  
  def focus(): IndividualElement = js.native
  
  /**
    * @see {@link https://developers.recurly.com/reference/recurly-js/index.html#fn-elementremove|Element.remove}
    */
  def remove(): IndividualElement = js.native
}
