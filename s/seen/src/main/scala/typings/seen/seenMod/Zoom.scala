package typings.seen.seenMod

import typings.seen.Anon_Smooth
import typings.seen.Anon_SmoothBoolean
import typings.seen.seenMod.EventsNs.Dispatcher
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("seen", "Zoom")
@js.native
class Zoom protected () extends js.Object {
  def this(elementOrId: String) = this()
  def this(elementOrId: HTMLElement) = this()
  def this(elementOrId: String, options: Anon_SmoothBoolean) = this()
  def this(elementOrId: HTMLElement, options: Anon_SmoothBoolean) = this()
  var defaults: Anon_Smooth = js.native
  var dispatch: Dispatcher = js.native
  var el: HTMLElement = js.native
  var speed: Double = js.native
}

