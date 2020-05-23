package typings.seen.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SceneOptions extends js.Object {
  var cache: js.UndefOr[Boolean] = js.undefined
  var camera: js.UndefOr[Camera] = js.undefined
  var cullBackfaces: js.UndefOr[Boolean] = js.undefined
  var fractionalPoints: js.UndefOr[Boolean] = js.undefined
  var model: js.UndefOr[Model] = js.undefined
  var shader: js.UndefOr[Shader] = js.undefined
  var viewport: js.UndefOr[Viewport] = js.undefined
}

object SceneOptions {
  @scala.inline
  def apply(
    cache: js.UndefOr[Boolean] = js.undefined,
    camera: Camera = null,
    cullBackfaces: js.UndefOr[Boolean] = js.undefined,
    fractionalPoints: js.UndefOr[Boolean] = js.undefined,
    model: Model = null,
    shader: Shader = null,
    viewport: Viewport = null
  ): SceneOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cache)) __obj.updateDynamic("cache")(cache.get.asInstanceOf[js.Any])
    if (camera != null) __obj.updateDynamic("camera")(camera.asInstanceOf[js.Any])
    if (!js.isUndefined(cullBackfaces)) __obj.updateDynamic("cullBackfaces")(cullBackfaces.get.asInstanceOf[js.Any])
    if (!js.isUndefined(fractionalPoints)) __obj.updateDynamic("fractionalPoints")(fractionalPoints.get.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (shader != null) __obj.updateDynamic("shader")(shader.asInstanceOf[js.Any])
    if (viewport != null) __obj.updateDynamic("viewport")(viewport.asInstanceOf[js.Any])
    __obj.asInstanceOf[SceneOptions]
  }
}

