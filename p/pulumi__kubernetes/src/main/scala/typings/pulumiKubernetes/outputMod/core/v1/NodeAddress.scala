package typings.pulumiKubernetes.outputMod.core.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * NodeAddress contains information for the node's address.
  */
trait NodeAddress extends js.Object {
  /**
    * The node address.
    */
  val address: String
  /**
    * Node address type, one of Hostname, ExternalIP or InternalIP.
    */
  val `type`: String
}

object NodeAddress {
  @scala.inline
  def apply(address: String, `type`: String): NodeAddress = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeAddress]
  }
}

