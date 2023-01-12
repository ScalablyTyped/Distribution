package typings.snyk.distLibTypesMod

import typings.snyk.distLibSnykTestCommonMod.FailOn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TestOptions extends StObject {
  
  var command: js.UndefOr[String] = js.undefined
  
  var failOn: js.UndefOr[FailOn] = js.undefined
  
  var gradleSubProject: js.UndefOr[Boolean] = js.undefined
  
  var initScript: js.UndefOr[String] = js.undefined
  
  var isDockerUser: js.UndefOr[Boolean] = js.undefined
  
  var pruneRepeatedSubdependencies: js.UndefOr[Boolean] = js.undefined
  
  var showVulnPaths: ShowVulnPaths
  
  var testDepGraphDockerEndpoint: js.UndefOr[String | Null] = js.undefined
  
  var traverseNodeModules: js.UndefOr[Boolean] = js.undefined
  
  var yarnWorkspaces: js.UndefOr[Boolean] = js.undefined
}
object TestOptions {
  
  inline def apply(showVulnPaths: ShowVulnPaths): TestOptions = {
    val __obj = js.Dynamic.literal(showVulnPaths = showVulnPaths.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TestOptions] (val x: Self) extends AnyVal {
    
    inline def setCommand(value: String): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
    
    inline def setCommandUndefined: Self = StObject.set(x, "command", js.undefined)
    
    inline def setFailOn(value: FailOn): Self = StObject.set(x, "failOn", value.asInstanceOf[js.Any])
    
    inline def setFailOnUndefined: Self = StObject.set(x, "failOn", js.undefined)
    
    inline def setGradleSubProject(value: Boolean): Self = StObject.set(x, "gradleSubProject", value.asInstanceOf[js.Any])
    
    inline def setGradleSubProjectUndefined: Self = StObject.set(x, "gradleSubProject", js.undefined)
    
    inline def setInitScript(value: String): Self = StObject.set(x, "initScript", value.asInstanceOf[js.Any])
    
    inline def setInitScriptUndefined: Self = StObject.set(x, "initScript", js.undefined)
    
    inline def setIsDockerUser(value: Boolean): Self = StObject.set(x, "isDockerUser", value.asInstanceOf[js.Any])
    
    inline def setIsDockerUserUndefined: Self = StObject.set(x, "isDockerUser", js.undefined)
    
    inline def setPruneRepeatedSubdependencies(value: Boolean): Self = StObject.set(x, "pruneRepeatedSubdependencies", value.asInstanceOf[js.Any])
    
    inline def setPruneRepeatedSubdependenciesUndefined: Self = StObject.set(x, "pruneRepeatedSubdependencies", js.undefined)
    
    inline def setShowVulnPaths(value: ShowVulnPaths): Self = StObject.set(x, "showVulnPaths", value.asInstanceOf[js.Any])
    
    inline def setTestDepGraphDockerEndpoint(value: String): Self = StObject.set(x, "testDepGraphDockerEndpoint", value.asInstanceOf[js.Any])
    
    inline def setTestDepGraphDockerEndpointNull: Self = StObject.set(x, "testDepGraphDockerEndpoint", null)
    
    inline def setTestDepGraphDockerEndpointUndefined: Self = StObject.set(x, "testDepGraphDockerEndpoint", js.undefined)
    
    inline def setTraverseNodeModules(value: Boolean): Self = StObject.set(x, "traverseNodeModules", value.asInstanceOf[js.Any])
    
    inline def setTraverseNodeModulesUndefined: Self = StObject.set(x, "traverseNodeModules", js.undefined)
    
    inline def setYarnWorkspaces(value: Boolean): Self = StObject.set(x, "yarnWorkspaces", value.asInstanceOf[js.Any])
    
    inline def setYarnWorkspacesUndefined: Self = StObject.set(x, "yarnWorkspaces", js.undefined)
  }
}
