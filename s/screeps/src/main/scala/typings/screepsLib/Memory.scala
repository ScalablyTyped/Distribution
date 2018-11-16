package typings
package screepsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Memory
  extends /* name */ ScalablyTyped.runtime.StringDictionary[js.Any] {
  var creeps: ScalablyTyped.runtime.StringDictionary[CreepMemory]
  var flags: ScalablyTyped.runtime.StringDictionary[FlagMemory]
  var rooms: ScalablyTyped.runtime.StringDictionary[RoomMemory]
  var spawns: ScalablyTyped.runtime.StringDictionary[SpawnMemory]
}

