package typings
package reactDashReconcilerLib.reactDashReconcilerMod.ReactReconcilerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DevToolsConfig[Instance, TextInstance] extends js.Object {
  var bundleType: BundleType
  // Note: this actually *does* depend on Fiber internal fields.
  // Used by "inspect clicked DOM element" in React DevTools.
  var findFiberByHostInstance: js.UndefOr[js.Function1[/* instance */ Instance | TextInstance, Fiber]] = js.undefined
  // Used by RN in-app inspector.
  // This API is unfortunately RN-specific.
  // TODO: Change it to accept Fiber instead and type it properly.
  var getInspectorDataForViewTag: js.UndefOr[js.Function1[/* tag */ scala.Double, js.Object]] = js.undefined
  var rendererPackageName: java.lang.String
  var version: java.lang.String
}

object DevToolsConfig {
  @scala.inline
  def apply[Instance, TextInstance](
    bundleType: BundleType,
    rendererPackageName: java.lang.String,
    version: java.lang.String,
    findFiberByHostInstance: js.Function1[/* instance */ Instance | TextInstance, Fiber] = null,
    getInspectorDataForViewTag: js.Function1[/* tag */ scala.Double, js.Object] = null
  ): DevToolsConfig[Instance, TextInstance] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("bundleType")(bundleType)
    __obj.updateDynamic("rendererPackageName")(rendererPackageName)
    __obj.updateDynamic("version")(version)
    if (findFiberByHostInstance != null) __obj.updateDynamic("findFiberByHostInstance")(findFiberByHostInstance)
    if (getInspectorDataForViewTag != null) __obj.updateDynamic("getInspectorDataForViewTag")(getInspectorDataForViewTag)
    __obj.asInstanceOf[DevToolsConfig[Instance, TextInstance]]
  }
}

