package typings.snyk.distLibTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PROJECT_CRITICALITY extends StObject
@JSImport("snyk/dist/lib/types", "PROJECT_CRITICALITY")
@js.native
object PROJECT_CRITICALITY extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[PROJECT_CRITICALITY & String] = js.native
  
  @js.native
  sealed trait CRITICAL
    extends StObject
       with PROJECT_CRITICALITY
  /* "critical" */ val CRITICAL: typings.snyk.distLibTypesMod.PROJECT_CRITICALITY.CRITICAL & String = js.native
  
  @js.native
  sealed trait HIGH
    extends StObject
       with PROJECT_CRITICALITY
  /* "high" */ val HIGH: typings.snyk.distLibTypesMod.PROJECT_CRITICALITY.HIGH & String = js.native
  
  @js.native
  sealed trait LOW
    extends StObject
       with PROJECT_CRITICALITY
  /* "low" */ val LOW: typings.snyk.distLibTypesMod.PROJECT_CRITICALITY.LOW & String = js.native
  
  @js.native
  sealed trait MEDIUM
    extends StObject
       with PROJECT_CRITICALITY
  /* "medium" */ val MEDIUM: typings.snyk.distLibTypesMod.PROJECT_CRITICALITY.MEDIUM & String = js.native
}
