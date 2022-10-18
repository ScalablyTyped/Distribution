package typings.snyk

import typings.snyk.distCliCommandsTestIacLocalExecutionTypesMod.IacCustomPolicies
import typings.snyk.distCliCommandsTestIacLocalExecutionTypesMod.IacFileScanResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCliCommandsTestIacLocalExecutionOrgSettingsApplyCustomSeveritiesMod {
  
  @JSImport("snyk/dist/cli/commands/test/iac/local-execution/org-settings/apply-custom-severities", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def applyCustomSeverities(scannedFiles: js.Array[IacFileScanResult], customPolicies: IacCustomPolicies): js.Promise[js.Array[IacFileScanResult]] = (^.asInstanceOf[js.Dynamic].applyDynamic("applyCustomSeverities")(scannedFiles.asInstanceOf[js.Any], customPolicies.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[IacFileScanResult]]]
}
