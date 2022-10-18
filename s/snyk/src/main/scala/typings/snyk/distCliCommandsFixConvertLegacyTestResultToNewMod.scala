package typings.snyk

import typings.snyk.distLibSnykTestLegacyMod.TestResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCliCommandsFixConvertLegacyTestResultToNewMod {
  
  @JSImport("snyk/dist/cli/commands/fix/convert-legacy-test-result-to-new", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def convertLegacyTestResultToNew(testResult: TestResult): typings.snyk.distLibEcosystemsTypesMod.TestResult = ^.asInstanceOf[js.Dynamic].applyDynamic("convertLegacyTestResultToNew")(testResult.asInstanceOf[js.Any]).asInstanceOf[typings.snyk.distLibEcosystemsTypesMod.TestResult]
}
