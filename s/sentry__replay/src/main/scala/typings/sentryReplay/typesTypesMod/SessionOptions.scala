package typings.sentryReplay.typesTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Pick<@sentry/replay.@sentry/replay/types/types.ReplayPluginOptions, 'sessionSampleRate' | 'stickySession'> */
trait SessionOptions extends StObject {
  
  /**
    * Should buffer recordings to be saved later either by error sampling, or by
    * manually calling `flush()`. This is only a factor if not sampled for a
    * session-based replay.
    */
  var allowBuffering: Boolean
  
  var sessionSampleRate: Double
  
  var stickySession: Boolean
}
object SessionOptions {
  
  inline def apply(allowBuffering: Boolean, sessionSampleRate: Double, stickySession: Boolean): SessionOptions = {
    val __obj = js.Dynamic.literal(allowBuffering = allowBuffering.asInstanceOf[js.Any], sessionSampleRate = sessionSampleRate.asInstanceOf[js.Any], stickySession = stickySession.asInstanceOf[js.Any])
    __obj.asInstanceOf[SessionOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SessionOptions] (val x: Self) extends AnyVal {
    
    inline def setAllowBuffering(value: Boolean): Self = StObject.set(x, "allowBuffering", value.asInstanceOf[js.Any])
    
    inline def setSessionSampleRate(value: Double): Self = StObject.set(x, "sessionSampleRate", value.asInstanceOf[js.Any])
    
    inline def setStickySession(value: Boolean): Self = StObject.set(x, "stickySession", value.asInstanceOf[js.Any])
  }
}
