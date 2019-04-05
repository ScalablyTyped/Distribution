package typings
package slickgridLib.SlickNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Slick.Event")
@js.native
class Event[T] () extends js.Object {
  def notify(args: T): js.Any = js.native
  def notify(args: T, e: slickgridLib.DOMEvent): js.Any = js.native
  def notify(args: T, e: slickgridLib.DOMEvent, scope: js.Any): js.Any = js.native
  def notify(args: T, e: EventData): js.Any = js.native
  def notify(args: T, e: EventData, scope: js.Any): js.Any = js.native
  /***
  		* Adds an event handler to be called when the event is fired.
  		* <p>Event handler will receive two arguments - an <code>EventData</code> and the <code>data</code>
  		* object the event was fired with.<p>
  		* @method subscribe
  		* @param fn {Function} Event handler.
  		*/
  def subscribe(fn: js.Function2[(/* e */ slickgridLib.DOMEvent) | (/* e */ EventData), /* data */ T, scala.Unit]): scala.Unit = js.native
  /***
  		* Removes an event handler added with <code>subscribe(fn)</code>.
  		* @method unsubscribe
  		* @param fn {Function} Event handler to be removed.
  		*/
  def unsubscribe(fn: js.Function2[(/* e */ slickgridLib.DOMEvent) | (/* e */ EventData), /* data */ T, scala.Unit]): scala.Unit = js.native
}

