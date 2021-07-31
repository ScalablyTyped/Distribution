package typings.rx.Rx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompositeDisposable
  extends StObject
     with Disposable {
  
  /**
    * Adds a disposable to the CompositeDisposable or disposes the disposable if the CompositeDisposable is disposed.
    * @param {Mixed} item Disposable to add.
    */
  def add(item: IDisposable): Unit
  
  /**
    * Removes and disposes the first occurrence of a disposable from the CompositeDisposable.
    * @param {Mixed} item Disposable to remove.
    * @returns {Boolean} true if found; false otherwise.
    */
  def remove(item: IDisposable): Unit
}
object CompositeDisposable {
  
  @scala.inline
  def apply(add: IDisposable => Unit, dispose: () => Unit, remove: IDisposable => Unit): CompositeDisposable = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), dispose = js.Any.fromFunction0(dispose), remove = js.Any.fromFunction1(remove))
    __obj.asInstanceOf[CompositeDisposable]
  }
  
  @scala.inline
  implicit class CompositeDisposableMutableBuilder[Self <: CompositeDisposable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdd(value: IDisposable => Unit): Self = StObject.set(x, "add", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemove(value: IDisposable => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
  }
}
