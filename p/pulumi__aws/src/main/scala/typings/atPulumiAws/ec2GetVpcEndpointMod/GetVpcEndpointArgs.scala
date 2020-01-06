package typings.atPulumiAws.ec2GetVpcEndpointMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.typesInputMod.ec2.GetVpcEndpointFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetVpcEndpointArgs extends js.Object {
  /**
    * Custom filter block as described below.
    */
  val filters: js.UndefOr[js.Array[GetVpcEndpointFilter]] = js.native
  /**
    * The ID of the specific VPC Endpoint to retrieve.
    */
  val id: js.UndefOr[String] = js.native
  /**
    * The AWS service name of the specific VPC Endpoint to retrieve.
    */
  val serviceName: js.UndefOr[String] = js.native
  /**
    * The state of the specific VPC Endpoint to retrieve.
    */
  val state: js.UndefOr[String] = js.native
  /**
    * A mapping of tags, each pair of which must exactly match
    * a pair on the specific VPC Endpoint to retrieve.
    */
  val tags: js.UndefOr[StringDictionary[js.Any]] = js.native
  /**
    * The ID of the VPC in which the specific VPC Endpoint is used.
    */
  val vpcId: js.UndefOr[String] = js.native
}

object GetVpcEndpointArgs {
  @scala.inline
  def apply(
    filters: js.Array[GetVpcEndpointFilter] = null,
    id: String = null,
    serviceName: String = null,
    state: String = null,
    tags: StringDictionary[js.Any] = null,
    vpcId: String = null
  ): GetVpcEndpointArgs = {
    val __obj = js.Dynamic.literal()
    if (filters != null) __obj.updateDynamic("filters")(filters.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (serviceName != null) __obj.updateDynamic("serviceName")(serviceName.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (vpcId != null) __obj.updateDynamic("vpcId")(vpcId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetVpcEndpointArgs]
  }
}

