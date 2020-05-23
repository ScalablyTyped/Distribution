package typings.recurlyRecurlyJs.elementsMod

import typings.recurlyRecurlyJs.emitterMod.Emitter
import typings.std.Element
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IndividualElement extends Emitter[ElementEvent] {
  @JSName("attach")
  var attach_Original: Attach[IndividualElement] = js.native
  def attach(el: String): IndividualElement = js.native
  def attach(el: HTMLElement): IndividualElement = js.native
  def configure(options: IndividualElementOptions): Element = js.native
  def remove(): Element = js.native
}

