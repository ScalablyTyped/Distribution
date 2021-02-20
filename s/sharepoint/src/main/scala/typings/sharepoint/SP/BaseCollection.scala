package typings.sharepoint.SP

import typings.sharepoint.IEnumerable
import typings.sharepoint.IEnumerator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseCollection[T] extends IEnumerable[T] {
  
  def get_count(): Double = js.native
  
  def itemAtIndex(index: Double): T = js.native
}
object BaseCollection {
  
  @scala.inline
  def apply[T](getEnumerator: () => IEnumerator[T], get_count: () => Double, itemAtIndex: Double => T): BaseCollection[T] = {
    val __obj = js.Dynamic.literal(getEnumerator = js.Any.fromFunction0(getEnumerator), get_count = js.Any.fromFunction0(get_count), itemAtIndex = js.Any.fromFunction1(itemAtIndex))
    __obj.asInstanceOf[BaseCollection[T]]
  }
  
  @scala.inline
  implicit class BaseCollectionMutableBuilder[Self <: BaseCollection[_], T] (val x: Self with BaseCollection[T]) extends AnyVal {
    
    @scala.inline
    def setGet_count(value: () => Double): Self = StObject.set(x, "get_count", js.Any.fromFunction0(value))
    
    @scala.inline
    def setItemAtIndex(value: Double => T): Self = StObject.set(x, "itemAtIndex", js.Any.fromFunction1(value))
  }
}
