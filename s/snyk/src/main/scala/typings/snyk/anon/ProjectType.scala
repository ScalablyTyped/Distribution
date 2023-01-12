package typings.snyk.anon

import typings.snyk.distLibSnykTestIacTestResultMod.AnnotatedIacIssue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProjectType extends StObject {
  
  var cloudConfigResults: js.Array[AnnotatedIacIssue]
  
  var projectType: String
}
object ProjectType {
  
  inline def apply(cloudConfigResults: js.Array[AnnotatedIacIssue], projectType: String): ProjectType = {
    val __obj = js.Dynamic.literal(cloudConfigResults = cloudConfigResults.asInstanceOf[js.Any], projectType = projectType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ProjectType] (val x: Self) extends AnyVal {
    
    inline def setCloudConfigResults(value: js.Array[AnnotatedIacIssue]): Self = StObject.set(x, "cloudConfigResults", value.asInstanceOf[js.Any])
    
    inline def setCloudConfigResultsVarargs(value: AnnotatedIacIssue*): Self = StObject.set(x, "cloudConfigResults", js.Array(value*))
    
    inline def setProjectType(value: String): Self = StObject.set(x, "projectType", value.asInstanceOf[js.Any])
  }
}
