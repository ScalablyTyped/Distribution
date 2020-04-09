package typings.pulumiAws.getTransitGatewayMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.ec2transitgateway.GetTransitGatewayFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetTransitGatewayArgs extends js.Object {
  /**
    * One or more configuration blocks containing name-values filters. Detailed below.
    */
  val filters: js.UndefOr[js.Array[GetTransitGatewayFilter]] = js.native
  /**
    * Identifier of the EC2 Transit Gateway.
    */
  val id: js.UndefOr[String] = js.native
  /**
    * Key-value tags for the EC2 Transit Gateway
    */
  val tags: js.UndefOr[StringDictionary[js.Any]] = js.native
}

object GetTransitGatewayArgs {
  @scala.inline
  def apply(
    filters: js.Array[GetTransitGatewayFilter] = null,
    id: String = null,
    tags: StringDictionary[js.Any] = null
  ): GetTransitGatewayArgs = {
    val __obj = js.Dynamic.literal()
    if (filters != null) __obj.updateDynamic("filters")(filters.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTransitGatewayArgs]
  }
}

