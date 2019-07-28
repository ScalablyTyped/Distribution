package typings.atPulumiAws.ec2GetCustomerGatewayMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.Anon_NameValues
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetCustomerGatewayArgs extends js.Object {
  /**
    * One or more [name-value pairs][dcg-filters] to filter by.
    */
  val filters: js.UndefOr[js.Array[Anon_NameValues]] = js.undefined
  /**
    * The ID of the gateway.
    */
  val id: js.UndefOr[String] = js.undefined
  val tags: js.UndefOr[StringDictionary[js.Any]] = js.undefined
}

object GetCustomerGatewayArgs {
  @scala.inline
  def apply(
    filters: js.Array[Anon_NameValues] = null,
    id: String = null,
    tags: StringDictionary[js.Any] = null
  ): GetCustomerGatewayArgs = {
    val __obj = js.Dynamic.literal()
    if (filters != null) __obj.updateDynamic("filters")(filters)
    if (id != null) __obj.updateDynamic("id")(id)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[GetCustomerGatewayArgs]
  }
}

