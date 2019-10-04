package typings.rollupDashPluginDashPeerDashDepsDashExternal.rollupDashPluginDashPeerDashDepsDashExternalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluginPeerDepsExternalOptions extends js.Object {
  var includeDependencies: js.UndefOr[Boolean] = js.undefined
  var packageJsonPath: js.UndefOr[String] = js.undefined
}

object PluginPeerDepsExternalOptions {
  @scala.inline
  def apply(includeDependencies: js.UndefOr[Boolean] = js.undefined, packageJsonPath: String = null): PluginPeerDepsExternalOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(includeDependencies)) __obj.updateDynamic("includeDependencies")(includeDependencies)
    if (packageJsonPath != null) __obj.updateDynamic("packageJsonPath")(packageJsonPath)
    __obj.asInstanceOf[PluginPeerDepsExternalOptions]
  }
}

