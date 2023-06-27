package typings.sentryReplay

import typings.sentryReplay.anon.Session
import typings.sentryReplay.typesTypesReplayMod.SessionOptions
import typings.sentryReplay.typesTypesReplayMod.Timeouts
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSessionGetSessionMod {
  
  @JSImport("@sentry/replay/types/session/getSession", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getSession(param0: GetSessionParams): Session = ^.asInstanceOf[js.Dynamic].applyDynamic("getSession")(param0.asInstanceOf[js.Any]).asInstanceOf[Session]
  
  trait GetSessionParams
    extends StObject
       with SessionOptions {
    
    /**
      * The current session (e.g. if stickySession is off)
      */
    var currentSession: js.UndefOr[typings.sentryReplay.typesTypesReplayMod.Session] = js.undefined
    
    var timeouts: Timeouts
  }
  object GetSessionParams {
    
    inline def apply(allowBuffering: Boolean, sessionSampleRate: Double, stickySession: Boolean, timeouts: Timeouts): GetSessionParams = {
      val __obj = js.Dynamic.literal(allowBuffering = allowBuffering.asInstanceOf[js.Any], sessionSampleRate = sessionSampleRate.asInstanceOf[js.Any], stickySession = stickySession.asInstanceOf[js.Any], timeouts = timeouts.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetSessionParams]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GetSessionParams] (val x: Self) extends AnyVal {
      
      inline def setCurrentSession(value: typings.sentryReplay.typesTypesReplayMod.Session): Self = StObject.set(x, "currentSession", value.asInstanceOf[js.Any])
      
      inline def setCurrentSessionUndefined: Self = StObject.set(x, "currentSession", js.undefined)
      
      inline def setTimeouts(value: Timeouts): Self = StObject.set(x, "timeouts", value.asInstanceOf[js.Any])
    }
  }
}
