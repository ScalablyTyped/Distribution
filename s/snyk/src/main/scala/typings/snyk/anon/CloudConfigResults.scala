package typings.snyk.anon

import typings.snyk.distCliCommandsTestIacLocalExecutionTypesMod.PolicyMetadata
import typings.snyk.distLibIacConstantsMod.IacProjectTypes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CloudConfigResults extends StObject {
  
  var cloudConfigResults: js.Array[PolicyMetadata]
  
  var projectType: IacProjectTypes
}
object CloudConfigResults {
  
  inline def apply(cloudConfigResults: js.Array[PolicyMetadata], projectType: IacProjectTypes): CloudConfigResults = {
    val __obj = js.Dynamic.literal(cloudConfigResults = cloudConfigResults.asInstanceOf[js.Any], projectType = projectType.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloudConfigResults]
  }
  
  extension [Self <: CloudConfigResults](x: Self) {
    
    inline def setCloudConfigResults(value: js.Array[PolicyMetadata]): Self = StObject.set(x, "cloudConfigResults", value.asInstanceOf[js.Any])
    
    inline def setCloudConfigResultsVarargs(value: PolicyMetadata*): Self = StObject.set(x, "cloudConfigResults", js.Array(value*))
    
    inline def setProjectType(value: IacProjectTypes): Self = StObject.set(x, "projectType", value.asInstanceOf[js.Any])
  }
}
