package typings.snyk.distLibSnykTestLegacyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SEVERITY extends StObject
@JSImport("snyk/dist/lib/snyk-test/legacy", "SEVERITY")
@js.native
object SEVERITY extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[SEVERITY & String] = js.native
  
  @js.native
  sealed trait CRITICAL
    extends StObject
       with SEVERITY
  /* "critical" */ val CRITICAL: typings.snyk.distLibSnykTestLegacyMod.SEVERITY.CRITICAL & String = js.native
  
  @js.native
  sealed trait HIGH
    extends StObject
       with SEVERITY
  /* "high" */ val HIGH: typings.snyk.distLibSnykTestLegacyMod.SEVERITY.HIGH & String = js.native
  
  @js.native
  sealed trait LOW
    extends StObject
       with SEVERITY
  /* "low" */ val LOW: typings.snyk.distLibSnykTestLegacyMod.SEVERITY.LOW & String = js.native
  
  @js.native
  sealed trait MEDIUM
    extends StObject
       with SEVERITY
  /* "medium" */ val MEDIUM: typings.snyk.distLibSnykTestLegacyMod.SEVERITY.MEDIUM & String = js.native
}
