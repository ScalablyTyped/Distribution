package typings.screeps.global

import org.scalablytyped.runtime.TopLevel
import typings.screeps.Id
import typings.screeps.ResourceConstant
import typings.screeps.ResourceConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Resource")
@js.native
class Resource protected ()
  extends typings.screeps.Resource[ResourceConstant] {
  def this(id: Id[typings.screeps.Resource[ResourceConstant]]) = this()
}
@JSGlobal("Resource")
@js.native
object Resource extends TopLevel[ResourceConstructor]
