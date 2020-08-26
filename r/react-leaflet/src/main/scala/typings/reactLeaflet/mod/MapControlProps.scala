package typings.reactLeaflet.mod

import typings.leaflet.mod.ControlPosition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  leaflet :react-leaflet.react-leaflet.LeafletContext | undefined} & leaflet.leaflet.ControlOptions */
@js.native
trait MapControlProps extends js.Object {
  var leaflet: js.UndefOr[LeafletContext] = js.native
  var position: js.UndefOr[ControlPosition] = js.native
}

object MapControlProps {
  @scala.inline
  def apply(): MapControlProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MapControlProps]
  }
  @scala.inline
  implicit class MapControlPropsOps[Self <: MapControlProps] (val x: Self) extends AnyVal {
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
    def setLeaflet(value: LeafletContext): Self = this.set("leaflet", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLeaflet: Self = this.set("leaflet", js.undefined)
    @scala.inline
    def setPosition(value: ControlPosition): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
  }
  
}

