package typings.projectOsrmOsrm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Options extends StObject {
  
  /**
    * Limits the search to segments with given bearing in degrees towards true north in clockwise direction. Can be null or an array of [{value},{range}] with integer 0 .. 360,integer 0 .. 180.
    */
  var bearings: js.UndefOr[js.Array[Bearing] | Null] = js.undefined
  
  /**
    * The coordinates this request will use, coordinates as [{lon},{lat}] values, in decimal degrees.
    */
  var coordinates: js.UndefOr[js.Array[Coordinate]] = js.undefined
  
  /**
    * Whether or not adds a Hint to the response which can be used in subsequent requests. (optional, default true)
    */
  var generate_hints: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Hints for the coordinate snapping. Array of base64 encoded strings.
    */
  var hints: js.UndefOr[js.Array[Hint]] = js.undefined
  
  /**
    * Limits the coordinate snapping to streets in the given radius in meters. Can be null (unlimited, default) or double >= 0.
    */
  var radiuses: js.UndefOr[js.Array[Radius] | Null] = js.undefined
  
  /**
    * Removes waypoints from the response. Waypoints are still calculated, but not serialized.
    * Could be useful in case you are interested in some other part of response and do not want to transfer waste data.
    * @default false
    */
  var skip_waypoints: js.UndefOr[Boolean] = js.undefined
}
object Options {
  
  inline def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
    
    inline def setBearings(value: js.Array[Bearing]): Self = StObject.set(x, "bearings", value.asInstanceOf[js.Any])
    
    inline def setBearingsNull: Self = StObject.set(x, "bearings", null)
    
    inline def setBearingsUndefined: Self = StObject.set(x, "bearings", js.undefined)
    
    inline def setBearingsVarargs(value: Bearing*): Self = StObject.set(x, "bearings", js.Array(value*))
    
    inline def setCoordinates(value: js.Array[Coordinate]): Self = StObject.set(x, "coordinates", value.asInstanceOf[js.Any])
    
    inline def setCoordinatesUndefined: Self = StObject.set(x, "coordinates", js.undefined)
    
    inline def setCoordinatesVarargs(value: Coordinate*): Self = StObject.set(x, "coordinates", js.Array(value*))
    
    inline def setGenerate_hints(value: Boolean): Self = StObject.set(x, "generate_hints", value.asInstanceOf[js.Any])
    
    inline def setGenerate_hintsUndefined: Self = StObject.set(x, "generate_hints", js.undefined)
    
    inline def setHints(value: js.Array[Hint]): Self = StObject.set(x, "hints", value.asInstanceOf[js.Any])
    
    inline def setHintsUndefined: Self = StObject.set(x, "hints", js.undefined)
    
    inline def setHintsVarargs(value: Hint*): Self = StObject.set(x, "hints", js.Array(value*))
    
    inline def setRadiuses(value: js.Array[Radius]): Self = StObject.set(x, "radiuses", value.asInstanceOf[js.Any])
    
    inline def setRadiusesNull: Self = StObject.set(x, "radiuses", null)
    
    inline def setRadiusesUndefined: Self = StObject.set(x, "radiuses", js.undefined)
    
    inline def setRadiusesVarargs(value: Radius*): Self = StObject.set(x, "radiuses", js.Array(value*))
    
    inline def setSkip_waypoints(value: Boolean): Self = StObject.set(x, "skip_waypoints", value.asInstanceOf[js.Any])
    
    inline def setSkip_waypointsUndefined: Self = StObject.set(x, "skip_waypoints", js.undefined)
  }
}
