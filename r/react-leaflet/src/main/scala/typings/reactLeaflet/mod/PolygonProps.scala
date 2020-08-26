package typings.reactLeaflet.mod

import typings.leaflet.mod.LatLngExpression
import typings.leaflet.mod.PolylineOptions
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.reactLeaflet.mod.MapComponentProps because var conflicts: pane. Inlined leaflet
- typings.reactLeaflet.mod.MapLayerProps because var conflicts: attribution, pane. Inlined children */ @js.native
trait PolygonProps
  extends PolylineOptions
     with PathEvents {
  var children: js.UndefOr[Children] = js.native
  var leaflet: js.UndefOr[LeafletContext] = js.native
  var positions: js.Array[(js.Array[js.Array[LatLngExpression] | LatLngExpression]) | LatLngExpression] = js.native
}

object PolygonProps {
  @scala.inline
  def apply(positions: js.Array[(js.Array[js.Array[LatLngExpression] | LatLngExpression]) | LatLngExpression]): PolygonProps = {
    val __obj = js.Dynamic.literal(positions = positions.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolygonProps]
  }
  @scala.inline
  implicit class PolygonPropsOps[Self <: PolygonProps] (val x: Self) extends AnyVal {
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
    def setPositionsVarargs(value: ((js.Array[js.Array[LatLngExpression] | LatLngExpression]) | LatLngExpression)*): Self = this.set("positions", js.Array(value :_*))
    @scala.inline
    def setPositions(value: js.Array[(js.Array[js.Array[LatLngExpression] | LatLngExpression]) | LatLngExpression]): Self = this.set("positions", value.asInstanceOf[js.Any])
    @scala.inline
    def setChildrenVarargs(value: ReactNode*): Self = this.set("children", js.Array(value :_*))
    @scala.inline
    def setChildren(value: Children): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setLeaflet(value: LeafletContext): Self = this.set("leaflet", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLeaflet: Self = this.set("leaflet", js.undefined)
  }
  
}

