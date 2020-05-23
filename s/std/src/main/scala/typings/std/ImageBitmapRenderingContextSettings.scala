package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageBitmapRenderingContextSettings extends js.Object {
  var alpha: js.UndefOr[scala.Boolean] = js.undefined
}

object ImageBitmapRenderingContextSettings {
  @scala.inline
  def apply(alpha: js.UndefOr[scala.Boolean] = js.undefined): ImageBitmapRenderingContextSettings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(alpha)) __obj.updateDynamic("alpha")(alpha.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageBitmapRenderingContextSettings]
  }
}

