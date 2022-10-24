package typings.snyk

import typings.snyk.distLibEcosystemsTypesMod.ScanResult
import typings.snyk.distLibPollingTypesMod.ResolutionMeta
import typings.snyk.distLibPollingTypesMod.ResolveAndMonitorFactsResponse
import typings.snyk.distLibPollingTypesMod.ResolveAndTestFactsResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibPollingCommonMod {
  
  @JSImport("snyk/dist/lib/polling/common", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def delayNextStep(attemptsCount: Double, maxAttempts: Double, pollInterval: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("delayNextStep")(attemptsCount.asInstanceOf[js.Any], maxAttempts.asInstanceOf[js.Any], pollInterval.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def extractResolutionMetaFromScanResult(param0: ScanResult): ResolutionMeta = ^.asInstanceOf[js.Dynamic].applyDynamic("extractResolutionMetaFromScanResult")(param0.asInstanceOf[js.Any]).asInstanceOf[ResolutionMeta]
  
  inline def handleProcessingStatus(response: ResolveAndMonitorFactsResponse): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("handleProcessingStatus")(response.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def handleProcessingStatus(response: ResolveAndTestFactsResponse): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("handleProcessingStatus")(response.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
