package typings.atPulumiAws.typesOutputMod.emr

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClusterInstanceGroupEbsConfig extends js.Object {
  var iops: js.UndefOr[Double] = js.undefined
  var size: Double
  var `type`: String
  var volumesPerInstance: js.UndefOr[Double] = js.undefined
}

object ClusterInstanceGroupEbsConfig {
  @scala.inline
  def apply(size: Double, `type`: String, iops: Int | Double = null, volumesPerInstance: Int | Double = null): ClusterInstanceGroupEbsConfig = {
    val __obj = js.Dynamic.literal(size = size)
    __obj.updateDynamic("type")(`type`)
    if (iops != null) __obj.updateDynamic("iops")(iops.asInstanceOf[js.Any])
    if (volumesPerInstance != null) __obj.updateDynamic("volumesPerInstance")(volumesPerInstance.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterInstanceGroupEbsConfig]
  }
}

