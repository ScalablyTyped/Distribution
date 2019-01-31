package typings
package sipDotJsLib.typesSessionMod.InviteServerContextNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var body: js.UndefOr[js.Any] = js.undefined
  // TODO: This may be incorrect
  /** Array of extra headers added to the INVITE. */
  var extraHeaders: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var modifiers: js.UndefOr[
    sipDotJsLib.typesSessionDashDescriptionDashHandlerMod.SessionDescriptionHandlerModifiers
  ] = js.undefined
  var onInfo: js.UndefOr[
    js.Function1[/* request */ sipDotJsLib.typesSipDashMessageMod.IncomingRequest, scala.Unit]
  ] = js.undefined
  var reasonPhrase: js.UndefOr[java.lang.String] = js.undefined
  var rel100: js.UndefOr[scala.Boolean] = js.undefined
  /** Options to pass to SessionDescriptionHandler's getDescription() and setDescription(). */
  var sessionDescriptionHandlerOptions: js.UndefOr[
    sipDotJsLib.typesSessionDashDescriptionDashHandlerMod.SessionDescriptionHandlerOptions
  ] = js.undefined
  var statusCode: js.UndefOr[scala.Double] = js.undefined
}

