package typings.sentryReplay

import typings.sentryReplay.typesTypesReplayMod.ReplayContainer
import typings.sentryTypes.typesEventMod.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesCoreHandlersUtilShouldSampleForBufferEventMod {
  
  @JSImport("@sentry/replay/types/coreHandlers/util/shouldSampleForBufferEvent", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def shouldSampleForBufferEvent(replay: ReplayContainer, event: Event): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("shouldSampleForBufferEvent")(replay.asInstanceOf[js.Any], event.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
