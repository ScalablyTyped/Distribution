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
    costCallback: (/* roomName */ String, /* costMatrix */ CostMatrix) => Unit | CostMatrix = null,
    heuristicWeight: js.UndefOr[Double] = js.undefined,
    ignore: js.Array[_ | RoomPosition] = null,
    ignoreCreeps: js.UndefOr[Boolean] = js.undefined,
    ignoreDestructibleStructures: js.UndefOr[Boolean] = js.undefined,
    ignoreRoads: js.UndefOr[Boolean] = js.undefined,
    maxOps: js.UndefOr[Double] = js.undefined,
    maxRooms: js.UndefOr[Double] = js.undefined,
    noPathFinding: js.UndefOr[Boolean] = js.undefined,
    plainCost: js.UndefOr[Double] = js.undefined,
    range: js.UndefOr[Double] = js.undefined,
    reusePath: js.UndefOr[Double] = js.undefined,
    serialize: js.UndefOr[Boolean] = js.undefined,
    serializeMemory: js.UndefOr[Boolean] = js.undefined,
    swampCost: js.UndefOr[Double] = js.undefined,
    visualizePathStyle: PolyStyle = null
  ): MoveToOpts = {
    val __obj = js.Dynamic.literal()
    if (avoid != null) __obj.updateDynamic("avoid")(avoid.asInstanceOf[js.Any])
    if (costCallback != null) __obj.updateDynamic("costCallback")(js.Any.fromFunction2(costCallback))
    if (!js.isUndefined(heuristicWeight)) __obj.updateDynamic("heuristicWeight")(heuristicWeight.get.asInstanceOf[js.Any])
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreCreeps)) __obj.updateDynamic("ignoreCreeps")(ignoreCreeps.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreDestructibleStructures)) __obj.updateDynamic("ignoreDestructibleStructures")(ignoreDestructibleStructures.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreRoads)) __obj.updateDynamic("ignoreRoads")(ignoreRoads.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxOps)) __obj.updateDynamic("maxOps")(maxOps.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxRooms)) __obj.updateDynamic("maxRooms")(maxRooms.get.asInstanceOf[js.Any])
    if (!js.isUndefined(noPathFinding)) __obj.updateDynamic("noPathFinding")(noPathFinding.get.asInstanceOf[js.Any])
    if (!js.isUndefined(plainCost)) __obj.updateDynamic("plainCost")(plainCost.get.asInstanceOf[js.Any])
    if (!js.isUndefined(range)) __obj.updateDynamic("range")(range.get.asInstanceOf[js.Any])
    if (!js.isUndefined(reusePath)) __obj.updateDynamic("reusePath")(reusePath.get.asInstanceOf[js.Any])
    if (!js.isUndefined(serialize)) __obj.updateDynamic("serialize")(serialize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(serializeMemory)) __obj.updateDynamic("serializeMemory")(serializeMemory.get.asInstanceOf[js.Any])
    if (!js.isUndefined(swampCost)) __obj.updateDynamic("swampCost")(swampCost.get.asInstanceOf[js.Any])
    if (visualizePathStyle != null) __obj.updateDynamic("visualizePathStyle")(visualizePathStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[MoveToOpts]
  }
}

