package typings.screeps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An object containing additional pathfinding flags.
  */
trait PathFinderOpts extends StObject {
  
  /**
    * Instead of searching for a path to the goals this will search for a path away from the goals.
    * The cheapest path that is out of range of every goal will be returned. The default is false.
    */
  var flee: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Weight to apply to the heuristic in the A* formula F = G + weight * H. Use this option only if you understand
    * the underlying A* algorithm mechanics! The default value is 1.
    */
  var heuristicWeight: js.UndefOr[Double] = js.undefined
  
  /**
    * The maximum allowed cost of the path returned. If at any point the pathfinder detects that it is impossible to find
    * a path with a cost less than or equal to maxCost it will immediately halt the search. The default is Infinity.
    */
  var maxCost: js.UndefOr[Double] = js.undefined
  
  /**
    * The maximum allowed pathfinding operations. You can limit CPU time used for the search based on ratio 1 op ~ 0.001 CPU. The default value is 2000.
    */
  var maxOps: js.UndefOr[Double] = js.undefined
  
  /**
    * The maximum allowed rooms to search. The default (and maximum) is 16.
    */
  var maxRooms: js.UndefOr[Double] = js.undefined
  
  /**
    * Cost for walking on plain positions. The default is 1.
    */
  var plainCost: js.UndefOr[Double] = js.undefined
  
  /**
    * Request from the pathfinder to generate a CostMatrix for a certain room. The callback accepts one argument, roomName.
    * This callback will only be called once per room per search. If you are running multiple pathfinding operations in a
    * single room and in a single tick you may consider caching your CostMatrix to speed up your code. Please read the
    * CostMatrix documentation below for more information on CostMatrix.
    *
    * @param roomName The name of the room the pathfinder needs a cost matrix for.
    */
  var roomCallback: js.UndefOr[js.Function1[/* roomName */ String, Boolean | CostMatrix]] = js.undefined
  
  /**
    * Cost for walking on swamp positions. The default is 5.
    */
  var swampCost: js.UndefOr[Double] = js.undefined
}
object PathFinderOpts {
  
  @scala.inline
  def apply(): PathFinderOpts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PathFinderOpts]
  }
  
  @scala.inline
  implicit class PathFinderOptsMutableBuilder[Self <: PathFinderOpts] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFlee(value: Boolean): Self = StObject.set(x, "flee", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFleeUndefined: Self = StObject.set(x, "flee", js.undefined)
    
    @scala.inline
    def setHeuristicWeight(value: Double): Self = StObject.set(x, "heuristicWeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeuristicWeightUndefined: Self = StObject.set(x, "heuristicWeight", js.undefined)
    
    @scala.inline
    def setMaxCost(value: Double): Self = StObject.set(x, "maxCost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxCostUndefined: Self = StObject.set(x, "maxCost", js.undefined)
    
    @scala.inline
    def setMaxOps(value: Double): Self = StObject.set(x, "maxOps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxOpsUndefined: Self = StObject.set(x, "maxOps", js.undefined)
    
    @scala.inline
    def setMaxRooms(value: Double): Self = StObject.set(x, "maxRooms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxRoomsUndefined: Self = StObject.set(x, "maxRooms", js.undefined)
    
    @scala.inline
    def setPlainCost(value: Double): Self = StObject.set(x, "plainCost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlainCostUndefined: Self = StObject.set(x, "plainCost", js.undefined)
    
    @scala.inline
    def setRoomCallback(value: /* roomName */ String => Boolean | CostMatrix): Self = StObject.set(x, "roomCallback", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRoomCallbackUndefined: Self = StObject.set(x, "roomCallback", js.undefined)
    
    @scala.inline
    def setSwampCost(value: Double): Self = StObject.set(x, "swampCost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSwampCostUndefined: Self = StObject.set(x, "swampCost", js.undefined)
  }
}
