package typings.sentryTypes

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesBrowseroptionsMod {
  
  trait BrowserClientReplayOptions extends StObject {
    
    /**
      * The sample rate for sessions that has had an error occur.
      * This is independent of `sessionSampleRate`.
      * 1.0 will record all sessions and 0 will record none.
      */
    var replaysOnErrorSampleRate: js.UndefOr[Double] = js.undefined
    
    /**
      * The sample rate for session-long replays.
      * 1.0 will record all sessions and 0 will record none.
      */
    var replaysSessionSampleRate: js.UndefOr[Double] = js.undefined
  }
  object BrowserClientReplayOptions {
    
    inline def apply(): BrowserClientReplayOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BrowserClientReplayOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BrowserClientReplayOptions] (val x: Self) extends AnyVal {
      
      inline def setReplaysOnErrorSampleRate(value: Double): Self = StObject.set(x, "replaysOnErrorSampleRate", value.asInstanceOf[js.Any])
      
      inline def setReplaysOnErrorSampleRateUndefined: Self = StObject.set(x, "replaysOnErrorSampleRate", js.undefined)
      
      inline def setReplaysSessionSampleRate(value: Double): Self = StObject.set(x, "replaysSessionSampleRate", value.asInstanceOf[js.Any])
      
      inline def setReplaysSessionSampleRateUndefined: Self = StObject.set(x, "replaysSessionSampleRate", js.undefined)
    }
  }
}
