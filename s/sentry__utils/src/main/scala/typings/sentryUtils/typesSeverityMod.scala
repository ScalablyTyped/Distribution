package typings.sentryUtils

import typings.sentryTypes.typesSeverityMod.Severity
import typings.sentryTypes.typesSeverityMod.SeverityLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSeverityMod {
  
  @JSImport("@sentry/utils/types/severity", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def severityFromString(level: String): Severity = ^.asInstanceOf[js.Dynamic].applyDynamic("severityFromString")(level.asInstanceOf[js.Any]).asInstanceOf[Severity]
  inline def severityFromString(level: Severity): Severity = ^.asInstanceOf[js.Dynamic].applyDynamic("severityFromString")(level.asInstanceOf[js.Any]).asInstanceOf[Severity]
  inline def severityFromString(level: SeverityLevel): Severity = ^.asInstanceOf[js.Dynamic].applyDynamic("severityFromString")(level.asInstanceOf[js.Any]).asInstanceOf[Severity]
  
  inline def severityLevelFromString(level: String): SeverityLevel = ^.asInstanceOf[js.Dynamic].applyDynamic("severityLevelFromString")(level.asInstanceOf[js.Any]).asInstanceOf[SeverityLevel]
  inline def severityLevelFromString(level: SeverityLevel): SeverityLevel = ^.asInstanceOf[js.Dynamic].applyDynamic("severityLevelFromString")(level.asInstanceOf[js.Any]).asInstanceOf[SeverityLevel]
  
  @JSImport("@sentry/utils/types/severity", "validSeverityLevels")
  @js.native
  val validSeverityLevels: js.Array[String] = js.native
}
