package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Used to reflect the zoomAndPan attribute, and is mixed in to other interfaces for elements that support this attribute. */
trait SVGZoomAndPan extends js.Object {
  val zoomAndPan: Double
}

object SVGZoomAndPan {
  @scala.inline
  def apply(zoomAndPan: Double): SVGZoomAndPan = {
    val __obj = js.Dynamic.literal(zoomAndPan = zoomAndPan.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGZoomAndPan]
  }
}

