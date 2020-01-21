package typings.samlp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SamlRequest extends js.Object {
  var assertionConsumerServiceURL: js.UndefOr[String] = js.undefined
  var destination: js.UndefOr[String] = js.undefined
  var forceAuthn: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var issuer: js.UndefOr[String] = js.undefined
}

object SamlRequest {
  @scala.inline
  def apply(
    assertionConsumerServiceURL: String = null,
    destination: String = null,
    forceAuthn: String = null,
    id: String = null,
    issuer: String = null
  ): SamlRequest = {
    val __obj = js.Dynamic.literal()
    if (assertionConsumerServiceURL != null) __obj.updateDynamic("assertionConsumerServiceURL")(assertionConsumerServiceURL.asInstanceOf[js.Any])
    if (destination != null) __obj.updateDynamic("destination")(destination.asInstanceOf[js.Any])
    if (forceAuthn != null) __obj.updateDynamic("forceAuthn")(forceAuthn.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (issuer != null) __obj.updateDynamic("issuer")(issuer.asInstanceOf[js.Any])
    __obj.asInstanceOf[SamlRequest]
  }
}

