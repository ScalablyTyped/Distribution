package typings
package atStorybookThemingLib.distBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Animation extends js.Object {
  var float: atEmotionSerializeLib.atEmotionSerializeMod.Keyframes
  var glow: atEmotionSerializeLib.atEmotionSerializeMod.Keyframes
  var hoverable: atEmotionUtilsLib.atEmotionUtilsMod.SerializedStyles
  var inlineGlow: atEmotionUtilsLib.atEmotionUtilsMod.SerializedStyles
  var jiggle: atEmotionSerializeLib.atEmotionSerializeMod.Keyframes
  var rotate360: atEmotionSerializeLib.atEmotionSerializeMod.Keyframes
}

object Animation {
  @scala.inline
  def apply(
    float: atEmotionSerializeLib.atEmotionSerializeMod.Keyframes,
    glow: atEmotionSerializeLib.atEmotionSerializeMod.Keyframes,
    hoverable: atEmotionUtilsLib.atEmotionUtilsMod.SerializedStyles,
    inlineGlow: atEmotionUtilsLib.atEmotionUtilsMod.SerializedStyles,
    jiggle: atEmotionSerializeLib.atEmotionSerializeMod.Keyframes,
    rotate360: atEmotionSerializeLib.atEmotionSerializeMod.Keyframes
  ): Animation = {
    val __obj = js.Dynamic.literal(float = float, glow = glow, hoverable = hoverable, inlineGlow = inlineGlow, jiggle = jiggle, rotate360 = rotate360)
  
    __obj.asInstanceOf[Animation]
  }
}

