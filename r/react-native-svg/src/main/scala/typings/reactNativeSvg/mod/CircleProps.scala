package typings.reactNativeSvg.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CircleProps
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
  var cx: js.UndefOr[NumberProp] = js.native
  var cy: js.UndefOr[NumberProp] = js.native
  var opacity: js.UndefOr[NumberProp] = js.native
  var r: js.UndefOr[NumberProp] = js.native
}

object CircleProps {
  @scala.inline
  def apply(): CircleProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CircleProps]
  }
  @scala.inline
  implicit class CirclePropsOps[Self <: CircleProps] (val x: Self) extends AnyVal {
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
    def setCx(value: NumberProp): Self = this.set("cx", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCx: Self = this.set("cx", js.undefined)
    @scala.inline
    def setCy(value: NumberProp): Self = this.set("cy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCy: Self = this.set("cy", js.undefined)
    @scala.inline
    def setOpacity(value: NumberProp): Self = this.set("opacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    @scala.inline
    def setR(value: NumberProp): Self = this.set("r", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteR: Self = this.set("r", js.undefined)
  }
  
}

