package typings.screeps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An object containing:
  * path - An array of RoomPosition objects.
  * ops - Total number of operations performed before this path was calculated.
  * cost - The total cost of the path as derived from `plainCost`, `swampCost` and any given CostMatrix instances.
  * incomplete - If the pathfinder fails to find a complete path, this will be true.
  *   Note that `path` will still be populated with a partial path which represents the closest path it could find given the search parameters.
  */
trait PathFinderPath extends StObject {
  
  /**
    * The total cost of the path as derived from `plainCost`, `swampCost` and any given CostMatrix instances.
    */
  var cost: Double
  
  /**
    * If the pathfinder fails to find a complete path, this will be true.
    *
    * Note that `path` will still be populated with a partial path which represents the closest path it could find given the search parameters.
    */
  var incomplete: Boolean
  
  /**
    * Total number of operations performed before this path was calculated.
    */
  var ops: Double
  
  /**
    * An array of RoomPosition objects.
    */
  var path: js.Array[RoomPosition]
}
object PathFinderPath {
  
  inline def apply(cost: Double, incomplete: Boolean, ops: Double, path: js.Array[RoomPosition]): PathFinderPath = {
    val __obj = js.Dynamic.literal(cost = cost.asInstanceOf[js.Any], incomplete = incomplete.asInstanceOf[js.Any], ops = ops.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathFinderPath]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathFinderPath] (val x: Self) extends AnyVal {
    
    inline def setCost(value: Double): Self = StObject.set(x, "cost", value.asInstanceOf[js.Any])
    
    inline def setIncomplete(value: Boolean): Self = StObject.set(x, "incomplete", value.asInstanceOf[js.Any])
    
    inline def setOps(value: Double): Self = StObject.set(x, "ops", value.asInstanceOf[js.Any])
    
    inline def setPath(value: js.Array[RoomPosition]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathVarargs(value: RoomPosition*): Self = StObject.set(x, "path", js.Array(value*))
  }
}
