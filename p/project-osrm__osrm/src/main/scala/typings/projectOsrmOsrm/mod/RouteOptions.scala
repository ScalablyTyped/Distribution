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
  * Returns the fastest route between two or more coordinates while visiting the waypoints in order.
  *
  * https://github.com/Project-OSRM/osrm-backend/blob/master/docs/nodejs/api.md#route
  */
trait RouteOptions
  extends StObject
     with Options {
  
  /**
    * Boolean: Search for alternative routes. (optional, default false)
    * Number: Search for up to this many alternative routes. Please note that even if alternative routes are requested, a result cannot be guaranteed. (optional, default 0)
    */
  var alternatives: js.UndefOr[Boolean | Double] = js.undefined
  
  /**
    * An array with strings of duration, nodes, distance, weight, datasources, speed or boolean for enabling/disabling all. (optional, default false)
    */
  var annotations: js.UndefOr[Boolean | (js.Array[duration | nodes | distance | weight | datasources | speed])] = js.undefined
  
  /**
    * Keep waypoints on curb side. Can be null (unrestricted, default) or curb.
    */
  var approaches: js.UndefOr[js.Array[ApproachTypes] | Null] = js.undefined
  
  /**
    * Forces the route to keep going straight at waypoints and don't do a uturn even if it would be faster. Default value depends on the profile.
    */
  var continue_straight: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Which classes to exclude.
    */
  var exclude: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Returned route geometry format (influences overview and per step). Can also be geojson. (optional, default polyline)
    */
  var geometries: js.UndefOr[GeometriesTypes] = js.undefined
  
  /**
    * Add overview geometry either full, simplified according to highest zoom level it could be display on, or not at all (false). (optional, default simplified)
    */
  var overview: js.UndefOr[OverviewTypes] = js.undefined
  
  /**
    * Which edges can be snapped to, either default, or any. default only snaps to edges marked by the profile as is_startpoint, any will allow snapping to any edge in the routing graph.
    */
  var snapping: js.UndefOr[SnappingTypes] = js.undefined
  
  /**
    * Return route steps for each route leg. (optional, default false)
    */
  var steps: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indices to coordinates to treat as waypoints. If not supplied, all coordinates are waypoints. Must include first and last coordinate index. null/true/false
    */
  var waypoints: js.UndefOr[js.Array[Double]] = js.undefined
}
object RouteOptions {
  
  inline def apply(): RouteOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RouteOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RouteOptions] (val x: Self) extends AnyVal {
    
    inline def setAlternatives(value: Boolean | Double): Self = StObject.set(x, "alternatives", value.asInstanceOf[js.Any])
    
    inline def setAlternativesUndefined: Self = StObject.set(x, "alternatives", js.undefined)
    
    inline def setAnnotations(value: Boolean | (js.Array[duration | nodes | distance | weight | datasources | speed])): Self = StObject.set(x, "annotations", value.asInstanceOf[js.Any])
    
    inline def setAnnotationsUndefined: Self = StObject.set(x, "annotations", js.undefined)
    
    inline def setAnnotationsVarargs(value: (duration | nodes | distance | weight | datasources | speed)*): Self = StObject.set(x, "annotations", js.Array(value*))
    
    inline def setApproaches(value: js.Array[ApproachTypes]): Self = StObject.set(x, "approaches", value.asInstanceOf[js.Any])
    
    inline def setApproachesNull: Self = StObject.set(x, "approaches", null)
    
    inline def setApproachesUndefined: Self = StObject.set(x, "approaches", js.undefined)
    
    inline def setApproachesVarargs(value: ApproachTypes*): Self = StObject.set(x, "approaches", js.Array(value*))
    
    inline def setContinue_straight(value: Boolean): Self = StObject.set(x, "continue_straight", value.asInstanceOf[js.Any])
    
    inline def setContinue_straightUndefined: Self = StObject.set(x, "continue_straight", js.undefined)
    
    inline def setExclude(value: js.Array[String]): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
    
    inline def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
    
    inline def setExcludeVarargs(value: String*): Self = StObject.set(x, "exclude", js.Array(value*))
    
    inline def setGeometries(value: GeometriesTypes): Self = StObject.set(x, "geometries", value.asInstanceOf[js.Any])
    
    inline def setGeometriesUndefined: Self = StObject.set(x, "geometries", js.undefined)
    
    inline def setOverview(value: OverviewTypes): Self = StObject.set(x, "overview", value.asInstanceOf[js.Any])
    
    inline def setOverviewUndefined: Self = StObject.set(x, "overview", js.undefined)
    
    inline def setSnapping(value: SnappingTypes): Self = StObject.set(x, "snapping", value.asInstanceOf[js.Any])
    
    inline def setSnappingUndefined: Self = StObject.set(x, "snapping", js.undefined)
    
    inline def setSteps(value: Boolean): Self = StObject.set(x, "steps", value.asInstanceOf[js.Any])
    
    inline def setStepsUndefined: Self = StObject.set(x, "steps", js.undefined)
    
    inline def setWaypoints(value: js.Array[Double]): Self = StObject.set(x, "waypoints", value.asInstanceOf[js.Any])
    
    inline def setWaypointsUndefined: Self = StObject.set(x, "waypoints", js.undefined)
    
    inline def setWaypointsVarargs(value: Double*): Self = StObject.set(x, "waypoints", js.Array(value*))
  }
}
