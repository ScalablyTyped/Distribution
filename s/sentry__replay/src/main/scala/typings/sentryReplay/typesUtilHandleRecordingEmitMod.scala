package typings.sentryReplay

import typings.sentryReplay.typesTypesReplayFrameMod.OptionFrameEvent
import typings.sentryReplay.typesTypesReplayMod.RecordingEvent
import typings.sentryReplay.typesTypesReplayMod.ReplayContainer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesUtilHandleRecordingEmitMod {
  
  @JSImport("@sentry/replay/types/util/handleRecordingEmit", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createOptionsEvent(replay: ReplayContainer): OptionFrameEvent = ^.asInstanceOf[js.Dynamic].applyDynamic("createOptionsEvent")(replay.asInstanceOf[js.Any]).asInstanceOf[OptionFrameEvent]
  
  inline def getHandleRecordingEmit(replay: ReplayContainer): RecordingEmitCallback = ^.asInstanceOf[js.Dynamic].applyDynamic("getHandleRecordingEmit")(replay.asInstanceOf[js.Any]).asInstanceOf[RecordingEmitCallback]
  
  type RecordingEmitCallback = js.Function2[/* event */ RecordingEvent, /* isCheckout */ js.UndefOr[Boolean], Unit]
}
