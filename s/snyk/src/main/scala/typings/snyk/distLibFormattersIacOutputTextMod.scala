package typings.snyk

import typings.snyk.distCliCommandsTestIacLocalExecutionTypesMod.IaCTestFlags
import typings.snyk.distLibFormattersIacOutputTextFormattersMod.FormatTestDataParams
import typings.snyk.distLibFormattersIacOutputTextIssuesListTypesMod.Options
import typings.snyk.distLibFormattersIacOutputTextTypesMod.FormattedOutputResultsBySeverity
import typings.snyk.distLibFormattersIacOutputTextTypesMod.IaCTestFailure
import typings.snyk.distLibFormattersIacOutputTextTypesMod.IacTestData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibFormattersIacOutputTextMod {
  
  @JSImport("snyk/dist/lib/formatters/iac-output/text", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("snyk/dist/lib/formatters/iac-output/text", "customRulesMessage")
  @js.native
  val customRulesMessage: String = js.native
  
  @JSImport("snyk/dist/lib/formatters/iac-output/text", "customRulesReportMessage")
  @js.native
  val customRulesReportMessage: String = js.native
  
  @JSImport("snyk/dist/lib/formatters/iac-output/text", "failuresTipOutput")
  @js.native
  val failuresTipOutput: String = js.native
  
  inline def formatFailuresList(testFailures: js.Array[IaCTestFailure]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatFailuresList")(testFailures.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def formatIacTestFailures(testFailures: js.Array[IaCTestFailure]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatIacTestFailures")(testFailures.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def formatIacTestSummary(testData: IacTestData): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatIacTestSummary")(testData.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def formatShareResultsOutput(orgName: String, projectName: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatShareResultsOutput")(orgName.asInstanceOf[js.Any], projectName.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def formatSnykIacTestTestData(
    snykIacTestScanResult: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Results */ Any,
    projectName: String,
    orgName: String
  ): IacTestData = (^.asInstanceOf[js.Dynamic].applyDynamic("formatSnykIacTestTestData")(snykIacTestScanResult.asInstanceOf[js.Any], projectName.asInstanceOf[js.Any], orgName.asInstanceOf[js.Any])).asInstanceOf[IacTestData]
  inline def formatSnykIacTestTestData(snykIacTestScanResult: Unit, projectName: String, orgName: String): IacTestData = (^.asInstanceOf[js.Dynamic].applyDynamic("formatSnykIacTestTestData")(snykIacTestScanResult.asInstanceOf[js.Any], projectName.asInstanceOf[js.Any], orgName.asInstanceOf[js.Any])).asInstanceOf[IacTestData]
  
  inline def formatTestData(param0: FormatTestDataParams): IacTestData = ^.asInstanceOf[js.Dynamic].applyDynamic("formatTestData")(param0.asInstanceOf[js.Any]).asInstanceOf[IacTestData]
  
  inline def getIacDisplayedIssues(resultsBySeverity: FormattedOutputResultsBySeverity): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getIacDisplayedIssues")(resultsBySeverity.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def getIacDisplayedIssues(resultsBySeverity: FormattedOutputResultsBySeverity, options: Options): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getIacDisplayedIssues")(resultsBySeverity.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("snyk/dist/lib/formatters/iac-output/text", "iacTestTitle")
  @js.native
  val iacTestTitle: String = js.native
  
  @JSImport("snyk/dist/lib/formatters/iac-output/text", "shareCustomRulesDisclaimer")
  @js.native
  val shareCustomRulesDisclaimer: String = js.native
  
  @JSImport("snyk/dist/lib/formatters/iac-output/text", "shareResultsTip")
  @js.native
  val shareResultsTip: String = js.native
  
  inline def shouldLogUserMessages(options: IaCTestFlags): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("shouldLogUserMessages")(options.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @JSImport("snyk/dist/lib/formatters/iac-output/text", "spinnerMessage")
  @js.native
  val spinnerMessage: String = js.native
  
  @JSImport("snyk/dist/lib/formatters/iac-output/text", "spinnerSuccessMessage")
  @js.native
  val spinnerSuccessMessage: String = js.native
}
