package typings.rxLite.Rx

import typings.rxCore.Rx.IDisposable
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
  implicit class CompositeDisposableOps[Self <: CompositeDisposable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAdd(value: IDisposable => Unit): Self = this.set("add", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsDisposed(value: Boolean): Self = this.set("isDisposed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemove(value: IDisposable => Boolean): Self = this.set("remove", js.Any.fromFunction1(value))
    
    @scala.inline
    def setToArray(value: () => js.Array[IDisposable]): Self = this.set("toArray", js.Any.fromFunction0(value))
  }
}
