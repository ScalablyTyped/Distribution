package typings.sharepoint.SP

import typings.sharepoint.IEnumerable
import typings.sharepoint.IEnumerator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseCollection[T]
  extends StObject
     with IEnumerable[T] {
  
  def get_count(): Double
  
  def itemAtIndex(index: Double): T
}
object BaseCollection {
  
  inline def apply[T](getEnumerator: () => IEnumerator[T], get_count: () => Double, itemAtIndex: Double => T): BaseCollection[T] = {
    val __obj = js.Dynamic.literal(getEnumerator = js.Any.fromFunction0(getEnumerator), get_count = js.Any.fromFunction0(get_count), itemAtIndex = js.Any.fromFunction1(itemAtIndex))
    __obj.asInstanceOf[BaseCollection[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BaseCollection[?], T] (val x: Self & BaseCollection[T]) extends AnyVal {
    
    inline def setGet_count(value: () => Double): Self = StObject.set(x, "get_count", js.Any.fromFunction0(value))
    
    inline def setItemAtIndex(value: Double => T): Self = StObject.set(x, "itemAtIndex", js.Any.fromFunction1(value))
  }
}
