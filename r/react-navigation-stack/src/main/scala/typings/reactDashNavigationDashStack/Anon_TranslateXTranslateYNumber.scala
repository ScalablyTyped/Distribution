package typings.reactDashNavigationDashStack

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_TranslateXTranslateYNumber extends js.Object {
  var translateX: js.UndefOr[scala.Nothing] = js.undefined
  var translateY: Double
}

object Anon_TranslateXTranslateYNumber {
  @scala.inline
  def apply(translateY: Double, translateX: js.UndefOr[scala.Nothing] = js.undefined): Anon_TranslateXTranslateYNumber = {
    val __obj = js.Dynamic.literal(translateY = translateY.asInstanceOf[js.Any])
    if (!js.isUndefined(translateX)) __obj.updateDynamic("translateX")(translateX.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_TranslateXTranslateYNumber]
  }
}

