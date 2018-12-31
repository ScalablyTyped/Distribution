package typings
package seleniumDashWebdriverLib.remoteMod.SeleniumServerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options for the Selenium server
  */
trait Options extends js.Object {
  /** The arguments to pass to the service. If a promise is provided, the
    service will wait for it to resolve before starting. */
  var args: js.UndefOr[
    js.Array[java.lang.String] | seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.IThenable[js.Array[java.lang.String]]
  ] = js.undefined
  /** The environment variables that should be visible to the server process.
    Defaults to inheriting the current process's environment.*/
  var env: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  /** The arguments to pass to the JVM. If a promise is provided, the service
    will wait for it to resolve before starting. */
  var jvmArgs: js.UndefOr[
    js.Array[java.lang.String] | seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.IThenable[js.Array[java.lang.String]]
  ] = js.undefined
  /** Whether the server should only be accessed on this host's loopback address.*/
  var loopback: js.UndefOr[scala.Boolean] = js.undefined
  /** The port to start the server on (must be > 0). If the port is provided
    as a promise, the service will wait for the promise to resolve before starting. */
  var port: js.UndefOr[
    scala.Double | seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.IThenable[scala.Double]
  ] = js.undefined
  /** IO configuration for the spawned server process. For more information,
    refer to the documentation of `child_process.spawn`*/
  var stdio: js.UndefOr[java.lang.String | (js.Array[java.lang.String | scala.Double])] = js.undefined
}

