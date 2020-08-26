package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Used to reflect the zoomAndPan attribute, and is mixed in to other interfaces for elements that support this attribute. */
@js.native
trait SVGZoomAndPan extends js.Object {
  val zoomAndPan: Double = js.native
}

object SVGZoomAndPan {
  @scala.inline
  def apply(zoomAndPan: Double): SVGZoomAndPan = {
    val __obj = js.Dynamic.literal(zoomAndPan = zoomAndPan.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGZoomAndPan]
  }
  @scala.inline
  implicit class SVGZoomAndPanOps[Self <: SVGZoomAndPan] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setZoomAndPan(value: Double): Self = this.set("zoomAndPan", value.asInstanceOf[js.Any])
  }
  
}

