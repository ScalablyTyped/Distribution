package typings.pulumiAws.inputMod.codebuild

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProjectSecondarySourceGitSubmodulesConfig extends StObject {
  
  /**
    * If set to true, fetches Git submodules for the AWS CodeBuild build project.
    */
  var fetchSubmodules: Input[Boolean]
}
object ProjectSecondarySourceGitSubmodulesConfig {
  
  @scala.inline
  def apply(fetchSubmodules: Input[Boolean]): ProjectSecondarySourceGitSubmodulesConfig = {
    val __obj = js.Dynamic.literal(fetchSubmodules = fetchSubmodules.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectSecondarySourceGitSubmodulesConfig]
  }
  
  @scala.inline
  implicit class ProjectSecondarySourceGitSubmodulesConfigMutableBuilder[Self <: ProjectSecondarySourceGitSubmodulesConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFetchSubmodules(value: Input[Boolean]): Self = StObject.set(x, "fetchSubmodules", value.asInstanceOf[js.Any])
  }
}
