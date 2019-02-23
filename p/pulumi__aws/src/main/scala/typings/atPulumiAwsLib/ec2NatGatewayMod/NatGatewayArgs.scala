package typings
package atPulumiAwsLib.ec2NatGatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NatGatewayArgs extends js.Object {
  /**
    * The Allocation ID of the Elastic IP address for the gateway.
    */
  val allocationId: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * The Subnet ID of the subnet in which to place the gateway.
    */
  val subnetId: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[atPulumiPulumiLib.outputMod.Input[org.scalablytyped.runtime.StringDictionary[_]]] = js.undefined
}

