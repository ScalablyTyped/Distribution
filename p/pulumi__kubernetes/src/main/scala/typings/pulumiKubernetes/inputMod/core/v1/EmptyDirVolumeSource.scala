package typings.pulumiKubernetes.inputMod.core.v1

import typings.pulumiPulumi.outputMod.Input
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
  var medium: js.UndefOr[Input[String]] = js.undefined
  /**
    * Total amount of local storage required for this EmptyDir volume. The size limit is also
    * applicable for memory medium. The maximum usage on memory medium EmptyDir would be the
    * minimum value between the SizeLimit specified here and the sum of memory limits of all
    * containers in a pod. The default is nil which means that the limit is undefined. More info:
    * http://kubernetes.io/docs/user-guide/volumes#emptydir
    */
  var sizeLimit: js.UndefOr[Input[String]] = js.undefined
}

object EmptyDirVolumeSource {
  @scala.inline
  def apply(medium: Input[String] = null, sizeLimit: Input[String] = null): EmptyDirVolumeSource = {
    val __obj = js.Dynamic.literal()
    if (medium != null) __obj.updateDynamic("medium")(medium.asInstanceOf[js.Any])
    if (sizeLimit != null) __obj.updateDynamic("sizeLimit")(sizeLimit.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmptyDirVolumeSource]
  }
}

