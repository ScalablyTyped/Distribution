package typings.sentryReplay

import typings.sentryReplay.typesTypesMod.ReplayContainer
import typings.sentryTypes.typesEventMod.Event
import typings.sentryTypes.typesEventMod.EventHint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesCoreHandlersHandleGlobalEventMod {
  
  @JSImport("@sentry/replay/types/coreHandlers/handleGlobalEvent", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def handleGlobalEventListener(replay: ReplayContainer): js.Function2[/* event */ Event, /* hint */ EventHint, Event | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("handleGlobalEventListener")(replay.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* event */ Event, /* hint */ EventHint, Event | Null]]
  inline def handleGlobalEventListener(replay: ReplayContainer, includeAfterSendEventHandling: Boolean): js.Function2[/* event */ Event, /* hint */ EventHint, Event | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("handleGlobalEventListener")(replay.asInstanceOf[js.Any], includeAfterSendEventHandling.asInstanceOf[js.Any])).asInstanceOf[js.Function2[/* event */ Event, /* hint */ EventHint, Event | Null]]
}
