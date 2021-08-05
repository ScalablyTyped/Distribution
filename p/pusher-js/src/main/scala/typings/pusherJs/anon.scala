package typings.pusherJs

import typings.pusherJs.mod.AuthInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Activity extends StObject {
    
    def activity(): Unit
    
    def closed(): Unit
    
    def error(error: js.Any): Unit
    
    def message(message: String): Unit
    
    def ping(): Unit
  }
  object Activity {
    
    inline def apply(
      activity: () => Unit,
      closed: () => Unit,
      error: js.Any => Unit,
      message: String => Unit,
      ping: () => Unit
    ): Activity = {
      val __obj = js.Dynamic.literal(activity = js.Any.fromFunction0(activity), closed = js.Any.fromFunction0(closed), error = js.Any.fromFunction1(error), message = js.Any.fromFunction1(message), ping = js.Any.fromFunction0(ping))
      __obj.asInstanceOf[Activity]
    }
    
    extension [Self <: Activity](x: Self) {
      
      inline def setActivity(value: () => Unit): Self = StObject.set(x, "activity", js.Any.fromFunction0(value))
      
      inline def setClosed(value: () => Unit): Self = StObject.set(x, "closed", js.Any.fromFunction0(value))
      
      inline def setError(value: js.Any => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
      
      inline def setMessage(value: String => Unit): Self = StObject.set(x, "message", js.Any.fromFunction1(value))
      
      inline def setPing(value: () => Unit): Self = StObject.set(x, "ping", js.Any.fromFunction0(value))
    }
  }
  
  trait Authorize extends StObject {
    
    def authorize(
      socketId: String,
      callback: js.Function2[/* errored */ Boolean, /* authInfo */ js.UndefOr[AuthInfo], Unit]
    ): Unit
  }
  object Authorize {
    
    inline def apply(
      authorize: (String, js.Function2[/* errored */ Boolean, /* authInfo */ js.UndefOr[AuthInfo], Unit]) => Unit
    ): Authorize = {
      val __obj = js.Dynamic.literal(authorize = js.Any.fromFunction2(authorize))
      __obj.asInstanceOf[Authorize]
    }
    
    extension [Self <: Authorize](x: Self) {
      
      inline def setAuthorize(
        value: (String, js.Function2[/* errored */ Boolean, /* authInfo */ js.UndefOr[AuthInfo], Unit]) => Unit
      ): Self = StObject.set(x, "authorize", js.Any.fromFunction2(value))
    }
  }
  
  trait Backoff extends StObject {
    
    def backoff(): Unit
    
    def refused(): Unit
    
    def retry(): Unit
    
    def ssl_only(): Unit
  }
  object Backoff {
    
    inline def apply(backoff: () => Unit, refused: () => Unit, retry: () => Unit, ssl_only: () => Unit): Backoff = {
      val __obj = js.Dynamic.literal(backoff = js.Any.fromFunction0(backoff), refused = js.Any.fromFunction0(refused), retry = js.Any.fromFunction0(retry), ssl_only = js.Any.fromFunction0(ssl_only))
      __obj.asInstanceOf[Backoff]
    }
    
    extension [Self <: Backoff](x: Self) {
      
      inline def setBackoff(value: () => Unit): Self = StObject.set(x, "backoff", js.Any.fromFunction0(value))
      
      inline def setRefused(value: () => Unit): Self = StObject.set(x, "refused", js.Any.fromFunction0(value))
      
      inline def setRetry(value: () => Unit): Self = StObject.set(x, "retry", js.Any.fromFunction0(value))
      
      inline def setSsl_only(value: () => Unit): Self = StObject.set(x, "ssl_only", js.Any.fromFunction0(value))
    }
  }
  
  trait Connected extends StObject {
    
    def backoff(): Unit
    
    def connected(handshake: js.Any): Unit
    
    def refused(): Unit
    
    def retry(): Unit
    
    def ssl_only(): Unit
  }
  object Connected {
    
    inline def apply(
      backoff: () => Unit,
      connected: js.Any => Unit,
      refused: () => Unit,
      retry: () => Unit,
      ssl_only: () => Unit
    ): Connected = {
      val __obj = js.Dynamic.literal(backoff = js.Any.fromFunction0(backoff), connected = js.Any.fromFunction1(connected), refused = js.Any.fromFunction0(refused), retry = js.Any.fromFunction0(retry), ssl_only = js.Any.fromFunction0(ssl_only))
      __obj.asInstanceOf[Connected]
    }
    
    extension [Self <: Connected](x: Self) {
      
      inline def setBackoff(value: () => Unit): Self = StObject.set(x, "backoff", js.Any.fromFunction0(value))
      
      inline def setConnected(value: js.Any => Unit): Self = StObject.set(x, "connected", js.Any.fromFunction1(value))
      
      inline def setRefused(value: () => Unit): Self = StObject.set(x, "refused", js.Any.fromFunction0(value))
      
      inline def setRetry(value: () => Unit): Self = StObject.set(x, "retry", js.Any.fromFunction0(value))
      
      inline def setSsl_only(value: () => Unit): Self = StObject.set(x, "ssl_only", js.Any.fromFunction0(value))
    }
  }
}
