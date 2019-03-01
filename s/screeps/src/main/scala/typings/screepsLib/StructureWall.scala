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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("destroy")(destroy)
    __obj.updateDynamic("hits")(hits)
    __obj.updateDynamic("hitsMax")(hitsMax)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("isActive")(isActive)
    __obj.updateDynamic("notifyWhenAttacked")(notifyWhenAttacked)
    __obj.updateDynamic("pos")(pos)
    __obj.updateDynamic("room")(room)
    __obj.updateDynamic("structureType")(structureType)
    __obj.updateDynamic("ticksToLive")(ticksToLive)
    __obj.asInstanceOf[StructureWall]
  }
}

