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
  
  /* 0 */ val Cancel: Cancel with scala.Double = js.native
  /* 1 */ val Default: Default with scala.Double = js.native
  /* 4 */ val PropBoth: PropBoth with scala.Double = js.native
  /* 2 */ val PropDataOnly: PropDataOnly with scala.Double = js.native
  /* 3 */ val PropLocalizedOnly: PropLocalizedOnly with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[sharepointLib.SPNs.JsGridNs.UpdateSerializeMode with scala.Double] = js.native
}

