package typings.reactMapGl.mod

import typings.reactMapGl.reactMapGlStrings.`bottom-left`
import typings.reactMapGl.reactMapGlStrings.`bottom-right`
import typings.reactMapGl.reactMapGlStrings.`top-left`
import typings.reactMapGl.reactMapGlStrings.`top-right`
import typings.reactMapGl.reactMapGlStrings.bottom
import typings.reactMapGl.reactMapGlStrings.left
import typings.reactMapGl.reactMapGlStrings.right
import typings.reactMapGl.reactMapGlStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PopupProps extends BaseControlProps {
  var altitude: js.UndefOr[Double] = js.native
  var anchor: js.UndefOr[
    top | `top-left` | `top-right` | bottom | `bottom-left` | `bottom-right` | left | right
  ] = js.native
  var className: js.UndefOr[String] = js.native
  var closeButton: js.UndefOr[Boolean] = js.native
  var closeOnClick: js.UndefOr[Boolean] = js.native
  var dynamicPosition: js.UndefOr[Boolean] = js.native
  var latitude: Double = js.native
  var longitude: Double = js.native
  var offsetLeft: js.UndefOr[Double] = js.native
  var offsetTop: js.UndefOr[Double] = js.native
  var onClose: js.UndefOr[js.Function0[Unit]] = js.native
  var sortByDepth: js.UndefOr[Boolean] = js.native
  var tipSize: js.UndefOr[Double] = js.native
}

object PopupProps {
  @scala.inline
  def apply(latitude: Double, longitude: Double): PopupProps = {
    val __obj = js.Dynamic.literal(latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any])
    __obj.asInstanceOf[PopupProps]
  }
  @scala.inline
  implicit class PopupPropsOps[Self <: PopupProps] (val x: Self) extends AnyVal {
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
    def setLatitude(value: Double): Self = this.set("latitude", value.asInstanceOf[js.Any])
    @scala.inline
    def setLongitude(value: Double): Self = this.set("longitude", value.asInstanceOf[js.Any])
    @scala.inline
    def setAltitude(value: Double): Self = this.set("altitude", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAltitude: Self = this.set("altitude", js.undefined)
    @scala.inline
    def setAnchor(value: top | `top-left` | `top-right` | bottom | `bottom-left` | `bottom-right` | left | right): Self = this.set("anchor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnchor: Self = this.set("anchor", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setCloseButton(value: Boolean): Self = this.set("closeButton", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCloseButton: Self = this.set("closeButton", js.undefined)
    @scala.inline
    def setCloseOnClick(value: Boolean): Self = this.set("closeOnClick", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCloseOnClick: Self = this.set("closeOnClick", js.undefined)
    @scala.inline
    def setDynamicPosition(value: Boolean): Self = this.set("dynamicPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDynamicPosition: Self = this.set("dynamicPosition", js.undefined)
    @scala.inline
    def setOffsetLeft(value: Double): Self = this.set("offsetLeft", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffsetLeft: Self = this.set("offsetLeft", js.undefined)
    @scala.inline
    def setOffsetTop(value: Double): Self = this.set("offsetTop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffsetTop: Self = this.set("offsetTop", js.undefined)
    @scala.inline
    def setOnClose(value: () => Unit): Self = this.set("onClose", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnClose: Self = this.set("onClose", js.undefined)
    @scala.inline
    def setSortByDepth(value: Boolean): Self = this.set("sortByDepth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSortByDepth: Self = this.set("sortByDepth", js.undefined)
    @scala.inline
    def setTipSize(value: Double): Self = this.set("tipSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTipSize: Self = this.set("tipSize", js.undefined)
  }
  
}

