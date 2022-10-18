package typings.snyk.distLibTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IacOutputMeta extends StObject {
  
  var gitRemoteUrl: js.UndefOr[String] = js.undefined
  
  var orgName: String
  
  var projectName: String
}
object IacOutputMeta {
  
  inline def apply(orgName: String, projectName: String): IacOutputMeta = {
    val __obj = js.Dynamic.literal(orgName = orgName.asInstanceOf[js.Any], projectName = projectName.asInstanceOf[js.Any])
    __obj.asInstanceOf[IacOutputMeta]
  }
  
  extension [Self <: IacOutputMeta](x: Self) {
    
    inline def setGitRemoteUrl(value: String): Self = StObject.set(x, "gitRemoteUrl", value.asInstanceOf[js.Any])
    
    inline def setGitRemoteUrlUndefined: Self = StObject.set(x, "gitRemoteUrl", js.undefined)
    
    inline def setOrgName(value: String): Self = StObject.set(x, "orgName", value.asInstanceOf[js.Any])
    
    inline def setProjectName(value: String): Self = StObject.set(x, "projectName", value.asInstanceOf[js.Any])
  }
}
