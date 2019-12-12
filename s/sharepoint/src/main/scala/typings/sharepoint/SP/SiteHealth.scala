package typings.sharepoint.SP

import org.scalablytyped.runtime.TopLevel
import typings.sharepoint.SP.SiteHealth.SiteHealthResult
import typings.sharepoint.SP.SiteHealth.SiteHealthStatusType
import typings.sharepoint.SP.SiteHealth.SiteHealthStatusType.failedError
import typings.sharepoint.SP.SiteHealth.SiteHealthStatusType.failedWarning
import typings.sharepoint.SP.SiteHealth.SiteHealthStatusType.passed
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.SiteHealth")
@js.native
object SiteHealth extends js.Object {
  @js.native
  class SiteHealthResult () extends ClientValueObject {
    def get_messageAsText(): String = js.native
    def get_ruleHelpLink(): String = js.native
    def get_ruleId(): Guid = js.native
    def get_ruleIsRepairable(): Boolean = js.native
    def get_ruleName(): String = js.native
    def get_status(): SiteHealthStatusType = js.native
    def get_timeStamp(): Date = js.native
    def set_status(value: SiteHealthStatusType): Unit = js.native
    def set_timeStamp(value: Date): Unit = js.native
  }
  
  @js.native
  sealed trait SiteHealthStatusType extends js.Object
  
  @js.native
  class SiteHealthSummary () extends ClientObject {
    def get_failedErrorCount(): Double = js.native
    def get_failedWarningCount(): Double = js.native
    def get_passedCount(): Double = js.native
    def get_results(): js.Array[SiteHealthResult] = js.native
  }
  
  @js.native
  object SiteHealthStatusType extends js.Object {
    @js.native
    sealed trait failedError extends SiteHealthStatusType
    
    @js.native
    sealed trait failedWarning extends SiteHealthStatusType
    
    @js.native
    sealed trait passed extends SiteHealthStatusType
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[SiteHealthStatusType with Double] = js.native
    /* 2 */ @js.native
    object failedError extends TopLevel[failedError with Double]
    
    /* 1 */ @js.native
    object failedWarning extends TopLevel[failedWarning with Double]
    
    /* 0 */ @js.native
    object passed extends TopLevel[passed with Double]
    
  }
  
}

