package typings.projections

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("projections", "braun")
  @js.native
  val braun: Projection = js.native
  
  @JSImport("projections", "centralCylindrical")
  @js.native
  val centralCylindrical: Projection = js.native
  
  @JSImport("projections", "equirectangular")
  @js.native
  val equirectangular: Projection = js.native
  
  @JSImport("projections", "gall")
  @js.native
  val gall: Projection = js.native
  
  @JSImport("projections", "gallPeters")
  @js.native
  val gallPeters: Projection = js.native
  
  @JSImport("projections", "kavrayskiy7")
  @js.native
  val kavrayskiy7: Projection = js.native
  
  @JSImport("projections", "lambert")
  @js.native
  val lambert: Projection = js.native
  
  @JSImport("projections", "mercator")
  @js.native
  val mercator: Projection = js.native
  
  @JSImport("projections", "miller")
  @js.native
  val miller: Projection = js.native
  
  @JSImport("projections", "sinusoidal")
  @js.native
  val sinusoidal: Projection = js.native
  
  @JSImport("projections", "wagner6")
  @js.native
  val wagner6: Projection = js.native
  
  trait Coordinate extends StObject {
    
    var lat: Double
    
    var lon: Double
  }
  object Coordinate {
    
    inline def apply(lat: Double, lon: Double): Coordinate = {
      val __obj = js.Dynamic.literal(lat = lat.asInstanceOf[js.Any], lon = lon.asInstanceOf[js.Any])
      __obj.asInstanceOf[Coordinate]
    }
    
    extension [Self <: Coordinate](x: Self) {
      
      inline def setLat(value: Double): Self = StObject.set(x, "lat", value.asInstanceOf[js.Any])
      
      inline def setLon(value: Double): Self = StObject.set(x, "lon", value.asInstanceOf[js.Any])
    }
  }
  
  trait Point extends StObject {
    
    var x: Double
    
    var y: Double
  }
  object Point {
    
    inline def apply(x: Double, y: Double): Point = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[Point]
    }
    
    extension [Self <: Point](x: Self) {
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Projection extends StObject {
    
    def apply(coordinate: Coordinate): Point = js.native
    def apply(coordinate: Coordinate, options: ProjectionOptions): Point = js.native
    def apply(point: Point): Coordinate = js.native
    def apply(point: Point, options: ProjectionOptions): Coordinate = js.native
  }
  
  trait ProjectionOptions extends StObject {
    
    /**
      * maximum latitude in degrees < 90
      * @default 85
      */
    var latLimit: js.UndefOr[Double] = js.undefined
    
    /**
      * Latitude of the central meridian
      * @default 0
      */
    var meridian: js.UndefOr[Double] = js.undefined
    
    /**
      * longitude of the standard parallel(s)
      * @default 0
      */
    var standardParallel: js.UndefOr[Double] = js.undefined
  }
  object ProjectionOptions {
    
    inline def apply(): ProjectionOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ProjectionOptions]
    }
    
    extension [Self <: ProjectionOptions](x: Self) {
      
      inline def setLatLimit(value: Double): Self = StObject.set(x, "latLimit", value.asInstanceOf[js.Any])
      
      inline def setLatLimitUndefined: Self = StObject.set(x, "latLimit", js.undefined)
      
      inline def setMeridian(value: Double): Self = StObject.set(x, "meridian", value.asInstanceOf[js.Any])
      
      inline def setMeridianUndefined: Self = StObject.set(x, "meridian", js.undefined)
      
      inline def setStandardParallel(value: Double): Self = StObject.set(x, "standardParallel", value.asInstanceOf[js.Any])
      
      inline def setStandardParallelUndefined: Self = StObject.set(x, "standardParallel", js.undefined)
    }
  }
}
