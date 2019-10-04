package typings.atPulumiAws.typesInputMod.opsworksNs

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MemcachedLayerEbsVolume extends js.Object {
  var iops: js.UndefOr[Input[Double]] = js.undefined
  var mountPoint: Input[String]
  var numberOfDisks: Input[Double]
  var raidLevel: js.UndefOr[Input[String]] = js.undefined
  var size: Input[Double]
  var `type`: js.UndefOr[Input[String]] = js.undefined
}

object MemcachedLayerEbsVolume {
  @scala.inline
  def apply(
    mountPoint: Input[String],
    numberOfDisks: Input[Double],
    size: Input[Double],
    iops: Input[Double] = null,
    raidLevel: Input[String] = null,
    `type`: Input[String] = null
  ): MemcachedLayerEbsVolume = {
    val __obj = js.Dynamic.literal(mountPoint = mountPoint.asInstanceOf[js.Any], numberOfDisks = numberOfDisks.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    if (iops != null) __obj.updateDynamic("iops")(iops.asInstanceOf[js.Any])
    if (raidLevel != null) __obj.updateDynamic("raidLevel")(raidLevel.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MemcachedLayerEbsVolume]
  }
}

