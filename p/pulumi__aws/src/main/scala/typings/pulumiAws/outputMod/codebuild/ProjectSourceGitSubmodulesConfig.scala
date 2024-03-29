package typings.pulumiAws.outputMod.codebuild

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProjectSourceGitSubmodulesConfig extends StObject {
  
  /**
    * If set to true, fetches Git submodules for the AWS CodeBuild build project.
    */
  var fetchSubmodules: Boolean
}
object ProjectSourceGitSubmodulesConfig {
  
  inline def apply(fetchSubmodules: Boolean): ProjectSourceGitSubmodulesConfig = {
    val __obj = js.Dynamic.literal(fetchSubmodules = fetchSubmodules.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectSourceGitSubmodulesConfig]
  }
  
  extension [Self <: ProjectSourceGitSubmodulesConfig](x: Self) {
    
    inline def setFetchSubmodules(value: Boolean): Self = StObject.set(x, "fetchSubmodules", value.asInstanceOf[js.Any])
  }
}
