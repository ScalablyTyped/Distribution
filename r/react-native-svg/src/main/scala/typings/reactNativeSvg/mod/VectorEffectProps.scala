package typings.reactNativeSvg.mod

import typings.reactNativeSvg.reactNativeSvgStrings.`non-scaling-stroke`
import typings.reactNativeSvg.reactNativeSvgStrings.inherit
import typings.reactNativeSvg.reactNativeSvgStrings.nonScalingStroke
import typings.reactNativeSvg.reactNativeSvgStrings.none
import typings.reactNativeSvg.reactNativeSvgStrings.uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VectorEffectProps extends js.Object {
  var vectorEffect: js.UndefOr[
    none | `non-scaling-stroke` | nonScalingStroke | typings.reactNativeSvg.reactNativeSvgStrings.default | inherit | uri
  ] = js.undefined
}

object VectorEffectProps {
  @scala.inline
  def apply(
    vectorEffect: none | `non-scaling-stroke` | nonScalingStroke | typings.reactNativeSvg.reactNativeSvgStrings.default | inherit | uri = null
  ): VectorEffectProps = {
    val __obj = js.Dynamic.literal()
    if (vectorEffect != null) __obj.updateDynamic("vectorEffect")(vectorEffect.asInstanceOf[js.Any])
    __obj.asInstanceOf[VectorEffectProps]
  }
}

