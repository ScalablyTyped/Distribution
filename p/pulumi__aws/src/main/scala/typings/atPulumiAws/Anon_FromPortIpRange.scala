package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FromPortIpRange extends js.Object {
  var fromPort: Input[Double]
  var ipRange: Input[String]
  var protocol: Input[String]
  var toPort: Input[Double]
}

object Anon_FromPortIpRange {
  @scala.inline
  def apply(fromPort: Input[Double], ipRange: Input[String], protocol: Input[String], toPort: Input[Double]): Anon_FromPortIpRange = {
    val __obj = js.Dynamic.literal(fromPort = fromPort.asInstanceOf[js.Any], ipRange = ipRange.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], toPort = toPort.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_FromPortIpRange]
  }
}

