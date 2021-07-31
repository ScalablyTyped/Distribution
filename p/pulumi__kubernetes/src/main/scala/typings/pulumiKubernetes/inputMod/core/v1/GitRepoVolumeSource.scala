package typings.pulumiKubernetes.inputMod.core.v1

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a volume that is populated with the contents of a git repository. Git repo volumes do not support ownership management. Git repo volumes support SELinux relabeling.
  *
  * DEPRECATED: GitRepo is deprecated. To provision a container with a git repo, mount an EmptyDir into an InitContainer that clones the repo using git, then mount the EmptyDir into the Pod's container.
  */
trait GitRepoVolumeSource extends StObject {
  
  /**
    * Target directory name. Must not contain or start with '..'.  If '.' is supplied, the volume directory will be the git repository.  Otherwise, if specified, the volume will contain the git repository in the subdirectory with the given name.
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
  def apply(repository: Input[String]): GitRepoVolumeSource = {
    val __obj = js.Dynamic.literal(repository = repository.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitRepoVolumeSource]
  }
  
  @scala.inline
  implicit class GitRepoVolumeSourceMutableBuilder[Self <: GitRepoVolumeSource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDirectory(value: Input[String]): Self = StObject.set(x, "directory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectoryUndefined: Self = StObject.set(x, "directory", js.undefined)
    
    @scala.inline
    def setRepository(value: Input[String]): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevision(value: Input[String]): Self = StObject.set(x, "revision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevisionUndefined: Self = StObject.set(x, "revision", js.undefined)
  }
}
