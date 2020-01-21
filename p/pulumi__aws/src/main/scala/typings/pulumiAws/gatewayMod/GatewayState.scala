package typings.pulumiAws.gatewayMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GatewayState extends js.Object {
  /**
    * The ASN to be configured on the Amazon side of the connection. The ASN must be in the private range of 64,512 to 65,534 or 4,200,000,000 to 4,294,967,294.
    */
  val amazonSideAsn: js.UndefOr[Input[String]] = js.native
  /**
    * The name of the connection.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * AWS Account ID of the gateway.
    */
  val ownerAccountId: js.UndefOr[Input[String]] = js.native
}

object GatewayState {
  @scala.inline
  def apply(
    amazonSideAsn: Input[String] = null,
    name: Input[String] = null,
    ownerAccountId: Input[String] = null
  ): GatewayState = {
    val __obj = js.Dynamic.literal()
    if (amazonSideAsn != null) __obj.updateDynamic("amazonSideAsn")(amazonSideAsn.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (ownerAccountId != null) __obj.updateDynamic("ownerAccountId")(ownerAccountId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GatewayState]
  }
}

