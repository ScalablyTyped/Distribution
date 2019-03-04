package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Iops extends js.Object {
  var iops: js.UndefOr[scala.Double] = js.undefined
  var size: scala.Double
  var `type`: java.lang.String
  var volumesPerInstance: js.UndefOr[scala.Double] = js.undefined
}

object Anon_Iops {
  @scala.inline
  def apply(
    size: scala.Double,
    `type`: java.lang.String,
    iops: scala.Int | scala.Double = null,
    volumesPerInstance: scala.Int | scala.Double = null
  ): Anon_Iops = {
    val __obj = js.Dynamic.literal(size = size)
    __obj.updateDynamic("type")(`type`)
    if (iops != null) __obj.updateDynamic("iops")(iops.asInstanceOf[js.Any])
    if (volumesPerInstance != null) __obj.updateDynamic("volumesPerInstance")(volumesPerInstance.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Iops]
  }
}

