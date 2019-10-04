package typings.atPulumiAws.typesOutputMod.opsworksNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HaproxyLayerEbsVolume extends js.Object {
  var iops: js.UndefOr[Double] = js.undefined
  var mountPoint: String
  var numberOfDisks: Double
  var raidLevel: js.UndefOr[String] = js.undefined
  var size: Double
  var `type`: js.UndefOr[String] = js.undefined
}

object HaproxyLayerEbsVolume {
  @scala.inline
  def apply(
    mountPoint: String,
    numberOfDisks: Double,
    size: Double,
    iops: Int | Double = null,
    raidLevel: String = null,
    `type`: String = null
  ): HaproxyLayerEbsVolume = {
    val __obj = js.Dynamic.literal(mountPoint = mountPoint, numberOfDisks = numberOfDisks, size = size)
    if (iops != null) __obj.updateDynamic("iops")(iops.asInstanceOf[js.Any])
    if (raidLevel != null) __obj.updateDynamic("raidLevel")(raidLevel)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[HaproxyLayerEbsVolume]
  }
}

