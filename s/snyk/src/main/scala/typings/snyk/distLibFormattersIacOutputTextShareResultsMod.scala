package typings.snyk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibFormattersIacOutputTextShareResultsMod {
  
  @JSImport("snyk/dist/lib/formatters/iac-output/text/share-results", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def formatShareResultsOutput(orgName: String, projectName: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatShareResultsOutput")(orgName.asInstanceOf[js.Any], projectName.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def formatShareResultsOutputV2(orgName: String, projectName: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatShareResultsOutputV2")(orgName.asInstanceOf[js.Any], projectName.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("snyk/dist/lib/formatters/iac-output/text/share-results", "shareCustomRulesDisclaimer")
  @js.native
  val shareCustomRulesDisclaimer: String = js.native
  
  @JSImport("snyk/dist/lib/formatters/iac-output/text/share-results", "shareResultsTip")
  @js.native
  val shareResultsTip: String = js.native
}
