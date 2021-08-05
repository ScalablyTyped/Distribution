package typings.reactFns

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait IsLoading extends StObject {
    
    var isLoading: Boolean
  }
  object IsLoading {
    
    inline def apply(isLoading: Boolean): IsLoading = {
      val __obj = js.Dynamic.literal(isLoading = isLoading.asInstanceOf[js.Any])
      __obj.asInstanceOf[IsLoading]
    }
    
    extension [Self <: IsLoading](x: Self) {
      
      inline def setIsLoading(value: Boolean): Self = StObject.set(x, "isLoading", value.asInstanceOf[js.Any])
    }
  }
  
  trait Latitude extends StObject {
    
    var latitude: Double
    
    var longitude: Double
  }
  object Latitude {
    
    inline def apply(latitude: Double, longitude: Double): Latitude = {
      val __obj = js.Dynamic.literal(latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any])
      __obj.asInstanceOf[Latitude]
    }
    
    extension [Self <: Latitude](x: Self) {
      
      inline def setLatitude(value: Double): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
      
      inline def setLongitude(value: Double): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<react-fns.react-fns/dist/Scroll/Scroll.ScrollConfig> */
  trait PartialScrollConfig extends StObject {
    
    var throttle: js.UndefOr[Double] = js.undefined
  }
  object PartialScrollConfig {
    
    inline def apply(): PartialScrollConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialScrollConfig]
    }
    
    extension [Self <: PartialScrollConfig](x: Self) {
      
      inline def setThrottle(value: Double): Self = StObject.set(x, "throttle", value.asInstanceOf[js.Any])
      
      inline def setThrottleUndefined: Self = StObject.set(x, "throttle", js.undefined)
    }
  }
  
  /* Inlined std.Partial<react-fns.react-fns/dist/WindowSize/WindowSize.WindowSizeConfig> */
  trait PartialWindowSizeConfig extends StObject {
    
    var throttle: js.UndefOr[Double] = js.undefined
  }
  object PartialWindowSizeConfig {
    
    inline def apply(): PartialWindowSizeConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialWindowSizeConfig]
    }
    
    extension [Self <: PartialWindowSizeConfig](x: Self) {
      
      inline def setThrottle(value: Double): Self = StObject.set(x, "throttle", value.asInstanceOf[js.Any])
      
      inline def setThrottleUndefined: Self = StObject.set(x, "throttle", js.undefined)
    }
  }
}
