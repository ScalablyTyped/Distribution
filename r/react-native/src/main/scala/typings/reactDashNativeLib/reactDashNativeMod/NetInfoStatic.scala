package typings
package reactDashNativeLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NetInfoStatic extends js.Object {
  /**
    * An object with the same methods as above but the listener receives a
    * boolean which represents the internet connectivity.
    * Use this if you are only interested with whether the device has internet
    * connectivity.
    */
  var isConnected: reactDashNativeLib.Anon_AddEventListener
  /**
    * Adds an event handler. Supported events:
    *
    * - `connectionChange`: Fires when the network status changes. The argument to the event
    *   handler is an object with keys:
    *   - `type`: A `DeprecatedConnectionType` (listed above)
    *   - `effectiveType`: An `EffectiveConnectionType` (listed above)
    * - `change`: This event is deprecated. Listen to `connectionChange` instead. Fires when
    *   the network status changes. The argument to the event handler is one of the deprecated
    *   connectivity types listed above.
    */
  def addEventListener(
    eventName: java.lang.String,
    listener: js.Function1[/* result */ ConnectionInfo | ConnectionType, scala.Unit]
  ): scala.Unit
  /**
    * This function is deprecated. Use `getConnectionInfo` instead. Returns a promise that
    * resolves with one of the deprecated connectivity types listed above.
    */
  def fetch(): js.Promise[ConnectionType]
  /**
    * Returns a promise that resolves to an object with `type` and `effectiveType` keys
    * whose values are a `ConnectionType` and an `EffectiveConnectionType`, (described above),
    * respectively.
    */
  def getConnectionInfo(): js.Promise[ConnectionInfo]
  /**
    * Detect if the current active connection is
    * metered or not. A network is classified as metered when the user is
    * sensitive to heavy data usage on that connection due to monetary
    * costs, data limitations or battery/performance issues.
    */
  def isConnectionExpensive(): js.Promise[scala.Boolean]
  /**
    * Removes the listener for network status changes.
    */
  def removeEventListener(
    eventName: java.lang.String,
    listener: js.Function1[/* result */ ConnectionInfo | ConnectionType, scala.Unit]
  ): scala.Unit
}

object NetInfoStatic {
  @scala.inline
  def apply(
    addEventListener: (java.lang.String, js.Function1[/* result */ ConnectionInfo | ConnectionType, scala.Unit]) => scala.Unit,
    fetch: () => js.Promise[ConnectionType],
    getConnectionInfo: () => js.Promise[ConnectionInfo],
    isConnected: reactDashNativeLib.Anon_AddEventListener,
    isConnectionExpensive: () => js.Promise[scala.Boolean],
    removeEventListener: (java.lang.String, js.Function1[/* result */ ConnectionInfo | ConnectionType, scala.Unit]) => scala.Unit
  ): NetInfoStatic = {
    val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction2(addEventListener), fetch = js.Any.fromFunction0(fetch), getConnectionInfo = js.Any.fromFunction0(getConnectionInfo), isConnected = isConnected, isConnectionExpensive = js.Any.fromFunction0(isConnectionExpensive), removeEventListener = js.Any.fromFunction2(removeEventListener))
  
    __obj.asInstanceOf[NetInfoStatic]
  }
}

