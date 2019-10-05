package typings.atPulumiKubernetes.typesInputMod.core.v1

import typings.atPulumiPulumi.outputMod.Input
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
  var address: Input[String]
  /**
    * Node address type, one of Hostname, ExternalIP or InternalIP.
    */
  var `type`: Input[String]
}

object NodeAddress {
  @scala.inline
  def apply(address: Input[String], `type`: Input[String]): NodeAddress = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeAddress]
  }
}

