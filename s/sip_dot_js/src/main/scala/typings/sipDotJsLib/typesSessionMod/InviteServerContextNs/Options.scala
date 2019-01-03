package typings
package sipDotJsLib.typesSessionMod.InviteServerContextNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  // TODO: This may be incorrect
  /** Array of extra headers added to the INVITE. */
  var extraHeaders: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** Options to pass to SessionDescriptionHandler's getDescription() and setDescription(). */
  var sessionDescriptionHandlerOptions: js.UndefOr[
    sipDotJsLib.typesSessionDashDescriptionDashHandlerMod.SessionDescriptionHandlerOptions
  ] = js.undefined
}

