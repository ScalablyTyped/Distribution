package typings.seen.seenMod

import typings.seen.seenMod.EventsNs.Dispatcher
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("seen", "MouseEvents")
@js.native
class MouseEvents protected () extends js.Object {
  def this(elementOrId: String) = this()
  def this(elementOrId: HTMLElement) = this()
  def this(elementOrId: String, options: MouseEventOptions) = this()
  def this(elementOrId: HTMLElement, options: MouseEventOptions) = this()
  var dispatch: Dispatcher = js.native
  var el: HTMLElement = js.native
  def attach(): Unit = js.native
  def detach(): Unit = js.native
}

