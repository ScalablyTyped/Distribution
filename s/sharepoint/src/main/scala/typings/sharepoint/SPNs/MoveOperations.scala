package typings.sharepoint.SPNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MoveOperations extends js.Object

@JSGlobal("SP.MoveOperations")
@js.native
object MoveOperations extends js.Object {
  @js.native
  sealed trait allowBrokenThickets extends MoveOperations
  
  @js.native
  sealed trait bypassApprovePermission extends MoveOperations
  
  @js.native
  sealed trait none extends MoveOperations
  
  @js.native
  sealed trait overwrite extends MoveOperations
  
  /* 2 */ val allowBrokenThickets: typings.sharepoint.SPNs.MoveOperations.allowBrokenThickets with Double = js.native
  /* 3 */ val bypassApprovePermission: typings.sharepoint.SPNs.MoveOperations.bypassApprovePermission with Double = js.native
  /* 0 */ val none: typings.sharepoint.SPNs.MoveOperations.none with Double = js.native
  /* 1 */ val overwrite: typings.sharepoint.SPNs.MoveOperations.overwrite with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MoveOperations with Double] = js.native
}

