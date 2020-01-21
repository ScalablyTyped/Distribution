package typings.seen.mod

import typings.seen.AnonInertia
import typings.seen.AnonInertiaBoolean
import typings.seen.AnonOffset
import typings.seen.mod.Events.Dispatcher
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("seen", "Drag")
@js.native
class Drag protected () extends js.Object {
  def this(elementOrId: String) = this()
  def this(elementOrId: HTMLElement) = this()
  def this(elementOrId: String, options: AnonInertiaBoolean) = this()
  def this(elementOrId: HTMLElement, options: AnonInertiaBoolean) = this()
  var defaults: AnonInertia = js.native
  var dispatch: Dispatcher = js.native
  var el: HTMLElement = js.native
  var inertia: Boolean = js.native
  def on(`type`: String, listener: js.Function1[/* e */ AnonOffset, Unit]): Dispatcher = js.native
}

