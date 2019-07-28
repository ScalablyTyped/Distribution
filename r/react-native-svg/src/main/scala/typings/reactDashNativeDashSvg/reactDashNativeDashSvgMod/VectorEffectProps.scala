package typings.reactDashNativeDashSvg.reactDashNativeDashSvgMod

import typings.reactDashNativeDashSvg.reactDashNativeDashSvgStrings.`non-scaling-stroke`
import typings.reactDashNativeDashSvg.reactDashNativeDashSvgStrings.inherit
import typings.reactDashNativeDashSvg.reactDashNativeDashSvgStrings.nonScalingStroke
import typings.reactDashNativeDashSvg.reactDashNativeDashSvgStrings.none
import typings.reactDashNativeDashSvg.reactDashNativeDashSvgStrings.uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VectorEffectProps extends js.Object {
  var vectorEffect: js.UndefOr[
    none | `non-scaling-stroke` | nonScalingStroke | typings.reactDashNativeDashSvg.reactDashNativeDashSvgStrings.default | inherit | uri
  ] = js.undefined
}

object VectorEffectProps {
  @scala.inline
  def apply(
    vectorEffect: none | `non-scaling-stroke` | nonScalingStroke | typings.reactDashNativeDashSvg.reactDashNativeDashSvgStrings.default | inherit | uri = null
  ): VectorEffectProps = {
    val __obj = js.Dynamic.literal()
    if (vectorEffect != null) __obj.updateDynamic("vectorEffect")(vectorEffect.asInstanceOf[js.Any])
    __obj.asInstanceOf[VectorEffectProps]
  }
}

