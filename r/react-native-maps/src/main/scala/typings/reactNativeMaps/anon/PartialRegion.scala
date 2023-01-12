package typings.reactNativeMaps.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<react-native-maps.react-native-maps/lib/sharedTypes.Region> */
trait PartialRegion extends StObject {
  
  var latitude: js.UndefOr[Double] = js.undefined
  
  var latitudeDelta: js.UndefOr[Double] = js.undefined
  
  var longitude: js.UndefOr[Double] = js.undefined
  
  var longitudeDelta: js.UndefOr[Double] = js.undefined
}
object PartialRegion {
  
  inline def apply(): PartialRegion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialRegion]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialRegion] (val x: Self) extends AnyVal {
    
    inline def setLatitude(value: Double): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
    
    inline def setLatitudeDelta(value: Double): Self = StObject.set(x, "latitudeDelta", value.asInstanceOf[js.Any])
    
    inline def setLatitudeDeltaUndefined: Self = StObject.set(x, "latitudeDelta", js.undefined)
    
    inline def setLatitudeUndefined: Self = StObject.set(x, "latitude", js.undefined)
    
    inline def setLongitude(value: Double): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
    
    inline def setLongitudeDelta(value: Double): Self = StObject.set(x, "longitudeDelta", value.asInstanceOf[js.Any])
    
    inline def setLongitudeDeltaUndefined: Self = StObject.set(x, "longitudeDelta", js.undefined)
    
    inline def setLongitudeUndefined: Self = StObject.set(x, "longitude", js.undefined)
  }
}
