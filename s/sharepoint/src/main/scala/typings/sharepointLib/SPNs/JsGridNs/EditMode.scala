package typings
package sharepointLib.SPNs.JsGridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EditMode extends js.Object

@JSGlobal("SP.JsGrid.EditMode")
@js.native
object EditMode extends js.Object {
  @js.native
  sealed trait Defer
    extends sharepointLib.SPNs.JsGridNs.EditMode
  
   // 0,
  @js.native
  sealed trait ReadOnly
    extends sharepointLib.SPNs.JsGridNs.EditMode
  
   // 2,
  @js.native
  sealed trait ReadOnlyDefer
    extends sharepointLib.SPNs.JsGridNs.EditMode
  
   // 1,
  @js.native
  sealed trait ReadWrite
    extends sharepointLib.SPNs.JsGridNs.EditMode
  
   // 3,
  @js.native
  sealed trait ReadWriteDefer
    extends sharepointLib.SPNs.JsGridNs.EditMode
  
  /* 4 */ val Defer: Defer with scala.Double = js.native
  /* 0 */ val ReadOnly: ReadOnly with scala.Double = js.native
  /* 2 */ val ReadOnlyDefer: ReadOnlyDefer with scala.Double = js.native
  /* 1 */ val ReadWrite: ReadWrite with scala.Double = js.native
  /* 3 */ val ReadWriteDefer: ReadWriteDefer with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[sharepointLib.SPNs.JsGridNs.EditMode with scala.Double] = js.native
}

