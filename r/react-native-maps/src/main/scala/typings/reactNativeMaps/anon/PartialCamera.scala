package typings.reactNativeMaps.anon

import typings.reactNativeMaps.mod.LatLng
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<react-native-maps.react-native-maps.Camera> */
trait PartialCamera extends StObject {
  
  var altitude: js.UndefOr[Double] = js.undefined
  
  var center: js.UndefOr[LatLng] = js.undefined
  
  var heading: js.UndefOr[Double] = js.undefined
  
  var pitch: js.UndefOr[Double] = js.undefined
  
  var zoom: js.UndefOr[Double] = js.undefined
}
object PartialCamera {
  
  @scala.inline
  def apply(): PartialCamera = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialCamera]
  }
  
  @scala.inline
  implicit class PartialCameraMutableBuilder[Self <: PartialCamera] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAltitude(value: Double): Self = StObject.set(x, "altitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAltitudeUndefined: Self = StObject.set(x, "altitude", js.undefined)
    
    @scala.inline
    def setCenter(value: LatLng): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCenterUndefined: Self = StObject.set(x, "center", js.undefined)
    
    @scala.inline
    def setHeading(value: Double): Self = StObject.set(x, "heading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadingUndefined: Self = StObject.set(x, "heading", js.undefined)
    
    @scala.inline
    def setPitch(value: Double): Self = StObject.set(x, "pitch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPitchUndefined: Self = StObject.set(x, "pitch", js.undefined)
    
    @scala.inline
    def setZoom(value: Double): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoomUndefined: Self = StObject.set(x, "zoom", js.undefined)
  }
}
