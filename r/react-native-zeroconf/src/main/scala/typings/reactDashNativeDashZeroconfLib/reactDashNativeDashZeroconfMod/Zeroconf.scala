package typings
package reactDashNativeDashZeroconfLib.reactDashNativeDashZeroconfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Zeroconf
  extends nodeLib.NodeJSNs.EventEmitter {
  /**
    * Add listeners
    *
    * @description If you cleaned the listeners and need to get them back
    * on.
    */
  def addDeviceListeners(): scala.Unit = js.native
  /**
    * Returns resolved services.
    *
    * @description Will return all names of services that have been
    * resolved.
    */
  def getServices(): org.scalablytyped.runtime.StringDictionary[Service] = js.native
  /**
    * Triggered when an error occurs.
    */
  @JSName("on")
  def on_error(
    e: reactDashNativeDashZeroconfLib.reactDashNativeDashZeroconfLibStrings.error,
    listener: js.Function1[/* err */ stdLib.Error, _]
  ): this.type = js.native
  /**
    * @param name Name of the the service.
    */
  @JSName("on")
  def on_found(
    e: reactDashNativeDashZeroconfLib.reactDashNativeDashZeroconfLibStrings.found,
    listener: js.Function1[/* name */ java.lang.String, _]
  ): this.type = js.native
  @JSName("on")
  def on_remove(
    e: reactDashNativeDashZeroconfLib.reactDashNativeDashZeroconfLibStrings.remove,
    listener: js.Function1[/* name */ java.lang.String, _]
  ): this.type = js.native
  /**
    * Triggered when a service is resolved.
    * @description Broadcast a service object once it is fully resolved.
    */
  @JSName("on")
  def on_resolved(
    e: reactDashNativeDashZeroconfLib.reactDashNativeDashZeroconfLibStrings.resolved,
    listener: js.Function1[/* service */ Service, _]
  ): this.type = js.native
  @JSName("on")
  def on_start(
    e: reactDashNativeDashZeroconfLib.reactDashNativeDashZeroconfLibStrings.start,
    listener: js.Function0[_]
  ): this.type = js.native
  @JSName("on")
  def on_stop(
    e: reactDashNativeDashZeroconfLib.reactDashNativeDashZeroconfLibStrings.stop,
    listener: js.Function0[_]
  ): this.type = js.native
  @JSName("on")
  def on_update(
    e: reactDashNativeDashZeroconfLib.reactDashNativeDashZeroconfLibStrings.update,
    listener: js.Function0[_]
  ): this.type = js.native
  /**
    * Remove listeners.
    *
    * @description Allow you to clean the listeners, avoiding potential
    * memory leaks.
    *
    * @see https://github.com/balthazar/react-native-zeroconf/issues/33
    */
  def removeDeviceListeners(): scala.Unit = js.native
  /**
    * Start the zeroconf scan.
    *
    * @description This will initialize the scan from the `Zeroconf`
    * instance. Will stop another scan if any is running.
    *
    * @param type Default `http`
    * @param protocol Default `tcp`
    * @param domain Default `local`
    */
  def scan(): scala.Unit = js.native
  def scan(`type`: java.lang.String): scala.Unit = js.native
  def scan(`type`: java.lang.String, protocol: java.lang.String): scala.Unit = js.native
  def scan(`type`: java.lang.String, protocol: java.lang.String, domain: java.lang.String): scala.Unit = js.native
  /**
    * Stop the scan.
    *
    * @description If any scan is running, stop it. Otherwise do nothing.
    */
  def stop(): scala.Unit = js.native
}

