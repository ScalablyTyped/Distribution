package typings.recurlyRecurlyJs.elementsMod

import typings.recurlyRecurlyJs.Emitter
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CardElement extends Emitter[ElementEvent] {
  @JSName("attach")
  var attach_Original: Attach[CardElement] = js.native
  def attach(el: String): CardElement = js.native
  def attach(el: HTMLElement): CardElement = js.native
  def configure(options: CardElementOptions): CardElement = js.native
  def remove(): CardElement = js.native
}

