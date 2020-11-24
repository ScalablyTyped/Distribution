package typings.screeps

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Memory extends js.Object {
  
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
  implicit class MemoryOps[Self <: Memory] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCreeps(value: StringDictionary[CreepMemory]): Self = this.set("creeps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlags(value: StringDictionary[FlagMemory]): Self = this.set("flags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPowerCreeps(value: StringDictionary[PowerCreepMemory]): Self = this.set("powerCreeps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRooms(value: StringDictionary[RoomMemory]): Self = this.set("rooms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpawns(value: StringDictionary[SpawnMemory]): Self = this.set("spawns", value.asInstanceOf[js.Any])
  }
}
