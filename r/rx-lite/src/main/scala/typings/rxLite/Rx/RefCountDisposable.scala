package typings.rxLite.Rx

import typings.rxCore.Rx.IDisposable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RefCountDisposable
  extends StObject
     with IDisposable {
  
  def getDisposable(): IDisposable
  
  var isDisposed: Boolean
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
