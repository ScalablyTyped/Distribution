package typings.pulumiAws.getInternetGatewayMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.ec2.GetInternetGatewayAttachment
import typings.pulumiAws.outputMod.ec2.GetInternetGatewayFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetInternetGatewayResult extends js.Object {
  val attachments: js.Array[GetInternetGatewayAttachment] = js.native
  val filters: js.UndefOr[js.Array[GetInternetGatewayFilter]] = js.native
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  val internetGatewayId: String = js.native
  /**
    * The ID of the AWS account that owns the internet gateway.
    */
  val ownerId: String = js.native
  val tags: StringDictionary[js.Any] = js.native
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
    val __obj = js.Dynamic.literal(attachments = attachments.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], internetGatewayId = internetGatewayId.asInstanceOf[js.Any], ownerId = ownerId.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
    if (filters != null) __obj.updateDynamic("filters")(filters.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetInternetGatewayResult]
  }
}

