package typings.snyk

import typings.snyk.anon.IsFullScan
import typings.snyk.distCliCommandsTestIacLocalExecutionTypesMod.IacFileData
import typings.snyk.distCliCommandsTestIacLocalExecutionTypesMod.IacFileParsed
import typings.snyk.distCliCommandsTestIacLocalExecutionTypesMod.TerraformPlanJson
import typings.snyk.distLibErrorsMod.CustomError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCliCommandsTestIacLocalExecutionParsersTerraformPlanParserMod {
  
  @JSImport("snyk/dist/cli/commands/test/iac/local-execution/parsers/terraform-plan-parser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("snyk/dist/cli/commands/test/iac/local-execution/parsers/terraform-plan-parser", "FailedToExtractResourcesInTerraformPlanError")
  @js.native
  open class FailedToExtractResourcesInTerraformPlanError () extends CustomError {
    def this(message: String) = this()
  }
  
  inline def isTerraformPlan(terraformPlanJson: TerraformPlanJson): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTerraformPlan")(terraformPlanJson.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def tryParsingTerraformPlan(terraformPlanFile: IacFileData, terraformPlanJson: TerraformPlanJson): js.Array[IacFileParsed] = (^.asInstanceOf[js.Dynamic].applyDynamic("tryParsingTerraformPlan")(terraformPlanFile.asInstanceOf[js.Any], terraformPlanJson.asInstanceOf[js.Any])).asInstanceOf[js.Array[IacFileParsed]]
  inline def tryParsingTerraformPlan(terraformPlanFile: IacFileData, terraformPlanJson: TerraformPlanJson, param2: IsFullScan): js.Array[IacFileParsed] = (^.asInstanceOf[js.Dynamic].applyDynamic("tryParsingTerraformPlan")(terraformPlanFile.asInstanceOf[js.Any], terraformPlanJson.asInstanceOf[js.Any], param2.asInstanceOf[js.Any])).asInstanceOf[js.Array[IacFileParsed]]
}
