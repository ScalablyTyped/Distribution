package typings.reactNativeMaps.mod

import typings.reactNative.mod.ViewProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MapWMSTileProps extends ViewProps {
  
  var maximumZ: js.UndefOr[Double] = js.native
  
  var minimumZ: js.UndefOr[Double] = js.native
  
  var opacity: Double = js.native
  
  var tileSize: Double = js.native
  
  var urlTemplate: String = js.native
  
  var zIndex: js.UndefOr[Double] = js.native
}
object MapWMSTileProps {
  
  @scala.inline
  def apply(opacity: Double, tileSize: Double, urlTemplate: String): MapWMSTileProps = {
    val __obj = js.Dynamic.literal(opacity = opacity.asInstanceOf[js.Any], tileSize = tileSize.asInstanceOf[js.Any], urlTemplate = urlTemplate.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapWMSTileProps]
  }
  
  @scala.inline
  implicit class MapWMSTilePropsOps[Self <: MapWMSTileProps] (val x: Self) extends AnyVal {
    
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
    def setOpacity(value: Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTileSize(value: Double): Self = this.set("tileSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlTemplate(value: String): Self = this.set("urlTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximumZ(value: Double): Self = this.set("maximumZ", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaximumZ: Self = this.set("maximumZ", js.undefined)
    
    @scala.inline
    def setMinimumZ(value: Double): Self = this.set("minimumZ", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinimumZ: Self = this.set("minimumZ", js.undefined)
    
    @scala.inline
    def setZIndex(value: Double): Self = this.set("zIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZIndex: Self = this.set("zIndex", js.undefined)
  }
}
