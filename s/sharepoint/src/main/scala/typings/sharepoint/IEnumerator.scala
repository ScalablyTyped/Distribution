package typings.sharepoint

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IEnumerator[T] extends StObject {
  
  def get_current(): T = js.native
  
  def moveNext(): Boolean = js.native
  
  def reset(): Unit = js.native
}
object IEnumerator {
  
  @scala.inline
  def apply[T](get_current: () => T, moveNext: () => Boolean, reset: () => Unit): IEnumerator[T] = {
    val __obj = js.Dynamic.literal(get_current = js.Any.fromFunction0(get_current), moveNext = js.Any.fromFunction0(moveNext), reset = js.Any.fromFunction0(reset))
    __obj.asInstanceOf[IEnumerator[T]]
  }
  
  @scala.inline
  implicit class IEnumeratorMutableBuilder[Self <: IEnumerator[_], T] (val x: Self with IEnumerator[T]) extends AnyVal {
    
    @scala.inline
    def setGet_current(value: () => T): Self = StObject.set(x, "get_current", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMoveNext(value: () => Boolean): Self = StObject.set(x, "moveNext", js.Any.fromFunction0(value))
    
    @scala.inline
    def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
  }
}
