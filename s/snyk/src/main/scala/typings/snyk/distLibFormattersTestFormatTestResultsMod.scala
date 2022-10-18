package typings.snyk

import org.scalablytyped.runtime.StringDictionary
import typings.snyk.distLibSnykTestLegacyMod.GroupedVuln
import typings.snyk.distLibSnykTestLegacyMod.TestResult
import typings.snyk.distLibTypesMod.Options
import typings.snyk.distLibTypesMod.OutputDataTypes
import typings.snyk.distLibTypesMod.SupportedProjectTypes
import typings.snyk.distLibTypesMod.TestOptions
import typings.snyk.snykStrings._empty
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibFormattersTestFormatTestResultsMod {
  
  @JSImport("snyk/dist/lib/formatters/test/format-test-results", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createErrorMappedResultsForJsonOutput(results: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("createErrorMappedResultsForJsonOutput")(results.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def dockerUserCTA(options: Any): _empty | (/* 
  For more free scans that keep your images secure, sign up to Snyk at https://dockr.ly/3ePqVcp */ String) = ^.asInstanceOf[js.Dynamic].applyDynamic("dockerUserCTA")(options.asInstanceOf[js.Any]).asInstanceOf[_empty | (/* 
  For more free scans that keep your images secure, sign up to Snyk at https://dockr.ly/3ePqVcp */ String)]
  
  inline def extractDataToSendFromResults(results: Any, mappedResults: Any, options: Options): OutputDataTypes = (^.asInstanceOf[js.Dynamic].applyDynamic("extractDataToSendFromResults")(results.asInstanceOf[js.Any], mappedResults.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[OutputDataTypes]
  
  inline def getDisplayedOutput(
    res: TestResult,
    options: Options & TestOptions,
    testedInfoText: String,
    localPackageTest: Any,
    projectType: SupportedProjectTypes,
    meta: String,
    prefix: String,
    multiProjAdvice: String,
    dockerAdvice: String
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getDisplayedOutput")(res.asInstanceOf[js.Any], options.asInstanceOf[js.Any], testedInfoText.asInstanceOf[js.Any], localPackageTest.asInstanceOf[js.Any], projectType.asInstanceOf[js.Any], meta.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], multiProjAdvice.asInstanceOf[js.Any], dockerAdvice.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def groupVulnerabilities(vulns: Any): StringDictionary[GroupedVuln] = ^.asInstanceOf[js.Dynamic].applyDynamic("groupVulnerabilities")(vulns.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[GroupedVuln]]
}
