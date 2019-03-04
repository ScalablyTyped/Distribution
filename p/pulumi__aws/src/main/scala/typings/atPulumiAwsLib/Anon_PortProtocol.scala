package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_PortProtocol extends js.Object {
  var port: atPulumiPulumiLib.outputMod.Input[scala.Double]
  var protocol: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

object Anon_PortProtocol {
  @scala.inline
  def apply(
    port: atPulumiPulumiLib.outputMod.Input[scala.Double],
    protocol: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  ): Anon_PortProtocol = {
    val __obj = js.Dynamic.literal(port = port.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_PortProtocol]
  }
}

