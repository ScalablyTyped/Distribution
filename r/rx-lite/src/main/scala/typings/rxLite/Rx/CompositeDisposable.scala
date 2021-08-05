package typings.rxLite.Rx

import typings.rxCore.Rx.IDisposable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompositeDisposable
  extends StObject
     with IDisposable {
  
  def add(item: IDisposable): Unit
  
  var isDisposed: Boolean
  
  var length: Double
  
  def remove(item: IDisposable): Boolean
  
  def toArray(): js.Array[IDisposable]
}
object CompositeDisposable {
  
  inline def apply(
    add: IDisposable => Unit,
    dispose: () => Unit,
    isDisposed: Boolean,
    length: Double,
    remove: IDisposable => Boolean,
    toArray: () => js.Array[IDisposable]
  ): CompositeDisposable = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), dispose = js.Any.fromFunction0(dispose), isDisposed = isDisposed.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], remove = js.Any.fromFunction1(remove), toArray = js.Any.fromFunction0(toArray))
    __obj.asInstanceOf[CompositeDisposable]
  }
  
  extension [Self <: CompositeDisposable](x: Self) {
    
    inline def setAdd(value: IDisposable => Unit): Self = StObject.set(x, "add", js.Any.fromFunction1(value))
    
    inline def setIsDisposed(value: Boolean): Self = StObject.set(x, "isDisposed", value.asInstanceOf[js.Any])
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setRemove(value: IDisposable => Boolean): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
    
    inline def setToArray(value: () => js.Array[IDisposable]): Self = StObject.set(x, "toArray", js.Any.fromFunction0(value))
  }
}
