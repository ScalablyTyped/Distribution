package typings.sentryReplay

import typings.sentryReplay.typesTypesReplayMod.ReplayContainer
import typings.sentryTypes.typesEventMod.Event
import typings.sentryTypes.typesTransportMod.TransportMakeRequestResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesCoreHandlersHandleAfterSendEventMod {
  
  @JSImport("@sentry/replay/types/coreHandlers/handleAfterSendEvent", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def handleAfterSendEvent(replay: ReplayContainer): AfterSendEventCallback = ^.asInstanceOf[js.Dynamic].applyDynamic("handleAfterSendEvent")(replay.asInstanceOf[js.Any]).asInstanceOf[AfterSendEventCallback]
  
  type AfterSendEventCallback = js.Function2[/* event */ Event, /* sendResponse */ TransportMakeRequestResponse | Unit, Unit]
}
