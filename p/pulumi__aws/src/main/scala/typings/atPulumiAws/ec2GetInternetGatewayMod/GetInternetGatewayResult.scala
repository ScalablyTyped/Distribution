package typings.atPulumiAws.ec2GetInternetGatewayMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.typesOutputMod.ec2Ns.GetInternetGatewayAttachment
import typings.atPulumiAws.typesOutputMod.ec2Ns.GetInternetGatewayFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetInternetGatewayResult extends js.Object {
  val attachments: js.Array[GetInternetGatewayAttachment]
  val filters: js.UndefOr[js.Array[GetInternetGatewayFilter]] = js.undefined
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String
  val internetGatewayId: String
  /**
    * The ID of the AWS account that owns the internet gateway.
    */
  val ownerId: String
  val tags: StringDictionary[js.Any]
}

object GetInternetGatewayResult {
  @scala.inline
  def apply(
    attachments: js.Array[GetInternetGatewayAttachment],
    id: String,
    internetGatewayId: String,
    ownerId: String,
    tags: StringDictionary[js.Any],
    filters: js.Array[GetInternetGatewayFilter] = null
  ): GetInternetGatewayResult = {
    val __obj = js.Dynamic.literal(attachments = attachments, id = id, internetGatewayId = internetGatewayId, ownerId = ownerId, tags = tags)
    if (filters != null) __obj.updateDynamic("filters")(filters)
    __obj.asInstanceOf[GetInternetGatewayResult]
  }
}

