package typings.screeps

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Memory extends StObject {
  
  var creeps: StringDictionary[CreepMemory] = js.native
  
  var flags: StringDictionary[FlagMemory] = js.native
  
  var powerCreeps: StringDictionary[PowerCreepMemory] = js.native
  
  var rooms: StringDictionary[RoomMemory] = js.native
  
  var spawns: StringDictionary[SpawnMemory] = js.native
}
object Memory {
  
  @scala.inline
  def apply(
    creeps: StringDictionary[CreepMemory],
    flags: StringDictionary[FlagMemory],
    powerCreeps: StringDictionary[PowerCreepMemory],
    rooms: StringDictionary[RoomMemory],
    spawns: StringDictionary[SpawnMemory]
  ): Memory = {
    val __obj = js.Dynamic.literal(creeps = creeps.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], powerCreeps = powerCreeps.asInstanceOf[js.Any], rooms = rooms.asInstanceOf[js.Any], spawns = spawns.asInstanceOf[js.Any])
    __obj.asInstanceOf[Memory]
  }
  
  @scala.inline
  implicit class MemoryMutableBuilder[Self <: Memory] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreeps(value: StringDictionary[CreepMemory]): Self = StObject.set(x, "creeps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlags(value: StringDictionary[FlagMemory]): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPowerCreeps(value: StringDictionary[PowerCreepMemory]): Self = StObject.set(x, "powerCreeps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRooms(value: StringDictionary[RoomMemory]): Self = StObject.set(x, "rooms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpawns(value: StringDictionary[SpawnMemory]): Self = StObject.set(x, "spawns", value.asInstanceOf[js.Any])
  }
}
