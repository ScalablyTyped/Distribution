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
  
  val Defer: Defer with java.lang.String = js.native
  val ReadOnly: ReadOnly with java.lang.String = js.native
  val ReadOnlyDefer: ReadOnlyDefer with java.lang.String = js.native
  val ReadWrite: ReadWrite with java.lang.String = js.native
  val ReadWriteDefer: ReadWriteDefer with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[sharepointLib.SPNs.JsGridNs.EditMode with java.lang.String] = js.native
}

