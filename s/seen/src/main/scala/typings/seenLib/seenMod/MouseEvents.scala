package typings
package seenLib.seenMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("seen", "MouseEvents")
@js.native
class MouseEvents protected () extends js.Object {
  def this(elementOrId: java.lang.String) = this()
  def this(elementOrId: stdLib.HTMLElement) = this()
  def this(elementOrId: java.lang.String, options: MouseEventOptions) = this()
  def this(elementOrId: stdLib.HTMLElement, options: MouseEventOptions) = this()
  var dispatch: seenLib.seenMod.EventsNs.Dispatcher = js.native
  var el: stdLib.HTMLElement = js.native
  def attach(): scala.Unit = js.native
  def detach(): scala.Unit = js.native
}

