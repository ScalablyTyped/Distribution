package typings.reactNativeSvg.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MarkerProps extends js.Object {
  var id: js.UndefOr[String] = js.native
  var markerHeight: js.UndefOr[NumberProp] = js.native
  var markerUnits: js.UndefOr[MarkerUnits] = js.native
  var markerWidth: js.UndefOr[NumberProp] = js.native
  var orient: js.UndefOr[Orient | NumberProp] = js.native
  var preserveAspectRatio: js.UndefOr[String] = js.native
  var refX: js.UndefOr[NumberProp] = js.native
  var refY: js.UndefOr[NumberProp] = js.native
  var viewBox: js.UndefOr[String] = js.native
}

object MarkerProps {
  @scala.inline
  def apply(): MarkerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MarkerProps]
  }
  @scala.inline
  implicit class MarkerPropsOps[Self <: MarkerProps] (val x: Self) extends AnyVal {
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setMarkerHeight(value: NumberProp): Self = this.set("markerHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarkerHeight: Self = this.set("markerHeight", js.undefined)
    @scala.inline
    def setMarkerUnits(value: MarkerUnits): Self = this.set("markerUnits", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarkerUnits: Self = this.set("markerUnits", js.undefined)
    @scala.inline
    def setMarkerWidth(value: NumberProp): Self = this.set("markerWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarkerWidth: Self = this.set("markerWidth", js.undefined)
    @scala.inline
    def setOrient(value: Orient | NumberProp): Self = this.set("orient", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrient: Self = this.set("orient", js.undefined)
    @scala.inline
    def setPreserveAspectRatio(value: String): Self = this.set("preserveAspectRatio", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreserveAspectRatio: Self = this.set("preserveAspectRatio", js.undefined)
    @scala.inline
    def setRefX(value: NumberProp): Self = this.set("refX", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRefX: Self = this.set("refX", js.undefined)
    @scala.inline
    def setRefY(value: NumberProp): Self = this.set("refY", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRefY: Self = this.set("refY", js.undefined)
    @scala.inline
    def setViewBox(value: String): Self = this.set("viewBox", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteViewBox: Self = this.set("viewBox", js.undefined)
  }
  
}

