package typings
package screepsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The base prototype for a structure that has an owner. Such structures can be
  * found using `FIND_MY_STRUCTURES` and `FIND_HOSTILE_STRUCTURES` constants.
  */
trait OwnedStructure[T /* <: StructureConstant */] extends Structure[T] {
  /**
    * Whether this is your own structure. Walls and roads don't have this property as they are considered neutral structures.
    */
  var my: scala.Boolean
  /**
    * An object with the structure’s owner info (if present) containing the following properties: username
    */
  var owner: Owner
}

object OwnedStructure {
  @scala.inline
  def apply[T /* <: StructureConstant */](
    destroy: js.Function0[ScreepsReturnCode],
    hits: scala.Double,
    hitsMax: scala.Double,
    id: java.lang.String,
    isActive: js.Function0[scala.Boolean],
    my: scala.Boolean,
    notifyWhenAttacked: js.Function1[scala.Boolean, ScreepsReturnCode],
    owner: Owner,
    pos: RoomPosition,
    room: Room,
    structureType: T
  ): OwnedStructure[T] = {
    val __obj = js.Dynamic.literal(destroy = destroy, hits = hits, hitsMax = hitsMax, id = id, isActive = isActive, my = my, notifyWhenAttacked = notifyWhenAttacked, owner = owner, pos = pos, room = room, structureType = structureType.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[OwnedStructure[T]]
  }
}

