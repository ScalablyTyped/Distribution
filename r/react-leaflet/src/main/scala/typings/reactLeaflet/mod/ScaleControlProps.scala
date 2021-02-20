package typings.reactLeaflet.mod

import typings.leaflet.mod.ControlPosition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined leaflet.leaflet.Control.ScaleOptions & react-leaflet.react-leaflet.MapControlProps */
@js.native
trait ScaleControlProps extends StObject {
  
  var imperial: js.UndefOr[Boolean] = js.native
  
  var leaflet: js.UndefOr[LeafletContext] = js.native
  
  var maxWidth: js.UndefOr[Double] = js.native
  
  var metric: js.UndefOr[Boolean] = js.native
  
  var position: js.UndefOr[ControlPosition] = js.native
  
  var updateWhenIdle: js.UndefOr[Boolean] = js.native
}
object ScaleControlProps {
  
  @scala.inline
  def apply(): ScaleControlProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScaleControlProps]
  }
  
  @scala.inline
  implicit class ScaleControlPropsMutableBuilder[Self <: ScaleControlProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setImperial(value: Boolean): Self = StObject.set(x, "imperial", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImperialUndefined: Self = StObject.set(x, "imperial", js.undefined)
    
    @scala.inline
    def setLeaflet(value: LeafletContext): Self = StObject.set(x, "leaflet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeafletUndefined: Self = StObject.set(x, "leaflet", js.undefined)
    
    @scala.inline
    def setMaxWidth(value: Double): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
    
    @scala.inline
    def setMetric(value: Boolean): Self = StObject.set(x, "metric", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetricUndefined: Self = StObject.set(x, "metric", js.undefined)
    
    @scala.inline
    def setPosition(value: ControlPosition): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    @scala.inline
    def setUpdateWhenIdle(value: Boolean): Self = StObject.set(x, "updateWhenIdle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateWhenIdleUndefined: Self = StObject.set(x, "updateWhenIdle", js.undefined)
  }
}
