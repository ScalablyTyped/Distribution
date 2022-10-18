package typings.snyk

import typings.snyk.distCliCommandsMonitorTypesMod.BadResult
import typings.snyk.distCliCommandsMonitorTypesMod.GoodResult
import typings.snyk.distLibEcosystemsTypesMod.Ecosystem
import typings.snyk.distLibEcosystemsTypesMod.EcosystemMonitorError
import typings.snyk.distLibEcosystemsTypesMod.EcosystemMonitorResult
import typings.snyk.distLibEcosystemsTypesMod.MonitorDependenciesRequest
import typings.snyk.distLibEcosystemsTypesMod.ScanResult
import typings.snyk.distLibTypesMod.Contributor
import typings.snyk.distLibTypesMod.Options
import typings.snyk.distLibTypesMod.PolicyOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibEcosystemsMonitorMod {
  
  @JSImport("snyk/dist/lib/ecosystems/monitor", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def generateMonitorDependenciesRequest(scanResult: ScanResult, options: Options): js.Promise[MonitorDependenciesRequest] = (^.asInstanceOf[js.Dynamic].applyDynamic("generateMonitorDependenciesRequest")(scanResult.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[MonitorDependenciesRequest]]
  
  inline def getFormattedMonitorOutput(
    results: js.Array[GoodResult | BadResult],
    monitorResults: js.Array[EcosystemMonitorResult],
    errors: js.Array[EcosystemMonitorError],
    options: Options
  ): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFormattedMonitorOutput")(results.asInstanceOf[js.Any], monitorResults.asInstanceOf[js.Any], errors.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  inline def monitorEcosystem(ecosystem: Ecosystem, paths: js.Array[String], options: Options & PolicyOptions): js.Promise[js.Tuple2[js.Array[EcosystemMonitorResult], js.Array[EcosystemMonitorError]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("monitorEcosystem")(ecosystem.asInstanceOf[js.Any], paths.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Tuple2[js.Array[EcosystemMonitorResult], js.Array[EcosystemMonitorError]]]]
  inline def monitorEcosystem(
    ecosystem: Ecosystem,
    paths: js.Array[String],
    options: Options & PolicyOptions,
    contributors: js.Array[Contributor]
  ): js.Promise[js.Tuple2[js.Array[EcosystemMonitorResult], js.Array[EcosystemMonitorError]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("monitorEcosystem")(ecosystem.asInstanceOf[js.Any], paths.asInstanceOf[js.Any], options.asInstanceOf[js.Any], contributors.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Tuple2[js.Array[EcosystemMonitorResult], js.Array[EcosystemMonitorError]]]]
}
