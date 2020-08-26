package typings.screeps.global

import org.scalablytyped.runtime.TopLevel
import typings.screeps.CreepConstructor
import typings.screeps.Id
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Creep")
@js.native
class Creep protected ()
  extends typings.screeps.Creep {
  def this(id: Id[typings.screeps.Creep]) = this()
}

@JSGlobal("Creep")
@js.native
object Creep extends TopLevel[CreepConstructor]

