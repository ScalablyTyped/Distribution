package typings.reactNativeSvg.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommonMarkerProps extends js.Object {
  var marker: js.UndefOr[String] = js.native
  var markerEnd: js.UndefOr[String] = js.native
  var markerMid: js.UndefOr[String] = js.native
  var markerStart: js.UndefOr[String] = js.native
}

object CommonMarkerProps {
  @scala.inline
  def apply(): CommonMarkerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommonMarkerProps]
  }
  @scala.inline
  implicit class CommonMarkerPropsOps[Self <: CommonMarkerProps] (val x: Self) extends AnyVal {
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
    def setMarker(value: String): Self = this.set("marker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarker: Self = this.set("marker", js.undefined)
    @scala.inline
    def setMarkerEnd(value: String): Self = this.set("markerEnd", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarkerEnd: Self = this.set("markerEnd", js.undefined)
    @scala.inline
    def setMarkerMid(value: String): Self = this.set("markerMid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarkerMid: Self = this.set("markerMid", js.undefined)
    @scala.inline
    def setMarkerStart(value: String): Self = this.set("markerStart", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarkerStart: Self = this.set("markerStart", js.undefined)
  }
  
}

