package typings.screeps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A dropped piece of resource. It will decay after a while if not picked up. Dropped resource pile decays for ceil(amount/1000) units per tick.
  */
trait Resource[T /* <: ResourceConstant */] extends RoomObject {
  /**
    * The amount of resource units containing.
    */
  var amount: Double
  /**
    * A unique object identifier. You can use `Game.getObjectById` method to retrieve an object instance by its `id`.
    */
  var id: String
  /**
    * One of the `RESOURCE_*` constants.
    */
  var resourceType: T
}

@JSGlobal("Resource")
@js.native
class ResourceCls protected () extends Resource[ResourceConstant] {
  def this(id: String) = this()
  /**
    * The amount of resource units containing.
    */
  /* CompleteClass */
  override var amount: Double = js.native
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
    * An object representing the position of this object in the room.
    */
  /* CompleteClass */
  override var pos: RoomPosition = js.native
  /**
    * One of the `RESOURCE_*` constants.
    */
  /* CompleteClass */
  override var resourceType: ResourceConstant = js.native
}

object Resource {
  @scala.inline
  def apply[T /* <: ResourceConstant */](
    amount: Double,
    effects: js.Array[RoomObjectEffect],
    id: String,
    pos: RoomPosition,
    resourceType: T,
    room: Room = null
  ): Resource[T] = {
    val __obj = js.Dynamic.literal(amount = amount, effects = effects, id = id, pos = pos, resourceType = resourceType.asInstanceOf[js.Any])
    if (room != null) __obj.updateDynamic("room")(room)
    __obj.asInstanceOf[Resource[T]]
  }
}

