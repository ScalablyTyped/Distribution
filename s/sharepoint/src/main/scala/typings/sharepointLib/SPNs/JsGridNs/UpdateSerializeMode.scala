package typings
package sharepointLib.SPNs.JsGridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait UpdateSerializeMode extends js.Object

@JSGlobal("SP.JsGrid.UpdateSerializeMode")
@js.native
object UpdateSerializeMode extends js.Object {
   // 0,
  @js.native
  sealed trait Cancel
    extends sharepointLib.SPNs.JsGridNs.UpdateSerializeMode
  
   // 1,
  @js.native
  sealed trait Default
    extends sharepointLib.SPNs.JsGridNs.UpdateSerializeMode
  
  @js.native
  sealed trait PropBoth
    extends sharepointLib.SPNs.JsGridNs.UpdateSerializeMode
  
   // 2,
  @js.native
  sealed trait PropDataOnly
    extends sharepointLib.SPNs.JsGridNs.UpdateSerializeMode
  
   // 3,
  @js.native
  sealed trait PropLocalizedOnly
    extends sharepointLib.SPNs.JsGridNs.UpdateSerializeMode
  
  val Cancel: Cancel with java.lang.String = js.native
  val Default: Default with java.lang.String = js.native
  val PropBoth: PropBoth with java.lang.String = js.native
  val PropDataOnly: PropDataOnly with java.lang.String = js.native
  val PropLocalizedOnly: PropLocalizedOnly with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[sharepointLib.SPNs.JsGridNs.UpdateSerializeMode with java.lang.String] = js.native
}

