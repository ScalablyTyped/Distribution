package typings.snyk.distCliCommandsTestIacLocalExecutionTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TerraformPlanScanMode extends StObject
@JSImport("snyk/dist/cli/commands/test/iac/local-execution/types", "TerraformPlanScanMode")
@js.native
object TerraformPlanScanMode extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[TerraformPlanScanMode & String] = js.native
  
  @js.native
  sealed trait DeltaScan
    extends StObject
       with TerraformPlanScanMode
  /* "resource-changes" */ val DeltaScan: typings.snyk.distCliCommandsTestIacLocalExecutionTypesMod.TerraformPlanScanMode.DeltaScan & String = js.native
  
  @js.native
  sealed trait FullScan
    extends StObject
       with TerraformPlanScanMode
  /* "planned-values" */ val FullScan: typings.snyk.distCliCommandsTestIacLocalExecutionTypesMod.TerraformPlanScanMode.FullScan & String = js.native
}
