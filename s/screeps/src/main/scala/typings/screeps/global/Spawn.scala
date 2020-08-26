package typings.screeps.global

import org.scalablytyped.runtime.TopLevel
import typings.screeps.Id
import typings.screeps.StructureSpawnConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Spawn")
@js.native
class Spawn protected ()
  extends typings.screeps.StructureSpawn {
  def this(id: Id[typings.screeps.StructureSpawn]) = this()
}

@JSGlobal("Spawn")
@js.native
object Spawn extends TopLevel[StructureSpawnConstructor]

