package typings.snyk

import typings.snyk.distLibEcosystemsTypesMod.MonitorDependenciesResponse
import typings.snyk.distLibEcosystemsTypesMod.ScanResult
import typings.snyk.distLibPollingTypesMod.ResolutionMeta
import typings.snyk.distLibPollingTypesMod.ResolveFactsState
import typings.snyk.distLibTypesMod.Contributor
import typings.snyk.distLibTypesMod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibPollingPollingMonitorMod {
  
  @JSImport("snyk/dist/lib/polling/polling-monitor", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def pollingMonitorWithTokenUntilDone(token: String, isAsync: Boolean, options: Options, pollInterval: Double, attemptsCount: Double): js.Promise[MonitorDependenciesResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("pollingMonitorWithTokenUntilDone")(token.asInstanceOf[js.Any], isAsync.asInstanceOf[js.Any], options.asInstanceOf[js.Any], pollInterval.asInstanceOf[js.Any], attemptsCount.asInstanceOf[js.Any])).asInstanceOf[js.Promise[MonitorDependenciesResponse]]
  inline def pollingMonitorWithTokenUntilDone(
    token: String,
    isAsync: Boolean,
    options: Options,
    pollInterval: Double,
    attemptsCount: Double,
    maxAttempts: Double
  ): js.Promise[MonitorDependenciesResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("pollingMonitorWithTokenUntilDone")(token.asInstanceOf[js.Any], isAsync.asInstanceOf[js.Any], options.asInstanceOf[js.Any], pollInterval.asInstanceOf[js.Any], attemptsCount.asInstanceOf[js.Any], maxAttempts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[MonitorDependenciesResponse]]
  inline def pollingMonitorWithTokenUntilDone(
    token: String,
    isAsync: Boolean,
    options: Options,
    pollInterval: Double,
    attemptsCount: Double,
    maxAttempts: Double,
    resolutionMeta: Unit,
    contributors: js.Array[Contributor]
  ): js.Promise[MonitorDependenciesResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("pollingMonitorWithTokenUntilDone")(token.asInstanceOf[js.Any], isAsync.asInstanceOf[js.Any], options.asInstanceOf[js.Any], pollInterval.asInstanceOf[js.Any], attemptsCount.asInstanceOf[js.Any], maxAttempts.asInstanceOf[js.Any], resolutionMeta.asInstanceOf[js.Any], contributors.asInstanceOf[js.Any])).asInstanceOf[js.Promise[MonitorDependenciesResponse]]
  inline def pollingMonitorWithTokenUntilDone(
    token: String,
    isAsync: Boolean,
    options: Options,
    pollInterval: Double,
    attemptsCount: Double,
    maxAttempts: Double,
    resolutionMeta: ResolutionMeta
  ): js.Promise[MonitorDependenciesResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("pollingMonitorWithTokenUntilDone")(token.asInstanceOf[js.Any], isAsync.asInstanceOf[js.Any], options.asInstanceOf[js.Any], pollInterval.asInstanceOf[js.Any], attemptsCount.asInstanceOf[js.Any], maxAttempts.asInstanceOf[js.Any], resolutionMeta.asInstanceOf[js.Any])).asInstanceOf[js.Promise[MonitorDependenciesResponse]]
  inline def pollingMonitorWithTokenUntilDone(
    token: String,
    isAsync: Boolean,
    options: Options,
    pollInterval: Double,
    attemptsCount: Double,
    maxAttempts: Double,
    resolutionMeta: ResolutionMeta,
    contributors: js.Array[Contributor]
  ): js.Promise[MonitorDependenciesResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("pollingMonitorWithTokenUntilDone")(token.asInstanceOf[js.Any], isAsync.asInstanceOf[js.Any], options.asInstanceOf[js.Any], pollInterval.asInstanceOf[js.Any], attemptsCount.asInstanceOf[js.Any], maxAttempts.asInstanceOf[js.Any], resolutionMeta.asInstanceOf[js.Any], contributors.asInstanceOf[js.Any])).asInstanceOf[js.Promise[MonitorDependenciesResponse]]
  inline def pollingMonitorWithTokenUntilDone(
    token: String,
    isAsync: Boolean,
    options: Options,
    pollInterval: Double,
    attemptsCount: Double,
    maxAttempts: Unit,
    resolutionMeta: Unit,
    contributors: js.Array[Contributor]
  ): js.Promise[MonitorDependenciesResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("pollingMonitorWithTokenUntilDone")(token.asInstanceOf[js.Any], isAsync.asInstanceOf[js.Any], options.asInstanceOf[js.Any], pollInterval.asInstanceOf[js.Any], attemptsCount.asInstanceOf[js.Any], maxAttempts.asInstanceOf[js.Any], resolutionMeta.asInstanceOf[js.Any], contributors.asInstanceOf[js.Any])).asInstanceOf[js.Promise[MonitorDependenciesResponse]]
  inline def pollingMonitorWithTokenUntilDone(
    token: String,
    isAsync: Boolean,
    options: Options,
    pollInterval: Double,
    attemptsCount: Double,
    maxAttempts: Unit,
    resolutionMeta: ResolutionMeta
  ): js.Promise[MonitorDependenciesResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("pollingMonitorWithTokenUntilDone")(token.asInstanceOf[js.Any], isAsync.asInstanceOf[js.Any], options.asInstanceOf[js.Any], pollInterval.asInstanceOf[js.Any], attemptsCount.asInstanceOf[js.Any], maxAttempts.asInstanceOf[js.Any], resolutionMeta.asInstanceOf[js.Any])).asInstanceOf[js.Promise[MonitorDependenciesResponse]]
  inline def pollingMonitorWithTokenUntilDone(
    token: String,
    isAsync: Boolean,
    options: Options,
    pollInterval: Double,
    attemptsCount: Double,
    maxAttempts: Unit,
    resolutionMeta: ResolutionMeta,
    contributors: js.Array[Contributor]
  ): js.Promise[MonitorDependenciesResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("pollingMonitorWithTokenUntilDone")(token.asInstanceOf[js.Any], isAsync.asInstanceOf[js.Any], options.asInstanceOf[js.Any], pollInterval.asInstanceOf[js.Any], attemptsCount.asInstanceOf[js.Any], maxAttempts.asInstanceOf[js.Any], resolutionMeta.asInstanceOf[js.Any], contributors.asInstanceOf[js.Any])).asInstanceOf[js.Promise[MonitorDependenciesResponse]]
  
  inline def requestMonitorPollingToken(options: Options, isAsync: Boolean, scanResult: ScanResult): js.Promise[ResolveFactsState] = (^.asInstanceOf[js.Dynamic].applyDynamic("requestMonitorPollingToken")(options.asInstanceOf[js.Any], isAsync.asInstanceOf[js.Any], scanResult.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ResolveFactsState]]
}
