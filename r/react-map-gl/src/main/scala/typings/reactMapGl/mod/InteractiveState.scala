package typings.reactMapGl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InteractiveState extends StObject {
  
  var startBearing: js.UndefOr[Double] = js.native
  
  var startPanLngLat: js.UndefOr[js.Tuple2[Double, Double]] = js.native
  
  var startPitch: js.UndefOr[Double] = js.native
  
  var startZoom: js.UndefOr[Double] = js.native
  
  var startZoomLngLat: js.UndefOr[js.Tuple2[Double, Double]] = js.native
}
object InteractiveState {
  
  @scala.inline
  def apply(): InteractiveState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InteractiveState]
  }
  
  @scala.inline
  implicit class InteractiveStateMutableBuilder[Self <: InteractiveState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStartBearing(value: Double): Self = StObject.set(x, "startBearing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartBearingUndefined: Self = StObject.set(x, "startBearing", js.undefined)
    
    @scala.inline
    def setStartPanLngLat(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "startPanLngLat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartPanLngLatUndefined: Self = StObject.set(x, "startPanLngLat", js.undefined)
    
    @scala.inline
    def setStartPitch(value: Double): Self = StObject.set(x, "startPitch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartPitchUndefined: Self = StObject.set(x, "startPitch", js.undefined)
    
    @scala.inline
    def setStartZoom(value: Double): Self = StObject.set(x, "startZoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartZoomLngLat(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "startZoomLngLat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartZoomLngLatUndefined: Self = StObject.set(x, "startZoomLngLat", js.undefined)
    
    @scala.inline
    def setStartZoomUndefined: Self = StObject.set(x, "startZoom", js.undefined)
  }
}
