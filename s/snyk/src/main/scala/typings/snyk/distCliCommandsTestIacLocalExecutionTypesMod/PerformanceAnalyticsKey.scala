package typings.snyk.distCliCommandsTestIacLocalExecutionTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PerformanceAnalyticsKey extends StObject
@JSImport("snyk/dist/cli/commands/test/iac/local-execution/types", "PerformanceAnalyticsKey")
@js.native
object PerformanceAnalyticsKey extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[PerformanceAnalyticsKey & String] = js.native
  
  @js.native
  sealed trait CacheCleanup
    extends StObject
       with PerformanceAnalyticsKey
  /* "cache-cleanup-ms" */ val CacheCleanup: typings.snyk.distCliCommandsTestIacLocalExecutionTypesMod.PerformanceAnalyticsKey.CacheCleanup & String = js.native
  
  @js.native
  sealed trait CustomSeverities
    extends StObject
       with PerformanceAnalyticsKey
  /* "custom-severities-ms" */ val CustomSeverities: typings.snyk.distCliCommandsTestIacLocalExecutionTypesMod.PerformanceAnalyticsKey.CustomSeverities & String = js.native
  
  @js.native
  sealed trait FileLoading
    extends StObject
       with PerformanceAnalyticsKey
  /* "file-loading-ms" */ val FileLoading: typings.snyk.distCliCommandsTestIacLocalExecutionTypesMod.PerformanceAnalyticsKey.FileLoading & String = js.native
  
  @js.native
  sealed trait FileParsing
    extends StObject
       with PerformanceAnalyticsKey
  /* "file-parsing-ms" */ val FileParsing: typings.snyk.distCliCommandsTestIacLocalExecutionTypesMod.PerformanceAnalyticsKey.FileParsing & String = js.native
  
  @js.native
  sealed trait FileScanning
    extends StObject
       with PerformanceAnalyticsKey
  /* "file-scanning-ms" */ val FileScanning: typings.snyk.distCliCommandsTestIacLocalExecutionTypesMod.PerformanceAnalyticsKey.FileScanning & String = js.native
  
  @js.native
  sealed trait InitLocalCache
    extends StObject
       with PerformanceAnalyticsKey
  /* "cache-init-ms" */ val InitLocalCache: typings.snyk.distCliCommandsTestIacLocalExecutionTypesMod.PerformanceAnalyticsKey.InitLocalCache & String = js.native
  
  @js.native
  sealed trait OrgSettings
    extends StObject
       with PerformanceAnalyticsKey
  /* "org-settings-ms" */ val OrgSettings: typings.snyk.distCliCommandsTestIacLocalExecutionTypesMod.PerformanceAnalyticsKey.OrgSettings & String = js.native
  
  @js.native
  sealed trait ResultFormatting
    extends StObject
       with PerformanceAnalyticsKey
  /* "results-formatting-ms" */ val ResultFormatting: typings.snyk.distCliCommandsTestIacLocalExecutionTypesMod.PerformanceAnalyticsKey.ResultFormatting & String = js.native
  
  @js.native
  sealed trait Total
    extends StObject
       with PerformanceAnalyticsKey
  /* "total-iac-ms" */ val Total: typings.snyk.distCliCommandsTestIacLocalExecutionTypesMod.PerformanceAnalyticsKey.Total & String = js.native
  
  @js.native
  sealed trait UsageTracking
    extends StObject
       with PerformanceAnalyticsKey
  /* "usage-tracking-ms" */ val UsageTracking: typings.snyk.distCliCommandsTestIacLocalExecutionTypesMod.PerformanceAnalyticsKey.UsageTracking & String = js.native
}
