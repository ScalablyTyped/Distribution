package typings
package screenfullLib.screenfullMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IScreenfull extends js.Object {
  var element: stdLib.Element = js.native
  var enabled: scala.Boolean = js.native
  var isFullscreen: scala.Boolean = js.native
  var raw: IScreenfullRaw = js.native
  def exit(): scala.Unit = js.native
  def off(name: screenfullLib.EventNameMap, handler: js.Function1[/* event */ stdLib.Event, scala.Unit]): scala.Unit = js.native
  def on(name: screenfullLib.EventNameMap, handler: js.Function1[/* event */ stdLib.Event, scala.Unit]): scala.Unit = js.native
  def onchange(handler: js.Function0[scala.Unit]): scala.Unit = js.native
  def onerror(handler: js.Function1[/* event */ stdLib.Event, scala.Unit]): scala.Unit = js.native
  def request(): scala.Unit = js.native
  def request(elem: stdLib.Element): scala.Unit = js.native
  def toggle(): scala.Unit = js.native
  def toggle(elem: stdLib.Element): scala.Unit = js.native
}

