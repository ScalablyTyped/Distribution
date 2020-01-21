package typings.pulumiAws.getCustomerGatewayMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.ec2.GetCustomerGatewayFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetCustomerGatewayArgs extends js.Object {
  /**
    * One or more [name-value pairs][dcg-filters] to filter by.
    */
  val filters: js.UndefOr[js.Array[GetCustomerGatewayFilter]] = js.native
  /**
    * The ID of the gateway.
    */
  val id: js.UndefOr[String] = js.native
  val tags: js.UndefOr[StringDictionary[js.Any]] = js.native
}

object GetCustomerGatewayArgs {
  @scala.inline
  def apply(
    filters: js.Array[GetCustomerGatewayFilter] = null,
    id: String = null,
    tags: StringDictionary[js.Any] = null
  ): GetCustomerGatewayArgs = {
    val __obj = js.Dynamic.literal()
    if (filters != null) __obj.updateDynamic("filters")(filters.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCustomerGatewayArgs]
  }
}

