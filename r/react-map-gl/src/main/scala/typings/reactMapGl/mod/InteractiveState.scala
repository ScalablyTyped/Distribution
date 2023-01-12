package typings.reactMapGl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InteractiveState extends StObject {
  
  var startBearing: js.UndefOr[Double] = js.undefined
  
  var startPanLngLat: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
  
  var startPitch: js.UndefOr[Double] = js.undefined
  
  var startZoom: js.UndefOr[Double] = js.undefined
  
  var startZoomLngLat: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
}
object InteractiveState {
  
  inline def apply(): InteractiveState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InteractiveState]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InteractiveState] (val x: Self) extends AnyVal {
    
    inline def setStartBearing(value: Double): Self = StObject.set(x, "startBearing", value.asInstanceOf[js.Any])
    
    inline def setStartBearingUndefined: Self = StObject.set(x, "startBearing", js.undefined)
    
    inline def setStartPanLngLat(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "startPanLngLat", value.asInstanceOf[js.Any])
    
    inline def setStartPanLngLatUndefined: Self = StObject.set(x, "startPanLngLat", js.undefined)
    
    inline def setStartPitch(value: Double): Self = StObject.set(x, "startPitch", value.asInstanceOf[js.Any])
    
    inline def setStartPitchUndefined: Self = StObject.set(x, "startPitch", js.undefined)
    
    inline def setStartZoom(value: Double): Self = StObject.set(x, "startZoom", value.asInstanceOf[js.Any])
    
    inline def setStartZoomLngLat(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "startZoomLngLat", value.asInstanceOf[js.Any])
    
    inline def setStartZoomLngLatUndefined: Self = StObject.set(x, "startZoomLngLat", js.undefined)
    
    inline def setStartZoomUndefined: Self = StObject.set(x, "startZoom", js.undefined)
  }
}
