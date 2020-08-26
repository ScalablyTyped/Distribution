package typings.pulumiKubernetes.inputMod.core.v1

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents an empty directory for a pod. Empty directory volumes support ownership management and SELinux relabeling.
  */
@js.native
trait EmptyDirVolumeSource extends js.Object {
  /**
    * What type of storage medium should back this directory. The default is "" which means to use the node's default medium. Must be an empty string (default) or Memory. More info: https://kubernetes.io/docs/concepts/storage/volumes#emptydir
    */
  var medium: js.UndefOr[Input[String]] = js.native
  /**
    * Total amount of local storage required for this EmptyDir volume. The size limit is also applicable for memory medium. The maximum usage on memory medium EmptyDir would be the minimum value between the SizeLimit specified here and the sum of memory limits of all containers in a pod. The default is nil which means that the limit is undefined. More info: http://kubernetes.io/docs/user-guide/volumes#emptydir
    */
  var sizeLimit: js.UndefOr[Input[String]] = js.native
}

object EmptyDirVolumeSource {
  @scala.inline
  def apply(): EmptyDirVolumeSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EmptyDirVolumeSource]
  }
  @scala.inline
  implicit class EmptyDirVolumeSourceOps[Self <: EmptyDirVolumeSource] (val x: Self) extends AnyVal {
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
    def setMedium(value: Input[String]): Self = this.set("medium", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMedium: Self = this.set("medium", js.undefined)
    @scala.inline
    def setSizeLimit(value: Input[String]): Self = this.set("sizeLimit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSizeLimit: Self = this.set("sizeLimit", js.undefined)
  }
  
}

