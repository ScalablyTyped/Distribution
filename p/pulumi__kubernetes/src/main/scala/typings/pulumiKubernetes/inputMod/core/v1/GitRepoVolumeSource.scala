package typings.pulumiKubernetes.inputMod.core.v1

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a volume that is populated with the contents of a git repository. Git repo volumes do not support ownership management. Git repo volumes support SELinux relabeling.
  *
  * DEPRECATED: GitRepo is deprecated. To provision a container with a git repo, mount an EmptyDir into an InitContainer that clones the repo using git, then mount the EmptyDir into the Pod's container.
  */
@js.native
trait GitRepoVolumeSource extends js.Object {
  /**
    * Target directory name. Must not contain or start with '..'.  If '.' is supplied, the volume directory will be the git repository.  Otherwise, if specified, the volume will contain the git repository in the subdirectory with the given name.
    */
  var directory: js.UndefOr[Input[String]] = js.native
  /**
    * Repository URL
    */
  var repository: Input[String] = js.native
  /**
    * Commit hash for the specified revision.
    */
  var revision: js.UndefOr[Input[String]] = js.native
}

object GitRepoVolumeSource {
  @scala.inline
  def apply(repository: Input[String]): GitRepoVolumeSource = {
    val __obj = js.Dynamic.literal(repository = repository.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitRepoVolumeSource]
  }
  @scala.inline
  implicit class GitRepoVolumeSourceOps[Self <: GitRepoVolumeSource] (val x: Self) extends AnyVal {
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
    def setRepository(value: Input[String]): Self = this.set("repository", value.asInstanceOf[js.Any])
    @scala.inline
    def setDirectory(value: Input[String]): Self = this.set("directory", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirectory: Self = this.set("directory", js.undefined)
    @scala.inline
    def setRevision(value: Input[String]): Self = this.set("revision", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRevision: Self = this.set("revision", js.undefined)
  }
  
}

