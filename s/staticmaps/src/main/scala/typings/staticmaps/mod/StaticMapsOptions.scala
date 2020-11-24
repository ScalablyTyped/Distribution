package typings.staticmaps.mod

import typings.staticmaps.anon.Max
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StaticMapsOptions extends js.Object {
  
  var height: Double = js.native
  
  /** @deprecated Use zoomRange.max instead: */
  var maxZoom: js.UndefOr[Double] = js.native
  
  var paddingX: js.UndefOr[Double] = js.native
  
  var paddingY: js.UndefOr[Double] = js.native
  
  var reverseY: js.UndefOr[Boolean] = js.native
  
  /**
    * Subdomains of tile server
    * @default []
    */
  var subdomains: js.UndefOr[js.Array[String]] = js.native
  
  var tileRequestHeader: js.UndefOr[js.Object] = js.native
  
  /**
    * Limit concurrent connections to the tiles server
    * @default 2
    */
  var tileRequestLimit: js.UndefOr[Double] = js.native
  
  var tileRequestTimeout: js.UndefOr[Double] = js.native
  
  var tileSize: js.UndefOr[Double] = js.native
  
  var tileUrl: js.UndefOr[String] = js.native
  
  var width: Double = js.native
  
  /**
    * Defines the range of zoom levels to try
    */
  var zoomRange: js.UndefOr[Max] = js.native
}
object StaticMapsOptions {
  
  @scala.inline
  def apply(height: Double, width: Double): StaticMapsOptions = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[StaticMapsOptions]
  }
  
  @scala.inline
  implicit class StaticMapsOptionsOps[Self <: StaticMapsOptions] (val x: Self) extends AnyVal {
    
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
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxZoom(value: Double): Self = this.set("maxZoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxZoom: Self = this.set("maxZoom", js.undefined)
    
    @scala.inline
    def setPaddingX(value: Double): Self = this.set("paddingX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaddingX: Self = this.set("paddingX", js.undefined)
    
    @scala.inline
    def setPaddingY(value: Double): Self = this.set("paddingY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaddingY: Self = this.set("paddingY", js.undefined)
    
    @scala.inline
    def setReverseY(value: Boolean): Self = this.set("reverseY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReverseY: Self = this.set("reverseY", js.undefined)
    
    @scala.inline
    def setSubdomainsVarargs(value: String*): Self = this.set("subdomains", js.Array(value :_*))
    
    @scala.inline
    def setSubdomains(value: js.Array[String]): Self = this.set("subdomains", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubdomains: Self = this.set("subdomains", js.undefined)
    
    @scala.inline
    def setTileRequestHeader(value: js.Object): Self = this.set("tileRequestHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTileRequestHeader: Self = this.set("tileRequestHeader", js.undefined)
    
    @scala.inline
    def setTileRequestLimit(value: Double): Self = this.set("tileRequestLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTileRequestLimit: Self = this.set("tileRequestLimit", js.undefined)
    
    @scala.inline
    def setTileRequestTimeout(value: Double): Self = this.set("tileRequestTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTileRequestTimeout: Self = this.set("tileRequestTimeout", js.undefined)
    
    @scala.inline
    def setTileSize(value: Double): Self = this.set("tileSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTileSize: Self = this.set("tileSize", js.undefined)
    
    @scala.inline
    def setTileUrl(value: String): Self = this.set("tileUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTileUrl: Self = this.set("tileUrl", js.undefined)
    
    @scala.inline
    def setZoomRange(value: Max): Self = this.set("zoomRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZoomRange: Self = this.set("zoomRange", js.undefined)
  }
}
