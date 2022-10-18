package typings.snyk

import typings.snyk.distLibEcosystemsTypesMod.Issue
import typings.snyk.distLibEcosystemsTypesMod.IssuesData
import typings.snyk.distLibEcosystemsTypesMod.ScanResult
import typings.snyk.distLibPolicyFindAndLoadPolicyMod.Policy
import typings.snyk.distLibTypesMod.Options
import typings.snyk.distLibTypesMod.PolicyOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibEcosystemsPolicyMod {
  
  @JSImport("snyk/dist/lib/ecosystems/policy", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def filterIgnoredIssues(issues: js.Array[Issue], issuesData: IssuesData): js.Tuple2[js.Array[Issue], IssuesData] = (^.asInstanceOf[js.Dynamic].applyDynamic("filterIgnoredIssues")(issues.asInstanceOf[js.Any], issuesData.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[js.Array[Issue], IssuesData]]
  inline def filterIgnoredIssues(issues: js.Array[Issue], issuesData: IssuesData, policy: Policy): js.Tuple2[js.Array[Issue], IssuesData] = (^.asInstanceOf[js.Dynamic].applyDynamic("filterIgnoredIssues")(issues.asInstanceOf[js.Any], issuesData.asInstanceOf[js.Any], policy.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[js.Array[Issue], IssuesData]]
  
  inline def findAndLoadPolicyForScanResult(scanResult: ScanResult, options: Options & PolicyOptions): js.Promise[js.UndefOr[js.Object]] = (^.asInstanceOf[js.Dynamic].applyDynamic("findAndLoadPolicyForScanResult")(scanResult.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.UndefOr[js.Object]]]
}
