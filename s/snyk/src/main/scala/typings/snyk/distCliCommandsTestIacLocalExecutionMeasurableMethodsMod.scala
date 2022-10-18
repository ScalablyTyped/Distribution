package typings.snyk

import typings.snyk.anon.CustomRulesPath
import typings.snyk.anon.FailedScans
import typings.snyk.anon.Severity
import typings.snyk.distCliCommandsTestIacLocalExecutionProcessResultsMod.ResultsProcessor
import typings.snyk.distCliCommandsTestIacLocalExecutionRulesOciRegistryMod.OciRegistry
import typings.snyk.distCliCommandsTestIacLocalExecutionTypesMod.FormattedResult
import typings.snyk.distCliCommandsTestIacLocalExecutionTypesMod.IaCTestFlags
import typings.snyk.distCliCommandsTestIacLocalExecutionTypesMod.IacFileData
import typings.snyk.distCliCommandsTestIacLocalExecutionTypesMod.IacFileParsed
import typings.snyk.distCliCommandsTestIacLocalExecutionTypesMod.IacFileScanResult
import typings.snyk.distCliCommandsTestIacLocalExecutionTypesMod.IacOrgSettings
import typings.snyk.distCliCommandsTestIacLocalExecutionTypesMod.ParsingResults
import typings.snyk.distCliCommandsTestIacLocalExecutionTypesMod.PerformanceAnalyticsKey
import typings.snyk.distCliCommandsTestIacLocalExecutionTypesMod.RulesOrigin
import typings.snyk.distCliCommandsTestIacLocalExecutionTypesMod.TestMeta
import typings.snyk.distCliCommandsTestIacLocalExecutionTypesMod.TestReturnValue
import typings.snyk.distCliCommandsTestIacLocalExecutionUsageTrackingMod.TrackableResult
import typings.std.Parameters
import typings.std.Record
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCliCommandsTestIacLocalExecutionMeasurableMethodsMod {
  
  @JSImport("snyk/dist/cli/commands/test/iac/local-execution/measurable-methods", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def applyCustomSeverities(scannedFiles: js.Array[IacFileScanResult], customPolicies: Record[String, Severity]): js.Promise[js.Array[IacFileScanResult]] = (^.asInstanceOf[js.Dynamic].applyDynamic("applyCustomSeverities")(scannedFiles.asInstanceOf[js.Any], customPolicies.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[IacFileScanResult]]]
  
  inline def asyncPerformanceAnalyticsDecorator[T /* <: js.Function1[/* repeated */ Any, js.Promise[Any]] */](measurableMethod: T, analyticsKey: PerformanceAnalyticsKey): js.Function1[/* args */ Parameters[T], js.Promise[Awaited[ReturnType[T]]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("asyncPerformanceAnalyticsDecorator")(measurableMethod.asInstanceOf[js.Any], analyticsKey.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* args */ Parameters[T], js.Promise[Awaited[ReturnType[T]]]]]
  
  inline def cleanLocalCache(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("cleanLocalCache")().asInstanceOf[Unit]
  
  inline def formatScanResults(
    scanResults: js.Array[IacFileScanResult],
    options: IaCTestFlags,
    meta: TestMeta,
    projectPublicIds: Record[String, String],
    projectRoot: String
  ): js.Array[FormattedResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("formatScanResults")(scanResults.asInstanceOf[js.Any], options.asInstanceOf[js.Any], meta.asInstanceOf[js.Any], projectPublicIds.asInstanceOf[js.Any], projectRoot.asInstanceOf[js.Any])).asInstanceOf[js.Array[FormattedResult]]
  inline def formatScanResults(
    scanResults: js.Array[IacFileScanResult],
    options: IaCTestFlags,
    meta: TestMeta,
    projectPublicIds: Record[String, String],
    projectRoot: String,
    gitRemoteUrl: String
  ): js.Array[FormattedResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("formatScanResults")(scanResults.asInstanceOf[js.Any], options.asInstanceOf[js.Any], meta.asInstanceOf[js.Any], projectPublicIds.asInstanceOf[js.Any], projectRoot.asInstanceOf[js.Any], gitRemoteUrl.asInstanceOf[js.Any])).asInstanceOf[js.Array[FormattedResult]]
  
  inline def getIacOrgSettings(): js.Promise[IacOrgSettings] = ^.asInstanceOf[js.Dynamic].applyDynamic("getIacOrgSettings")().asInstanceOf[js.Promise[IacOrgSettings]]
  inline def getIacOrgSettings(publicOrgId: String): js.Promise[IacOrgSettings] = ^.asInstanceOf[js.Dynamic].applyDynamic("getIacOrgSettings")(publicOrgId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[IacOrgSettings]]
  
  inline def initLocalCache(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("initLocalCache")().asInstanceOf[js.Promise[Unit]]
  inline def initLocalCache(__0: CustomRulesPath): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("initLocalCache")(__0.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def loadContentForFiles(filePaths: js.Array[String]): js.Promise[js.Array[IacFileData]] = ^.asInstanceOf[js.Dynamic].applyDynamic("loadContentForFiles")(filePaths.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[IacFileData]]]
  
  inline def localTest(
    resultsProcessor: ResultsProcessor,
    pathToScan: String,
    options: IaCTestFlags,
    iacOrgSettings: IacOrgSettings,
    rulesOrigin: RulesOrigin
  ): js.Promise[TestReturnValue] = (^.asInstanceOf[js.Dynamic].applyDynamic("localTest")(resultsProcessor.asInstanceOf[js.Any], pathToScan.asInstanceOf[js.Any], options.asInstanceOf[js.Any], iacOrgSettings.asInstanceOf[js.Any], rulesOrigin.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TestReturnValue]]
  
  inline def parseFiles(filesData: js.Array[IacFileData]): js.Promise[ParsingResults] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseFiles")(filesData.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ParsingResults]]
  inline def parseFiles(filesData: js.Array[IacFileData], options: IaCTestFlags): js.Promise[ParsingResults] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseFiles")(filesData.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ParsingResults]]
  
  inline def performanceAnalyticsDecorator[T /* <: js.Function1[/* repeated */ Any, Any] */](measurableMethod: T, analyticsKey: PerformanceAnalyticsKey): js.Function1[/* args */ Parameters[T], ReturnType[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("performanceAnalyticsDecorator")(measurableMethod.asInstanceOf[js.Any], analyticsKey.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* args */ Parameters[T], ReturnType[T]]]
  
  inline def pull(registry: OciRegistry, repository: String, tag: String): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("pull")(registry.asInstanceOf[js.Any], repository.asInstanceOf[js.Any], tag.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  inline def scanFiles(parsedFiles: js.Array[IacFileParsed]): js.Promise[FailedScans] = ^.asInstanceOf[js.Dynamic].applyDynamic("scanFiles")(parsedFiles.asInstanceOf[js.Any]).asInstanceOf[js.Promise[FailedScans]]
  
  inline def trackUsage(formattedResults: js.Array[TrackableResult]): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("trackUsage")(formattedResults.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    T extends std.PromiseLike<infer U> ? U : T
    }}}
    */
  @js.native
  trait Awaited[T] extends StObject
}
