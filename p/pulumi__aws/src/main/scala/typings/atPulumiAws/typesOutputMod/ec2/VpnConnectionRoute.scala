package typings.atPulumiAws.typesOutputMod.ec2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VpnConnectionRoute extends js.Object {
  var destinationCidrBlock: String
  var source: String
  var state: String
}

object VpnConnectionRoute {
  @scala.inline
  def apply(destinationCidrBlock: String, source: String, state: String): VpnConnectionRoute = {
    val __obj = js.Dynamic.literal(destinationCidrBlock = destinationCidrBlock, source = source, state = state)
  
    __obj.asInstanceOf[VpnConnectionRoute]
  }
}

