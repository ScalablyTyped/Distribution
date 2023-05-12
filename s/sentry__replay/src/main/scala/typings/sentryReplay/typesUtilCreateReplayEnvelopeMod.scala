package typings.sentryReplay

import typings.sentryTypes.typesDsnMod.DsnComponents
import typings.sentryTypes.typesEnvelopeMod.ReplayEnvelope
import typings.sentryTypes.typesReplayMod.ReplayEvent
import typings.sentryTypes.typesReplayMod.ReplayRecordingData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesUtilCreateReplayEnvelopeMod {
  
  @JSImport("@sentry/replay/types/util/createReplayEnvelope", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createReplayEnvelope(replayEvent: ReplayEvent, recordingData: ReplayRecordingData, dsn: DsnComponents): ReplayEnvelope = (^.asInstanceOf[js.Dynamic].applyDynamic("createReplayEnvelope")(replayEvent.asInstanceOf[js.Any], recordingData.asInstanceOf[js.Any], dsn.asInstanceOf[js.Any])).asInstanceOf[ReplayEnvelope]
  inline def createReplayEnvelope(replayEvent: ReplayEvent, recordingData: ReplayRecordingData, dsn: DsnComponents, tunnel: String): ReplayEnvelope = (^.asInstanceOf[js.Dynamic].applyDynamic("createReplayEnvelope")(replayEvent.asInstanceOf[js.Any], recordingData.asInstanceOf[js.Any], dsn.asInstanceOf[js.Any], tunnel.asInstanceOf[js.Any])).asInstanceOf[ReplayEnvelope]
}
