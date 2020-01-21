package typings.reactGeosuggest

import typings.googlemaps.google.maps.MapsEventListener
import typings.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofevent extends js.Object {
  /**
    * Cross browser event handler registration. This listener is removed by
    * calling removeListener(handle) for the handle that is returned by this
    * function.
    */
  def addDomListener(instance: js.Object, eventName: String, handler: js.Function1[/* event */ Event_, Unit]): MapsEventListener = js.native
  def addDomListener(
    instance: js.Object,
    eventName: String,
    handler: js.Function1[/* event */ Event_, Unit],
    capture: Boolean
  ): MapsEventListener = js.native
  /**
    * Wrapper around addDomListener that removes the listener after the first
    * event.
    */
  def addDomListenerOnce(instance: js.Object, eventName: String, handler: js.Function1[/* event */ Event_, Unit]): MapsEventListener = js.native
  def addDomListenerOnce(
    instance: js.Object,
    eventName: String,
    handler: js.Function1[/* event */ Event_, Unit],
    capture: Boolean
  ): MapsEventListener = js.native
  /**
    * Adds the given listener function to the given event name for the given
    * object instance. Returns an identifier for this listener that can be used
    * with removeListener().
    */
  def addListener(instance: js.Object, eventName: String, handler: js.Function1[/* repeated */ js.Any, Unit]): MapsEventListener = js.native
  /**
    * Like addListener, but the handler removes itself after handling the first
    * event.
    */
  def addListenerOnce(instance: js.Object, eventName: String, handler: js.Function1[/* repeated */ js.Any, Unit]): MapsEventListener = js.native
  /**
    * Removes all listeners for all events for the given instance.
    */
  def clearInstanceListeners(instance: js.Object): Unit = js.native
  /**
    * Removes all listeners for the given event for the given instance.
    */
  def clearListeners(instance: js.Object, eventName: String): Unit = js.native
  /**
    * Removes the given listener, which should have been returned by
    * addListener above. Equivalent to calling listener.remove().
    */
  def removeListener(listener: MapsEventListener): Unit = js.native
  /**
    * Triggers the given event. All arguments after eventName are passed as
    * arguments to the listeners.
    */
  def trigger(instance: js.Any, eventName: String, args: js.Any*): Unit = js.native
}

