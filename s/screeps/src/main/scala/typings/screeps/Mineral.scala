package typings.screeps

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
  var density: Double
  /**
    * A unique object identifier. You can use `Game.getObjectById` method to retrieve an object instance by its `id`.
    */
  var id: Id[this.type]
  /**
    * The remaining amount of resources.
    */
  var mineralAmount: Double
  /**
    * The resource type, one of the `RESOURCE_*` constants.
    */
  var mineralType: T
  /**
    * The remaining time after which the deposit will be refilled.
    */
  var ticksToRegeneration: Double
}

object Mineral {
  @scala.inline
  def apply[/* <: typings.screeps.MineralConstant */ T](
    density: Double,
    effects: js.Array[RoomObjectEffect],
    id: Id[Mineral[T]],
    mineralAmount: Double,
    mineralType: T,
    pos: RoomPosition,
    ticksToRegeneration: Double,
    room: Room = null
  ): Mineral[T] = {
    val __obj = js.Dynamic.literal(density = density.asInstanceOf[js.Any], effects = effects.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], mineralAmount = mineralAmount.asInstanceOf[js.Any], mineralType = mineralType.asInstanceOf[js.Any], pos = pos.asInstanceOf[js.Any], ticksToRegeneration = ticksToRegeneration.asInstanceOf[js.Any])
    if (room != null) __obj.updateDynamic("room")(room.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mineral[T]]
  }
}

