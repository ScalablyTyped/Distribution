package typings.seleniumDashWebdriver.remoteMod.SeleniumServer

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options for the Selenium server
  */
trait Options extends js.Object {
  /** The arguments to pass to the service. If a promise is provided, the
    service will wait for it to resolve before starting. */
  var args: js.UndefOr[js.Array[String] | js.Promise[js.Array[String]]] = js.undefined
  /** The environment variables that should be visible to the server process.
    Defaults to inheriting the current process's environment.*/
  var env: js.UndefOr[StringDictionary[String]] = js.undefined
  /** The arguments to pass to the JVM. If a promise is provided, the service
    will wait for it to resolve before starting. */
  var jvmArgs: js.UndefOr[js.Array[String] | js.Promise[js.Array[String]]] = js.undefined
  /** Whether the server should only be accessed on this host's loopback address.*/
  var loopback: js.UndefOr[Boolean] = js.undefined
  /** The port to start the server on (must be > 0). If the port is provided
    as a promise, the service will wait for the promise to resolve before starting. */
  var port: js.UndefOr[Double | js.Promise[Double]] = js.undefined
  /** IO configuration for the spawned server process. For more information,
    refer to the documentation of `child_process.spawn`*/
  var stdio: js.UndefOr[String | (js.Array[String | Double])] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    args: js.Array[String] | js.Promise[js.Array[String]] = null,
    env: StringDictionary[String] = null,
    jvmArgs: js.Array[String] | js.Promise[js.Array[String]] = null,
    loopback: js.UndefOr[Boolean] = js.undefined,
    port: Double | js.Promise[Double] = null,
    stdio: String | (js.Array[String | Double]) = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (args != null) __obj.updateDynamic("args")(args.asInstanceOf[js.Any])
    if (env != null) __obj.updateDynamic("env")(env)
    if (jvmArgs != null) __obj.updateDynamic("jvmArgs")(jvmArgs.asInstanceOf[js.Any])
    if (!js.isUndefined(loopback)) __obj.updateDynamic("loopback")(loopback)
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (stdio != null) __obj.updateDynamic("stdio")(stdio.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

