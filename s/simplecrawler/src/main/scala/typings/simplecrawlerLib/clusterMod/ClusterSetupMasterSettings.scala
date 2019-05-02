package typings
package simplecrawlerLib.clusterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClusterSetupMasterSettings extends js.Object {
    // default: process.argv[1]
  var args: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var exec: js.UndefOr[java.lang.String] = js.undefined
    // default: process.argv.slice(2)
  var silent: js.UndefOr[scala.Boolean] = js.undefined
    // default: false
  var stdio: js.UndefOr[js.Array[_]] = js.undefined
}

object ClusterSetupMasterSettings {
  @scala.inline
  def apply(
    args: js.Array[java.lang.String] = null,
    exec: java.lang.String = null,
    silent: js.UndefOr[scala.Boolean] = js.undefined,
    stdio: js.Array[_] = null
  ): ClusterSetupMasterSettings = {
    val __obj = js.Dynamic.literal()
    if (args != null) __obj.updateDynamic("args")(args)
    if (exec != null) __obj.updateDynamic("exec")(exec)
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent)
    if (stdio != null) __obj.updateDynamic("stdio")(stdio)
    __obj.asInstanceOf[ClusterSetupMasterSettings]
  }
}

