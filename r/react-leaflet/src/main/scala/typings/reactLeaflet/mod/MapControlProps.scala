package typings.reactLeaflet.mod

import typings.leaflet.mod.ControlPosition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  leaflet ? :react-leaflet.react-leaflet.LeafletContext} & leaflet.leaflet.ControlOptions */
trait MapControlProps extends js.Object {
  var leaflet: js.UndefOr[LeafletContext] = js.undefined
  var position: js.UndefOr[ControlPosition] = js.undefined
}

object MapControlProps {
  @scala.inline
  def apply(leaflet: LeafletContext = null, position: ControlPosition = null): MapControlProps = {
    val __obj = js.Dynamic.literal()
    if (leaflet != null) __obj.updateDynamic("leaflet")(leaflet.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapControlProps]
  }
}

