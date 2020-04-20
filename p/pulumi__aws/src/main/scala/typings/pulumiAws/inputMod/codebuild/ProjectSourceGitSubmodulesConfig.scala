package typings.pulumiAws.inputMod.codebuild

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProjectSourceGitSubmodulesConfig extends js.Object {
  /**
    * If set to true, fetches Git submodules for the AWS CodeBuild build project.
    */
  var fetchSubmodules: Input[Boolean] = js.native
}

object ProjectSourceGitSubmodulesConfig {
  @scala.inline
  def apply(fetchSubmodules: Input[Boolean]): ProjectSourceGitSubmodulesConfig = {
    val __obj = js.Dynamic.literal(fetchSubmodules = fetchSubmodules.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectSourceGitSubmodulesConfig]
  }
}

