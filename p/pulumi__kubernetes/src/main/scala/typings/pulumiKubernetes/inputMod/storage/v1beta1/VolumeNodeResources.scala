package typings.pulumiKubernetes.inputMod.storage.v1beta1

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * VolumeNodeResources is a set of resource limits for scheduling of volumes.
  */
@js.native
trait VolumeNodeResources extends js.Object {
  /**
    * Maximum number of unique volumes managed by the CSI driver that can be used on a node. A volume that is both attached and mounted on a node is considered to be used once, not twice. The same rule applies for a unique volume that is shared among multiple pods on the same node. If this field is nil, then the supported number of volumes on this node is unbounded.
    */
  var count: js.UndefOr[Input[Double]] = js.native
}

object VolumeNodeResources {
  @scala.inline
  def apply(): VolumeNodeResources = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VolumeNodeResources]
  }
  @scala.inline
  implicit class VolumeNodeResourcesOps[Self <: VolumeNodeResources] (val x: Self) extends AnyVal {
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
    def setCount(value: Input[Double]): Self = this.set("count", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCount: Self = this.set("count", js.undefined)
  }
  
}

