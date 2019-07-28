package typings.samlp.samlpMod

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
    if (assertionConsumerServiceURL != null) __obj.updateDynamic("assertionConsumerServiceURL")(assertionConsumerServiceURL)
    if (destination != null) __obj.updateDynamic("destination")(destination)
    if (forceAuthn != null) __obj.updateDynamic("forceAuthn")(forceAuthn)
    if (id != null) __obj.updateDynamic("id")(id)
    if (issuer != null) __obj.updateDynamic("issuer")(issuer)
    __obj.asInstanceOf[SamlRequest]
  }
}

