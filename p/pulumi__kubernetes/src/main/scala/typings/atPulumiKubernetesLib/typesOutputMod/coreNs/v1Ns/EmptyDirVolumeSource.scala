package typings
package atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents an empty directory for a pod. Empty directory volumes support ownership management
  * and SELinux relabeling.
  */
trait EmptyDirVolumeSource extends js.Object {
  /**
    * What type of storage medium should back this directory. The default is "" which means to
    * use the node's default medium. Must be an empty string (default) or Memory. More info:
    * https://kubernetes.io/docs/concepts/storage/volumes#emptydir
    */
  val medium: java.lang.String
  /**
    * Total amount of local storage required for this EmptyDir volume. The size limit is also
    * applicable for memory medium. The maximum usage on memory medium EmptyDir would be the
    * minimum value between the SizeLimit specified here and the sum of memory limits of all
    * containers in a pod. The default is nil which means that the limit is undefined. More info:
    * http://kubernetes.io/docs/user-guide/volumes#emptydir
    */
  val sizeLimit: java.lang.String
}

object EmptyDirVolumeSource {
  @scala.inline
  def apply(medium: java.lang.String, sizeLimit: java.lang.String): EmptyDirVolumeSource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("medium")(medium)
    __obj.updateDynamic("sizeLimit")(sizeLimit)
    __obj.asInstanceOf[EmptyDirVolumeSource]
  }
}

