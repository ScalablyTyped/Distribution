package typings.reactLeaflet.mod

import typings.leaflet.mod.ControlPosition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined leaflet.leaflet.Control.ZoomOptions & react-leaflet.react-leaflet.MapControlProps */
trait ZoomControlProps extends js.Object {
  var leaflet: js.UndefOr[LeafletContext] = js.undefined
  var position: js.UndefOr[ControlPosition] = js.undefined
  var zoomInText: js.UndefOr[String] = js.undefined
  var zoomInTitle: js.UndefOr[String] = js.undefined
  var zoomOutText: js.UndefOr[String] = js.undefined
  var zoomOutTitle: js.UndefOr[String] = js.undefined
}

object ZoomControlProps {
  @scala.inline
  def apply(
    leaflet: LeafletContext = null,
    position: ControlPosition = null,
    zoomInText: String = null,
    zoomInTitle: String = null,
    zoomOutText: String = null,
    zoomOutTitle: String = null
  ): ZoomControlProps = {
    val __obj = js.Dynamic.literal()
    if (leaflet != null) __obj.updateDynamic("leaflet")(leaflet.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (zoomInText != null) __obj.updateDynamic("zoomInText")(zoomInText.asInstanceOf[js.Any])
    if (zoomInTitle != null) __obj.updateDynamic("zoomInTitle")(zoomInTitle.asInstanceOf[js.Any])
    if (zoomOutText != null) __obj.updateDynamic("zoomOutText")(zoomOutText.asInstanceOf[js.Any])
    if (zoomOutTitle != null) __obj.updateDynamic("zoomOutTitle")(zoomOutTitle.asInstanceOf[js.Any])
    __obj.asInstanceOf[ZoomControlProps]
  }
}

