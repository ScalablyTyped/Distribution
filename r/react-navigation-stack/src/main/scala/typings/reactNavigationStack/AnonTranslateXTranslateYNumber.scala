package typings.reactNavigationStack

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTranslateXTranslateYNumber extends js.Object {
  var translateX: js.UndefOr[scala.Nothing] = js.undefined
  var translateY: Double
}

object AnonTranslateXTranslateYNumber {
  @scala.inline
  def apply(translateY: Double, translateX: js.UndefOr[scala.Nothing] = js.undefined): AnonTranslateXTranslateYNumber = {
    val __obj = js.Dynamic.literal(translateY = translateY.asInstanceOf[js.Any])
    if (!js.isUndefined(translateX)) __obj.updateDynamic("translateX")(translateX.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTranslateXTranslateYNumber]
  }
}

