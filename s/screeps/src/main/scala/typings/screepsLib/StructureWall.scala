package typings
package screepsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Blocks movement of all creeps.
  */
trait StructureWall
  extends Structure[STRUCTURE_WALL]
     with AnyStructure {
  /**
    * The amount of game ticks when the wall will disappear (only for automatically placed border walls at the start of the game).
    */
  var ticksToLive: scala.Double
}

object StructureWall {
  @scala.inline
  def apply(
    destroy: js.Function0[ScreepsReturnCode],
    hits: scala.Double,
    hitsMax: scala.Double,
    id: java.lang.String,
    isActive: js.Function0[scala.Boolean],
    notifyWhenAttacked: js.Function1[scala.Boolean, ScreepsReturnCode],
    pos: RoomPosition,
    room: Room,
    structureType: STRUCTURE_WALL,
    ticksToLive: scala.Double
  ): StructureWall = {
    val __obj = js.Dynamic.literal(destroy = destroy, hits = hits, hitsMax = hitsMax, id = id, isActive = isActive, notifyWhenAttacked = notifyWhenAttacked, pos = pos, room = room, structureType = structureType, ticksToLive = ticksToLive)
  
    __obj.asInstanceOf[StructureWall]
  }
}

