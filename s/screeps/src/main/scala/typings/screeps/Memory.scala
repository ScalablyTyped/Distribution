package typings.screeps

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Memory extends js.Object {
  var creeps: StringDictionary[CreepMemory]
  var flags: StringDictionary[FlagMemory]
  var powerCreeps: StringDictionary[PowerCreepMemory]
  var rooms: StringDictionary[RoomMemory]
  var spawns: StringDictionary[SpawnMemory]
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
    val __obj = js.Dynamic.literal(creeps = creeps, flags = flags, powerCreeps = powerCreeps, rooms = rooms, spawns = spawns)
  
    __obj.asInstanceOf[Memory]
  }
}

