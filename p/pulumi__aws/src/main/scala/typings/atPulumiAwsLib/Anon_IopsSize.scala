package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IopsSize extends js.Object {
  var iops: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Double]] = js.undefined
  var size: atPulumiPulumiLib.outputMod.Input[scala.Double]
  var `type`: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  var volumesPerInstance: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Double]] = js.undefined
}

object Anon_IopsSize {
  @scala.inline
  def apply(
    size: atPulumiPulumiLib.outputMod.Input[scala.Double],
    `type`: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    iops: atPulumiPulumiLib.outputMod.Input[scala.Double] = null,
    volumesPerInstance: atPulumiPulumiLib.outputMod.Input[scala.Double] = null
  ): Anon_IopsSize = {
    val __obj = js.Dynamic.literal(`type` = `type`.asInstanceOf[js.Any])
    __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (iops != null) __obj.updateDynamic("iops")(iops.asInstanceOf[js.Any])
    if (volumesPerInstance != null) __obj.updateDynamic("volumesPerInstance")(volumesPerInstance.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_IopsSize]
  }
}

