package typings.startServerWebpackPlugin.mod

import typings.startServerWebpackPlugin.startServerWebpackPluginBooleans.`false`
import typings.startServerWebpackPlugin.startServerWebpackPluginBooleans.`true`
import typings.startServerWebpackPlugin.startServerWebpackPluginStrings.SIGUSR2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
    * Arguments for the script.
    * Default: `[]`.
    */
  var args: js.UndefOr[js.Array[String]] = js.native
  /**
    * Allow typing 'rs' to restart the server.
    * Default: 'true' if in 'development' mode, 'false' otherwise.
    */
  var keyboard: js.UndefOr[Boolean] = js.native
  /**
    * Name of the server to start (built asset from webpack).
    * If not provided, the plugin will tell you the available names.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Arguments for node.
    * Default: `[]`.
    */
  var nodeArgs: js.UndefOr[js.Array[String]] = js.native
  /**
    * Signal to send for HMR.
    * Default: 'false'.
    */
  var signal: js.UndefOr[`false` | `true` | SIGUSR2] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setArgsVarargs(value: String*): Self = this.set("args", js.Array(value :_*))
    @scala.inline
    def setArgs(value: js.Array[String]): Self = this.set("args", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArgs: Self = this.set("args", js.undefined)
    @scala.inline
    def setKeyboard(value: Boolean): Self = this.set("keyboard", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyboard: Self = this.set("keyboard", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setNodeArgsVarargs(value: String*): Self = this.set("nodeArgs", js.Array(value :_*))
    @scala.inline
    def setNodeArgs(value: js.Array[String]): Self = this.set("nodeArgs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNodeArgs: Self = this.set("nodeArgs", js.undefined)
    @scala.inline
    def setSignal(value: `false` | `true` | SIGUSR2): Self = this.set("signal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSignal: Self = this.set("signal", js.undefined)
  }
  
}

