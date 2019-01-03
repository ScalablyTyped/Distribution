package typings
package sipDotJsLib.typesSessionMod.InviteClientContextNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /** Array of extra headers added to the INVITE. */
  var extraHeaders: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** If true, send INVITE without SDP. */
  var inviteWithoutSdp: js.UndefOr[scala.Boolean] = js.undefined
  /** Deprecated */
  var params: js.UndefOr[sipDotJsLib.Anon_TodisplayName] = js.undefined
  /** Options to pass to SessionDescriptionHandler's getDescription() and setDescription(). */
  var sessionDescriptionHandlerOptions: js.UndefOr[
    sipDotJsLib.typesSessionDashDescriptionDashHandlerMod.SessionDescriptionHandlerOptions
  ] = js.undefined
}

