package typings.proposalRelativeIndexingMethod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Array[T] extends StObject {
  
  /**
    * Takes an integer value and returns the item at that index,
    * allowing for positive and negative integers.
    * Negative integers count back from the last item in the array.
    */
  def at(index: Double): js.UndefOr[T]
}
object Array {
  
  inline def apply[T](at: Double => js.UndefOr[T]): Array[T] = {
    val __obj = js.Dynamic.literal(at = js.Any.fromFunction1(at))
    __obj.asInstanceOf[Array[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Array[?], T] (val x: Self & Array[T]) extends AnyVal {
    
    inline def setAt(value: Double => js.UndefOr[T]): Self = StObject.set(x, "at", js.Any.fromFunction1(value))
  }
}
