package typings.sharepoint.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
}
