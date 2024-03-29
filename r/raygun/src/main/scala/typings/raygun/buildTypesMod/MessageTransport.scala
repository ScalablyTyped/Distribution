package typings.raygun.buildTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MessageTransport extends StObject {
  
  def send(message: String): Unit
}
object MessageTransport {
  
  inline def apply(send: String => Unit): MessageTransport = {
    val __obj = js.Dynamic.literal(send = js.Any.fromFunction1(send))
    __obj.asInstanceOf[MessageTransport]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MessageTransport] (val x: Self) extends AnyVal {
    
    inline def setSend(value: String => Unit): Self = StObject.set(x, "send", js.Any.fromFunction1(value))
  }
}
