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

