package typings
package sharepointLib.SPNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MoveOperations extends js.Object

@JSGlobal("SP.MoveOperations")
@js.native
object MoveOperations extends js.Object {
  @js.native
  sealed trait allowBrokenThickets
    extends sharepointLib.SPNs.MoveOperations
  
  @js.native
  sealed trait bypassApprovePermission
    extends sharepointLib.SPNs.MoveOperations
  
  @js.native
  sealed trait none
    extends sharepointLib.SPNs.MoveOperations
  
  @js.native
  sealed trait overwrite
    extends sharepointLib.SPNs.MoveOperations
  
  val allowBrokenThickets: allowBrokenThickets with java.lang.String = js.native
  val bypassApprovePermission: bypassApprovePermission with java.lang.String = js.native
  val none: none with java.lang.String = js.native
  val overwrite: overwrite with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[sharepointLib.SPNs.MoveOperations with java.lang.String] = js.native
}

