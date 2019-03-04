package typings
package screepsLib

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
  var amount: scala.Double
  /**
    * A unique object identifier. You can use `Game.getObjectById` method to retrieve an object instance by its `id`.
    */
  var id: java.lang.String
  /**
    * One of the `RESOURCE_*` constants.
    */
  var resourceType: T
}

object Resource {
  @scala.inline
  def apply[T /* <: ResourceConstant */](amount: scala.Double, id: java.lang.String, pos: RoomPosition, resourceType: T, room: Room = null): Resource[T] = {
    val __obj = js.Dynamic.literal(amount = amount, id = id, pos = pos, resourceType = resourceType.asInstanceOf[js.Any])
    if (room != null) __obj.updateDynamic("room")(room)
    __obj.asInstanceOf[Resource[T]]
  }
}

