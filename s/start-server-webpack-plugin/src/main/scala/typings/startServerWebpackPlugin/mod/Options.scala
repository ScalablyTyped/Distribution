package typings.startServerWebpackPlugin.mod

import typings.startServerWebpackPlugin.startServerWebpackPluginBooleans.`false`
import typings.startServerWebpackPlugin.startServerWebpackPluginBooleans.`true`
import typings.startServerWebpackPlugin.startServerWebpackPluginStrings.SIGUSR2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * Arguments for the script.
    * Default: `[]`.
    */
  var args: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Allow typing 'rs' to restart the server.
    * Default: 'true' if in 'development' mode, 'false' otherwise.
    */
  var keyboard: js.UndefOr[Boolean] = js.undefined
  /**
    * Name of the server to start (built asset from webpack).
    * If not provided, the plugin will tell you the available names.
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * Arguments for node.
    * Default: `[]`.
    */
  var nodeArgs: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Signal to send for HMR.
    * Default: 'false'.
    */
  var signal: js.UndefOr[`false` | `true` | SIGUSR2] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    args: js.Array[String] = null,
    keyboard: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    nodeArgs: js.Array[String] = null,
    signal: `false` | `true` | SIGUSR2 = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (args != null) __obj.updateDynamic("args")(args.asInstanceOf[js.Any])
    if (!js.isUndefined(keyboard)) __obj.updateDynamic("keyboard")(keyboard.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (nodeArgs != null) __obj.updateDynamic("nodeArgs")(nodeArgs.asInstanceOf[js.Any])
    if (signal != null) __obj.updateDynamic("signal")(signal.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

