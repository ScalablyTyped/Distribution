package typings.pusherJs

import typings.pusherJs.mod.AuthInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Activity extends StObject {
    
    def activity(): Unit = js.native
    
    def closed(): Unit = js.native
    
    def error(error: js.Any): Unit = js.native
    
    def message(message: String): Unit = js.native
    
    def ping(): Unit = js.native
  }
  object Activity {
    
    @scala.inline
    def apply(
      activity: () => Unit,
      closed: () => Unit,
      error: js.Any => Unit,
      message: String => Unit,
      ping: () => Unit
    ): Activity = {
      val __obj = js.Dynamic.literal(activity = js.Any.fromFunction0(activity), closed = js.Any.fromFunction0(closed), error = js.Any.fromFunction1(error), message = js.Any.fromFunction1(message), ping = js.Any.fromFunction0(ping))
      __obj.asInstanceOf[Activity]
    }
    
    @scala.inline
    implicit class ActivityMutableBuilder[Self <: Activity] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActivity(value: () => Unit): Self = StObject.set(x, "activity", js.Any.fromFunction0(value))
      
      @scala.inline
      def setClosed(value: () => Unit): Self = StObject.set(x, "closed", js.Any.fromFunction0(value))
      
      @scala.inline
      def setError(value: js.Any => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMessage(value: String => Unit): Self = StObject.set(x, "message", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPing(value: () => Unit): Self = StObject.set(x, "ping", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait Authorize extends StObject {
    
    def authorize(
      socketId: String,
      callback: js.Function2[/* errored */ Boolean, /* authInfo */ js.UndefOr[AuthInfo], Unit]
    ): Unit = js.native
  }
  object Authorize {
    
    @scala.inline
    def apply(
      authorize: (String, js.Function2[/* errored */ Boolean, /* authInfo */ js.UndefOr[AuthInfo], Unit]) => Unit
    ): Authorize = {
      val __obj = js.Dynamic.literal(authorize = js.Any.fromFunction2(authorize))
      __obj.asInstanceOf[Authorize]
    }
    
    @scala.inline
    implicit class AuthorizeMutableBuilder[Self <: Authorize] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuthorize(
        value: (String, js.Function2[/* errored */ Boolean, /* authInfo */ js.UndefOr[AuthInfo], Unit]) => Unit
      ): Self = StObject.set(x, "authorize", js.Any.fromFunction2(value))
    }
  }
  
  @js.native
  trait Backoff extends StObject {
    
    def backoff(): Unit = js.native
    
    def refused(): Unit = js.native
    
    def retry(): Unit = js.native
    
    def ssl_only(): Unit = js.native
  }
  object Backoff {
    
    @scala.inline
    def apply(backoff: () => Unit, refused: () => Unit, retry: () => Unit, ssl_only: () => Unit): Backoff = {
      val __obj = js.Dynamic.literal(backoff = js.Any.fromFunction0(backoff), refused = js.Any.fromFunction0(refused), retry = js.Any.fromFunction0(retry), ssl_only = js.Any.fromFunction0(ssl_only))
      __obj.asInstanceOf[Backoff]
    }
    
    @scala.inline
    implicit class BackoffMutableBuilder[Self <: Backoff] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBackoff(value: () => Unit): Self = StObject.set(x, "backoff", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRefused(value: () => Unit): Self = StObject.set(x, "refused", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRetry(value: () => Unit): Self = StObject.set(x, "retry", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSsl_only(value: () => Unit): Self = StObject.set(x, "ssl_only", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait Connected extends StObject {
    
    def backoff(): Unit = js.native
    
    def connected(handshake: js.Any): Unit = js.native
    
    def refused(): Unit = js.native
    
    def retry(): Unit = js.native
    
    def ssl_only(): Unit = js.native
  }
  object Connected {
    
    @scala.inline
    def apply(
      backoff: () => Unit,
      connected: js.Any => Unit,
      refused: () => Unit,
      retry: () => Unit,
      ssl_only: () => Unit
    ): Connected = {
      val __obj = js.Dynamic.literal(backoff = js.Any.fromFunction0(backoff), connected = js.Any.fromFunction1(connected), refused = js.Any.fromFunction0(refused), retry = js.Any.fromFunction0(retry), ssl_only = js.Any.fromFunction0(ssl_only))
      __obj.asInstanceOf[Connected]
    }
    
    @scala.inline
    implicit class ConnectedMutableBuilder[Self <: Connected] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBackoff(value: () => Unit): Self = StObject.set(x, "backoff", js.Any.fromFunction0(value))
      
      @scala.inline
      def setConnected(value: js.Any => Unit): Self = StObject.set(x, "connected", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRefused(value: () => Unit): Self = StObject.set(x, "refused", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRetry(value: () => Unit): Self = StObject.set(x, "retry", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSsl_only(value: () => Unit): Self = StObject.set(x, "ssl_only", js.Any.fromFunction0(value))
    }
  }
}
