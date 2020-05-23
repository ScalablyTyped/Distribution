package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CanvasRenderingContext2DSettings extends js.Object {
  var alpha: js.UndefOr[scala.Boolean] = js.undefined
  var desynchronized: js.UndefOr[scala.Boolean] = js.undefined
}

object CanvasRenderingContext2DSettings {
  @scala.inline
  def apply(
    alpha: js.UndefOr[scala.Boolean] = js.undefined,
    desynchronized: js.UndefOr[scala.Boolean] = js.undefined
  ): CanvasRenderingContext2DSettings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(alpha)) __obj.updateDynamic("alpha")(alpha.get.asInstanceOf[js.Any])
    if (!js.isUndefined(desynchronized)) __obj.updateDynamic("desynchronized")(desynchronized.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanvasRenderingContext2DSettings]
  }
}

