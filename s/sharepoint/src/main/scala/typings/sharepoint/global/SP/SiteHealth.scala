package typings.sharepoint.global.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SiteHealth {
  
  @JSGlobal("SP.SiteHealth.SiteHealthResult")
  @js.native
  class SiteHealthResult ()
    extends typings.sharepoint.SP.SiteHealth.SiteHealthResult
  
  @JSGlobal("SP.SiteHealth.SiteHealthStatusType")
  @js.native
  object SiteHealthStatusType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.sharepoint.SP.SiteHealth.SiteHealthStatusType with Double] = js.native
    
    /* 2 */ val failedError: typings.sharepoint.SP.SiteHealth.SiteHealthStatusType.failedError with Double = js.native
    
    /* 1 */ val failedWarning: typings.sharepoint.SP.SiteHealth.SiteHealthStatusType.failedWarning with Double = js.native
    
    /* 0 */ val passed: typings.sharepoint.SP.SiteHealth.SiteHealthStatusType.passed with Double = js.native
  }
  
  @JSGlobal("SP.SiteHealth.SiteHealthSummary")
  @js.native
  class SiteHealthSummary ()
    extends typings.sharepoint.SP.SiteHealth.SiteHealthSummary
}
