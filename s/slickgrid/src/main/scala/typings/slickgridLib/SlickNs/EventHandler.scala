package typings
package slickgridLib.SlickNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Slick.EventHandler")
@js.native
class EventHandler[T] () extends js.Object {
  def subscribe(event: Event[T], handler: js.Function2[/* e */ EventData, /* data */ T, scala.Unit]): EventHandler[_] = js.native
  def unsubscribe(event: Event[T], handler: js.Function2[/* e */ EventData, /* data */ T, scala.Unit]): EventHandler[_] = js.native
  def unsubscribeAll(): EventHandler[_] = js.native
}

