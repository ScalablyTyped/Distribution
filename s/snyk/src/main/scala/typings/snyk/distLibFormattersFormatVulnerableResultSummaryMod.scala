package typings.snyk

import typings.snyk.distLibTypesMod.Options
import typings.snyk.distLibTypesMod.TestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibFormattersFormatVulnerableResultSummaryMod {
  
  @JSImport("snyk/dist/lib/formatters/format-vulnerable-result-summary", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def summariseVulnerableResults(vulnerableResults: Any, options: Options & TestOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("summariseVulnerableResults")(vulnerableResults.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
}
