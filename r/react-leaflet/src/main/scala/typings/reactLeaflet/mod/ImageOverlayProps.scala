package typings.reactLeaflet.mod

import typings.leaflet.mod.ImageOverlayOptions
import typings.leaflet.mod.LatLngBoundsExpression
import typings.leaflet.mod.LatLngTuple
import typings.react.mod.ReactNode
import typings.std.HTMLImageElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.reactLeaflet.mod.MapComponentProps because var conflicts: pane. Inlined leaflet
- typings.reactLeaflet.mod.MapLayerProps because var conflicts: attribution, pane. Inlined children */ @js.native
trait ImageOverlayProps extends ImageOverlayOptions {
  var bounds: js.UndefOr[LatLngBoundsExpression] = js.native
  var children: js.UndefOr[Children] = js.native
  var leaflet: js.UndefOr[LeafletContext] = js.native
  var url: String | HTMLImageElement = js.native
}

object ImageOverlayProps {
  @scala.inline
  def apply(url: String | HTMLImageElement): ImageOverlayProps = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageOverlayProps]
  }
  @scala.inline
  implicit class ImageOverlayPropsOps[Self <: ImageOverlayProps] (val x: Self) extends AnyVal {
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
    def setUrl(value: String | HTMLImageElement): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def setBoundsVarargs(value: LatLngTuple*): Self = this.set("bounds", js.Array(value :_*))
    @scala.inline
    def setBounds(value: LatLngBoundsExpression): Self = this.set("bounds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBounds: Self = this.set("bounds", js.undefined)
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

