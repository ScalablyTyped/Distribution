package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IpPortInput extends js.Object {
  var ip: Input[String]
  var port: js.UndefOr[Input[Double]] = js.undefined
}

object Anon_IpPortInput {
  @scala.inline
  def apply(ip: Input[String], port: Input[Double] = null): Anon_IpPortInput = {
    val __obj = js.Dynamic.literal(ip = ip.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_IpPortInput]
  }
}

