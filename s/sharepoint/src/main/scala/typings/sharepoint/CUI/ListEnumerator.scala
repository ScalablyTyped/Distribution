package typings.sharepoint.CUI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListEnumerator[T] extends StObject {
  
  def get_current(): T = js.native
  
  def moveNext(): Boolean = js.native
  
  def movePrevious(): Boolean = js.native
  
  def reset(): scala.Unit = js.native
}
object ListEnumerator {
  
  @scala.inline
  def apply[T](
    get_current: () => T,
    moveNext: () => Boolean,
    movePrevious: () => Boolean,
    reset: () => scala.Unit
  ): ListEnumerator[T] = {
    val __obj = js.Dynamic.literal(get_current = js.Any.fromFunction0(get_current), moveNext = js.Any.fromFunction0(moveNext), movePrevious = js.Any.fromFunction0(movePrevious), reset = js.Any.fromFunction0(reset))
    __obj.asInstanceOf[ListEnumerator[T]]
  }
  
  @scala.inline
  implicit class ListEnumeratorMutableBuilder[Self <: ListEnumerator[_], T] (val x: Self with ListEnumerator[T]) extends AnyVal {
    
    @scala.inline
    def setGet_current(value: () => T): Self = StObject.set(x, "get_current", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMoveNext(value: () => Boolean): Self = StObject.set(x, "moveNext", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMovePrevious(value: () => Boolean): Self = StObject.set(x, "movePrevious", js.Any.fromFunction0(value))
    
    @scala.inline
    def setReset(value: () => scala.Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
  }
}
