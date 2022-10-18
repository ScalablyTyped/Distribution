package typings.snyk

import typings.sarif.mod.Log
import typings.sarif.mod.ReportingDescriptor
import typings.sarif.mod.Result
import typings.snyk.distLibSnykTestLegacyMod.AnnotatedIssue
import typings.snyk.distLibSnykTestLegacyMod.TestResult
import typings.snyk.snykStrings.error_
import typings.snyk.snykStrings.note
import typings.snyk.snykStrings.warning
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibFormattersOpenSourceSarifOutputMod {
  
  @JSImport("snyk/dist/lib/formatters/open-source-sarif-output", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createSarifOutputForOpenSource(testResults: js.Array[TestResult]): Log = ^.asInstanceOf[js.Dynamic].applyDynamic("createSarifOutputForOpenSource")(testResults.asInstanceOf[js.Any]).asInstanceOf[Log]
  
  inline def getLevel(vuln: AnnotatedIssue): error_ | warning | note = ^.asInstanceOf[js.Dynamic].applyDynamic("getLevel")(vuln.asInstanceOf[js.Any]).asInstanceOf[error_ | warning | note]
  
  inline def getResults(testResult: Any): js.Array[Result] = ^.asInstanceOf[js.Dynamic].applyDynamic("getResults")(testResult.asInstanceOf[js.Any]).asInstanceOf[js.Array[Result]]
  
  inline def getRules(testResult: TestResult): js.Array[ReportingDescriptor] = ^.asInstanceOf[js.Dynamic].applyDynamic("getRules")(testResult.asInstanceOf[js.Any]).asInstanceOf[js.Array[ReportingDescriptor]]
}
