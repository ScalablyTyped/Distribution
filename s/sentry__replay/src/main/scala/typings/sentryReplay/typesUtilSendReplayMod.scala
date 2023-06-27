package typings.sentryReplay

import typings.sentryReplay.anon.Count
import typings.sentryReplay.typesTypesReplayMod.SendReplayData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesUtilSendReplayMod {
  
  @JSImport("@sentry/replay/types/util/sendReplay", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def sendReplay(replayData: SendReplayData): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("sendReplay")(replayData.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
  inline def sendReplay(replayData: SendReplayData, retryConfig: Count): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("sendReplay")(replayData.asInstanceOf[js.Any], retryConfig.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
}
