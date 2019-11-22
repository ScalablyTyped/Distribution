package typings.qrcodeDotReact.qrcodeDotReactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageSettings extends js.Object {
  var excavate: js.UndefOr[Boolean] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var src: String
  var width: js.UndefOr[Double] = js.undefined
  var x: js.UndefOr[Double] = js.undefined
  var y: js.UndefOr[Double] = js.undefined
}

object ImageSettings {
  @scala.inline
  def apply(
    src: String,
    excavate: js.UndefOr[Boolean] = js.undefined,
    height: Int | Double = null,
    width: Int | Double = null,
    x: Int | Double = null,
    y: Int | Double = null
  ): ImageSettings = {
    val __obj = js.Dynamic.literal(src = src)
    if (!js.isUndefined(excavate)) __obj.updateDynamic("excavate")(excavate)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageSettings]
  }
}

