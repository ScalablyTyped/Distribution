package typings.storybookTheming.typesMod

import typings.emotionSerialize.mod.Keyframes
import typings.emotionUtils.mod.SerializedStyles
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Animation extends js.Object {
  var float: Keyframes = js.native
  var glow: Keyframes = js.native
  var hoverable: SerializedStyles = js.native
  var inlineGlow: SerializedStyles = js.native
  var jiggle: Keyframes = js.native
  var rotate360: Keyframes = js.native
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
  @scala.inline
  implicit class AnimationOps[Self <: Animation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFloat(value: Keyframes): Self = this.set("float", value.asInstanceOf[js.Any])
    @scala.inline
    def setGlow(value: Keyframes): Self = this.set("glow", value.asInstanceOf[js.Any])
    @scala.inline
    def setHoverable(value: SerializedStyles): Self = this.set("hoverable", value.asInstanceOf[js.Any])
    @scala.inline
    def setInlineGlow(value: SerializedStyles): Self = this.set("inlineGlow", value.asInstanceOf[js.Any])
    @scala.inline
    def setJiggle(value: Keyframes): Self = this.set("jiggle", value.asInstanceOf[js.Any])
    @scala.inline
    def setRotate360(value: Keyframes): Self = this.set("rotate360", value.asInstanceOf[js.Any])
  }
  
}

