package typings.pulumiKubernetes.outputMod.core.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a volume that is populated with the contents of a git repository. Git repo volumes do not support ownership management. Git repo volumes support SELinux relabeling.
  *
  * DEPRECATED: GitRepo is deprecated. To provision a container with a git repo, mount an EmptyDir into an InitContainer that clones the repo using git, then mount the EmptyDir into the Pod's container.
  */
@js.native
trait GitRepoVolumeSource extends StObject {
  
  /**
    * Target directory name. Must not contain or start with '..'.  If '.' is supplied, the volume directory will be the git repository.  Otherwise, if specified, the volume will contain the git repository in the subdirectory with the given name.
    */
  var directory: String = js.native
  
  /**
    * Repository URL
    */
  var repository: String = js.native
  
  /**
    * Commit hash for the specified revision.
    */
  var revision: String = js.native
}
object GitRepoVolumeSource {
  
  @scala.inline
  def apply(directory: String, repository: String, revision: String): GitRepoVolumeSource = {
    val __obj = js.Dynamic.literal(directory = directory.asInstanceOf[js.Any], repository = repository.asInstanceOf[js.Any], revision = revision.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitRepoVolumeSource]
  }
  
  @scala.inline
  implicit class GitRepoVolumeSourceMutableBuilder[Self <: GitRepoVolumeSource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDirectory(value: String): Self = StObject.set(x, "directory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepository(value: String): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevision(value: String): Self = StObject.set(x, "revision", value.asInstanceOf[js.Any])
  }
}
