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
  
  /* 0 */ val Committed: Committed with scala.Double = js.native
  /* 1 */ val Uncommitted: Uncommitted with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[sharepointLib.SPNs.JsGridNs.EditActorUpdateType with scala.Double] = js.native
}

