package typings
package slickgridLib.SlickNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Slick.Event")
@js.native
class Event[T] () extends js.Object {
  /***
  		* Fires an event notifying all subscribers.
  		* @method notify
  		* @param args {Object} Additional data object to be passed to all handlers.
  		* @param e {EventData}
  		*      Optional.
  		*      An <code>EventData</code> object to be passed to all handlers.
  		*      For DOM events, an existing W3C/jQuery event object can be passed in.
  		* @param scope {Object}
  		*      Optional.
  		*      The scope ("this") within which the handler will be executed.
  		*      If not specified, the scope will be set to the <code>Event</code> instance.
  		* @return Last run callback result.
  		* @note slick.core.Event.notify shows this method as returning a value, type is unknown.
  		*/
  def notify(args: T): js.Any = js.native
  def notify(args: T, e: slickgridLib.DOMEvent): js.Any = js.native
  def notify(args: T, e: slickgridLib.DOMEvent, scope: js.Any): js.Any = js.native
  /***
  		* Fires an event notifying all subscribers.
  		* @method notify
  		* @param args {Object} Additional data object to be passed to all handlers.
  		* @param e {EventData}
  		*      Optional.
  		*      An <code>EventData</code> object to be passed to all handlers.
  		*      For DOM events, an existing W3C/jQuery event object can be passed in.
  		* @param scope {Object}
  		*      Optional.
  		*      The scope ("this") within which the handler will be executed.
  		*      If not specified, the scope will be set to the <code>Event</code> instance.
  		* @return Last run callback result.
  		* @note slick.core.Event.notify shows this method as returning a value, type is unknown.
  		*/
  def notify(args: T, e: EventData): js.Any = js.native
  /***
  		* Fires an event notifying all subscribers.
  		* @method notify
  		* @param args {Object} Additional data object to be passed to all handlers.
  		* @param e {EventData}
  		*      Optional.
  		*      An <code>EventData</code> object to be passed to all handlers.
  		*      For DOM events, an existing W3C/jQuery event object can be passed in.
  		* @param scope {Object}
  		*      Optional.
  		*      The scope ("this") within which the handler will be executed.
  		*      If not specified, the scope will be set to the <code>Event</code> instance.
  		* @return Last run callback result.
  		* @note slick.core.Event.notify shows this method as returning a value, type is unknown.
  		*/
  def notify(args: T, e: EventData, scope: js.Any): js.Any = js.native
  /***
  		* Adds an event handler to be called when the event is fired.
  		* <p>Event handler will receive two arguments - an <code>EventData</code> and the <code>data</code>
  		* object the event was fired with.<p>
  		* @method subscribe
  		* @param fn {Function} Event handler.
  		*/
  def subscribe(fn: js.Function2[(/* e */ slickgridLib.DOMEvent) | (/* e */ EventData), /* data */ T, _]): scala.Unit = js.native
  /***
  		* Removes an event handler added with <code>subscribe(fn)</code>.
  		* @method unsubscribe
  		* @param fn {Function} Event handler to be removed.
  		*/
  def unsubscribe(fn: js.Function2[(/* e */ slickgridLib.DOMEvent) | (/* e */ EventData), /* data */ T, _]): scala.Unit = js.native
}

