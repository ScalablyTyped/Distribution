package typings.reactNativeSvg.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RectProps
  extends TransformProps
     with FillProps
     with StrokeProps
     with ClipProps
     with VectorEffectProps
     with ResponderProps
     with TouchableProps
     with DefinitionProps
     with CommonMarkerProps
     with CommonMaskProps {
  var height: js.UndefOr[NumberProp] = js.native
  var opacity: js.UndefOr[NumberProp] = js.native
  var rx: js.UndefOr[NumberProp] = js.native
  var ry: js.UndefOr[NumberProp] = js.native
  var width: js.UndefOr[NumberProp] = js.native
  @JSName("x")
  var x_RectProps: js.UndefOr[NumberProp] = js.native
  @JSName("y")
  var y_RectProps: js.UndefOr[NumberProp] = js.native
}

object RectProps {
  @scala.inline
  def apply(): RectProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RectProps]
  }
  @scala.inline
  implicit class RectPropsOps[Self <: RectProps] (val x: Self) extends AnyVal {
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
    def setHeight(value: NumberProp): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setOpacity(value: NumberProp): Self = this.set("opacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    @scala.inline
    def setRx(value: NumberProp): Self = this.set("rx", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRx: Self = this.set("rx", js.undefined)
    @scala.inline
    def setRy(value: NumberProp): Self = this.set("ry", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRy: Self = this.set("ry", js.undefined)
    @scala.inline
    def setWidth(value: NumberProp): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
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

