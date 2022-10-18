package typings.snyk.distCliCommandsTestIacLocalExecutionTypesMod

import typings.snyk.distLibIacConstantsMod.IacFileTypes
import typings.snyk.distLibIacConstantsMod.IacProjectType
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IacFileScanResult
  extends StObject
     with IacFileParsed {
  
  var violatedPolicies: js.Array[PolicyMetadata]
}
object IacFileScanResult {
  
  inline def apply(
    engineType: EngineType,
    fileContent: String,
    filePath: String,
    fileType: IacFileTypes,
    jsonContent: (Record[String, Any]) | TerraformScanInput,
    projectType: IacProjectType,
    violatedPolicies: js.Array[PolicyMetadata]
  ): IacFileScanResult = {
    val __obj = js.Dynamic.literal(engineType = engineType.asInstanceOf[js.Any], fileContent = fileContent.asInstanceOf[js.Any], filePath = filePath.asInstanceOf[js.Any], fileType = fileType.asInstanceOf[js.Any], jsonContent = jsonContent.asInstanceOf[js.Any], projectType = projectType.asInstanceOf[js.Any], violatedPolicies = violatedPolicies.asInstanceOf[js.Any])
    __obj.asInstanceOf[IacFileScanResult]
  }
  
  extension [Self <: IacFileScanResult](x: Self) {
    
    inline def setViolatedPolicies(value: js.Array[PolicyMetadata]): Self = StObject.set(x, "violatedPolicies", value.asInstanceOf[js.Any])
    
    inline def setViolatedPoliciesVarargs(value: PolicyMetadata*): Self = StObject.set(x, "violatedPolicies", js.Array(value*))
  }
}
