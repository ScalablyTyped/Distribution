package typings.screeps.anon

import typings.screeps.CostMatrix
import typings.screeps.FIND_STRUCTURES
import typings.screeps.FilterFunction
import typings.screeps.FilterObject
import typings.screeps.FindClosestByPathAlgorithm
import typings.screeps.RoomPosition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined screeps.FindPathOpts & std.Partial<screeps.FilterOptions<screeps.FIND_STRUCTURES>> & {  algorithm :screeps.FindClosestByPathAlgorithm | undefined} */
@js.native
trait FindPathOptsPartialFilter extends js.Object {
  
  var algorithm: js.UndefOr[FindClosestByPathAlgorithm] = js.native
  
  /**
    * An array of the room's objects or RoomPosition objects which should be treated as obstacles during the search. This option cannot
    * be used when the new PathFinder is enabled (use costCallback option instead).
    */
  var avoid: js.UndefOr[js.Array[_ | RoomPosition]] = js.native
  
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
  ] = js.native
  
  var filter: js.UndefOr[FilterFunction[FIND_STRUCTURES] | FilterObject | String] = js.native
  
  /**
    * Weight to apply to the heuristic in the A* formula F = G + weight * H. Use this option only if you understand the underlying
    * A* algorithm mechanics! The default value is 1.2.
    */
  var heuristicWeight: js.UndefOr[Double] = js.native
  
  /**
    * An array of the room's objects or RoomPosition objects which should be treated as walkable tiles during the search. This option
    * cannot be used when the new PathFinder is enabled (use costCallback option instead).
    */
  var ignore: js.UndefOr[js.Array[_ | RoomPosition]] = js.native
  
  /**
    * Treat squares with creeps as walkable. Can be useful with too many moving creeps around or in some other cases. The default
    * value is false.
    */
  var ignoreCreeps: js.UndefOr[Boolean] = js.native
  
  /**
    * Treat squares with destructible structures (constructed walls, ramparts, spawns, extensions) as walkable. Use this flag when
    * you need to move through a territory blocked by hostile structures. If a creep with an ATTACK body part steps on such a square,
    * it automatically attacks the structure. The default value is false.
    */
  var ignoreDestructibleStructures: js.UndefOr[Boolean] = js.native
  
  /**
    * Ignore road structures. Enabling this option can speed up the search. The default value is false. This is only used when the
    * new PathFinder is enabled.
    */
  var ignoreRoads: js.UndefOr[Boolean] = js.native
  
  /**
    * The maximum limit of possible pathfinding operations. You can limit CPU time used for the search based on ratio 1 op ~ 0.001 CPU.
    * The default value is 2000.
    */
  var maxOps: js.UndefOr[Double] = js.native
  
  /**
    * The maximum allowed rooms to search. The default (and maximum) is 16. This is only used when the new PathFinder is enabled.
    */
  var maxRooms: js.UndefOr[Double] = js.native
  
  /**
    * Cost for walking on plain positions. The default is 1.
    */
  var plainCost: js.UndefOr[Double] = js.native
  
  /**
    * Path to within (range) tiles of target tile. The default is to path to the tile that the target is on (0).
    */
  var range: js.UndefOr[Double] = js.native
  
  /**
    * If true, the result path will be serialized using Room.serializePath. The default is false.
    */
  var serialize: js.UndefOr[Boolean] = js.native
  
  /**
    * Cost for walking on swamp positions. The default is 5.
    */
  var swampCost: js.UndefOr[Double] = js.native
}
object FindPathOptsPartialFilter {
  
  @scala.inline
  def apply(): FindPathOptsPartialFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FindPathOptsPartialFilter]
  }
  
  @scala.inline
  implicit class FindPathOptsPartialFilterOps[Self <: FindPathOptsPartialFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAlgorithm(value: FindClosestByPathAlgorithm): Self = this.set("algorithm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlgorithm: Self = this.set("algorithm", js.undefined)
    
    @scala.inline
    def setAvoidVarargs(value: (js.Any | RoomPosition)*): Self = this.set("avoid", js.Array(value :_*))
    
    @scala.inline
    def setAvoid(value: js.Array[_ | RoomPosition]): Self = this.set("avoid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAvoid: Self = this.set("avoid", js.undefined)
    
    @scala.inline
    def setCostCallback(value: (/* roomName */ String, /* costMatrix */ CostMatrix) => Unit | CostMatrix): Self = this.set("costCallback", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteCostCallback: Self = this.set("costCallback", js.undefined)
    
    @scala.inline
    def setFilterFunction1(
      value: /* import warning: importer.ImportType#apply Failed type conversion: screeps.FindTypes[T] */ /* object */ js.Any => Boolean
    ): Self = this.set("filter", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFilter(value: FilterFunction[FIND_STRUCTURES] | FilterObject | String): Self = this.set("filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    
    @scala.inline
    def setHeuristicWeight(value: Double): Self = this.set("heuristicWeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeuristicWeight: Self = this.set("heuristicWeight", js.undefined)
    
    @scala.inline
    def setIgnoreVarargs(value: (js.Any | RoomPosition)*): Self = this.set("ignore", js.Array(value :_*))
    
    @scala.inline
    def setIgnore(value: js.Array[_ | RoomPosition]): Self = this.set("ignore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnore: Self = this.set("ignore", js.undefined)
    
    @scala.inline
    def setIgnoreCreeps(value: Boolean): Self = this.set("ignoreCreeps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreCreeps: Self = this.set("ignoreCreeps", js.undefined)
    
    @scala.inline
    def setIgnoreDestructibleStructures(value: Boolean): Self = this.set("ignoreDestructibleStructures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreDestructibleStructures: Self = this.set("ignoreDestructibleStructures", js.undefined)
    
    @scala.inline
    def setIgnoreRoads(value: Boolean): Self = this.set("ignoreRoads", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreRoads: Self = this.set("ignoreRoads", js.undefined)
    
    @scala.inline
    def setMaxOps(value: Double): Self = this.set("maxOps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxOps: Self = this.set("maxOps", js.undefined)
    
    @scala.inline
    def setMaxRooms(value: Double): Self = this.set("maxRooms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxRooms: Self = this.set("maxRooms", js.undefined)
    
    @scala.inline
    def setPlainCost(value: Double): Self = this.set("plainCost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlainCost: Self = this.set("plainCost", js.undefined)
    
    @scala.inline
    def setRange(value: Double): Self = this.set("range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRange: Self = this.set("range", js.undefined)
    
    @scala.inline
    def setSerialize(value: Boolean): Self = this.set("serialize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSerialize: Self = this.set("serialize", js.undefined)
    
    @scala.inline
    def setSwampCost(value: Double): Self = this.set("swampCost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSwampCost: Self = this.set("swampCost", js.undefined)
  }
}
