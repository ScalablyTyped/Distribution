package typings.sentryCore

import typings.sentryCore.apiMod.API
import typings.sentryTypes.eventMod.Event
import typings.sentryTypes.requestMod.SentryRequest
import typings.sentryTypes.sessionMod.Session
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@sentry/core/dist/request", JSImport.Namespace)
@js.native
object requestMod extends js.Object {
  
  def eventToSentryRequest(event: Event, api: API): SentryRequest = js.native
  
  def sessionToSentryRequest(session: Session, api: API): SentryRequest = js.native
}
