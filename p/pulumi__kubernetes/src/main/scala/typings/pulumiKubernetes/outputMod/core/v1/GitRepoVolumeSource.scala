package typings.pulumiKubernetes.outputMod.core.v1

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
  val directory: String
  /**
    * Repository URL
    */
  val repository: String
  /**
    * Commit hash for the specified revision.
    */
  val revision: String
}

object GitRepoVolumeSource {
  @scala.inline
  def apply(directory: String, repository: String, revision: String): GitRepoVolumeSource = {
    val __obj = js.Dynamic.literal(directory = directory.asInstanceOf[js.Any], repository = repository.asInstanceOf[js.Any], revision = revision.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GitRepoVolumeSource]
  }
}

