package typings.rx.Rx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SingleAssignmentDisposable extends StObject {
  
  /** Performs the task of cleaning up resources. */
  def dispose(): Unit
  
  def getDisposable(): IDisposable
  
  /** Is this value disposed. */
  var isDisposed: Boolean
  
  def setDisposable(value: IDisposable): Unit
}
object SingleAssignmentDisposable {
  
  inline def apply(
    dispose: () => Unit,
    getDisposable: () => IDisposable,
    isDisposed: Boolean,
    setDisposable: IDisposable => Unit
  ): SingleAssignmentDisposable = {
    val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction0(dispose), getDisposable = js.Any.fromFunction0(getDisposable), isDisposed = isDisposed.asInstanceOf[js.Any], setDisposable = js.Any.fromFunction1(setDisposable))
    __obj.asInstanceOf[SingleAssignmentDisposable]
  }
  
  extension [Self <: SingleAssignmentDisposable](x: Self) {
    
    inline def setDispose(value: () => Unit): Self = StObject.set(x, "dispose", js.Any.fromFunction0(value))
    
    inline def setGetDisposable(value: () => IDisposable): Self = StObject.set(x, "getDisposable", js.Any.fromFunction0(value))
    
    inline def setIsDisposed(value: Boolean): Self = StObject.set(x, "isDisposed", value.asInstanceOf[js.Any])
    
    inline def setSetDisposable(value: IDisposable => Unit): Self = StObject.set(x, "setDisposable", js.Any.fromFunction1(value))
  }
}
