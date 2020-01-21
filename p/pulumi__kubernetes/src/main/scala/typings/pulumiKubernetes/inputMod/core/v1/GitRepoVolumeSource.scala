package typings.pulumiKubernetes.inputMod.core.v1

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a volume that is populated with the contents of a git repository. Git repo volumes
  * do not support ownership management. Git repo volumes support SELinux relabeling.
  *
  * DEPRECATED: GitRepo is deprecated. To provision a container with a git repo, mount an
  * EmptyDir into an InitContainer that clones the repo using git, then mount the EmptyDir into
  * the Pod's container.
  */
trait GitRepoVolumeSource extends js.Object {
  /**
    * Target directory name. Must not contain or start with '..'.  If '.' is supplied, the volume
    * directory will be the git repository.  Otherwise, if specified, the volume will contain the
    * git repository in the subdirectory with the given name.
    */
  var directory: js.UndefOr[Input[String]] = js.undefined
  /**
    * Repository URL
    */
  var repository: Input[String]
  /**
    * Commit hash for the specified revision.
    */
  var revision: js.UndefOr[Input[String]] = js.undefined
}

object GitRepoVolumeSource {
  @scala.inline
  def apply(repository: Input[String], directory: Input[String] = null, revision: Input[String] = null): GitRepoVolumeSource = {
    val __obj = js.Dynamic.literal(repository = repository.asInstanceOf[js.Any])
    if (directory != null) __obj.updateDynamic("directory")(directory.asInstanceOf[js.Any])
    if (revision != null) __obj.updateDynamic("revision")(revision.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitRepoVolumeSource]
  }
}

