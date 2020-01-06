package typings.atPulumiAws.typesOutputMod.opsworks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GangliaLayerEbsVolume extends js.Object {
  var encrypted: js.UndefOr[Boolean] = js.native
  var iops: js.UndefOr[Double] = js.native
  var mountPoint: String = js.native
  var numberOfDisks: Double = js.native
  var raidLevel: js.UndefOr[String] = js.native
  var size: Double = js.native
  var `type`: js.UndefOr[String] = js.native
}

object GangliaLayerEbsVolume {
  @scala.inline
  def apply(
    mountPoint: String,
    numberOfDisks: Double,
    size: Double,
    encrypted: js.UndefOr[Boolean] = js.undefined,
    iops: Int | Double = null,
    raidLevel: String = null,
    `type`: String = null
  ): GangliaLayerEbsVolume = {
    val __obj = js.Dynamic.literal(mountPoint = mountPoint.asInstanceOf[js.Any], numberOfDisks = numberOfDisks.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    if (!js.isUndefined(encrypted)) __obj.updateDynamic("encrypted")(encrypted.asInstanceOf[js.Any])
    if (iops != null) __obj.updateDynamic("iops")(iops.asInstanceOf[js.Any])
    if (raidLevel != null) __obj.updateDynamic("raidLevel")(raidLevel.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GangliaLayerEbsVolume]
  }
}

