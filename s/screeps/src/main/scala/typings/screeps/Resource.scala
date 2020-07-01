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
  var id: Id[this.type]
  /**
    * One of the `RESOURCE_*` constants.
    */
  var resourceType: T
}

object Resource {
  @scala.inline
  def apply[/* <: typings.screeps.ResourceConstant */ T](
    amount: Double,
    effects: js.Array[RoomObjectEffect],
    id: Id[Resource[T]],
    pos: RoomPosition,
    resourceType: T,
    room: Room = null
  ): Resource[T] = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], effects = effects.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], pos = pos.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    if (room != null) __obj.updateDynamic("room")(room.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource[T]]
  }
}

