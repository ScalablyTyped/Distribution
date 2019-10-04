package typings.atPulumiAws.ec2transitgatewayGetTransitGatewayMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.typesInputMod.ec2transitgatewayNs.GetTransitGatewayFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetTransitGatewayArgs extends js.Object {
  /**
    * One or more configuration blocks containing name-values filters. Detailed below.
    */
  val filters: js.UndefOr[js.Array[GetTransitGatewayFilter]] = js.undefined
  /**
    * Identifier of the EC2 Transit Gateway.
    */
  val id: js.UndefOr[String] = js.undefined
  val tags: js.UndefOr[StringDictionary[js.Any]] = js.undefined
}

object GetTransitGatewayArgs {
  @scala.inline
  def apply(
    filters: js.Array[GetTransitGatewayFilter] = null,
    id: String = null,
    tags: StringDictionary[js.Any] = null
  ): GetTransitGatewayArgs = {
    val __obj = js.Dynamic.literal()
    if (filters != null) __obj.updateDynamic("filters")(filters)
    if (id != null) __obj.updateDynamic("id")(id)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[GetTransitGatewayArgs]
  }
}

