package typings.pulumiAws.outputMod.codebuild

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProjectSourceGitSubmodulesConfig extends js.Object {
  /**
    * If set to true, fetches Git submodules for the AWS CodeBuild build project.
    */
  var fetchSubmodules: Boolean = js.native
}

object ProjectSourceGitSubmodulesConfig {
  @scala.inline
  def apply(fetchSubmodules: Boolean): ProjectSourceGitSubmodulesConfig = {
    val __obj = js.Dynamic.literal(fetchSubmodules = fetchSubmodules.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ProjectSourceGitSubmodulesConfig]
  }
}

