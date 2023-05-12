package typings.projectOsrmOsrm.mod

import typings.projectOsrmOsrm.projectOsrmOsrmStrings.datasources
import typings.projectOsrmOsrm.projectOsrmOsrmStrings.distance
import typings.projectOsrmOsrm.projectOsrmOsrmStrings.duration
import typings.projectOsrmOsrm.projectOsrmOsrmStrings.nodes
import typings.projectOsrmOsrm.projectOsrmOsrmStrings.speed
import typings.projectOsrmOsrm.projectOsrmOsrmStrings.weight
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Map matching matches given GPS points to the road network in the most plausible way. Please note the request might
  * result multiple sub-traces. Large jumps in the timestamps (>60s) or improbable transitions lead to trace splits if
  * a complete matching could not be found. The algorithm might not be able to match all points. Outliers are removed
  * if they can not be matched successfully.
  *
  * https://github.com/Project-OSRM/osrm-backend/blob/master/docs/nodejs/api.md#match
  */
trait MatchOptions
  extends StObject
     with Options {
  
  /**
    * An array with strings of duration, nodes, distance, weight, datasources, speed or boolean for enabling/disabling all. (optional, default false)
    */
  var annotations: js.UndefOr[(js.Array[duration | nodes | distance | weight | datasources | speed]) | Boolean] = js.undefined
  
  /**
    * Which classes to exclude.
    */
  var exclude: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Allows the input track splitting based on huge timestamp gaps between points. Either split or ignore (optional, default split).
    */
  var gaps: js.UndefOr[GapTypes] = js.undefined
  
  /**
    * Returned route geometry format (influences overview and per step). Can also be geojson. (optional, default polyline)
    */
  var geometries: js.UndefOr[GeometriesTypes] = js.undefined
  
  /**
    * Add overview geometry either full, simplified according to highest zoom level it could be display on, or not at all (false). (optional, default simplified)
    */
  var overview: js.UndefOr[OverviewTypes] = js.undefined
  
  /**
    * Standard deviation of GPS precision used for map matching. If applicable use GPS accuracy. Can be null for default value 5 meters or double >= 0.
    */
  @JSName("radiuses")
  var radiuses_MatchOptions: js.UndefOr[js.Array[Double]] = js.undefined
  
  /**
    * Which edges can be snapped to, either default, or any. default only snaps to edges marked by the profile as is_startpoint, any will allow snapping to any edge in the routing graph.
    */
  var snapping: js.UndefOr[SnappingTypes] = js.undefined
  
  /**
    * Return route steps for each route. (optional, default false)
    */
  var steps: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Allows the input track modification to obtain better matching quality for noisy tracks (optional, default false).
    */
  var tidy: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Timestamp of the input location (integers, UNIX-like timestamp).
    */
  var timestamps: js.UndefOr[js.Array[Double]] = js.undefined
  
  /**
    * Indices to coordinates to treat as waypoints. If not supplied, all coordinates are waypoints. Must include first and last coordinate index.
    */
  var waypoints: js.UndefOr[js.Array[Double]] = js.undefined
}
object MatchOptions {
  
  inline def apply(): MatchOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MatchOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MatchOptions] (val x: Self) extends AnyVal {
    
    inline def setAnnotations(value: (js.Array[duration | nodes | distance | weight | datasources | speed]) | Boolean): Self = StObject.set(x, "annotations", value.asInstanceOf[js.Any])
    
    inline def setAnnotationsUndefined: Self = StObject.set(x, "annotations", js.undefined)
    
    inline def setAnnotationsVarargs(value: (duration | nodes | distance | weight | datasources | speed)*): Self = StObject.set(x, "annotations", js.Array(value*))
    
    inline def setExclude(value: js.Array[String]): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
    
    inline def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
    
    inline def setExcludeVarargs(value: String*): Self = StObject.set(x, "exclude", js.Array(value*))
    
    inline def setGaps(value: GapTypes): Self = StObject.set(x, "gaps", value.asInstanceOf[js.Any])
    
    inline def setGapsUndefined: Self = StObject.set(x, "gaps", js.undefined)
    
    inline def setGeometries(value: GeometriesTypes): Self = StObject.set(x, "geometries", value.asInstanceOf[js.Any])
    
    inline def setGeometriesUndefined: Self = StObject.set(x, "geometries", js.undefined)
    
    inline def setOverview(value: OverviewTypes): Self = StObject.set(x, "overview", value.asInstanceOf[js.Any])
    
    inline def setOverviewUndefined: Self = StObject.set(x, "overview", js.undefined)
    
    inline def setRadiuses(value: js.Array[Double]): Self = StObject.set(x, "radiuses", value.asInstanceOf[js.Any])
    
    inline def setRadiusesUndefined: Self = StObject.set(x, "radiuses", js.undefined)
    
    inline def setRadiusesVarargs(value: Double*): Self = StObject.set(x, "radiuses", js.Array(value*))
    
    inline def setSnapping(value: SnappingTypes): Self = StObject.set(x, "snapping", value.asInstanceOf[js.Any])
    
    inline def setSnappingUndefined: Self = StObject.set(x, "snapping", js.undefined)
    
    inline def setSteps(value: Boolean): Self = StObject.set(x, "steps", value.asInstanceOf[js.Any])
    
    inline def setStepsUndefined: Self = StObject.set(x, "steps", js.undefined)
    
    inline def setTidy(value: Boolean): Self = StObject.set(x, "tidy", value.asInstanceOf[js.Any])
    
    inline def setTidyUndefined: Self = StObject.set(x, "tidy", js.undefined)
    
    inline def setTimestamps(value: js.Array[Double]): Self = StObject.set(x, "timestamps", value.asInstanceOf[js.Any])
    
    inline def setTimestampsUndefined: Self = StObject.set(x, "timestamps", js.undefined)
    
    inline def setTimestampsVarargs(value: Double*): Self = StObject.set(x, "timestamps", js.Array(value*))
    
    inline def setWaypoints(value: js.Array[Double]): Self = StObject.set(x, "waypoints", value.asInstanceOf[js.Any])
    
    inline def setWaypointsUndefined: Self = StObject.set(x, "waypoints", js.undefined)
    
    inline def setWaypointsVarargs(value: Double*): Self = StObject.set(x, "waypoints", js.Array(value*))
  }
}
