package typings.sharepoint.SPNs.JsGridNs

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
  sealed trait Cancel extends UpdateSerializeMode
  
   // 1,
  @js.native
  sealed trait Default extends UpdateSerializeMode
  
  @js.native
  sealed trait PropBoth extends UpdateSerializeMode
  
   // 2,
  @js.native
  sealed trait PropDataOnly extends UpdateSerializeMode
  
   // 3,
  @js.native
  sealed trait PropLocalizedOnly extends UpdateSerializeMode
  
  /* 0 */ val Cancel: typings.sharepoint.SPNs.JsGridNs.UpdateSerializeMode.Cancel with Double = js.native
  /* 1 */ val Default: typings.sharepoint.SPNs.JsGridNs.UpdateSerializeMode.Default with Double = js.native
  /* 4 */ val PropBoth: typings.sharepoint.SPNs.JsGridNs.UpdateSerializeMode.PropBoth with Double = js.native
  /* 2 */ val PropDataOnly: typings.sharepoint.SPNs.JsGridNs.UpdateSerializeMode.PropDataOnly with Double = js.native
  /* 3 */ val PropLocalizedOnly: typings.sharepoint.SPNs.JsGridNs.UpdateSerializeMode.PropLocalizedOnly with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[UpdateSerializeMode with Double] = js.native
}

