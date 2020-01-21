package typings.reactNavigationStack

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOpacityTransform extends js.Object {
  var opacity: Double
  var transform: js.UndefOr[scala.Nothing] = js.undefined
}

object AnonOpacityTransform {
  @scala.inline
  def apply(opacity: Double, transform: js.UndefOr[scala.Nothing] = js.undefined): AnonOpacityTransform = {
    val __obj = js.Dynamic.literal(opacity = opacity.asInstanceOf[js.Any])
    if (!js.isUndefined(transform)) __obj.updateDynamic("transform")(transform.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOpacityTransform]
  }
}

