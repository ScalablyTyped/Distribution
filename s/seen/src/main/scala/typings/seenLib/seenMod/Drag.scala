package typings
package seenLib.seenMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("seen", "Drag")
@js.native
class Drag protected () extends js.Object {
  def this(elementOrId: java.lang.String) = this()
  def this(elementOrId: stdLib.HTMLElement) = this()
  def this(elementOrId: java.lang.String, options: seenLib.Anon_InertiaBoolean) = this()
  def this(elementOrId: stdLib.HTMLElement, options: seenLib.Anon_InertiaBoolean) = this()
  var defaults: seenLib.Anon_Inertia = js.native
  var dispatch: seenLib.seenMod.EventsNs.Dispatcher = js.native
  var el: stdLib.HTMLElement = js.native
  var inertia: scala.Boolean = js.native
  def on(`type`: java.lang.String, listener: js.Function1[/* e */ seenLib.Anon_Offset, scala.Unit]): seenLib.seenMod.EventsNs.Dispatcher = js.native
}

