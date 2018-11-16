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
  
  val Both: Both with java.lang.String = js.native
  val DataOnly: DataOnly with java.lang.String = js.native
  val Either: Either with java.lang.String = js.native
  val LocalizedOnly: LocalizedOnly with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[sharepointLib.SPNs.JsGridNs.EditActorWriteType with java.lang.String] = js.native
}

