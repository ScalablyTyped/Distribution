package typings.reactDashNavigationDashStack

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_TranslateXTranslateY extends js.Object {
  var translateX: Double
  var translateY: js.UndefOr[scala.Nothing] = js.undefined
}

object Anon_TranslateXTranslateY {
  @scala.inline
  def apply(translateX: Double, translateY: js.UndefOr[scala.Nothing] = js.undefined): Anon_TranslateXTranslateY = {
    val __obj = js.Dynamic.literal(translateX = translateX.asInstanceOf[js.Any])
    if (!js.isUndefined(translateY)) __obj.updateDynamic("translateY")(translateY.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_TranslateXTranslateY]
  }
}

