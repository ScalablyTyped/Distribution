package typings.sharepoint.SPNs.JsGridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EditMode extends js.Object

@JSGlobal("SP.JsGrid.EditMode")
@js.native
object EditMode extends js.Object {
  @js.native
  sealed trait Defer extends EditMode
  
   // 0,
  @js.native
  sealed trait ReadOnly extends EditMode
  
   // 2,
  @js.native
  sealed trait ReadOnlyDefer extends EditMode
  
   // 1,
  @js.native
  sealed trait ReadWrite extends EditMode
  
   // 3,
  @js.native
  sealed trait ReadWriteDefer extends EditMode
  
  /* 4 */ val Defer: typings.sharepoint.SPNs.JsGridNs.EditMode.Defer with Double = js.native
  /* 0 */ val ReadOnly: typings.sharepoint.SPNs.JsGridNs.EditMode.ReadOnly with Double = js.native
  /* 2 */ val ReadOnlyDefer: typings.sharepoint.SPNs.JsGridNs.EditMode.ReadOnlyDefer with Double = js.native
  /* 1 */ val ReadWrite: typings.sharepoint.SPNs.JsGridNs.EditMode.ReadWrite with Double = js.native
  /* 3 */ val ReadWriteDefer: typings.sharepoint.SPNs.JsGridNs.EditMode.ReadWriteDefer with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EditMode with Double] = js.native
}

