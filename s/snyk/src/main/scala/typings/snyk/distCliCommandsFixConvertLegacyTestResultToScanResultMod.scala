package typings.snyk

import typings.snyk.distLibEcosystemsTypesMod.ScanResult
import typings.snyk.distLibSnykTestLegacyMod.TestResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCliCommandsFixConvertLegacyTestResultToScanResultMod {
  
  @JSImport("snyk/dist/cli/commands/fix/convert-legacy-test-result-to-scan-result", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def convertLegacyTestResultToScanResult(testResult: TestResult): ScanResult = ^.asInstanceOf[js.Dynamic].applyDynamic("convertLegacyTestResultToScanResult")(testResult.asInstanceOf[js.Any]).asInstanceOf[ScanResult]
}
