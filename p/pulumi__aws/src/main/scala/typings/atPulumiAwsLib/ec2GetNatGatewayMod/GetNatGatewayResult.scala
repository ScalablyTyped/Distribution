package typings
package atPulumiAwsLib.ec2GetNatGatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetNatGatewayResult extends js.Object {
  /**
    * The Id of the EIP allocated to the selected Nat Gateway.
    */
  val allocationId: java.lang.String
  val id: java.lang.String
  /**
    * The Id of the ENI allocated to the selected Nat Gateway.
    */
  val networkInterfaceId: java.lang.String
  /**
    * The private Ip address of the selected Nat Gateway.
    */
  val privateIp: java.lang.String
  /**
    * The public Ip (EIP) address of the selected Nat Gateway.
    */
  val publicIp: java.lang.String
  val state: java.lang.String
  val subnetId: java.lang.String
  val tags: org.scalablytyped.runtime.StringDictionary[js.Any]
  val vpcId: java.lang.String
}

