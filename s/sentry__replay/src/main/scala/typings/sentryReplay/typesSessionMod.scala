package typings.sentryReplay

import typings.sentryReplay.typesTypesReplayMod.Sampled
import typings.sentryReplay.typesTypesReplayMod.Session
import typings.sentryReplay.typesTypesReplayMod.SessionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSessionMod {
  
  @JSImport("@sentry/replay/types/session", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createSession(param0: SessionOptions): Session = ^.asInstanceOf[js.Dynamic].applyDynamic("createSession")(param0.asInstanceOf[js.Any]).asInstanceOf[Session]
  
  inline def getSessionSampleType(sessionSampleRate: Double, allowBuffering: Boolean): Sampled = (^.asInstanceOf[js.Dynamic].applyDynamic("getSessionSampleType")(sessionSampleRate.asInstanceOf[js.Any], allowBuffering.asInstanceOf[js.Any])).asInstanceOf[Sampled]
}
