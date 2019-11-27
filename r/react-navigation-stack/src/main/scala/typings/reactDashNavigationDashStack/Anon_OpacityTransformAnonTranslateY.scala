package typings.reactDashNavigationDashStack

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_OpacityTransformAnonTranslateY extends js.Object {
  var opacity: js.UndefOr[scala.Nothing] = js.undefined
  var transform: js.Array[Anon_TranslateY]
}

object Anon_OpacityTransformAnonTranslateY {
  @scala.inline
  def apply(transform: js.Array[Anon_TranslateY], opacity: js.UndefOr[scala.Nothing] = js.undefined): Anon_OpacityTransformAnonTranslateY = {
    val __obj = js.Dynamic.literal(transform = transform.asInstanceOf[js.Any])
    if (!js.isUndefined(opacity)) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_OpacityTransformAnonTranslateY]
  }
}

