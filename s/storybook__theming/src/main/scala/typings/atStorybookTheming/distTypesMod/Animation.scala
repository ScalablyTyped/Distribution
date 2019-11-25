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
    val __obj = js.Dynamic.literal(float = float.asInstanceOf[js.Any], glow = glow.asInstanceOf[js.Any], hoverable = hoverable.asInstanceOf[js.Any], inlineGlow = inlineGlow.asInstanceOf[js.Any], jiggle = jiggle.asInstanceOf[js.Any], rotate360 = rotate360.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Animation]
  }
}

