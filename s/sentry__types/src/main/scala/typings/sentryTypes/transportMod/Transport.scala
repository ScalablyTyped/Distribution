package typings.sentryTypes.transportMod

import typings.sentryTypes.eventMod.Event
import typings.sentryTypes.responseMod.Response
import typings.sentryTypes.sessionMod.Session
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Transport extends js.Object {
  
  /**
    * Call this function to wait until all pending requests have been sent.
    *
    * @param timeout Number time in ms to wait until the buffer is drained.
    */
  def close(): js.Thenable[Boolean] = js.native
  def close(timeout: Double): js.Thenable[Boolean] = js.native
  
  /**
    * Sends the event to the Store endpoint in Sentry.
    *
    * @param event Event that should be sent to Sentry.
    */
  def sendEvent(event: Event): js.Thenable[Response] = js.native
  
  /**
    * Sends the session to the Store endpoint in Sentry.
    *
    * @param body Session that should be sent to Sentry.
    */
  var sendSession: js.UndefOr[js.Function1[/* session */ Session, js.Thenable[Response]]] = js.native
}
