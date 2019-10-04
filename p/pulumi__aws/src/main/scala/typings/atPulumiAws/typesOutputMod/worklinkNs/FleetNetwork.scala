package typings.atPulumiAws.typesOutputMod.worklinkNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FleetNetwork extends js.Object {
  /**
    * A list of security group IDs associated with access to the provided subnets.
    */
  var securityGroupIds: js.Array[String]
  /**
    * A list of subnet IDs used for X-ENI connections from Amazon WorkLink rendering containers.
    */
  var subnetIds: js.Array[String]
  /**
    * The VPC ID with connectivity to associated websites.
    */
  var vpcId: String
}

object FleetNetwork {
  @scala.inline
  def apply(securityGroupIds: js.Array[String], subnetIds: js.Array[String], vpcId: String): FleetNetwork = {
    val __obj = js.Dynamic.literal(securityGroupIds = securityGroupIds, subnetIds = subnetIds, vpcId = vpcId)
  
    __obj.asInstanceOf[FleetNetwork]
  }
}

