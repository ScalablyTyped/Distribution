package typings
package socketioDashJwtLib.socketioDashJwtMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JwtAuthOptions extends js.Object {
   // In milliseconds to handle the second round trip.
  var callback: js.UndefOr[scala.Boolean] = js.undefined
   // To disconnect socket server-side without a client-side callback if no valid token.
  var decodedPropertyName: java.lang.String
   // Property to store the docoded token to.
  var handshake: js.UndefOr[scala.Boolean] = js.undefined
  var secret: java.lang.String | JwtSecretFunc
  var timeout: js.UndefOr[scala.Double] = js.undefined
}

object JwtAuthOptions {
  @scala.inline
  def apply(
    decodedPropertyName: java.lang.String,
    secret: java.lang.String | JwtSecretFunc,
    callback: js.UndefOr[scala.Boolean] = js.undefined,
    handshake: js.UndefOr[scala.Boolean] = js.undefined,
    timeout: scala.Int | scala.Double = null
  ): JwtAuthOptions = {
    val __obj = js.Dynamic.literal(decodedPropertyName = decodedPropertyName, secret = secret.asInstanceOf[js.Any])
    if (!js.isUndefined(callback)) __obj.updateDynamic("callback")(callback)
    if (!js.isUndefined(handshake)) __obj.updateDynamic("handshake")(handshake)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[JwtAuthOptions]
  }
}

