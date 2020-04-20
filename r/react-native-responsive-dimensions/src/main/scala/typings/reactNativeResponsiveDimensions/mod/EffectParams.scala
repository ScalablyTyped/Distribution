package typings.reactNativeResponsiveDimensions.mod

import typings.reactNative.mod.ScaledSize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EffectParams extends js.Object {
  var screen: ScaledSize
  var window: ScaledSize
}

object EffectParams {
  @scala.inline
  def apply(screen: ScaledSize, window: ScaledSize): EffectParams = {
    val __obj = js.Dynamic.literal(screen = screen.asInstanceOf[js.Any], window = window.asInstanceOf[js.Any])
    __obj.asInstanceOf[EffectParams]
  }
}

