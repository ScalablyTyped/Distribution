package typings.scrollmagic.mod

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ControllerConstructorOptions extends js.Object {
  var container: js.UndefOr[String | Element] = js.undefined
  var globalSceneOptions: js.UndefOr[SceneConstructorOptions] = js.undefined
  var loglevel: js.UndefOr[Double] = js.undefined
  var refreshInterval: js.UndefOr[Double] = js.undefined
  var vertical: js.UndefOr[Boolean] = js.undefined
}

object ControllerConstructorOptions {
  @scala.inline
  def apply(
    container: String | Element = null,
    globalSceneOptions: SceneConstructorOptions = null,
    loglevel: js.UndefOr[Double] = js.undefined,
    refreshInterval: js.UndefOr[Double] = js.undefined,
    vertical: js.UndefOr[Boolean] = js.undefined
  ): ControllerConstructorOptions = {
    val __obj = js.Dynamic.literal()
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (globalSceneOptions != null) __obj.updateDynamic("globalSceneOptions")(globalSceneOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(loglevel)) __obj.updateDynamic("loglevel")(loglevel.get.asInstanceOf[js.Any])
    if (!js.isUndefined(refreshInterval)) __obj.updateDynamic("refreshInterval")(refreshInterval.get.asInstanceOf[js.Any])
    if (!js.isUndefined(vertical)) __obj.updateDynamic("vertical")(vertical.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ControllerConstructorOptions]
  }
}

