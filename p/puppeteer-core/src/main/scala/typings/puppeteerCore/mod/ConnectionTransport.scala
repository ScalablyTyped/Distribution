package typings.puppeteerCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConnectionTransport extends StObject {
  
  def close(): Unit
  
  var onclose: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var onmessage: js.UndefOr[js.Function1[/* message */ String, Unit]] = js.undefined
  
  def send(message: String): Unit
}
object ConnectionTransport {
  
  inline def apply(close: () => Unit, send: String => Unit): ConnectionTransport = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), send = js.Any.fromFunction1(send))
    __obj.asInstanceOf[ConnectionTransport]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConnectionTransport] (val x: Self) extends AnyVal {
    
    inline def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
    
    inline def setOnclose(value: () => Unit): Self = StObject.set(x, "onclose", js.Any.fromFunction0(value))
    
    inline def setOncloseUndefined: Self = StObject.set(x, "onclose", js.undefined)
    
    inline def setOnmessage(value: /* message */ String => Unit): Self = StObject.set(x, "onmessage", js.Any.fromFunction1(value))
    
    inline def setOnmessageUndefined: Self = StObject.set(x, "onmessage", js.undefined)
    
    inline def setSend(value: String => Unit): Self = StObject.set(x, "send", js.Any.fromFunction1(value))
  }
}
