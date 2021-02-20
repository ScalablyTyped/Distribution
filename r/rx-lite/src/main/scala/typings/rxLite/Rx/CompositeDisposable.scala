package typings.rxLite.Rx

import typings.rxCore.Rx.IDisposable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CompositeDisposable extends IDisposable {
  
  def add(item: IDisposable): Unit = js.native
  
  var isDisposed: Boolean = js.native
  
  var length: Double = js.native
  
  def remove(item: IDisposable): Boolean = js.native
  
  def toArray(): js.Array[IDisposable] = js.native
}
object CompositeDisposable {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class CompositeDisposableMutableBuilder[Self <: CompositeDisposable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdd(value: IDisposable => Unit): Self = StObject.set(x, "add", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsDisposed(value: Boolean): Self = StObject.set(x, "isDisposed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemove(value: IDisposable => Boolean): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
    
    @scala.inline
    def setToArray(value: () => js.Array[IDisposable]): Self = StObject.set(x, "toArray", js.Any.fromFunction0(value))
  }
}
