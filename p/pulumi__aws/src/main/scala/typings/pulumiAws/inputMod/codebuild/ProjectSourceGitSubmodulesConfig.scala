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
  @scala.inline
  implicit class ProjectSourceGitSubmodulesConfigOps[Self <: ProjectSourceGitSubmodulesConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFetchSubmodules(value: Input[Boolean]): Self = this.set("fetchSubmodules", value.asInstanceOf[js.Any])
  }
  
}

