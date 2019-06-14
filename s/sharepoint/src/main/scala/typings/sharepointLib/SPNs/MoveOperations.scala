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
  
  /* 2 */ val allowBrokenThickets: allowBrokenThickets with scala.Double = js.native
  /* 3 */ val bypassApprovePermission: bypassApprovePermission with scala.Double = js.native
  /* 0 */ val none: none with scala.Double = js.native
  /* 1 */ val overwrite: overwrite with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[sharepointLib.SPNs.MoveOperations with scala.Double] = js.native
}

