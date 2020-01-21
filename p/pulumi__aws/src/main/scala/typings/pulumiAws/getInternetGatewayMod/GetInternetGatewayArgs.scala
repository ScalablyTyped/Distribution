package typings.pulumiAws.getInternetGatewayMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.ec2.GetInternetGatewayFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetInternetGatewayArgs extends js.Object {
  /**
    * Custom filter block as described below.
    */
  val filters: js.UndefOr[js.Array[GetInternetGatewayFilter]] = js.native
  /**
    * The id of the specific Internet Gateway to retrieve.
    */
  val internetGatewayId: js.UndefOr[String] = js.native
  /**
    * A mapping of tags, each pair of which must exactly match
    * a pair on the desired Internet Gateway.
    */
  val tags: js.UndefOr[StringDictionary[js.Any]] = js.native
}

object GetInternetGatewayArgs {
  @scala.inline
  def apply(
    filters: js.Array[GetInternetGatewayFilter] = null,
    internetGatewayId: String = null,
    tags: StringDictionary[js.Any] = null
  ): GetInternetGatewayArgs = {
    val __obj = js.Dynamic.literal()
    if (filters != null) __obj.updateDynamic("filters")(filters.asInstanceOf[js.Any])
    if (internetGatewayId != null) __obj.updateDynamic("internetGatewayId")(internetGatewayId.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetInternetGatewayArgs]
  }
}

