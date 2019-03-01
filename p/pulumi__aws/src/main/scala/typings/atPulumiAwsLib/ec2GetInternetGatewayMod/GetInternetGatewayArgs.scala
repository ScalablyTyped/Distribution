package typings
package atPulumiAwsLib.ec2GetInternetGatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetInternetGatewayArgs extends js.Object {
  /**
    * Custom filter block as described below.
    */
  val filters: js.UndefOr[js.Array[atPulumiAwsLib.Anon_NameValues]] = js.undefined
  /**
    * The id of the specific Internet Gateway to retrieve.
    */
  val internetGatewayId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A mapping of tags, each pair of which must exactly match
    * a pair on the desired Internet Gateway.
    */
  val tags: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
}

object GetInternetGatewayArgs {
  @scala.inline
  def apply(
    filters: js.Array[atPulumiAwsLib.Anon_NameValues] = null,
    internetGatewayId: java.lang.String = null,
    tags: org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): GetInternetGatewayArgs = {
    val __obj = js.Dynamic.literal()
    if (filters != null) __obj.updateDynamic("filters")(filters)
    if (internetGatewayId != null) __obj.updateDynamic("internetGatewayId")(internetGatewayId)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[GetInternetGatewayArgs]
  }
}

