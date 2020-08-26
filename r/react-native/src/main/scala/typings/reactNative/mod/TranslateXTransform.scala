package typings.reactNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TranslateXTransform extends js.Object {
  var translateX: Double = js.native
}

object TranslateXTransform {
  @scala.inline
  def apply(translateX: Double): TranslateXTransform = {
    val __obj = js.Dynamic.literal(translateX = translateX.asInstanceOf[js.Any])
    __obj.asInstanceOf[TranslateXTransform]
  }
  @scala.inline
  implicit class TranslateXTransformOps[Self <: TranslateXTransform] (val x: Self) extends AnyVal {
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
    def setTranslateX(value: Double): Self = this.set("translateX", value.asInstanceOf[js.Any])
  }
  
}

