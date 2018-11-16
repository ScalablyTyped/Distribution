package typings
package sharepointLib.SPNs.JsGridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EditActorUpdateType extends js.Object

@JSGlobal("SP.JsGrid.EditActorUpdateType")
@js.native
object EditActorUpdateType extends js.Object {
   // 0,
  @js.native
  sealed trait Committed
    extends sharepointLib.SPNs.JsGridNs.EditActorUpdateType
  
   // 1
  @js.native
  sealed trait Uncommitted
    extends sharepointLib.SPNs.JsGridNs.EditActorUpdateType
  
  val Committed: Committed with java.lang.String = js.native
  val Uncommitted: Uncommitted with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[sharepointLib.SPNs.JsGridNs.EditActorUpdateType with java.lang.String] = js.native
}

