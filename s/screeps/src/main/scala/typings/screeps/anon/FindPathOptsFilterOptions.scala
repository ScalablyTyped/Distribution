package typings.screeps.anon

import typings.screeps.CostMatrix
import typings.screeps.FIND_STRUCTURES
import typings.screeps.FilterFunction
import typings.screeps.FilterObject
import typings.screeps.RoomPosition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined screeps.FindPathOpts & screeps.FilterOptions<screeps.FIND_STRUCTURES> & {  algorithm ? :string} */
trait FindPathOptsFilterOptions extends js.Object {
  var algorithm: js.UndefOr[String] = js.undefined
  /**
    * An array of the room's objects or RoomPosition objects which should be treated as obstacles during the search. This option cannot
    * be used when the new PathFinder is enabled (use costCallback option instead).
    */
  var avoid: js.UndefOr[js.Array[_ | RoomPosition]] = js.undefined
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
  var filter: FilterFunction[FIND_STRUCTURES] | FilterObject | String
  /**
    * Weight to apply to the heuristic in the A* formula F = G + weight * H. Use this option only if you understand the underlying
    * A* algorithm mechanics! The default value is 1.2.
    */
  var heuristicWeight: js.UndefOr[Double] = js.undefined
  /**
    * An array of the room's objects or RoomPosition objects which should be treated as walkable tiles during the search. This option
    * cannot be used when the new PathFinder is enabled (use costCallback option instead).
    */
  var ignore: js.UndefOr[js.Array[_ | RoomPosition]] = js.undefined
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

object FindPathOptsFilterOptions {
  @scala.inline
  def apply(
    filter: FilterFunction[FIND_STRUCTURES] | FilterObject | String,
    algorithm: String = null,
    avoid: js.Array[_ | RoomPosition] = null,
    costCallback: (/* roomName */ String, /* costMatrix */ CostMatrix) => Unit | CostMatrix = null,
    heuristicWeight: js.UndefOr[Double] = js.undefined,
    ignore: js.Array[_ | RoomPosition] = null,
    ignoreCreeps: js.UndefOr[Boolean] = js.undefined,
    ignoreDestructibleStructures: js.UndefOr[Boolean] = js.undefined,
    ignoreRoads: js.UndefOr[Boolean] = js.undefined,
    maxOps: js.UndefOr[Double] = js.undefined,
    maxRooms: js.UndefOr[Double] = js.undefined,
    plainCost: js.UndefOr[Double] = js.undefined,
    range: js.UndefOr[Double] = js.undefined,
    serialize: js.UndefOr[Boolean] = js.undefined,
    swampCost: js.UndefOr[Double] = js.undefined
  ): FindPathOptsFilterOptions = {
    val __obj = js.Dynamic.literal(filter = filter.asInstanceOf[js.Any])
    if (algorithm != null) __obj.updateDynamic("algorithm")(algorithm.asInstanceOf[js.Any])
    if (avoid != null) __obj.updateDynamic("avoid")(avoid.asInstanceOf[js.Any])
    if (costCallback != null) __obj.updateDynamic("costCallback")(js.Any.fromFunction2(costCallback))
    if (!js.isUndefined(heuristicWeight)) __obj.updateDynamic("heuristicWeight")(heuristicWeight.get.asInstanceOf[js.Any])
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreCreeps)) __obj.updateDynamic("ignoreCreeps")(ignoreCreeps.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreDestructibleStructures)) __obj.updateDynamic("ignoreDestructibleStructures")(ignoreDestructibleStructures.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreRoads)) __obj.updateDynamic("ignoreRoads")(ignoreRoads.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxOps)) __obj.updateDynamic("maxOps")(maxOps.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxRooms)) __obj.updateDynamic("maxRooms")(maxRooms.get.asInstanceOf[js.Any])
    if (!js.isUndefined(plainCost)) __obj.updateDynamic("plainCost")(plainCost.get.asInstanceOf[js.Any])
    if (!js.isUndefined(range)) __obj.updateDynamic("range")(range.get.asInstanceOf[js.Any])
    if (!js.isUndefined(serialize)) __obj.updateDynamic("serialize")(serialize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(swampCost)) __obj.updateDynamic("swampCost")(swampCost.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[FindPathOptsFilterOptions]
  }
}

