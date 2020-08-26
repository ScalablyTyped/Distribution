package typings.reactNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransformsStyle extends js.Object {
  var rotation: js.UndefOr[Double] = js.native
  var scaleX: js.UndefOr[Double] = js.native
  var scaleY: js.UndefOr[Double] = js.native
  var transform: js.UndefOr[
    js.Array[
      PerpectiveTransform | RotateTransform | RotateXTransform | RotateYTransform | RotateZTransform | ScaleTransform | ScaleXTransform | ScaleYTransform | TranslateXTransform | TranslateYTransform | SkewXTransform | SkewYTransform
    ]
  ] = js.native
  var transformMatrix: js.UndefOr[js.Array[Double]] = js.native
  var translateX: js.UndefOr[Double] = js.native
  var translateY: js.UndefOr[Double] = js.native
}

object TransformsStyle {
  @scala.inline
  def apply(): TransformsStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransformsStyle]
  }
  @scala.inline
  implicit class TransformsStyleOps[Self <: TransformsStyle] (val x: Self) extends AnyVal {
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
    def setRotation(value: Double): Self = this.set("rotation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRotation: Self = this.set("rotation", js.undefined)
    @scala.inline
    def setScaleX(value: Double): Self = this.set("scaleX", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScaleX: Self = this.set("scaleX", js.undefined)
    @scala.inline
    def setScaleY(value: Double): Self = this.set("scaleY", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScaleY: Self = this.set("scaleY", js.undefined)
    @scala.inline
    def setTransformVarargs(
      value: (PerpectiveTransform | RotateTransform | RotateXTransform | RotateYTransform | RotateZTransform | ScaleTransform | ScaleXTransform | ScaleYTransform | TranslateXTransform | TranslateYTransform | SkewXTransform | SkewYTransform)*
    ): Self = this.set("transform", js.Array(value :_*))
    @scala.inline
    def setTransform(
      value: js.Array[
          PerpectiveTransform | RotateTransform | RotateXTransform | RotateYTransform | RotateZTransform | ScaleTransform | ScaleXTransform | ScaleYTransform | TranslateXTransform | TranslateYTransform | SkewXTransform | SkewYTransform
        ]
    ): Self = this.set("transform", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransform: Self = this.set("transform", js.undefined)
    @scala.inline
    def setTransformMatrixVarargs(value: Double*): Self = this.set("transformMatrix", js.Array(value :_*))
    @scala.inline
    def setTransformMatrix(value: js.Array[Double]): Self = this.set("transformMatrix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransformMatrix: Self = this.set("transformMatrix", js.undefined)
    @scala.inline
    def setTranslateX(value: Double): Self = this.set("translateX", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTranslateX: Self = this.set("translateX", js.undefined)
    @scala.inline
    def setTranslateY(value: Double): Self = this.set("translateY", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTranslateY: Self = this.set("translateY", js.undefined)
  }
  
}

