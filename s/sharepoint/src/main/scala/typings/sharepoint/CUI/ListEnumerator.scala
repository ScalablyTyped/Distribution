package typings.sharepoint.CUI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListEnumerator[T] extends StObject {
  
  def get_current(): T
  
  def moveNext(): Boolean
  
  def movePrevious(): Boolean
  
  def reset(): scala.Unit
}
object ListEnumerator {
  
  inline def apply[T](
    get_current: () => T,
    moveNext: () => Boolean,
    movePrevious: () => Boolean,
    reset: () => scala.Unit
  ): ListEnumerator[T] = {
    val __obj = js.Dynamic.literal(get_current = js.Any.fromFunction0(get_current), moveNext = js.Any.fromFunction0(moveNext), movePrevious = js.Any.fromFunction0(movePrevious), reset = js.Any.fromFunction0(reset))
    __obj.asInstanceOf[ListEnumerator[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListEnumerator[?], T] (val x: Self & ListEnumerator[T]) extends AnyVal {
    
    inline def setGet_current(value: () => T): Self = StObject.set(x, "get_current", js.Any.fromFunction0(value))
    
    inline def setMoveNext(value: () => Boolean): Self = StObject.set(x, "moveNext", js.Any.fromFunction0(value))
    
    inline def setMovePrevious(value: () => Boolean): Self = StObject.set(x, "movePrevious", js.Any.fromFunction0(value))
    
    inline def setReset(value: () => scala.Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
  }
}
