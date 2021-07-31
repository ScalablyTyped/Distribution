package typings.screeps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Blocks movement of all creeps.
  */
trait StructureWall
  extends StObject
     with Structure[STRUCTURE_WALL]
     with AnyStructure
     with ConcreteStructure[js.Any] {
  
  /**
    * The amount of game ticks when the wall will disappear (only for automatically placed border walls at the start of the game).
    */
  var ticksToLive: Double
}
object StructureWall {
  
  @scala.inline
  def apply(
    destroy: () => ScreepsReturnCode,
    effects: js.Array[RoomObjectEffect],
    hits: Double,
    hitsMax: Double,
    id: Id[StructureWall],
    isActive: () => Boolean,
    notifyWhenAttacked: Boolean => ScreepsReturnCode,
    pos: RoomPosition,
    room: Room,
    structureType: STRUCTURE_WALL,
    ticksToLive: Double
  ): StructureWall = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), effects = effects.asInstanceOf[js.Any], hits = hits.asInstanceOf[js.Any], hitsMax = hitsMax.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isActive = js.Any.fromFunction0(isActive), notifyWhenAttacked = js.Any.fromFunction1(notifyWhenAttacked), pos = pos.asInstanceOf[js.Any], room = room.asInstanceOf[js.Any], structureType = structureType.asInstanceOf[js.Any], ticksToLive = ticksToLive.asInstanceOf[js.Any])
    __obj.asInstanceOf[StructureWall]
  }
  
  @scala.inline
  implicit class StructureWallMutableBuilder[Self <: StructureWall] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTicksToLive(value: Double): Self = StObject.set(x, "ticksToLive", value.asInstanceOf[js.Any])
  }
}
