package typings.puppeteerCore.anon

import typings.puppeteerCore.eventEmitterMod.CommonEventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Emitter extends StObject {
  
  var emitter: CommonEventEmitter
  
  var eventName: String | js.Symbol
  
  def handler(args: js.Any*): Unit
}
object Emitter {
  
  @scala.inline
  def apply(emitter: CommonEventEmitter, eventName: String | js.Symbol, handler: /* repeated */ js.Any => Unit): Emitter = {
    val __obj = js.Dynamic.literal(emitter = emitter.asInstanceOf[js.Any], eventName = eventName.asInstanceOf[js.Any], handler = js.Any.fromFunction1(handler))
    __obj.asInstanceOf[Emitter]
  }
  
  @scala.inline
  implicit class EmitterMutableBuilder[Self <: Emitter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEmitter(value: CommonEventEmitter): Self = StObject.set(x, "emitter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventName(value: String | js.Symbol): Self = StObject.set(x, "eventName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHandler(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "handler", js.Any.fromFunction1(value))
  }
}
