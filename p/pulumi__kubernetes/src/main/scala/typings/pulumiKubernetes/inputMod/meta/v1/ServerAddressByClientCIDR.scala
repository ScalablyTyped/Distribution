package typings.pulumiKubernetes.inputMod.meta.v1

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ServerAddressByClientCIDR helps the client to determine the server address that they should
  * use, depending on the clientCIDR that they match.
  */
trait ServerAddressByClientCIDR extends js.Object {
  /**
    * The CIDR with which clients can match their IP to figure out the server address that they
    * should use.
    */
  var clientCIDR: Input[String]
  /**
    * Address of this server, suitable for a client that matches the above CIDR. This can be a
    * hostname, hostname:port, IP or IP:port.
    */
  var serverAddress: Input[String]
}

object ServerAddressByClientCIDR {
  @scala.inline
  def apply(clientCIDR: Input[String], serverAddress: Input[String]): ServerAddressByClientCIDR = {
    val __obj = js.Dynamic.literal(clientCIDR = clientCIDR.asInstanceOf[js.Any], serverAddress = serverAddress.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ServerAddressByClientCIDR]
  }
}

