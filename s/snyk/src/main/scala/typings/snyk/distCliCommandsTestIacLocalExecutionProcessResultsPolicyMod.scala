package typings.snyk

import typings.snyk.anon.FilteredIssues
import typings.snyk.distCliCommandsTestIacLocalExecutionTypesMod.FormattedResult
import typings.snyk.distLibPolicyFindAndLoadPolicyMod.Policy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCliCommandsTestIacLocalExecutionProcessResultsPolicyMod {
  
  @JSImport("snyk/dist/cli/commands/test/iac/local-execution/process-results/policy", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def filterIgnoredIssues(policy: Unit, results: js.Array[FormattedResult]): FilteredIssues = (^.asInstanceOf[js.Dynamic].applyDynamic("filterIgnoredIssues")(policy.asInstanceOf[js.Any], results.asInstanceOf[js.Any])).asInstanceOf[FilteredIssues]
  inline def filterIgnoredIssues(policy: Policy, results: js.Array[FormattedResult]): FilteredIssues = (^.asInstanceOf[js.Dynamic].applyDynamic("filterIgnoredIssues")(policy.asInstanceOf[js.Any], results.asInstanceOf[js.Any])).asInstanceOf[FilteredIssues]
}
