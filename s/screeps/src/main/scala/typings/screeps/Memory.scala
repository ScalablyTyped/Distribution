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
    val __obj = js.Dynamic.literal(creeps = creeps.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], powerCreeps = powerCreeps.asInstanceOf[js.Any], rooms = rooms.asInstanceOf[js.Any], spawns = spawns.asInstanceOf[js.Any])
    __obj.asInstanceOf[Memory]
  }
}

