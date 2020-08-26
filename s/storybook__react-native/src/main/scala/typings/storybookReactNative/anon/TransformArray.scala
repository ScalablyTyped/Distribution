package typings.storybookReactNative.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransformArray extends js.Object {
  var transform: js.Array[TranslateY | TranslateXTranslateY] = js.native
}

object TransformArray {
  @scala.inline
  def apply(transform: js.Array[TranslateY | TranslateXTranslateY]): TransformArray = {
    val __obj = js.Dynamic.literal(transform = transform.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransformArray]
  }
  @scala.inline
  implicit class TransformArrayOps[Self <: TransformArray] (val x: Self) extends AnyVal {
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
    def setTransformVarargs(value: (TranslateY | TranslateXTranslateY)*): Self = this.set("transform", js.Array(value :_*))
    @scala.inline
    def setTransform(value: js.Array[TranslateY | TranslateXTranslateY]): Self = this.set("transform", value.asInstanceOf[js.Any])
  }
  
}

