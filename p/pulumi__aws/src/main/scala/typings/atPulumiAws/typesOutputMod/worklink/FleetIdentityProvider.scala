package typings.atPulumiAws.typesOutputMod.worklink

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FleetIdentityProvider extends js.Object {
  /**
    * The SAML metadata document provided by the customer’s identity provider.
    */
  var samlMetadata: String
  /**
    * The type of identity provider.
    */
  var `type`: String
}

object FleetIdentityProvider {
  @scala.inline
  def apply(samlMetadata: String, `type`: String): FleetIdentityProvider = {
    val __obj = js.Dynamic.literal(samlMetadata = samlMetadata)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[FleetIdentityProvider]
  }
}

