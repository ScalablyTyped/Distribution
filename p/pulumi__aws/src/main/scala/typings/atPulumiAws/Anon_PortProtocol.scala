package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_PortProtocol extends js.Object {
  var port: Input[Double]
  var protocol: Input[String]
}

object Anon_PortProtocol {
  @scala.inline
  def apply(port: Input[Double], protocol: Input[String]): Anon_PortProtocol = {
    val __obj = js.Dynamic.literal(port = port.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_PortProtocol]
  }
}

