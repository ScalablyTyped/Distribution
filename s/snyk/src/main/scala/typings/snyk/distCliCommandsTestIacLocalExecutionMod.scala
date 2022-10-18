package typings.snyk

import typings.snyk.distCliCommandsTestIacLocalExecutionProcessResultsMod.ResultsProcessor
import typings.snyk.distCliCommandsTestIacLocalExecutionTypesMod.IaCTestFlags
import typings.snyk.distCliCommandsTestIacLocalExecutionTypesMod.IacFileParseFailure
import typings.snyk.distCliCommandsTestIacLocalExecutionTypesMod.IacFileParsed
import typings.snyk.distCliCommandsTestIacLocalExecutionTypesMod.IacOrgSettings
import typings.snyk.distCliCommandsTestIacLocalExecutionTypesMod.RulesOrigin
import typings.snyk.distCliCommandsTestIacLocalExecutionTypesMod.SafeAnalyticsOutput
import typings.snyk.distCliCommandsTestIacLocalExecutionTypesMod.TestReturnValue
import typings.snyk.distLibErrorsMod.CustomError
import typings.snyk.distLibTypesMod.Tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCliCommandsTestIacLocalExecutionMod {
  
  @JSImport("snyk/dist/cli/commands/test/iac/local-execution", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("snyk/dist/cli/commands/test/iac/local-execution", "InvalidVarFilePath")
  @js.native
  open class InvalidVarFilePath protected () extends CustomError {
    def this(path: String) = this()
    def this(path: String, message: String) = this()
  }
  
  inline def parseTags(options: IaCTestFlags): js.UndefOr[js.Array[Tag]] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseTags")(options.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[js.Array[Tag]]]
  
  inline def removeFileContent(hasFilePathFileTypeFailureReasonProjectType: IacFileParseFailure): SafeAnalyticsOutput = ^.asInstanceOf[js.Dynamic].applyDynamic("removeFileContent")(hasFilePathFileTypeFailureReasonProjectType.asInstanceOf[js.Any]).asInstanceOf[SafeAnalyticsOutput]
  inline def removeFileContent(hasFilePathFileTypeFailureReasonProjectType: IacFileParsed): SafeAnalyticsOutput = ^.asInstanceOf[js.Dynamic].applyDynamic("removeFileContent")(hasFilePathFileTypeFailureReasonProjectType.asInstanceOf[js.Any]).asInstanceOf[SafeAnalyticsOutput]
  
  inline def test(
    resultsProcessor: ResultsProcessor,
    pathToScan: String,
    options: IaCTestFlags,
    iacOrgSettings: IacOrgSettings,
    rulesOrigin: RulesOrigin
  ): js.Promise[TestReturnValue] = (^.asInstanceOf[js.Dynamic].applyDynamic("test")(resultsProcessor.asInstanceOf[js.Any], pathToScan.asInstanceOf[js.Any], options.asInstanceOf[js.Any], iacOrgSettings.asInstanceOf[js.Any], rulesOrigin.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TestReturnValue]]
}
