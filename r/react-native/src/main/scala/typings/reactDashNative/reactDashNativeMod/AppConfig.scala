package typings.reactDashNative.reactDashNativeMod

import typings.react.reactMod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppConfig extends js.Object {
  var appKey: String
  var component: js.UndefOr[ComponentProvider] = js.undefined
  var run: js.UndefOr[Runnable] = js.undefined
}

object AppConfig {
  @scala.inline
  def apply(
    appKey: String,
    component: () => ComponentType[js.Any] = null,
    run: /* appParameters */ js.Any => Unit = null
  ): AppConfig = {
    val __obj = js.Dynamic.literal(appKey = appKey.asInstanceOf[js.Any])
    if (component != null) __obj.updateDynamic("component")(js.Any.fromFunction0(component))
    if (run != null) __obj.updateDynamic("run")(js.Any.fromFunction1(run))
    __obj.asInstanceOf[AppConfig]
  }
}

