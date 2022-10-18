package typings.snyk

import typings.snyk.distLibEcosystemsTypesMod.ScanResult
import typings.snyk.distLibEcosystemsUnmanagedTypesMod.CreateDepGraphResponse
import typings.snyk.distLibEcosystemsUnmanagedTypesMod.FileHashes
import typings.snyk.distLibEcosystemsUnmanagedTypesMod.GetDepGraphResponse
import typings.snyk.distLibEcosystemsUnmanagedTypesMod.GetIssuesResponse
import typings.snyk.distLibEcosystemsUnmanagedTypesMod.IssuesRequestAttributes
import typings.snyk.distLibPollingTypesMod.ResolveAndTestFactsResponse
import typings.snyk.distLibSnykTestLegacyMod.TestDependenciesResult
import typings.snyk.distLibTypesMod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibPollingPollingTestMod {
  
  @JSImport("snyk/dist/lib/polling/polling-test", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createDepGraph(hashes: FileHashes, orgId: String): js.Promise[CreateDepGraphResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("createDepGraph")(hashes.asInstanceOf[js.Any], orgId.asInstanceOf[js.Any])).asInstanceOf[js.Promise[CreateDepGraphResponse]]
  
  inline def getDepGraph(id: String, orgId: String): js.Promise[GetDepGraphResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("getDepGraph")(id.asInstanceOf[js.Any], orgId.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetDepGraphResponse]]
  
  inline def getIssues(issuesRequestAttributes: IssuesRequestAttributes, orgId: String): js.Promise[GetIssuesResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("getIssues")(issuesRequestAttributes.asInstanceOf[js.Any], orgId.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetIssuesResponse]]
  
  inline def pollingTestWithTokenUntilDone(token: String, `type`: String, options: Options, pollInterval: Double, attemptsCount: Double): js.Promise[TestDependenciesResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("pollingTestWithTokenUntilDone")(token.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any], pollInterval.asInstanceOf[js.Any], attemptsCount.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TestDependenciesResult]]
  inline def pollingTestWithTokenUntilDone(
    token: String,
    `type`: String,
    options: Options,
    pollInterval: Double,
    attemptsCount: Double,
    maxAttempts: Double
  ): js.Promise[TestDependenciesResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("pollingTestWithTokenUntilDone")(token.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any], pollInterval.asInstanceOf[js.Any], attemptsCount.asInstanceOf[js.Any], maxAttempts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TestDependenciesResult]]
  
  inline def requestTestPollingToken(options: Options, isAsync: Boolean, scanResult: ScanResult): js.Promise[ResolveAndTestFactsResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("requestTestPollingToken")(options.asInstanceOf[js.Any], isAsync.asInstanceOf[js.Any], scanResult.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ResolveAndTestFactsResponse]]
}
