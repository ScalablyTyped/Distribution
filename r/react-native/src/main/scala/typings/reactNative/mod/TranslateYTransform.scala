package typings.reactNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TranslateYTransform extends js.Object {
  var translateY: Double = js.native
}

object TranslateYTransform {
  @scala.inline
  def apply(translateY: Double): TranslateYTransform = {
    val __obj = js.Dynamic.literal(translateY = translateY.asInstanceOf[js.Any])
    __obj.asInstanceOf[TranslateYTransform]
  }
  @scala.inline
  implicit class TranslateYTransformOps[Self <: TranslateYTransform] (val x: Self) extends AnyVal {
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
    def setTranslateY(value: Double): Self = this.set("translateY", value.asInstanceOf[js.Any])
  }
  
}

