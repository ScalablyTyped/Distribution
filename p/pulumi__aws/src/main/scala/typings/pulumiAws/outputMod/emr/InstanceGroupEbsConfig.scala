package typings.pulumiAws.outputMod.emr

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstanceGroupEbsConfig extends js.Object {
  /**
    * The number of I/O operations per second (IOPS) that the volume supports.
    */
  var iops: js.UndefOr[Double] = js.native
  /**
    * The volume size, in gibibytes (GiB). This can be a number from 1 - 1024. If the volume type is EBS-optimized, the minimum value is 10.
    */
  var size: Double = js.native
  /**
    * The volume type. Valid options are 'gp2', 'io1' and 'standard'.
    */
  var `type`: String = js.native
  /**
    * The number of EBS Volumes to attach per instance.
    */
  var volumesPerInstance: js.UndefOr[Double] = js.native
}

object InstanceGroupEbsConfig {
  @scala.inline
  def apply(size: Double, `type`: String): InstanceGroupEbsConfig = {
    val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstanceGroupEbsConfig]
  }
  @scala.inline
  implicit class InstanceGroupEbsConfigOps[Self <: InstanceGroupEbsConfig] (val x: Self) extends AnyVal {
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
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setIops(value: Double): Self = this.set("iops", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIops: Self = this.set("iops", js.undefined)
    @scala.inline
    def setVolumesPerInstance(value: Double): Self = this.set("volumesPerInstance", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVolumesPerInstance: Self = this.set("volumesPerInstance", js.undefined)
  }
  
}

