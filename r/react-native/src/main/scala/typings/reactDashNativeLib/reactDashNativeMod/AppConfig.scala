package typings
package reactDashNativeLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppConfig extends js.Object {
  var appKey: java.lang.String
  var component: js.UndefOr[ComponentProvider] = js.undefined
  var run: js.UndefOr[Runnable] = js.undefined
}

object AppConfig {
  @scala.inline
  def apply(appKey: java.lang.String, component: ComponentProvider = null, run: Runnable = null): AppConfig = {
    val __obj = js.Dynamic.literal(appKey = appKey)
    if (component != null) __obj.updateDynamic("component")(component)
    if (run != null) __obj.updateDynamic("run")(run)
    __obj.asInstanceOf[AppConfig]
  }
}

