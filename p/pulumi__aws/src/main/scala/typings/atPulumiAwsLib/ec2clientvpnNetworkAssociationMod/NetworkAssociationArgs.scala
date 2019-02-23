package typings
package atPulumiAwsLib.ec2clientvpnNetworkAssociationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NetworkAssociationArgs extends js.Object {
  /**
    * The ID of the Client VPN endpoint.
    */
  val clientVpnEndpointId: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * The ID of the subnet to associate with the Client VPN endpoint.
    */
  val subnetId: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

