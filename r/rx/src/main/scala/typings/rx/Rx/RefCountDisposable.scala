package typings.rx.Rx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RefCountDisposable
  extends StObject
     with Disposable {
  
  /**
    * Returns a dependent disposable that when disposed decreases the refcount on the underlying disposable.
    * @returns {Disposable} A dependent disposable contributing to the reference count that manages the underlying disposable's lifetime.
    */
  def getDisposable(): IDisposable
  
  /** Is this value disposed. */
  @JSName("isDisposed")
  var isDisposed_RefCountDisposable: Boolean
}
object RefCountDisposable {
  
  inline def apply(dispose: () => Unit, getDisposable: () => IDisposable, isDisposed: Boolean): RefCountDisposable = {
    val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction0(dispose), getDisposable = js.Any.fromFunction0(getDisposable), isDisposed = isDisposed.asInstanceOf[js.Any])
    __obj.asInstanceOf[RefCountDisposable]
  }
  
  extension [Self <: RefCountDisposable](x: Self) {
    
    inline def setGetDisposable(value: () => IDisposable): Self = StObject.set(x, "getDisposable", js.Any.fromFunction0(value))
    
    inline def setIsDisposed(value: Boolean): Self = StObject.set(x, "isDisposed", value.asInstanceOf[js.Any])
  }
}
