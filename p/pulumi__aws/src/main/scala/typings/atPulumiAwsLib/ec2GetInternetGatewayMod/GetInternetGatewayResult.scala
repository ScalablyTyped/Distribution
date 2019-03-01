package typings
package atPulumiAwsLib.ec2GetInternetGatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetInternetGatewayResult extends js.Object {
  val attachments: js.Array[atPulumiAwsLib.Anon_State]
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: java.lang.String
  val internetGatewayId: java.lang.String
  /**
    * The ID of the AWS account that owns the internet gateway.
    */
  val ownerId: java.lang.String
  val tags: org.scalablytyped.runtime.StringDictionary[js.Any]
}

object GetInternetGatewayResult {
  @scala.inline
  def apply(
    attachments: js.Array[atPulumiAwsLib.Anon_State],
    id: java.lang.String,
    internetGatewayId: java.lang.String,
    ownerId: java.lang.String,
    tags: org.scalablytyped.runtime.StringDictionary[js.Any]
  ): GetInternetGatewayResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("attachments")(attachments)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("internetGatewayId")(internetGatewayId)
    __obj.updateDynamic("ownerId")(ownerId)
    __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[GetInternetGatewayResult]
  }
}

