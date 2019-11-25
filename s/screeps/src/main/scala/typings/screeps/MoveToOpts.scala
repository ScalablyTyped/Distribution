package typings.screeps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MoveToOpts extends FindPathOpts {
  /**
    * If this option is set to true, `moveTo` method will return `ERR_NOT_FOUND` if there is no memorized path to reuse. This can
    * significantly save CPU time in some cases. The default value is false.
    */
  var noPathFinding: js.UndefOr[Boolean] = js.undefined
  /**
    * This option enables reusing the path found along multiple game ticks. It allows to save CPU time, but can result in a slightly
    * slower creep reaction behavior. The path is stored into the creep's memory to the `_move` property. The `reusePath` value defines
    * the amount of ticks which the path should be reused for. The default value is 5. Increase the amount to save more CPU, decrease
    * to make the movement more consistent. Set to 0 if you want to disable path reusing.
    */
  var reusePath: js.UndefOr[Double] = js.undefined
  /**
    * If `reusePath` is enabled and this option is set to true, the path will be stored in memory in the short serialized form using
    * `Room.serializePath`. The default value is true.
    */
  var serializeMemory: js.UndefOr[Boolean] = js.undefined
  /**
    * Draw a line along the creep’s path using `RoomVisual.poly`. You can provide either an empty object or custom style parameters.
    */
  var visualizePathStyle: js.UndefOr[PolyStyle] = js.undefined
}

object MoveToOpts {
  @scala.inline
  def apply(
    avoid: js.Array[_ | RoomPosition] = null,
    costCallback: (/* roomName */ String, /* costMatrix */ CostMatrix) => Boolean | CostMatrix = null,
    heuristicWeight: Int | Double = null,
    ignore: js.Array[_ | RoomPosition] = null,
    ignoreCreeps: js.UndefOr[Boolean] = js.undefined,
    ignoreDestructibleStructures: js.UndefOr[Boolean] = js.undefined,
    ignoreRoads: js.UndefOr[Boolean] = js.undefined,
    maxOps: Int | Double = null,
    maxRooms: Int | Double = null,
    noPathFinding: js.UndefOr[Boolean] = js.undefined,
    plainCost: Int | Double = null,
    range: Int | Double = null,
    reusePath: Int | Double = null,
    serialize: js.UndefOr[Boolean] = js.undefined,
    serializeMemory: js.UndefOr[Boolean] = js.undefined,
    swampCost: Int | Double = null,
    visualizePathStyle: PolyStyle = null
  ): MoveToOpts = {
    val __obj = js.Dynamic.literal()
    if (avoid != null) __obj.updateDynamic("avoid")(avoid.asInstanceOf[js.Any])
    if (costCallback != null) __obj.updateDynamic("costCallback")(js.Any.fromFunction2(costCallback))
    if (heuristicWeight != null) __obj.updateDynamic("heuristicWeight")(heuristicWeight.asInstanceOf[js.Any])
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreCreeps)) __obj.updateDynamic("ignoreCreeps")(ignoreCreeps.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreDestructibleStructures)) __obj.updateDynamic("ignoreDestructibleStructures")(ignoreDestructibleStructures.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreRoads)) __obj.updateDynamic("ignoreRoads")(ignoreRoads.asInstanceOf[js.Any])
    if (maxOps != null) __obj.updateDynamic("maxOps")(maxOps.asInstanceOf[js.Any])
    if (maxRooms != null) __obj.updateDynamic("maxRooms")(maxRooms.asInstanceOf[js.Any])
    if (!js.isUndefined(noPathFinding)) __obj.updateDynamic("noPathFinding")(noPathFinding.asInstanceOf[js.Any])
    if (plainCost != null) __obj.updateDynamic("plainCost")(plainCost.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    if (reusePath != null) __obj.updateDynamic("reusePath")(reusePath.asInstanceOf[js.Any])
    if (!js.isUndefined(serialize)) __obj.updateDynamic("serialize")(serialize.asInstanceOf[js.Any])
    if (!js.isUndefined(serializeMemory)) __obj.updateDynamic("serializeMemory")(serializeMemory.asInstanceOf[js.Any])
    if (swampCost != null) __obj.updateDynamic("swampCost")(swampCost.asInstanceOf[js.Any])
    if (visualizePathStyle != null) __obj.updateDynamic("visualizePathStyle")(visualizePathStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[MoveToOpts]
  }
}

