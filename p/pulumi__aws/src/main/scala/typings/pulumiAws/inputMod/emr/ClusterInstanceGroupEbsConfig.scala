package typings.pulumiAws.inputMod.emr

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClusterInstanceGroupEbsConfig extends js.Object {
  /**
    * The number of I/O operations per second (IOPS) that the volume supports
    */
  var iops: js.UndefOr[Input[Double]] = js.native
  /**
    * The volume size, in gibibytes (GiB).
    */
  var size: Input[Double] = js.native
  /**
    * The volume type. Valid options are `gp2`, `io1`, `standard` and `st1`. See [EBS Volume Types](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html).
    */
  var `type`: Input[String] = js.native
  /**
    * The number of EBS volumes with this configuration to attach to each EC2 instance in the instance group (default is 1)
    */
  var volumesPerInstance: js.UndefOr[Input[Double]] = js.native
}

object ClusterInstanceGroupEbsConfig {
  @scala.inline
  def apply(size: Input[Double], `type`: Input[String]): ClusterInstanceGroupEbsConfig = {
    val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterInstanceGroupEbsConfig]
  }
  @scala.inline
  implicit class ClusterInstanceGroupEbsConfigOps[Self <: ClusterInstanceGroupEbsConfig] (val x: Self) extends AnyVal {
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
    def setSize(value: Input[Double]): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: Input[String]): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setIops(value: Input[Double]): Self = this.set("iops", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIops: Self = this.set("iops", js.undefined)
    @scala.inline
    def setVolumesPerInstance(value: Input[Double]): Self = this.set("volumesPerInstance", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVolumesPerInstance: Self = this.set("volumesPerInstance", js.undefined)
  }
  
}

