package typings.reactLeaflet.mod

import typings.leaflet.mod.CrossOrigin
import typings.leaflet.mod.LatLngBoundsExpression
import typings.leaflet.mod.LatLngTuple
import typings.leaflet.mod.Point_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.leaflet.mod.GridLayerOptions because var conflicts: attribution, pane. Inlined bounds, className, keepBuffer, maxZoom, minZoom, noWrap, opacity, tileSize, updateInterval, updateWhenIdle, updateWhenZooming, zIndex
- typings.leaflet.mod.TileLayerOptions because var conflicts: attribution, pane. Inlined accessToken, crossOrigin, detectRetina, errorTileUrl, id, maxNativeZoom, minNativeZoom, subdomains, tms, zoomOffset, zoomReverse */ @js.native
trait TileLayerProps
  extends MapLayerProps
     with TileLayerEvents {
  var accessToken: js.UndefOr[String] = js.native
  var bounds: js.UndefOr[LatLngBoundsExpression] = js.native
  var className: js.UndefOr[String] = js.native
  var crossOrigin: js.UndefOr[CrossOrigin] = js.native
  var detectRetina: js.UndefOr[Boolean] = js.native
  var errorTileUrl: js.UndefOr[String] = js.native
  var id: js.UndefOr[String] = js.native
  var keepBuffer: js.UndefOr[Double] = js.native
  var maxNativeZoom: js.UndefOr[Double] = js.native
  var maxZoom: js.UndefOr[Double] = js.native
  var minNativeZoom: js.UndefOr[Double] = js.native
  var minZoom: js.UndefOr[Double] = js.native
  var noWrap: js.UndefOr[Boolean] = js.native
  var opacity: js.UndefOr[Double] = js.native
  var subdomains: js.UndefOr[String | js.Array[String]] = js.native
  var tileSize: js.UndefOr[Double | Point_] = js.native
  var tms: js.UndefOr[Boolean] = js.native
  var updateInterval: js.UndefOr[Double] = js.native
  var updateWhenIdle: js.UndefOr[Boolean] = js.native
  var updateWhenZooming: js.UndefOr[Boolean] = js.native
  var url: String = js.native
  var zIndex: js.UndefOr[Double] = js.native
  var zoomOffset: js.UndefOr[Double] = js.native
  var zoomReverse: js.UndefOr[Boolean] = js.native
}

object TileLayerProps {
  @scala.inline
  def apply(url: String): TileLayerProps = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[TileLayerProps]
  }
  @scala.inline
  implicit class TileLayerPropsOps[Self <: TileLayerProps] (val x: Self) extends AnyVal {
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
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def setAccessToken(value: String): Self = this.set("accessToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccessToken: Self = this.set("accessToken", js.undefined)
    @scala.inline
    def setBoundsVarargs(value: LatLngTuple*): Self = this.set("bounds", js.Array(value :_*))
    @scala.inline
    def setBounds(value: LatLngBoundsExpression): Self = this.set("bounds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBounds: Self = this.set("bounds", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setCrossOrigin(value: CrossOrigin): Self = this.set("crossOrigin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCrossOrigin: Self = this.set("crossOrigin", js.undefined)
    @scala.inline
    def setDetectRetina(value: Boolean): Self = this.set("detectRetina", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDetectRetina: Self = this.set("detectRetina", js.undefined)
    @scala.inline
    def setErrorTileUrl(value: String): Self = this.set("errorTileUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrorTileUrl: Self = this.set("errorTileUrl", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setKeepBuffer(value: Double): Self = this.set("keepBuffer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeepBuffer: Self = this.set("keepBuffer", js.undefined)
    @scala.inline
    def setMaxNativeZoom(value: Double): Self = this.set("maxNativeZoom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxNativeZoom: Self = this.set("maxNativeZoom", js.undefined)
    @scala.inline
    def setMaxZoom(value: Double): Self = this.set("maxZoom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxZoom: Self = this.set("maxZoom", js.undefined)
    @scala.inline
    def setMinNativeZoom(value: Double): Self = this.set("minNativeZoom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinNativeZoom: Self = this.set("minNativeZoom", js.undefined)
    @scala.inline
    def setMinZoom(value: Double): Self = this.set("minZoom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinZoom: Self = this.set("minZoom", js.undefined)
    @scala.inline
    def setNoWrap(value: Boolean): Self = this.set("noWrap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoWrap: Self = this.set("noWrap", js.undefined)
    @scala.inline
    def setOpacity(value: Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    @scala.inline
    def setSubdomainsVarargs(value: String*): Self = this.set("subdomains", js.Array(value :_*))
    @scala.inline
    def setSubdomains(value: String | js.Array[String]): Self = this.set("subdomains", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubdomains: Self = this.set("subdomains", js.undefined)
    @scala.inline
    def setTileSize(value: Double | Point_): Self = this.set("tileSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTileSize: Self = this.set("tileSize", js.undefined)
    @scala.inline
    def setTms(value: Boolean): Self = this.set("tms", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTms: Self = this.set("tms", js.undefined)
    @scala.inline
    def setUpdateInterval(value: Double): Self = this.set("updateInterval", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdateInterval: Self = this.set("updateInterval", js.undefined)
    @scala.inline
    def setUpdateWhenIdle(value: Boolean): Self = this.set("updateWhenIdle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdateWhenIdle: Self = this.set("updateWhenIdle", js.undefined)
    @scala.inline
    def setUpdateWhenZooming(value: Boolean): Self = this.set("updateWhenZooming", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdateWhenZooming: Self = this.set("updateWhenZooming", js.undefined)
    @scala.inline
    def setZIndex(value: Double): Self = this.set("zIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZIndex: Self = this.set("zIndex", js.undefined)
    @scala.inline
    def setZoomOffset(value: Double): Self = this.set("zoomOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZoomOffset: Self = this.set("zoomOffset", js.undefined)
    @scala.inline
    def setZoomReverse(value: Boolean): Self = this.set("zoomReverse", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZoomReverse: Self = this.set("zoomReverse", js.undefined)
  }
  
}

