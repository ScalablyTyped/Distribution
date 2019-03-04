package typings
package screepsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Blocks movement of hostile creeps, and defends your creeps and structures on
  * the same tile. Can be used as a controllable gate.
  */
trait StructureRampart
  extends OwnedStructure[STRUCTURE_RAMPART]
     with AnyOwnedStructure {
  /**
    * If false (default), only your creeps can step on the same square. If true, any hostile creeps can pass through.
    */
  var isPublic: scala.Boolean
  /**
    * The amount of game ticks when this rampart will lose some hit points.
    */
  var ticksToDecay: scala.Double
  /**
    * Make this rampart public to allow other players' creeps to pass through.
    * @param isPublic Whether this rampart should be public or non-public
    */
  def setPublic(isPublic: scala.Boolean): js.UndefOr[scala.Nothing]
}

object StructureRampart {
  @scala.inline
  def apply(
    destroy: js.Function0[ScreepsReturnCode],
    hits: scala.Double,
    hitsMax: scala.Double,
    id: java.lang.String,
    isActive: js.Function0[scala.Boolean],
    isPublic: scala.Boolean,
    my: scala.Boolean,
    notifyWhenAttacked: js.Function1[scala.Boolean, ScreepsReturnCode],
    owner: Owner,
    pos: RoomPosition,
    room: Room,
    setPublic: js.Function1[scala.Boolean, js.UndefOr[scala.Nothing]],
    structureType: STRUCTURE_RAMPART,
    ticksToDecay: scala.Double
  ): StructureRampart = {
    val __obj = js.Dynamic.literal(destroy = destroy, hits = hits, hitsMax = hitsMax, id = id, isActive = isActive, isPublic = isPublic, my = my, notifyWhenAttacked = notifyWhenAttacked, owner = owner, pos = pos, room = room, setPublic = setPublic, structureType = structureType, ticksToDecay = ticksToDecay)
  
    __obj.asInstanceOf[StructureRampart]
  }
}

