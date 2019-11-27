package typings.reactDashNavigationDashStack

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_OpacityTransform extends js.Object {
  var opacity: Double
  var transform: js.UndefOr[scala.Nothing] = js.undefined
}

object Anon_OpacityTransform {
  @scala.inline
  def apply(opacity: Double, transform: js.UndefOr[scala.Nothing] = js.undefined): Anon_OpacityTransform = {
    val __obj = js.Dynamic.literal(opacity = opacity.asInstanceOf[js.Any])
    if (!js.isUndefined(transform)) __obj.updateDynamic("transform")(transform.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_OpacityTransform]
  }
}

