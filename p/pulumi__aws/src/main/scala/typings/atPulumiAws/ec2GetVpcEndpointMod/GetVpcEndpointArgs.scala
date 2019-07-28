package typings.atPulumiAws.ec2GetVpcEndpointMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetVpcEndpointArgs extends js.Object {
  /**
    * The ID of the specific VPC Endpoint to retrieve.
    */
  val id: js.UndefOr[String] = js.undefined
  /**
    * The AWS service name of the specific VPC Endpoint to retrieve.
    */
  val serviceName: js.UndefOr[String] = js.undefined
  /**
    * The state of the specific VPC Endpoint to retrieve.
    */
  val state: js.UndefOr[String] = js.undefined
  val tags: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  /**
    * The ID of the VPC in which the specific VPC Endpoint is used.
    */
  val vpcId: js.UndefOr[String] = js.undefined
}

object GetVpcEndpointArgs {
  @scala.inline
  def apply(
    id: String = null,
    serviceName: String = null,
    state: String = null,
    tags: StringDictionary[js.Any] = null,
    vpcId: String = null
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

