package typings.reactDashNavigationDashStack

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_OpacityOverlayOpacity extends js.Object {
  var opacity: Double
  var overlayOpacity: js.UndefOr[scala.Nothing] = js.undefined
  var shadowOpacity: js.UndefOr[scala.Nothing] = js.undefined
  var transform: js.UndefOr[scala.Nothing] = js.undefined
}

object Anon_OpacityOverlayOpacity {
  @scala.inline
  def apply(
    opacity: Double,
    overlayOpacity: js.UndefOr[scala.Nothing] = js.undefined,
    shadowOpacity: js.UndefOr[scala.Nothing] = js.undefined,
    transform: js.UndefOr[scala.Nothing] = js.undefined
  ): Anon_OpacityOverlayOpacity = {
    val __obj = js.Dynamic.literal(opacity = opacity.asInstanceOf[js.Any])
    if (!js.isUndefined(overlayOpacity)) __obj.updateDynamic("overlayOpacity")(overlayOpacity.asInstanceOf[js.Any])
    if (!js.isUndefined(shadowOpacity)) __obj.updateDynamic("shadowOpacity")(shadowOpacity.asInstanceOf[js.Any])
    if (!js.isUndefined(transform)) __obj.updateDynamic("transform")(transform.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_OpacityOverlayOpacity]
  }
}

