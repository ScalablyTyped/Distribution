package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IopsMountPointNumberOfDisks extends js.Object {
  var iops: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Double]] = js.undefined
  var mountPoint: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  var numberOfDisks: atPulumiPulumiLib.outputMod.Input[scala.Double]
  var raidLevel: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var size: atPulumiPulumiLib.outputMod.Input[scala.Double]
  var `type`: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

object Anon_IopsMountPointNumberOfDisks {
  @scala.inline
  def apply(
    mountPoint: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    numberOfDisks: atPulumiPulumiLib.outputMod.Input[scala.Double],
    size: atPulumiPulumiLib.outputMod.Input[scala.Double],
    iops: atPulumiPulumiLib.outputMod.Input[scala.Double] = null,
    raidLevel: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    `type`: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): Anon_IopsMountPointNumberOfDisks = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("mountPoint")(mountPoint.asInstanceOf[js.Any])
    __obj.updateDynamic("numberOfDisks")(numberOfDisks.asInstanceOf[js.Any])
    __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (iops != null) __obj.updateDynamic("iops")(iops.asInstanceOf[js.Any])
    if (raidLevel != null) __obj.updateDynamic("raidLevel")(raidLevel.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_IopsMountPointNumberOfDisks]
  }
}

