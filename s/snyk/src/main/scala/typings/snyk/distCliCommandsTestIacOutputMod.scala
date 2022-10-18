package typings.snyk

import typings.ora.mod.Ora
import typings.snyk.anon.IacIgnoredIssuesCount
import typings.snyk.anon.IsIacCustomRulesEntitlementEnabled
import typings.snyk.distCliCommandsTestIacLocalExecutionTypesMod.IaCTestFlags
import typings.snyk.distCliCommandsTypesMod.TestCommandResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCliCommandsTestIacOutputMod {
  
  @JSImport("snyk/dist/cli/commands/test/iac/output", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def buildOutput(
    hasResultsOptionsIsIacShareCliResultsCustomRulesSupportedIsIacCustomRulesEntitlementEnabledIacOutputMetaIacScanFailuresIacIgnoredIssuesCountTestSpinner: IacIgnoredIssuesCount
  ): TestCommandResult = ^.asInstanceOf[js.Dynamic].applyDynamic("buildOutput")(hasResultsOptionsIsIacShareCliResultsCustomRulesSupportedIsIacCustomRulesEntitlementEnabledIacOutputMetaIacScanFailuresIacIgnoredIssuesCountTestSpinner.asInstanceOf[js.Any]).asInstanceOf[TestCommandResult]
  
  inline def buildShareResultsSummary(
    hasOrgNameProjectNameOptionsIsIacCustomRulesEntitlementEnabledIsIacShareCliResultsCustomRulesSupported: IsIacCustomRulesEntitlementEnabled
  ): String = ^.asInstanceOf[js.Dynamic].applyDynamic("buildShareResultsSummary")(hasOrgNameProjectNameOptionsIsIacCustomRulesEntitlementEnabledIsIacShareCliResultsCustomRulesSupported.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def buildShareResultsSummaryV2(
    hasOrgNameProjectNameOptionsIsIacCustomRulesEntitlementEnabledIsIacShareCliResultsCustomRulesSupported: IsIacCustomRulesEntitlementEnabled
  ): String = ^.asInstanceOf[js.Dynamic].applyDynamic("buildShareResultsSummaryV2")(hasOrgNameProjectNameOptionsIsIacCustomRulesEntitlementEnabledIsIacShareCliResultsCustomRulesSupported.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def buildSpinner(options: IaCTestFlags): js.UndefOr[Ora] = ^.asInstanceOf[js.Dynamic].applyDynamic("buildSpinner")(options.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Ora]]
  
  inline def printHeader(options: IaCTestFlags): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("printHeader")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def shouldPrintShareResultsTip(options: IaCTestFlags): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("shouldPrintShareResultsTip")(options.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
