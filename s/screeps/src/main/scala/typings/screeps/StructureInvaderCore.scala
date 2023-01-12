package typings.screeps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A structure which is a control center of NPC Strongholds, and also rules all invaders in the sector.
  */
trait StructureInvaderCore
  extends StObject
     with OwnedStructure[STRUCTURE_INVADER_CORE]
     with AnyOwnedStructure {
  
  /**
    * The level of the stronghold. The amount and quality of the loot depends on the level.
    */
  var level: Double
  
  /**
    * If the core is in process of spawning a new creep, this object will contain a `StructureSpawn.Spawning` object, or `null` otherwise.
    */
  var spawning: Spawning | Null
  
  /**
    * Shows the timer for a not yet deployed stronghold, undefined otherwise.
    */
  var ticksToDeploy: Double
}
object StructureInvaderCore {
  
  inline def apply(
    destroy: () => ScreepsReturnCode,
    effects: js.Array[RoomObjectEffect],
    hits: Double,
    hitsMax: Double,
    id: Id[StructureInvaderCore],
    isActive: () => Boolean,
    level: Double,
    my: Boolean,
    notifyWhenAttacked: Boolean => ScreepsReturnCode,
    owner: /* import warning: importer.ImportType#apply Failed type conversion: T extends screeps.STRUCTURE_CONTROLLER ? screeps.Owner | undefined : screeps.Owner */ js.Any,
    pos: RoomPosition,
    room: Room,
    structureType: STRUCTURE_INVADER_CORE,
    ticksToDeploy: Double
  ): StructureInvaderCore = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), effects = effects.asInstanceOf[js.Any], hits = hits.asInstanceOf[js.Any], hitsMax = hitsMax.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isActive = js.Any.fromFunction0(isActive), level = level.asInstanceOf[js.Any], my = my.asInstanceOf[js.Any], notifyWhenAttacked = js.Any.fromFunction1(notifyWhenAttacked), owner = owner.asInstanceOf[js.Any], pos = pos.asInstanceOf[js.Any], room = room.asInstanceOf[js.Any], structureType = structureType.asInstanceOf[js.Any], ticksToDeploy = ticksToDeploy.asInstanceOf[js.Any], spawning = null)
    __obj.asInstanceOf[StructureInvaderCore]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StructureInvaderCore] (val x: Self) extends AnyVal {
    
    inline def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    inline def setSpawning(value: Spawning): Self = StObject.set(x, "spawning", value.asInstanceOf[js.Any])
    
    inline def setSpawningNull: Self = StObject.set(x, "spawning", null)
    
    inline def setTicksToDeploy(value: Double): Self = StObject.set(x, "ticksToDeploy", value.asInstanceOf[js.Any])
  }
}
