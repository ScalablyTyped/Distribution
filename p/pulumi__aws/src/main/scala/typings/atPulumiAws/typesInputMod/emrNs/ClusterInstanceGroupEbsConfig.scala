package typings.atPulumiAws.typesInputMod.emrNs

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClusterInstanceGroupEbsConfig extends js.Object {
  var iops: js.UndefOr[Input[Double]] = js.undefined
  var size: Input[Double]
  var `type`: Input[String]
  var volumesPerInstance: js.UndefOr[Input[Double]] = js.undefined
}

object ClusterInstanceGroupEbsConfig {
  @scala.inline
  def apply(
    size: Input[Double],
    `type`: Input[String],
    iops: Input[Double] = null,
    volumesPerInstance: Input[Double] = null
  ): ClusterInstanceGroupEbsConfig = {
    val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (iops != null) __obj.updateDynamic("iops")(iops.asInstanceOf[js.Any])
    if (volumesPerInstance != null) __obj.updateDynamic("volumesPerInstance")(volumesPerInstance.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterInstanceGroupEbsConfig]
  }
}

