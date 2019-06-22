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
  val tags: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
  /**
    * The ID of the VPC in which the specific VPC Endpoint is used.
    */
  val vpcId: js.UndefOr[java.lang.String] = js.undefined
}

object GetVpcEndpointArgs {
  @scala.inline
  def apply(
    id: java.lang.String = null,
    serviceName: java.lang.String = null,
    state: java.lang.String = null,
    tags: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    vpcId: java.lang.String = null
  ): GetVpcEndpointArgs = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id)
    if (serviceName != null) __obj.updateDynamic("serviceName")(serviceName)
    if (state != null) __obj.updateDynamic("state")(state)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    if (vpcId != null) __obj.updateDynamic("vpcId")(vpcId)
    __obj.asInstanceOf[GetVpcEndpointArgs]
  }
}

