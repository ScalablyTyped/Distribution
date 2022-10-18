package typings.snyk

import typings.snyk.distCliCommandsTestIacLocalExecutionTypesMod.IaCTestFlags
import typings.snyk.distCliCommandsTestIacLocalExecutionTypesMod.IacShareResultsFormat
import typings.snyk.distLibEcosystemsTypesMod.ScanResult
import typings.snyk.distLibPolicyFindAndLoadPolicyMod.Policy
import typings.snyk.distLibTypesMod.IacOutputMeta
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibIacEnvelopeFormattersMod {
  
  @JSImport("snyk/dist/lib/iac/envelope-formatters", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def convertIacResultToScanResult(iacResult: IacShareResultsFormat, policy: Unit, meta: IacOutputMeta, options: IaCTestFlags): ScanResult = (^.asInstanceOf[js.Dynamic].applyDynamic("convertIacResultToScanResult")(iacResult.asInstanceOf[js.Any], policy.asInstanceOf[js.Any], meta.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ScanResult]
  inline def convertIacResultToScanResult(iacResult: IacShareResultsFormat, policy: Policy, meta: IacOutputMeta, options: IaCTestFlags): ScanResult = (^.asInstanceOf[js.Dynamic].applyDynamic("convertIacResultToScanResult")(iacResult.asInstanceOf[js.Any], policy.asInstanceOf[js.Any], meta.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ScanResult]
}
