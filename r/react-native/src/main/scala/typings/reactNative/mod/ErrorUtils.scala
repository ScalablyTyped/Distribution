package typings.reactNative.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ErrorUtils extends StObject {
  
  def getGlobalHandler(): ErrorHandlerCallback
  
  def setGlobalHandler(callback: ErrorHandlerCallback): Unit
}
object ErrorUtils {
  
  @scala.inline
  def apply(getGlobalHandler: () => ErrorHandlerCallback, setGlobalHandler: ErrorHandlerCallback => Unit): ErrorUtils = {
    val __obj = js.Dynamic.literal(getGlobalHandler = js.Any.fromFunction0(getGlobalHandler), setGlobalHandler = js.Any.fromFunction1(setGlobalHandler))
    __obj.asInstanceOf[ErrorUtils]
  }
  
  @scala.inline
  implicit class ErrorUtilsMutableBuilder[Self <: ErrorUtils] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetGlobalHandler(value: () => ErrorHandlerCallback): Self = StObject.set(x, "getGlobalHandler", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetGlobalHandler(value: ErrorHandlerCallback => Unit): Self = StObject.set(x, "setGlobalHandler", js.Any.fromFunction1(value))
  }
}
