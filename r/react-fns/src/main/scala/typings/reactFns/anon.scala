package typings.reactFns

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait IsLoading extends StObject {
    
    var isLoading: Boolean = js.native
  }
  object IsLoading {
    
    @scala.inline
    def apply(isLoading: Boolean): IsLoading = {
      val __obj = js.Dynamic.literal(isLoading = isLoading.asInstanceOf[js.Any])
      __obj.asInstanceOf[IsLoading]
    }
    
    @scala.inline
    implicit class IsLoadingMutableBuilder[Self <: IsLoading] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsLoading(value: Boolean): Self = StObject.set(x, "isLoading", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Latitude extends StObject {
    
    var latitude: Double = js.native
    
    var longitude: Double = js.native
  }
  object Latitude {
    
    @scala.inline
    def apply(latitude: Double, longitude: Double): Latitude = {
      val __obj = js.Dynamic.literal(latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any])
      __obj.asInstanceOf[Latitude]
    }
    
    @scala.inline
    implicit class LatitudeMutableBuilder[Self <: Latitude] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLatitude(value: Double): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLongitude(value: Double): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<react-fns.react-fns/dist/Scroll/Scroll.ScrollConfig> */
  @js.native
  trait PartialScrollConfig extends StObject {
    
    var throttle: js.UndefOr[Double] = js.native
  }
  object PartialScrollConfig {
    
    @scala.inline
    def apply(): PartialScrollConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialScrollConfig]
    }
    
    @scala.inline
    implicit class PartialScrollConfigMutableBuilder[Self <: PartialScrollConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setThrottle(value: Double): Self = StObject.set(x, "throttle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThrottleUndefined: Self = StObject.set(x, "throttle", js.undefined)
    }
  }
  
  /* Inlined std.Partial<react-fns.react-fns/dist/WindowSize/WindowSize.WindowSizeConfig> */
  @js.native
  trait PartialWindowSizeConfig extends StObject {
    
    var throttle: js.UndefOr[Double] = js.native
  }
  object PartialWindowSizeConfig {
    
    @scala.inline
    def apply(): PartialWindowSizeConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialWindowSizeConfig]
    }
    
    @scala.inline
    implicit class PartialWindowSizeConfigMutableBuilder[Self <: PartialWindowSizeConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setThrottle(value: Double): Self = StObject.set(x, "throttle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThrottleUndefined: Self = StObject.set(x, "throttle", js.undefined)
    }
  }
}
