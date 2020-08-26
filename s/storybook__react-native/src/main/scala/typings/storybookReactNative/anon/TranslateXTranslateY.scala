package typings.storybookReactNative.anon

import typings.reactNative.mod.Animated.AnimatedInterpolation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TranslateXTranslateY extends js.Object {
  var translateX: js.UndefOr[scala.Nothing] = js.native
  var translateY: AnimatedInterpolation = js.native
}

object TranslateXTranslateY {
  @scala.inline
  def apply(translateY: AnimatedInterpolation): TranslateXTranslateY = {
    val __obj = js.Dynamic.literal(translateY = translateY.asInstanceOf[js.Any])
    __obj.asInstanceOf[TranslateXTranslateY]
  }
  @scala.inline
  implicit class TranslateXTranslateYOps[Self <: TranslateXTranslateY] (val x: Self) extends AnyVal {
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
    def setTranslateY(value: AnimatedInterpolation): Self = this.set("translateY", value.asInstanceOf[js.Any])
  }
  
}

