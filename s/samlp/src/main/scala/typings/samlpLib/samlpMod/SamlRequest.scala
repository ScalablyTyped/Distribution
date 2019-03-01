package typings
package samlpLib.samlpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SamlRequest extends js.Object {
  var assertionConsumerServiceURL: js.UndefOr[java.lang.String] = js.undefined
  var destination: js.UndefOr[java.lang.String] = js.undefined
  var forceAuthn: js.UndefOr[java.lang.String] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var issuer: js.UndefOr[java.lang.String] = js.undefined
}

object SamlRequest {
  @scala.inline
  def apply(
    assertionConsumerServiceURL: java.lang.String = null,
    destination: java.lang.String = null,
    forceAuthn: java.lang.String = null,
    id: java.lang.String = null,
    issuer: java.lang.String = null
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

