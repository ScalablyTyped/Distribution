package typings
package reactDashNativeDashSvgLib.reactDashNativeDashSvgMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VectorEffectProps extends js.Object {
  var vectorEffect: js.UndefOr[
    reactDashNativeDashSvgLib.reactDashNativeDashSvgLibStrings.none | reactDashNativeDashSvgLib.reactDashNativeDashSvgLibStrings.`non-scaling-stroke` | reactDashNativeDashSvgLib.reactDashNativeDashSvgLibStrings.nonScalingStroke | reactDashNativeDashSvgLib.reactDashNativeDashSvgLibStrings.default | reactDashNativeDashSvgLib.reactDashNativeDashSvgLibStrings.inherit | reactDashNativeDashSvgLib.reactDashNativeDashSvgLibStrings.uri
  ] = js.undefined
}

object VectorEffectProps {
  @scala.inline
  def apply(
    vectorEffect: reactDashNativeDashSvgLib.reactDashNativeDashSvgLibStrings.none | reactDashNativeDashSvgLib.reactDashNativeDashSvgLibStrings.`non-scaling-stroke` | reactDashNativeDashSvgLib.reactDashNativeDashSvgLibStrings.nonScalingStroke | reactDashNativeDashSvgLib.reactDashNativeDashSvgLibStrings.default | reactDashNativeDashSvgLib.reactDashNativeDashSvgLibStrings.inherit | reactDashNativeDashSvgLib.reactDashNativeDashSvgLibStrings.uri = null
  ): VectorEffectProps = {
    val __obj = js.Dynamic.literal()
    if (vectorEffect != null) __obj.updateDynamic("vectorEffect")(vectorEffect.asInstanceOf[js.Any])
    __obj.asInstanceOf[VectorEffectProps]
  }
}

