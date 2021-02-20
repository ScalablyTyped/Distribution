package typings.reactNative

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MessageQueue extends StObject {
  
  def getCallableModule(name: String): js.Object = js.native
  
  def registerCallableModule(name: String, module: js.Object): Unit = js.native
  
  def registerLazyCallableModule(name: String, factory: js.Function0[js.Object]): Unit = js.native
}
object MessageQueue {
  
  @scala.inline
  def apply(
    getCallableModule: String => js.Object,
    registerCallableModule: (String, js.Object) => Unit,
    registerLazyCallableModule: (String, js.Function0[js.Object]) => Unit
  ): MessageQueue = {
    val __obj = js.Dynamic.literal(getCallableModule = js.Any.fromFunction1(getCallableModule), registerCallableModule = js.Any.fromFunction2(registerCallableModule), registerLazyCallableModule = js.Any.fromFunction2(registerLazyCallableModule))
    __obj.asInstanceOf[MessageQueue]
  }
  
  @scala.inline
  implicit class MessageQueueMutableBuilder[Self <: MessageQueue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetCallableModule(value: String => js.Object): Self = StObject.set(x, "getCallableModule", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRegisterCallableModule(value: (String, js.Object) => Unit): Self = StObject.set(x, "registerCallableModule", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRegisterLazyCallableModule(value: (String, js.Function0[js.Object]) => Unit): Self = StObject.set(x, "registerLazyCallableModule", js.Any.fromFunction2(value))
  }
}
