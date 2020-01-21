package typings.pulumiAws.outputMod.emr

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClusterMasterInstanceGroupEbsConfig extends js.Object {
  var iops: js.UndefOr[Double] = js.native
  var size: Double = js.native
  var `type`: String = js.native
  var volumesPerInstance: js.UndefOr[Double] = js.native
}

object ClusterMasterInstanceGroupEbsConfig {
  @scala.inline
  def apply(size: Double, `type`: String, iops: Int | Double = null, volumesPerInstance: Int | Double = null): ClusterMasterInstanceGroupEbsConfig = {
    val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (iops != null) __obj.updateDynamic("iops")(iops.asInstanceOf[js.Any])
    if (volumesPerInstance != null) __obj.updateDynamic("volumesPerInstance")(volumesPerInstance.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterMasterInstanceGroupEbsConfig]
  }
}

