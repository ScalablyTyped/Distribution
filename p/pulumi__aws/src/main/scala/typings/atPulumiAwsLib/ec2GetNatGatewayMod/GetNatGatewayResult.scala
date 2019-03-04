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

object GetNatGatewayResult {
  @scala.inline
  def apply(
    allocationId: java.lang.String,
    id: java.lang.String,
    networkInterfaceId: java.lang.String,
    privateIp: java.lang.String,
    publicIp: java.lang.String,
    state: java.lang.String,
    subnetId: java.lang.String,
    tags: org.scalablytyped.runtime.StringDictionary[js.Any],
    vpcId: java.lang.String
  ): GetNatGatewayResult = {
    val __obj = js.Dynamic.literal(allocationId = allocationId, id = id, networkInterfaceId = networkInterfaceId, privateIp = privateIp, publicIp = publicIp, state = state, subnetId = subnetId, tags = tags, vpcId = vpcId)
  
    __obj.asInstanceOf[GetNatGatewayResult]
  }
}

