package typings.pulumiAws.outputMod.ec2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VpnConnectionRoute extends js.Object {
  var destinationCidrBlock: String = js.native
  var source: String = js.native
  var state: String = js.native
}

object VpnConnectionRoute {
  @scala.inline
  def apply(destinationCidrBlock: String, source: String, state: String): VpnConnectionRoute = {
    val __obj = js.Dynamic.literal(destinationCidrBlock = destinationCidrBlock.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[VpnConnectionRoute]
  }
}

