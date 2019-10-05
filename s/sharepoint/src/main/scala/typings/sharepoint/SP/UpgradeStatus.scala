package typings.sharepoint.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait UpgradeStatus extends js.Object

@JSGlobal("SP.UpgradeStatus")
@js.native
object UpgradeStatus extends js.Object {
  @js.native
  sealed trait completed extends UpgradeStatus
  
  @js.native
  sealed trait failed extends UpgradeStatus
  
  @js.native
  sealed trait inProgress extends UpgradeStatus
  
  @js.native
  sealed trait none extends UpgradeStatus
  
  /* 3 */ val completed: typings.sharepoint.SP.UpgradeStatus.completed with Double = js.native
  /* 2 */ val failed: typings.sharepoint.SP.UpgradeStatus.failed with Double = js.native
  /* 1 */ val inProgress: typings.sharepoint.SP.UpgradeStatus.inProgress with Double = js.native
  /* 0 */ val none: typings.sharepoint.SP.UpgradeStatus.none with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[UpgradeStatus with Double] = js.native
}

