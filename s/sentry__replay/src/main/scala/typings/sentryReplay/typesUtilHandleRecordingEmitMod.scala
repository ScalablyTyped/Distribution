package typings.sentryReplay

import typings.sentryReplay.typesTypesMod.RecordingEvent
import typings.sentryReplay.typesTypesMod.ReplayContainer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesUtilHandleRecordingEmitMod {
  
  @JSImport("@sentry/replay/types/util/handleRecordingEmit", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createOptionsEvent(replay: ReplayContainer): RecordingEvent = ^.asInstanceOf[js.Dynamic].applyDynamic("createOptionsEvent")(replay.asInstanceOf[js.Any]).asInstanceOf[RecordingEvent]
  
  inline def getHandleRecordingEmit(replay: ReplayContainer): RecordingEmitCallback = ^.asInstanceOf[js.Dynamic].applyDynamic("getHandleRecordingEmit")(replay.asInstanceOf[js.Any]).asInstanceOf[RecordingEmitCallback]
  
  type RecordingEmitCallback = js.Function2[/* event */ RecordingEvent, /* isCheckout */ js.UndefOr[Boolean], Unit]
}
