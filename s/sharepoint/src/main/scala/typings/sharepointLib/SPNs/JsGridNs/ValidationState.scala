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
  
  val Invalid: Invalid with java.lang.String = js.native
  val Pending: Pending with java.lang.String = js.native
  val Valid: Valid with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[sharepointLib.SPNs.JsGridNs.ValidationState with java.lang.String] = js.native
}

