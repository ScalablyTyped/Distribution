package typings.screeps.anon

import typings.screeps.CostMatrix
import typings.screeps.FIND_STRUCTURES
import typings.screeps.FilterFunction
import typings.screeps.FilterObject
import typings.screeps.FindClosestByPathAlgorithm
import typings.screeps.RoomPosition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined screeps.FindPathOpts & std.Partial<screeps.FilterOptions<screeps.FIND_STRUCTURES>> & {  algorithm :screeps.FindClosestByPathAlgorithm | undefined} */
trait FindPathOptsPartialFilter extends StObject {
  
  var algorithm: js.UndefOr[FindClosestByPathAlgorithm] = js.undefined
  
  /**
    * An array of the room's objects or RoomPosition objects which should be treated as obstacles during the search. This option cannot
    * be used when the new PathFinder is enabled (use costCallback option instead).
    */
  var avoid: js.UndefOr[js.Array[js.Any | RoomPosition]] = js.undefined
  
  /**
    * You can use this callback to modify a CostMatrix for any room during the search. The callback accepts two arguments, roomName
    * and costMatrix. Use the costMatrix instance to make changes to the positions costs. If you return a new matrix from this callback,
    * it will be used instead of the built-in cached one. This option is only used when the new PathFinder is enabled.
    *
    * @param roomName The name of the room.
    * @param costMatrix The current CostMatrix
    * @returns The new CostMatrix to use
    */
  var costCallback: js.UndefOr[
    js.Function2[/* roomName */ String, /* costMatrix */ CostMatrix, Unit | CostMatrix]
  ] = js.undefined
  
  var filter: js.UndefOr[FilterFunction[FIND_STRUCTURES] | FilterObject | String] = js.undefined
  
  /**
    * Weight to apply to the heuristic in the A* formula F = G + weight * H. Use this option only if you understand the underlying
    * A* algorithm mechanics! The default value is 1.2.
    */
  var heuristicWeight: js.UndefOr[Double] = js.undefined
  
  /**
    * An array of the room's objects or RoomPosition objects which should be treated as walkable tiles during the search. This option
    * cannot be used when the new PathFinder is enabled (use costCallback option instead).
    */
  var ignore: js.UndefOr[js.Array[js.Any | RoomPosition]] = js.undefined
  
  /**
    * Treat squares with creeps as walkable. Can be useful with too many moving creeps around or in some other cases. The default
    * value is false.
    */
  var ignoreCreeps: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Treat squares with destructible structures (constructed walls, ramparts, spawns, extensions) as walkable. Use this flag when
    * you need to move through a territory blocked by hostile structures. If a creep with an ATTACK body part steps on such a square,
    * it automatically attacks the structure. The default value is false.
    */
  var ignoreDestructibleStructures: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Ignore road structures. Enabling this option can speed up the search. The default value is false. This is only used when the
    * new PathFinder is enabled.
    */
  var ignoreRoads: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The maximum limit of possible pathfinding operations. You can limit CPU time used for the search based on ratio 1 op ~ 0.001 CPU.
    * The default value is 2000.
    */
  var maxOps: js.UndefOr[Double] = js.undefined
  
  /**
    * The maximum allowed rooms to search. The default (and maximum) is 16. This is only used when the new PathFinder is enabled.
    */
  var maxRooms: js.UndefOr[Double] = js.undefined
  
  /**
    * Cost for walking on plain positions. The default is 1.
    */
  var plainCost: js.UndefOr[Double] = js.undefined
  
  /**
    * Path to within (range) tiles of target tile. The default is to path to the tile that the target is on (0).
    */
  var range: js.UndefOr[Double] = js.undefined
  
  /**
    * If true, the result path will be serialized using Room.serializePath. The default is false.
    */
  var serialize: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Cost for walking on swamp positions. The default is 5.
    */
  var swampCost: js.UndefOr[Double] = js.undefined
}
object FindPathOptsPartialFilter {
  
  inline def apply(): FindPathOptsPartialFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FindPathOptsPartialFilter]
  }
  
  extension [Self <: FindPathOptsPartialFilter](x: Self) {
    
    inline def setAlgorithm(value: FindClosestByPathAlgorithm): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
    
    inline def setAlgorithmUndefined: Self = StObject.set(x, "algorithm", js.undefined)
    
    inline def setAvoid(value: js.Array[js.Any | RoomPosition]): Self = StObject.set(x, "avoid", value.asInstanceOf[js.Any])
    
    inline def setAvoidUndefined: Self = StObject.set(x, "avoid", js.undefined)
    
    inline def setAvoidVarargs(value: (js.Any | RoomPosition)*): Self = StObject.set(x, "avoid", js.Array(value :_*))
    
    inline def setCostCallback(value: (/* roomName */ String, /* costMatrix */ CostMatrix) => Unit | CostMatrix): Self = StObject.set(x, "costCallback", js.Any.fromFunction2(value))
    
    inline def setCostCallbackUndefined: Self = StObject.set(x, "costCallback", js.undefined)
    
    inline def setFilter(value: FilterFunction[FIND_STRUCTURES] | FilterObject | String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterFunction1(
      value: /* import warning: importer.ImportType#apply Failed type conversion: screeps.FindTypes[T] */ /* object */ js.Any => Boolean
    ): Self = StObject.set(x, "filter", js.Any.fromFunction1(value))
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setHeuristicWeight(value: Double): Self = StObject.set(x, "heuristicWeight", value.asInstanceOf[js.Any])
    
    inline def setHeuristicWeightUndefined: Self = StObject.set(x, "heuristicWeight", js.undefined)
    
    inline def setIgnore(value: js.Array[js.Any | RoomPosition]): Self = StObject.set(x, "ignore", value.asInstanceOf[js.Any])
    
    inline def setIgnoreCreeps(value: Boolean): Self = StObject.set(x, "ignoreCreeps", value.asInstanceOf[js.Any])
    
    inline def setIgnoreCreepsUndefined: Self = StObject.set(x, "ignoreCreeps", js.undefined)
    
    inline def setIgnoreDestructibleStructures(value: Boolean): Self = StObject.set(x, "ignoreDestructibleStructures", value.asInstanceOf[js.Any])
    
    inline def setIgnoreDestructibleStructuresUndefined: Self = StObject.set(x, "ignoreDestructibleStructures", js.undefined)
    
    inline def setIgnoreRoads(value: Boolean): Self = StObject.set(x, "ignoreRoads", value.asInstanceOf[js.Any])
    
    inline def setIgnoreRoadsUndefined: Self = StObject.set(x, "ignoreRoads", js.undefined)
    
    inline def setIgnoreUndefined: Self = StObject.set(x, "ignore", js.undefined)
    
    inline def setIgnoreVarargs(value: (js.Any | RoomPosition)*): Self = StObject.set(x, "ignore", js.Array(value :_*))
    
    inline def setMaxOps(value: Double): Self = StObject.set(x, "maxOps", value.asInstanceOf[js.Any])
    
    inline def setMaxOpsUndefined: Self = StObject.set(x, "maxOps", js.undefined)
    
    inline def setMaxRooms(value: Double): Self = StObject.set(x, "maxRooms", value.asInstanceOf[js.Any])
    
    inline def setMaxRoomsUndefined: Self = StObject.set(x, "maxRooms", js.undefined)
    
    inline def setPlainCost(value: Double): Self = StObject.set(x, "plainCost", value.asInstanceOf[js.Any])
    
    inline def setPlainCostUndefined: Self = StObject.set(x, "plainCost", js.undefined)
    
    inline def setRange(value: Double): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
    
    inline def setSerialize(value: Boolean): Self = StObject.set(x, "serialize", value.asInstanceOf[js.Any])
    
    inline def setSerializeUndefined: Self = StObject.set(x, "serialize", js.undefined)
    
    inline def setSwampCost(value: Double): Self = StObject.set(x, "swampCost", value.asInstanceOf[js.Any])
    
    inline def setSwampCostUndefined: Self = StObject.set(x, "swampCost", js.undefined)
  }
}
