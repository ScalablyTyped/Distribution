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
  var id: String
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

@JSGlobal("Mineral")
@js.native
class MineralCls protected () extends Mineral[MineralConstant] {
  def this(id: String) = this()
  /**
    * The density of this mineral deposit, one of the `DENSITY_*` constants.
    */
  /* CompleteClass */
  override var density: Double = js.native
  /**
    * Applied effects, an array of objects with the following properties:
    */
  /* CompleteClass */
  override var effects: js.Array[RoomObjectEffect] = js.native
  /**
    * A unique object identifier. You can use `Game.getObjectById` method to retrieve an object instance by its `id`.
    */
  /* CompleteClass */
  override var id: String = js.native
  /**
    * The remaining amount of resources.
    */
  /* CompleteClass */
  override var mineralAmount: Double = js.native
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
    * The remaining time after which the deposit will be refilled.
    */
  /* CompleteClass */
  override var ticksToRegeneration: Double = js.native
}

object Mineral {
  @scala.inline
  def apply[T /* <: MineralConstant */](
    density: Double,
    effects: js.Array[RoomObjectEffect],
    id: String,
    mineralAmount: Double,
    mineralType: T,
    pos: RoomPosition,
    ticksToRegeneration: Double,
    room: Room = null
  ): Mineral[T] = {
    val __obj = js.Dynamic.literal(density = density, effects = effects, id = id, mineralAmount = mineralAmount, mineralType = mineralType.asInstanceOf[js.Any], pos = pos, ticksToRegeneration = ticksToRegeneration)
    if (room != null) __obj.updateDynamic("room")(room)
    __obj.asInstanceOf[Mineral[T]]
  }
}

