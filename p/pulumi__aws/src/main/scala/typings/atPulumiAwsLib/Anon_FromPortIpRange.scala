package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FromPortIpRange extends js.Object {
  var fromPort: atPulumiPulumiLib.outputMod.Input[scala.Double]
  var ipRange: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  var protocol: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  var toPort: atPulumiPulumiLib.outputMod.Input[scala.Double]
}

object Anon_FromPortIpRange {
  @scala.inline
  def apply(
    fromPort: atPulumiPulumiLib.outputMod.Input[scala.Double],
    ipRange: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    protocol: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    toPort: atPulumiPulumiLib.outputMod.Input[scala.Double]
  ): Anon_FromPortIpRange = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("fromPort")(fromPort.asInstanceOf[js.Any])
    __obj.updateDynamic("ipRange")(ipRange.asInstanceOf[js.Any])
    __obj.updateDynamic("protocol")(protocol.asInstanceOf[js.Any])
    __obj.updateDynamic("toPort")(toPort.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_FromPortIpRange]
  }
}

