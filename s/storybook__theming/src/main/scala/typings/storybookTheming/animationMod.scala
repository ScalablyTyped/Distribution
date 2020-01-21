package typings.storybookTheming

import typings.emotionSerialize.mod.Keyframes
import typings.emotionUtils.mod.SerializedStyles
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@storybook/theming/dist/animation", JSImport.Namespace)
@js.native
object animationMod extends js.Object {
  @js.native
  object animation extends js.Object {
    var float: Keyframes = js.native
    var glow: Keyframes = js.native
    var hoverable: SerializedStyles = js.native
    var inlineGlow: SerializedStyles = js.native
    var jiggle: Keyframes = js.native
    var rotate360: Keyframes = js.native
  }
  
  @js.native
  object easing extends js.Object {
    var rubber: String = js.native
  }
  
}

