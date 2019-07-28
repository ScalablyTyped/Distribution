package typings.sharepoint.SPNs.SiteHealthNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SiteHealthStatusType extends js.Object

@JSGlobal("SP.SiteHealth.SiteHealthStatusType")
@js.native
object SiteHealthStatusType extends js.Object {
  @js.native
  sealed trait failedError extends SiteHealthStatusType
  
  @js.native
  sealed trait failedWarning extends SiteHealthStatusType
  
  @js.native
  sealed trait passed extends SiteHealthStatusType
  
  /* 2 */ val failedError: typings.sharepoint.SPNs.SiteHealthNs.SiteHealthStatusType.failedError with Double = js.native
  /* 1 */ val failedWarning: typings.sharepoint.SPNs.SiteHealthNs.SiteHealthStatusType.failedWarning with Double = js.native
  /* 0 */ val passed: typings.sharepoint.SPNs.SiteHealthNs.SiteHealthStatusType.passed with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SiteHealthStatusType with Double] = js.native
}

