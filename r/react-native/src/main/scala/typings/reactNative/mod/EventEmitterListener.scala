package typings.reactNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventEmitterListener extends js.Object {
  /**
    * Adds a listener to be invoked when events of the specified type are
    * emitted. An optional calling context may be provided. The data arguments
    * emitted will be passed to the listener function.
    *
    * @param eventType - Name of the event to listen to
    * @param listener - Function to invoke when the specified event is
    *   emitted
    * @param context - Optional context object to use when invoking the
    *   listener
    */
  def addListener(eventType: String, listener: js.Function1[/* repeated */ js.Any, _]): EmitterSubscription = js.native
  def addListener(eventType: String, listener: js.Function1[/* repeated */ js.Any, _], context: js.Any): EmitterSubscription = js.native
}

