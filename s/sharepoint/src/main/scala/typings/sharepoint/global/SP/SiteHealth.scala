package typings.sharepoint.global.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.SiteHealth")
@js.native
object SiteHealth extends js.Object {
  @js.native
  class SiteHealthResult ()
    extends typings.sharepoint.SP.SiteHealth.SiteHealthResult
  
  @js.native
  class SiteHealthSummary ()
    extends typings.sharepoint.SP.SiteHealth.SiteHealthSummary
  
  @js.native
  object SiteHealthStatusType extends js.Object {
    /* 2 */ val failedError: typings.sharepoint.SP.SiteHealth.SiteHealthStatusType.failedError with Double = js.native
    /* 1 */ val failedWarning: typings.sharepoint.SP.SiteHealth.SiteHealthStatusType.failedWarning with Double = js.native
    /* 0 */ val passed: typings.sharepoint.SP.SiteHealth.SiteHealthStatusType.passed with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.sharepoint.SP.SiteHealth.SiteHealthStatusType with Double] = js.native
  }
  
}

