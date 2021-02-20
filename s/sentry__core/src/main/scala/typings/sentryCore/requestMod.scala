package typings.sentryCore

import typings.sentryCore.apiMod.API
import typings.sentryTypes.eventMod.Event
import typings.sentryTypes.requestMod.SentryRequest
import typings.sentryTypes.sessionMod.Session
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object requestMod {
  
  @JSImport("@sentry/core/dist/request", "eventToSentryRequest")
  @js.native
  def eventToSentryRequest(event: Event, api: API): SentryRequest = js.native
  
  @JSImport("@sentry/core/dist/request", "sessionToSentryRequest")
  @js.native
  def sessionToSentryRequest(session: Session, api: API): SentryRequest = js.native
}
