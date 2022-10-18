package typings.snyk

import typings.snyk.anon.IgnoredIssuesCount
import typings.snyk.distCliCommandsTestIacLocalExecutionTypesMod.FormattedResult
import typings.snyk.distCliCommandsTestIacLocalExecutionTypesMod.PerformanceAnalyticsKey
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCliCommandsTestIacLocalExecutionAnalyticsMod {
  
  @JSImport("snyk/dist/cli/commands/test/iac/local-execution/analytics", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addIacAnalytics(formattedResults: js.Array[FormattedResult], opts: IgnoredIssuesCount): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addIacAnalytics")(formattedResults.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def addIacDriftAnalytics(
    analysis: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DriftAnalysis */ Any,
    options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DescribeOptions */ Any
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addIacDriftAnalytics")(analysis.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("snyk/dist/cli/commands/test/iac/local-execution/analytics", "performanceAnalyticsObject")
  @js.native
  val performanceAnalyticsObject: Record[PerformanceAnalyticsKey, Double | Null] = js.native
}
