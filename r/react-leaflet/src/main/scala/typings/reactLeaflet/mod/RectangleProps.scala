package typings.reactLeaflet.mod

import typings.leaflet.mod.LatLngBoundsExpression
import typings.leaflet.mod.LatLngTuple
import typings.leaflet.mod.PolylineOptions
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.reactLeaflet.mod.MapComponentProps because var conflicts: pane. Inlined leaflet
- typings.reactLeaflet.mod.MapLayerProps because var conflicts: attribution, pane. Inlined children */ @js.native
trait RectangleProps
  extends PolylineOptions
     with PathEvents {
  var bounds: LatLngBoundsExpression = js.native
  var children: js.UndefOr[Children] = js.native
  var leaflet: js.UndefOr[LeafletContext] = js.native
}

object RectangleProps {
  @scala.inline
  def apply(bounds: LatLngBoundsExpression): RectangleProps = {
    val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any])
    __obj.asInstanceOf[RectangleProps]
  }
  @scala.inline
  implicit class RectanglePropsOps[Self <: RectangleProps] (val x: Self) extends AnyVal {
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
    def setBoundsVarargs(value: LatLngTuple*): Self = this.set("bounds", js.Array(value :_*))
    @scala.inline
    def setBounds(value: LatLngBoundsExpression): Self = this.set("bounds", value.asInstanceOf[js.Any])
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

