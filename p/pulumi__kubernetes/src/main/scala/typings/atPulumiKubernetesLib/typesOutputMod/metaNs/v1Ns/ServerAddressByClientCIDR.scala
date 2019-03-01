package typings
package atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns

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
  val clientCIDR: java.lang.String
  /**
    * Address of this server, suitable for a client that matches the above CIDR. This can be a
    * hostname, hostname:port, IP or IP:port.
    */
  val serverAddress: java.lang.String
}

object ServerAddressByClientCIDR {
  @scala.inline
  def apply(clientCIDR: java.lang.String, serverAddress: java.lang.String): ServerAddressByClientCIDR = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("clientCIDR")(clientCIDR)
    __obj.updateDynamic("serverAddress")(serverAddress)
    __obj.asInstanceOf[ServerAddressByClientCIDR]
  }
}

