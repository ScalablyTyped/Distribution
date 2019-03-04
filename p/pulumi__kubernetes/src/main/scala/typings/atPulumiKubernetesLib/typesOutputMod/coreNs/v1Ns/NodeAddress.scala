package typings
package atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns

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
  val address: java.lang.String
  /**
    * Node address type, one of Hostname, ExternalIP or InternalIP.
    */
  val `type`: java.lang.String
}

object NodeAddress {
  @scala.inline
  def apply(address: java.lang.String, `type`: java.lang.String): NodeAddress = {
    val __obj = js.Dynamic.literal(address = address)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[NodeAddress]
  }
}

