package typings.projectOsrmOsrm.mod

import typings.projectOsrmOsrm.projectOsrmOsrmStrings.any
import typings.projectOsrmOsrm.projectOsrmOsrmStrings.datasources
import typings.projectOsrmOsrm.projectOsrmOsrmStrings.distance
import typings.projectOsrmOsrm.projectOsrmOsrmStrings.duration
import typings.projectOsrmOsrm.projectOsrmOsrmStrings.first
import typings.projectOsrmOsrm.projectOsrmOsrmStrings.last
import typings.projectOsrmOsrm.projectOsrmOsrmStrings.nodes
import typings.projectOsrmOsrm.projectOsrmOsrmStrings.speed
import typings.projectOsrmOsrm.projectOsrmOsrmStrings.weight
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The trip plugin solves the Traveling Salesman Problem using a greedy heuristic (farthest-insertion algorithm) for
  * 10 or _ more waypoints and uses brute force for less than 10 waypoints. The returned path does not have to be the
  * shortest path, _ as TSP is NP-hard it is only an approximation.
  *
  * https://github.com/Project-OSRM/osrm-backend/blob/master/docs/nodejs/api.md#trip
  */
trait TripOptions
  extends StObject
     with Options {
  
  /**
    * An array with strings of duration, nodes, distance, weight, datasources, speed or boolean for enabling/disabling all. (optional, default false)
    */
  var annotations: js.UndefOr[(js.Array[duration | nodes | distance | weight | datasources | speed]) | Boolean] = js.undefined
  
  /**
    * Keep waypoints on curb side. Can be null (unrestricted, default) or curb.
    */
  var approaches: js.UndefOr[ApproachTypes | Null] = js.undefined
  
  /**
    * Return route ends at any or last coordinate. (optional, default any)
    */
  var destination: js.UndefOr[any | last] = js.undefined
  
  /**
    * Which classes to exclude.
    */
  var exclude: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Returned route geometry format (influences overview and per step). Can also be geojson. (optional, default polyline)
    */
  var geometries: js.UndefOr[GeometriesTypes] = js.undefined
  
  /**
    * Add overview geometry either full, simplified (optional, default simplified)
    */
  var overview: js.UndefOr[OverviewTypes] = js.undefined
  
  /**
    * Return route is a roundtrip. (optional, default true)
    */
  var roundtrip: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Which edges can be snapped to, either default, or any. default only snaps to edges marked by the profile as is_startpoint, any will allow snapping to any edge in the routing graph.
    */
  var snapping: js.UndefOr[SnappingTypes] = js.undefined
  
  /**
    * Return route starts at any or first coordinate. (optional, default any)
    */
  var source: js.UndefOr[any | first] = js.undefined
  
  /**
    * Return route steps for each route. (optional, default false)
    */
  var steps: js.UndefOr[Boolean] = js.undefined
}
object TripOptions {
  
  inline def apply(): TripOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TripOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TripOptions] (val x: Self) extends AnyVal {
    
    inline def setAnnotations(value: (js.Array[duration | nodes | distance | weight | datasources | speed]) | Boolean): Self = StObject.set(x, "annotations", value.asInstanceOf[js.Any])
    
    inline def setAnnotationsUndefined: Self = StObject.set(x, "annotations", js.undefined)
    
    inline def setAnnotationsVarargs(value: (duration | nodes | distance | weight | datasources | speed)*): Self = StObject.set(x, "annotations", js.Array(value*))
    
    inline def setApproaches(value: ApproachTypes): Self = StObject.set(x, "approaches", value.asInstanceOf[js.Any])
    
    inline def setApproachesNull: Self = StObject.set(x, "approaches", null)
    
    inline def setApproachesUndefined: Self = StObject.set(x, "approaches", js.undefined)
    
    inline def setDestination(value: any | last): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
    
    inline def setDestinationUndefined: Self = StObject.set(x, "destination", js.undefined)
    
    inline def setExclude(value: js.Array[String]): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
    
    inline def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
    
    inline def setExcludeVarargs(value: String*): Self = StObject.set(x, "exclude", js.Array(value*))
    
    inline def setGeometries(value: GeometriesTypes): Self = StObject.set(x, "geometries", value.asInstanceOf[js.Any])
    
    inline def setGeometriesUndefined: Self = StObject.set(x, "geometries", js.undefined)
    
    inline def setOverview(value: OverviewTypes): Self = StObject.set(x, "overview", value.asInstanceOf[js.Any])
    
    inline def setOverviewUndefined: Self = StObject.set(x, "overview", js.undefined)
    
    inline def setRoundtrip(value: Boolean): Self = StObject.set(x, "roundtrip", value.asInstanceOf[js.Any])
    
    inline def setRoundtripUndefined: Self = StObject.set(x, "roundtrip", js.undefined)
    
    inline def setSnapping(value: SnappingTypes): Self = StObject.set(x, "snapping", value.asInstanceOf[js.Any])
    
    inline def setSnappingUndefined: Self = StObject.set(x, "snapping", js.undefined)
    
    inline def setSource(value: any | first): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setSteps(value: Boolean): Self = StObject.set(x, "steps", value.asInstanceOf[js.Any])
    
    inline def setStepsUndefined: Self = StObject.set(x, "steps", js.undefined)
  }
}
