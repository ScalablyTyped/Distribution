package typings.raygun.buildTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Transport extends StObject {
  
  def send(options: SendOptions): Unit
}
object Transport {
  
  inline def apply(send: SendOptions => Unit): Transport = {
    val __obj = js.Dynamic.literal(send = js.Any.fromFunction1(send))
    __obj.asInstanceOf[Transport]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Transport] (val x: Self) extends AnyVal {
    
    inline def setSend(value: SendOptions => Unit): Self = StObject.set(x, "send", js.Any.fromFunction1(value))
  }
}
