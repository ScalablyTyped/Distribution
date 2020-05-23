package typings.screeps

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
  var my: Boolean
  /**
    * An object with the structure’s owner info (if present) containing the following properties: username
    */
  var owner: js.UndefOr[Owner] = js.undefined
}

object OwnedStructure {
  @scala.inline
  def apply[T](
    destroy: () => ScreepsReturnCode,
    effects: js.Array[RoomObjectEffect],
    hits: Double,
    hitsMax: Double,
    id: Id[OwnedStructure[T]],
    isActive: () => Boolean,
    my: Boolean,
    notifyWhenAttacked: Boolean => ScreepsReturnCode,
    pos: RoomPosition,
    room: Room,
    structureType: T,
    owner: Owner = null
  ): OwnedStructure[T] = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), effects = effects.asInstanceOf[js.Any], hits = hits.asInstanceOf[js.Any], hitsMax = hitsMax.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isActive = js.Any.fromFunction0(isActive), my = my.asInstanceOf[js.Any], notifyWhenAttacked = js.Any.fromFunction1(notifyWhenAttacked), pos = pos.asInstanceOf[js.Any], room = room.asInstanceOf[js.Any], structureType = structureType.asInstanceOf[js.Any])
    if (owner != null) __obj.updateDynamic("owner")(owner.asInstanceOf[js.Any])
    __obj.asInstanceOf[OwnedStructure[T]]
  }
}

