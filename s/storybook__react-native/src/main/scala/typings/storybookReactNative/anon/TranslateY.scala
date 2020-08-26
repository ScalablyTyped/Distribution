package typings.storybookReactNative.anon

import typings.reactNative.mod.Animated.AnimatedInterpolation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TranslateY extends js.Object {
  var translateX: AnimatedInterpolation = js.native
  var translateY: js.UndefOr[scala.Nothing] = js.native
}

object TranslateY {
  @scala.inline
  def apply(translateX: AnimatedInterpolation): TranslateY = {
    val __obj = js.Dynamic.literal(translateX = translateX.asInstanceOf[js.Any])
    __obj.asInstanceOf[TranslateY]
  }
  @scala.inline
  implicit class TranslateYOps[Self <: TranslateY] (val x: Self) extends AnyVal {
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
    def setTranslateX(value: AnimatedInterpolation): Self = this.set("translateX", value.asInstanceOf[js.Any])
  }
  
}

