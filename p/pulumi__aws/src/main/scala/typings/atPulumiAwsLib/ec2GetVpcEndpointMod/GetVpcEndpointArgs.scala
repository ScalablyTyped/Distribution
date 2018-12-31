package typings
package atPulumiAwsLib.ec2GetVpcEndpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetVpcEndpointArgs extends js.Object {
  /**
    * The ID of the specific VPC Endpoint to retrieve.
    */
  val id: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The AWS service name of the specific VPC Endpoint to retrieve.
    */
  val serviceName: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The state of the specific VPC Endpoint to retrieve.
    */
  val state: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The ID of the VPC in which the specific VPC Endpoint is used.
    */
  val vpcId: js.UndefOr[java.lang.String] = js.undefined
}

