package typings.reactLeaflet.mod

import typings.leaflet.mod.ControlPosition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined leaflet.leaflet.Control.ZoomOptions & react-leaflet.react-leaflet.MapControlProps */
@js.native
trait ZoomControlProps extends StObject {
  
  var leaflet: js.UndefOr[LeafletContext] = js.native
  
  var position: js.UndefOr[ControlPosition] = js.native
  
  var zoomInText: js.UndefOr[String] = js.native
  
  var zoomInTitle: js.UndefOr[String] = js.native
  
  var zoomOutText: js.UndefOr[String] = js.native
  
  var zoomOutTitle: js.UndefOr[String] = js.native
}
object ZoomControlProps {
  
  @scala.inline
  def apply(): ZoomControlProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ZoomControlProps]
  }
  
  @scala.inline
  implicit class ZoomControlPropsMutableBuilder[Self <: ZoomControlProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLeaflet(value: LeafletContext): Self = StObject.set(x, "leaflet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeafletUndefined: Self = StObject.set(x, "leaflet", js.undefined)
    
    @scala.inline
    def setPosition(value: ControlPosition): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    @scala.inline
    def setZoomInText(value: String): Self = StObject.set(x, "zoomInText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoomInTextUndefined: Self = StObject.set(x, "zoomInText", js.undefined)
    
    @scala.inline
    def setZoomInTitle(value: String): Self = StObject.set(x, "zoomInTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoomInTitleUndefined: Self = StObject.set(x, "zoomInTitle", js.undefined)
    
    @scala.inline
    def setZoomOutText(value: String): Self = StObject.set(x, "zoomOutText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoomOutTextUndefined: Self = StObject.set(x, "zoomOutText", js.undefined)
    
    @scala.inline
    def setZoomOutTitle(value: String): Self = StObject.set(x, "zoomOutTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoomOutTitleUndefined: Self = StObject.set(x, "zoomOutTitle", js.undefined)
  }
}
