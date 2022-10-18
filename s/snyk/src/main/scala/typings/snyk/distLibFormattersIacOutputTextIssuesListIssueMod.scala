package typings.snyk

import typings.snyk.distLibFormattersIacOutputTextIssuesListTypesMod.Options
import typings.snyk.distLibFormattersIacOutputTextTypesMod.FormattedOutputResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibFormattersIacOutputTextIssuesListIssueMod {
  
  @JSImport("snyk/dist/lib/formatters/iac-output/text/issues-list/issue", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def formatIssue(result: FormattedOutputResult): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatIssue")(result.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def formatIssue(result: FormattedOutputResult, options: Options): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatIssue")(result.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
}
