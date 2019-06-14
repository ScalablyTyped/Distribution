package typings
package sharepointLib.SPNs.JsGridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EditActorWriteType extends js.Object

@JSGlobal("SP.JsGrid.EditActorWriteType")
@js.native
object EditActorWriteType extends js.Object {
   // 1,
  @js.native
  sealed trait Both
    extends sharepointLib.SPNs.JsGridNs.EditActorWriteType
  
   // 3,
  @js.native
  sealed trait DataOnly
    extends sharepointLib.SPNs.JsGridNs.EditActorWriteType
  
  @js.native
  sealed trait Either
    extends sharepointLib.SPNs.JsGridNs.EditActorWriteType
  
   // 2,
  @js.native
  sealed trait LocalizedOnly
    extends sharepointLib.SPNs.JsGridNs.EditActorWriteType
  
  /* 0 */ val Both: Both with scala.Double = js.native
  /* 2 */ val DataOnly: DataOnly with scala.Double = js.native
  /* 3 */ val Either: Either with scala.Double = js.native
  /* 1 */ val LocalizedOnly: LocalizedOnly with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[sharepointLib.SPNs.JsGridNs.EditActorWriteType with scala.Double] = js.native
}

