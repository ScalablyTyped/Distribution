package typings.reactLeaflet.mod

import typings.leaflet.mod.ControlPosition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined leaflet.leaflet.Control.AttributionOptions & react-leaflet.react-leaflet.MapControlProps */
trait AttributionControlProps extends js.Object {
  var leaflet: js.UndefOr[LeafletContext] = js.undefined
  var position: js.UndefOr[ControlPosition] = js.undefined
  var prefix: js.UndefOr[String | Boolean] = js.undefined
}

object AttributionControlProps {
  @scala.inline
  def apply(leaflet: LeafletContext = null, position: ControlPosition = null, prefix: String | Boolean = null): AttributionControlProps = {
    val __obj = js.Dynamic.literal()
    if (leaflet != null) __obj.updateDynamic("leaflet")(leaflet.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttributionControlProps]
  }
}

