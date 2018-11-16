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
  
  val Both: Both with java.lang.String = js.native
  val DataOnly: DataOnly with java.lang.String = js.native
  val LocalizedOnly: LocalizedOnly with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[sharepointLib.SPNs.JsGridNs.EditActorReadType with java.lang.String] = js.native
}

