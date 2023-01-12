package typings.snyk.distCliCommandsTestIacLocalExecutionTypesMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShareResultsOutput extends StObject {
  
  var gitRemoteUrl: js.UndefOr[String] = js.undefined
  
  var projectPublicIds: StringDictionary[String]
}
object ShareResultsOutput {
  
  inline def apply(projectPublicIds: StringDictionary[String]): ShareResultsOutput = {
    val __obj = js.Dynamic.literal(projectPublicIds = projectPublicIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShareResultsOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ShareResultsOutput] (val x: Self) extends AnyVal {
    
    inline def setGitRemoteUrl(value: String): Self = StObject.set(x, "gitRemoteUrl", value.asInstanceOf[js.Any])
    
    inline def setGitRemoteUrlUndefined: Self = StObject.set(x, "gitRemoteUrl", js.undefined)
    
    inline def setProjectPublicIds(value: StringDictionary[String]): Self = StObject.set(x, "projectPublicIds", value.asInstanceOf[js.Any])
  }
}
