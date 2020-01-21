package typings.reactNavigationStack

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOpacityTransformAnonTranslateY extends js.Object {
  var opacity: js.UndefOr[scala.Nothing] = js.undefined
  var transform: js.Array[AnonTranslateY]
}

object AnonOpacityTransformAnonTranslateY {
  @scala.inline
  def apply(transform: js.Array[AnonTranslateY], opacity: js.UndefOr[scala.Nothing] = js.undefined): AnonOpacityTransformAnonTranslateY = {
    val __obj = js.Dynamic.literal(transform = transform.asInstanceOf[js.Any])
    if (!js.isUndefined(opacity)) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOpacityTransformAnonTranslateY]
  }
}

