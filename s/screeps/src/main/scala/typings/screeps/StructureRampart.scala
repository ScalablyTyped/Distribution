package typings.screeps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Blocks movement of hostile creeps, and defends your creeps and structures on
  * the same tile. Can be used as a controllable gate.
  */
trait StructureRampart
  extends OwnedStructure[STRUCTURE_RAMPART]
     with AnyOwnedStructure
     with ConcreteStructure[js.Any] {
  /**
    * If false (default), only your creeps can step on the same square. If true, any hostile creeps can pass through.
    */
  var isPublic: Boolean
  /**
    * The amount of game ticks when this rampart will lose some hit points.
    */
  var ticksToDecay: Double
  /**
    * Make this rampart public to allow other players' creeps to pass through.
    * @param isPublic Whether this rampart should be public or non-public
    */
  def setPublic(isPublic: Boolean): js.UndefOr[scala.Nothing]
}

object StructureRampart {
  @scala.inline
  def apply(
    destroy: () => ScreepsReturnCode,
    effects: js.Array[RoomObjectEffect],
    hits: Double,
    hitsMax: Double,
    id: Id[StructureRampart],
    isActive: () => Boolean,
    isPublic: Boolean,
    my: Boolean,
    notifyWhenAttacked: Boolean => ScreepsReturnCode,
    pos: RoomPosition,
    room: Room,
    setPublic: Boolean => js.UndefOr[scala.Nothing],
    structureType: STRUCTURE_RAMPART,
    ticksToDecay: Double,
    owner: Owner = null
  ): StructureRampart = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), effects = effects.asInstanceOf[js.Any], hits = hits.asInstanceOf[js.Any], hitsMax = hitsMax.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isActive = js.Any.fromFunction0(isActive), isPublic = isPublic.asInstanceOf[js.Any], my = my.asInstanceOf[js.Any], notifyWhenAttacked = js.Any.fromFunction1(notifyWhenAttacked), pos = pos.asInstanceOf[js.Any], room = room.asInstanceOf[js.Any], setPublic = js.Any.fromFunction1(setPublic), structureType = structureType.asInstanceOf[js.Any], ticksToDecay = ticksToDecay.asInstanceOf[js.Any])
    if (owner != null) __obj.updateDynamic("owner")(owner.asInstanceOf[js.Any])
    __obj.asInstanceOf[StructureRampart]
  }
}

