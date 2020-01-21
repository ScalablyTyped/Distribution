package typings.pulumiAws.inputMod.worklink

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FleetIdentityProvider extends js.Object {
  /**
    * The SAML metadata document provided by the customer’s identity provider.
    */
  var samlMetadata: Input[String] = js.native
  /**
    * The type of identity provider.
    */
  var `type`: Input[String] = js.native
}

object FleetIdentityProvider {
  @scala.inline
  def apply(samlMetadata: Input[String], `type`: Input[String]): FleetIdentityProvider = {
    val __obj = js.Dynamic.literal(samlMetadata = samlMetadata.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FleetIdentityProvider]
  }
}

