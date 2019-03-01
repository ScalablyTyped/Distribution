package typings
package screepsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Memory
  extends /* name */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var creeps: org.scalablytyped.runtime.StringDictionary[CreepMemory]
  var flags: org.scalablytyped.runtime.StringDictionary[FlagMemory]
  var rooms: org.scalablytyped.runtime.StringDictionary[RoomMemory]
  var spawns: org.scalablytyped.runtime.StringDictionary[SpawnMemory]
}

object Memory {
  @scala.inline
  def apply(
    creeps: org.scalablytyped.runtime.StringDictionary[CreepMemory],
    flags: org.scalablytyped.runtime.StringDictionary[FlagMemory],
    rooms: org.scalablytyped.runtime.StringDictionary[RoomMemory],
    spawns: org.scalablytyped.runtime.StringDictionary[SpawnMemory],
    StringDictionary: /* name */ org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): Memory = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("creeps")(creeps)
    __obj.updateDynamic("flags")(flags)
    __obj.updateDynamic("rooms")(rooms)
    __obj.updateDynamic("spawns")(spawns)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Memory]
  }
}

