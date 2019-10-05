package typings.atPulumiAws.typesOutputMod.emr

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstanceGroupEbsConfig extends js.Object {
  /**
    * The number of I/O operations per second (IOPS) that the volume supports.
    */
  var iops: js.UndefOr[Double] = js.undefined
  /**
    * The volume size, in gibibytes (GiB). This can be a number from 1 - 1024. If the volume type is EBS-optimized, the minimum value is 10.
    */
  var size: Double
  /**
    * The volume type. Valid options are 'gp2', 'io1' and 'standard'.
    */
  var `type`: String
  /**
    * The number of EBS Volumes to attach per instance.
    */
  var volumesPerInstance: js.UndefOr[Double] = js.undefined
}

object InstanceGroupEbsConfig {
  @scala.inline
  def apply(size: Double, `type`: String, iops: Int | Double = null, volumesPerInstance: Int | Double = null): InstanceGroupEbsConfig = {
    val __obj = js.Dynamic.literal(size = size)
    __obj.updateDynamic("type")(`type`)
    if (iops != null) __obj.updateDynamic("iops")(iops.asInstanceOf[js.Any])
    if (volumesPerInstance != null) __obj.updateDynamic("volumesPerInstance")(volumesPerInstance.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstanceGroupEbsConfig]
  }
}

