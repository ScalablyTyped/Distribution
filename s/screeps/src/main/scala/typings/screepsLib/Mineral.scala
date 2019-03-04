package typings
package screepsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A mineral deposit object. Can be harvested by creeps with a WORK body part using the extractor structure.
  * @see http://docs.screeps.com/api/#Mineral
  */
trait Mineral[T /* <: MineralConstant */] extends RoomObject {
  /**
    * The density of this mineral deposit, one of the `DENSITY_*` constants.
    */
  var density: scala.Double
  /**
    * A unique object identifier. You can use `Game.getObjectById` method to retrieve an object instance by its `id`.
    */
  var id: java.lang.String
  /**
    * The remaining amount of resources.
    */
  var mineralAmount: scala.Double
  /**
    * The resource type, one of the `RESOURCE_*` constants.
    */
  var mineralType: T
  /**
    * The remaining time after which the deposit will be refilled.
    */
  var ticksToRegeneration: scala.Double
}

object Mineral {
  @scala.inline
  def apply[T /* <: MineralConstant */](
    density: scala.Double,
    id: java.lang.String,
    mineralAmount: scala.Double,
    mineralType: T,
    pos: RoomPosition,
    ticksToRegeneration: scala.Double,
    room: Room = null
  ): Mineral[T] = {
    val __obj = js.Dynamic.literal(density = density, id = id, mineralAmount = mineralAmount, mineralType = mineralType.asInstanceOf[js.Any], pos = pos, ticksToRegeneration = ticksToRegeneration)
    if (room != null) __obj.updateDynamic("room")(room)
    __obj.asInstanceOf[Mineral[T]]
  }
}

