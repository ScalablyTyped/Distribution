package typings.sentryCore

import typings.sentryCore.apiMod.API
import typings.sentryTypes.eventMod.Event
import typings.sentryTypes.requestMod.SentryRequest
import typings.sentryTypes.sessionMod.Session
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object requestMod {
  
  @JSImport("@sentry/core/dist/request", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def eventToSentryRequest(event: Event, api: API): SentryRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("eventToSentryRequest")(event.asInstanceOf[js.Any], api.asInstanceOf[js.Any])).asInstanceOf[SentryRequest]
  
  @scala.inline
  def sessionToSentryRequest(session: Session, api: API): SentryRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("sessionToSentryRequest")(session.asInstanceOf[js.Any], api.asInstanceOf[js.Any])).asInstanceOf[SentryRequest]
}
