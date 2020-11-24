package typings.screeps.global

import org.scalablytyped.runtime.TopLevel
import typings.screeps.Id
import typings.screeps.StructureConstant
import typings.screeps.StructureConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Structure")
@js.native
class Structure protected ()
  extends typings.screeps.Structure[StructureConstant] {
  def this(id: Id[typings.screeps.Structure[StructureConstant]]) = this()
}
@JSGlobal("Structure")
@js.native
object Structure extends TopLevel[StructureConstructor]
