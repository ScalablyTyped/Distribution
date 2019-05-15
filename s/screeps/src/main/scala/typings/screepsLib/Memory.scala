package typings
package screepsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Memory extends js.Object {
  var creeps: org.scalablytyped.runtime.StringDictionary[CreepMemory]
  var flags: org.scalablytyped.runtime.StringDictionary[FlagMemory]
  var powerCreeps: org.scalablytyped.runtime.StringDictionary[PowerCreepMemory]
  var rooms: org.scalablytyped.runtime.StringDictionary[RoomMemory]
  var spawns: org.scalablytyped.runtime.StringDictionary[SpawnMemory]
}

object Memory {
  @scala.inline
  def apply(
    creeps: org.scalablytyped.runtime.StringDictionary[CreepMemory],
    flags: org.scalablytyped.runtime.StringDictionary[FlagMemory],
    powerCreeps: org.scalablytyped.runtime.StringDictionary[PowerCreepMemory],
    rooms: org.scalablytyped.runtime.StringDictionary[RoomMemory],
    spawns: org.scalablytyped.runtime.StringDictionary[SpawnMemory]
  ): Memory = {
    val __obj = js.Dynamic.literal(creeps = creeps, flags = flags, powerCreeps = powerCreeps, rooms = rooms, spawns = spawns)
  
    __obj.asInstanceOf[Memory]
  }
}

