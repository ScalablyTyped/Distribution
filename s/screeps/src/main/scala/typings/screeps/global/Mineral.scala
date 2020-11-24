package typings.screeps.global

import org.scalablytyped.runtime.TopLevel
import typings.screeps.Id
import typings.screeps.MineralConstant
import typings.screeps.MineralConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Mineral")
@js.native
class Mineral protected ()
  extends typings.screeps.Mineral[MineralConstant] {
  def this(id: Id[typings.screeps.Mineral[MineralConstant]]) = this()
}
@JSGlobal("Mineral")
@js.native
object Mineral extends TopLevel[MineralConstructor]
