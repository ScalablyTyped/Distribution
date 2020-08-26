package typings.reactSketchapp.propsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransformProps extends js.Object {
  var origin: js.UndefOr[NumberProp] = js.native
  var originX: js.UndefOr[NumberProp] = js.native
  var originY: js.UndefOr[NumberProp] = js.native
  var rotate: js.UndefOr[NumberProp] = js.native
  var rotation: js.UndefOr[NumberProp] = js.native
  var scale: js.UndefOr[NumberProp] = js.native
  var scaleX: js.UndefOr[NumberProp] = js.native
  var scaleY: js.UndefOr[NumberProp] = js.native
  var skew: js.UndefOr[NumberProp] = js.native
  var skewX: js.UndefOr[NumberProp] = js.native
  var skewY: js.UndefOr[NumberProp] = js.native
  var transform: js.UndefOr[js.Object | String] = js.native
  var translate: js.UndefOr[NumberProp] = js.native
  var translateX: js.UndefOr[NumberProp] = js.native
  var translateY: js.UndefOr[NumberProp] = js.native
  var x: js.UndefOr[NumberProp] = js.native
  var y: js.UndefOr[NumberProp] = js.native
}

object TransformProps {
  @scala.inline
  def apply(): TransformProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransformProps]
  }
  @scala.inline
  implicit class TransformPropsOps[Self <: TransformProps] (val x: Self) extends AnyVal {
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
    def setOrigin(value: NumberProp): Self = this.set("origin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrigin: Self = this.set("origin", js.undefined)
    @scala.inline
    def setOriginX(value: NumberProp): Self = this.set("originX", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOriginX: Self = this.set("originX", js.undefined)
    @scala.inline
    def setOriginY(value: NumberProp): Self = this.set("originY", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOriginY: Self = this.set("originY", js.undefined)
    @scala.inline
    def setRotate(value: NumberProp): Self = this.set("rotate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRotate: Self = this.set("rotate", js.undefined)
    @scala.inline
    def setRotation(value: NumberProp): Self = this.set("rotation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRotation: Self = this.set("rotation", js.undefined)
    @scala.inline
    def setScale(value: NumberProp): Self = this.set("scale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScale: Self = this.set("scale", js.undefined)
    @scala.inline
    def setScaleX(value: NumberProp): Self = this.set("scaleX", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScaleX: Self = this.set("scaleX", js.undefined)
    @scala.inline
    def setScaleY(value: NumberProp): Self = this.set("scaleY", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScaleY: Self = this.set("scaleY", js.undefined)
    @scala.inline
    def setSkew(value: NumberProp): Self = this.set("skew", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSkew: Self = this.set("skew", js.undefined)
    @scala.inline
    def setSkewX(value: NumberProp): Self = this.set("skewX", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSkewX: Self = this.set("skewX", js.undefined)
    @scala.inline
    def setSkewY(value: NumberProp): Self = this.set("skewY", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSkewY: Self = this.set("skewY", js.undefined)
    @scala.inline
    def setTransform(value: js.Object | String): Self = this.set("transform", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransform: Self = this.set("transform", js.undefined)
    @scala.inline
    def setTranslate(value: NumberProp): Self = this.set("translate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTranslate: Self = this.set("translate", js.undefined)
    @scala.inline
    def setTranslateX(value: NumberProp): Self = this.set("translateX", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTranslateX: Self = this.set("translateX", js.undefined)
    @scala.inline
    def setTranslateY(value: NumberProp): Self = this.set("translateY", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTranslateY: Self = this.set("translateY", js.undefined)
    @scala.inline
    def setX(value: NumberProp): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteX: Self = this.set("x", js.undefined)
    @scala.inline
    def setY(value: NumberProp): Self = this.set("y", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteY: Self = this.set("y", js.undefined)
  }
  
}

