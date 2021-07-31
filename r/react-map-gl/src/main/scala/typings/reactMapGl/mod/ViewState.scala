package typings.reactMapGl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ViewState extends StObject {
  
  var altitude: js.UndefOr[Double] = js.undefined
  
  var bearing: js.UndefOr[Double] = js.undefined
  
  var latitude: Double
  
  var longitude: Double
  
  var pitch: js.UndefOr[Double] = js.undefined
  
  var zoom: Double
}
object ViewState {
  
  @scala.inline
  def apply(latitude: Double, longitude: Double, zoom: Double): ViewState = {
    val __obj = js.Dynamic.literal(latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any], zoom = zoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewState]
  }
  
  @scala.inline
  implicit class ViewStateMutableBuilder[Self <: ViewState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAltitude(value: Double): Self = StObject.set(x, "altitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAltitudeUndefined: Self = StObject.set(x, "altitude", js.undefined)
    
    @scala.inline
    def setBearing(value: Double): Self = StObject.set(x, "bearing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBearingUndefined: Self = StObject.set(x, "bearing", js.undefined)
    
    @scala.inline
    def setLatitude(value: Double): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongitude(value: Double): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPitch(value: Double): Self = StObject.set(x, "pitch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPitchUndefined: Self = StObject.set(x, "pitch", js.undefined)
    
    @scala.inline
    def setZoom(value: Double): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
  }
}
