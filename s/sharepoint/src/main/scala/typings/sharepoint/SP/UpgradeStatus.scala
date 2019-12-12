package typings.sharepoint.SP

import org.scalablytyped.runtime.TopLevel
import typings.sharepoint.SP.UpgradeStatus.completed
import typings.sharepoint.SP.UpgradeStatus.failed
import typings.sharepoint.SP.UpgradeStatus.inProgress
import typings.sharepoint.SP.UpgradeStatus.none
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[UpgradeStatus with Double] = js.native
  /* 3 */ @js.native
  object completed extends TopLevel[completed with Double]
  
  /* 2 */ @js.native
  object failed extends TopLevel[failed with Double]
  
  /* 1 */ @js.native
  object inProgress extends TopLevel[inProgress with Double]
  
  /* 0 */ @js.native
  object none extends TopLevel[none with Double]
  
}

