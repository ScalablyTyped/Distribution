package typings.snyk

import typings.snyk.distLibFormattersIacOutputTextIssuesListTypesMod.Options
import typings.snyk.distLibFormattersIacOutputTextTypesMod.FormattedOutputResultsBySeverity
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibFormattersIacOutputTextIssuesListMod {
  
  @JSImport("snyk/dist/lib/formatters/iac-output/text/issues-list", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getIacDisplayedIssues(resultsBySeverity: FormattedOutputResultsBySeverity): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getIacDisplayedIssues")(resultsBySeverity.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def getIacDisplayedIssues(resultsBySeverity: FormattedOutputResultsBySeverity, options: Options): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getIacDisplayedIssues")(resultsBySeverity.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
}
