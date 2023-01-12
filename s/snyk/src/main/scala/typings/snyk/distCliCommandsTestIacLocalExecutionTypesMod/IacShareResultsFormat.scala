package typings.snyk.distCliCommandsTestIacLocalExecutionTypesMod

import typings.snyk.distLibIacConstantsMod.IacFileTypes
import typings.snyk.distLibIacConstantsMod.IacProjectType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IacShareResultsFormat extends StObject {
  
  var filePath: String
  
  var fileType: IacFileTypes
  
  var projectName: String
  
  var projectType: IacProjectType
  
  var targetFile: String
  
  var violatedPolicies: js.Array[PolicyMetadata]
}
object IacShareResultsFormat {
  
  inline def apply(
    filePath: String,
    fileType: IacFileTypes,
    projectName: String,
    projectType: IacProjectType,
    targetFile: String,
    violatedPolicies: js.Array[PolicyMetadata]
  ): IacShareResultsFormat = {
    val __obj = js.Dynamic.literal(filePath = filePath.asInstanceOf[js.Any], fileType = fileType.asInstanceOf[js.Any], projectName = projectName.asInstanceOf[js.Any], projectType = projectType.asInstanceOf[js.Any], targetFile = targetFile.asInstanceOf[js.Any], violatedPolicies = violatedPolicies.asInstanceOf[js.Any])
    __obj.asInstanceOf[IacShareResultsFormat]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IacShareResultsFormat] (val x: Self) extends AnyVal {
    
    inline def setFilePath(value: String): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
    
    inline def setFileType(value: IacFileTypes): Self = StObject.set(x, "fileType", value.asInstanceOf[js.Any])
    
    inline def setProjectName(value: String): Self = StObject.set(x, "projectName", value.asInstanceOf[js.Any])
    
    inline def setProjectType(value: IacProjectType): Self = StObject.set(x, "projectType", value.asInstanceOf[js.Any])
    
    inline def setTargetFile(value: String): Self = StObject.set(x, "targetFile", value.asInstanceOf[js.Any])
    
    inline def setViolatedPolicies(value: js.Array[PolicyMetadata]): Self = StObject.set(x, "violatedPolicies", value.asInstanceOf[js.Any])
    
    inline def setViolatedPoliciesVarargs(value: PolicyMetadata*): Self = StObject.set(x, "violatedPolicies", js.Array(value*))
  }
}
