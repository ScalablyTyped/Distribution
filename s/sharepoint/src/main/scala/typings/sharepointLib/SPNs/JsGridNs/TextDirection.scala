package typings
package sharepointLib.SPNs.JsGridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TextDirection extends js.Object

@JSGlobal("SP.JsGrid.TextDirection")
@js.native
object TextDirection extends js.Object {
   // 0,
  @js.native
  sealed trait Default
    extends sharepointLib.SPNs.JsGridNs.TextDirection
  
  @js.native
  sealed trait LeftToRight
    extends sharepointLib.SPNs.JsGridNs.TextDirection
  
   // 1,
  @js.native
  sealed trait RightToLeft
    extends sharepointLib.SPNs.JsGridNs.TextDirection
  
  /* 0 */ val Default: Default with scala.Double = js.native
  /* 2 */ val LeftToRight: LeftToRight with scala.Double = js.native
  /* 1 */ val RightToLeft: RightToLeft with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[sharepointLib.SPNs.JsGridNs.TextDirection with scala.Double] = js.native
}

