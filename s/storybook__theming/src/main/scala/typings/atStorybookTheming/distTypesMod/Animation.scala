package typings.atStorybookTheming.distTypesMod

import typings.atEmotionSerialize.atEmotionSerializeMod.Keyframes
import typings.atEmotionUtils.atEmotionUtilsMod.SerializedStyles
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Animation extends js.Object {
  var float: Keyframes
  var glow: Keyframes
  var hoverable: SerializedStyles
  var inlineGlow: SerializedStyles
  var jiggle: Keyframes
  var rotate360: Keyframes
}

object Animation {
  @scala.inline
  def apply(
    float: Keyframes,
    glow: Keyframes,
    hoverable: SerializedStyles,
    inlineGlow: SerializedStyles,
    jiggle: Keyframes,
    rotate360: Keyframes
  ): Animation = {
    val __obj = js.Dynamic.literal(float = float, glow = glow, hoverable = hoverable, inlineGlow = inlineGlow, jiggle = jiggle, rotate360 = rotate360)
  
    __obj.asInstanceOf[Animation]
  }
}

