package typings
package atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
         * Represents a volume that is populated with the contents of a git repository. Git repo volumes
         * do not support ownership management. Git repo volumes support SELinux relabeling.
         */

trait GitRepoVolumeSource extends js.Object {
  /**
               * Target directory name. Must not contain or start with '..'.  If '.' is supplied, the volume
               * directory will be the git repository.  Otherwise, if specified, the volume will contain the
               * git repository in the subdirectory with the given name.
               */
  val directory: java.lang.String
  /**
               * Repository URL
               */
  val repository: java.lang.String
  /**
               * Commit hash for the specified revision.
               */
  val revision: java.lang.String
}

