package typings
package sharepointLib.SPNs.JsGridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ValidationState extends js.Object

@JSGlobal("SP.JsGrid.ValidationState")
@js.native
object ValidationState extends js.Object {
  @js.native
  sealed trait Invalid
    extends sharepointLib.SPNs.JsGridNs.ValidationState
  
   // 1,
  @js.native
  sealed trait Pending
    extends sharepointLib.SPNs.JsGridNs.ValidationState
  
   // 0,
  @js.native
  sealed trait Valid
    extends sharepointLib.SPNs.JsGridNs.ValidationState
  
  /* 2 */ val Invalid: Invalid with scala.Double = js.native
  /* 1 */ val Pending: Pending with scala.Double = js.native
  /* 0 */ val Valid: Valid with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[sharepointLib.SPNs.JsGridNs.ValidationState with scala.Double] = js.native
}

