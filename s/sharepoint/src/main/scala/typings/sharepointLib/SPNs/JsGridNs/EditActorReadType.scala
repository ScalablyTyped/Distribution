package typings
package sharepointLib.SPNs.JsGridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EditActorReadType extends js.Object

@JSGlobal("SP.JsGrid.EditActorReadType")
@js.native
object EditActorReadType extends js.Object {
   // 1,
  @js.native
  sealed trait Both
    extends sharepointLib.SPNs.JsGridNs.EditActorReadType
  
  @js.native
  sealed trait DataOnly
    extends sharepointLib.SPNs.JsGridNs.EditActorReadType
  
   // 2,
  @js.native
  sealed trait LocalizedOnly
    extends sharepointLib.SPNs.JsGridNs.EditActorReadType
  
  /* 0 */ val Both: Both with scala.Double = js.native
  /* 2 */ val DataOnly: DataOnly with scala.Double = js.native
  /* 1 */ val LocalizedOnly: LocalizedOnly with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[sharepointLib.SPNs.JsGridNs.EditActorReadType with scala.Double] = js.native
}

