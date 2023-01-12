package typings.reactNativeWindows

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MessageQueue extends StObject {
  
  def getCallableModule(name: String): js.Object
  
  def registerCallableModule(name: String, module: js.Object): Unit
  
  def registerLazyCallableModule(name: String, factory: js.Function0[js.Object]): Unit
}
object MessageQueue {
  
  inline def apply(
    getCallableModule: String => js.Object,
    registerCallableModule: (String, js.Object) => Unit,
    registerLazyCallableModule: (String, js.Function0[js.Object]) => Unit
  ): MessageQueue = {
    val __obj = js.Dynamic.literal(getCallableModule = js.Any.fromFunction1(getCallableModule), registerCallableModule = js.Any.fromFunction2(registerCallableModule), registerLazyCallableModule = js.Any.fromFunction2(registerLazyCallableModule))
    __obj.asInstanceOf[MessageQueue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MessageQueue] (val x: Self) extends AnyVal {
    
    inline def setGetCallableModule(value: String => js.Object): Self = StObject.set(x, "getCallableModule", js.Any.fromFunction1(value))
    
    inline def setRegisterCallableModule(value: (String, js.Object) => Unit): Self = StObject.set(x, "registerCallableModule", js.Any.fromFunction2(value))
    
    inline def setRegisterLazyCallableModule(value: (String, js.Function0[js.Object]) => Unit): Self = StObject.set(x, "registerLazyCallableModule", js.Any.fromFunction2(value))
  }
}
