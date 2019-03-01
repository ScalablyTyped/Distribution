package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IopsMountPoint extends js.Object {
  var iops: js.UndefOr[scala.Double] = js.undefined
  var mountPoint: java.lang.String
  var numberOfDisks: scala.Double
  var raidLevel: js.UndefOr[java.lang.String] = js.undefined
  var size: scala.Double
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_IopsMountPoint {
  @scala.inline
  def apply(
    mountPoint: java.lang.String,
    numberOfDisks: scala.Double,
    size: scala.Double,
    iops: scala.Int | scala.Double = null,
    raidLevel: java.lang.String = null,
    `type`: java.lang.String = null
  ): Anon_IopsMountPoint = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("mountPoint")(mountPoint)
    __obj.updateDynamic("numberOfDisks")(numberOfDisks)
    __obj.updateDynamic("size")(size)
    if (iops != null) __obj.updateDynamic("iops")(iops.asInstanceOf[js.Any])
    if (raidLevel != null) __obj.updateDynamic("raidLevel")(raidLevel)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_IopsMountPoint]
  }
}

