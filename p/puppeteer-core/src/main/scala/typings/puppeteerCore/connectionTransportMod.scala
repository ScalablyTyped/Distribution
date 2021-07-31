package typings.puppeteerCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object connectionTransportMod {
  
  trait ConnectionTransport extends StObject {
    
    def close(): js.Any
    
    var onclose: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onmessage: js.UndefOr[js.Function1[/* message */ String, Unit]] = js.undefined
    
    def send(string: js.Any): js.Any
  }
  object ConnectionTransport {
    
    @scala.inline
    def apply(close: () => js.Any, send: js.Any => js.Any): ConnectionTransport = {
      val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), send = js.Any.fromFunction1(send))
      __obj.asInstanceOf[ConnectionTransport]
    }
    
    @scala.inline
    implicit class ConnectionTransportMutableBuilder[Self <: ConnectionTransport] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClose(value: () => js.Any): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnclose(value: () => Unit): Self = StObject.set(x, "onclose", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOncloseUndefined: Self = StObject.set(x, "onclose", js.undefined)
      
      @scala.inline
      def setOnmessage(value: /* message */ String => Unit): Self = StObject.set(x, "onmessage", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnmessageUndefined: Self = StObject.set(x, "onmessage", js.undefined)
      
      @scala.inline
      def setSend(value: js.Any => js.Any): Self = StObject.set(x, "send", js.Any.fromFunction1(value))
    }
  }
}
