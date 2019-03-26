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

@JSGlobal("Mineral")
@js.native
class MineralCls protected () extends Mineral[MineralConstant] {
  def this(id: java.lang.String) = this()
  /**
    * The density of this mineral deposit, one of the `DENSITY_*` constants.
    */
  /* CompleteClass */
  override var density: scala.Double = js.native
  /**
    * A unique object identifier. You can use `Game.getObjectById` method to retrieve an object instance by its `id`.
    */
  /* CompleteClass */
  override var id: java.lang.String = js.native
  /**
    * The remaining amount of resources.
    */
  /* CompleteClass */
  override var mineralAmount: scala.Double = js.native
  /**
    * The resource type, one of the `RESOURCE_*` constants.
    */
  /* CompleteClass */
  override var mineralType: MineralConstant = js.native
  /**
    * An object representing the position of this object in the room.
    */
  /* CompleteClass */
  override var pos: RoomPosition = js.native
  /**
    * The link to the Room object. May be undefined in case if an object is a
    * flag or a construction site and is placed in a room that is not visible
    * to you.
    */
  /* CompleteClass */
  override var room: js.UndefOr[Room] = js.native
  /**
    * The remaining time after which the deposit will be refilled.
    */
  /* CompleteClass */
  override var ticksToRegeneration: scala.Double = js.native
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

