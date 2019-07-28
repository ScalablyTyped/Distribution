package typings.sharepoint.SPNs.JsGridNs

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
  sealed trait Default extends TextDirection
  
  @js.native
  sealed trait LeftToRight extends TextDirection
  
   // 1,
  @js.native
  sealed trait RightToLeft extends TextDirection
  
  /* 0 */ val Default: typings.sharepoint.SPNs.JsGridNs.TextDirection.Default with Double = js.native
  /* 2 */ val LeftToRight: typings.sharepoint.SPNs.JsGridNs.TextDirection.LeftToRight with Double = js.native
  /* 1 */ val RightToLeft: typings.sharepoint.SPNs.JsGridNs.TextDirection.RightToLeft with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TextDirection with Double] = js.native
}

