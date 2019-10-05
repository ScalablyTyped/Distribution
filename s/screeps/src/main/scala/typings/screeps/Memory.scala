package typings.screeps

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
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

@JSGlobal("Memory")
@js.native
object Memory extends TopLevel[Memory]

