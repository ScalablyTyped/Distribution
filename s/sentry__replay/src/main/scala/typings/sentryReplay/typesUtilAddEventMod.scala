package typings.sentryReplay

import typings.sentryReplay.typesTypesMod.AddEventResult
import typings.sentryReplay.typesTypesMod.RecordingEvent
import typings.sentryReplay.typesTypesMod.ReplayContainer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesUtilAddEventMod {
  
  @JSImport("@sentry/replay/types/util/addEvent", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addEvent(replay: ReplayContainer, event: RecordingEvent): js.Promise[AddEventResult | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("addEvent")(replay.asInstanceOf[js.Any], event.asInstanceOf[js.Any])).asInstanceOf[js.Promise[AddEventResult | Null]]
  inline def addEvent(replay: ReplayContainer, event: RecordingEvent, isCheckout: Boolean): js.Promise[AddEventResult | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("addEvent")(replay.asInstanceOf[js.Any], event.asInstanceOf[js.Any], isCheckout.asInstanceOf[js.Any])).asInstanceOf[js.Promise[AddEventResult | Null]]
}
