package typings.pulumiAws.outputMod.worklink

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FleetIdentityProvider extends js.Object {
  /**
    * The SAML metadata document provided by the customer’s identity provider.
    */
  var samlMetadata: String = js.native
  /**
    * The type of identity provider.
    */
  var `type`: String = js.native
}

object FleetIdentityProvider {
  @scala.inline
  def apply(samlMetadata: String, `type`: String): FleetIdentityProvider = {
    val __obj = js.Dynamic.literal(samlMetadata = samlMetadata.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FleetIdentityProvider]
  }
}

