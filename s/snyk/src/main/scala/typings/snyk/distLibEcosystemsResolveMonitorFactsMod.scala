package typings.snyk

import org.scalablytyped.runtime.StringDictionary
import typings.snyk.distLibEcosystemsTypesMod.EcosystemMonitorError
import typings.snyk.distLibEcosystemsTypesMod.EcosystemMonitorResult
import typings.snyk.distLibEcosystemsTypesMod.ScanResult
import typings.snyk.distLibTypesMod.Contributor
import typings.snyk.distLibTypesMod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibEcosystemsResolveMonitorFactsMod {
  
  @JSImport("snyk/dist/lib/ecosystems/resolve-monitor-facts", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def resolveAndMonitorFacts(scans: StringDictionary[js.Array[ScanResult]], options: Options): js.Promise[js.Tuple2[js.Array[EcosystemMonitorResult], js.Array[EcosystemMonitorError]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveAndMonitorFacts")(scans.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Tuple2[js.Array[EcosystemMonitorResult], js.Array[EcosystemMonitorError]]]]
  inline def resolveAndMonitorFacts(
    scans: StringDictionary[js.Array[ScanResult]],
    options: Options,
    contributors: js.Array[Contributor]
  ): js.Promise[js.Tuple2[js.Array[EcosystemMonitorResult], js.Array[EcosystemMonitorError]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveAndMonitorFacts")(scans.asInstanceOf[js.Any], options.asInstanceOf[js.Any], contributors.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Tuple2[js.Array[EcosystemMonitorResult], js.Array[EcosystemMonitorError]]]]
}
