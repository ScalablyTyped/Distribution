package typings.sharepoint.SP

import org.scalablytyped.runtime.TopLevel
import typings.sharepoint.SP.MoveOperations.allowBrokenThickets
import typings.sharepoint.SP.MoveOperations.bypassApprovePermission
import typings.sharepoint.SP.MoveOperations.none
import typings.sharepoint.SP.MoveOperations.overwrite
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MoveOperations with Double] = js.native
  /* 2 */ @js.native
  object allowBrokenThickets extends TopLevel[allowBrokenThickets with Double]
  
  /* 3 */ @js.native
  object bypassApprovePermission extends TopLevel[bypassApprovePermission with Double]
  
  /* 0 */ @js.native
  object none extends TopLevel[none with Double]
  
  /* 1 */ @js.native
  object overwrite extends TopLevel[overwrite with Double]
  
}

