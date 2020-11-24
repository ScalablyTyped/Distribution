package typings.sharepoint.SP

import typings.sharepoint.IEnumerable
import typings.sharepoint.IEnumerator
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
  implicit class BaseCollectionOps[Self <: BaseCollection[_], T] (val x: Self with BaseCollection[T]) extends AnyVal {
    
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
    def setGet_count(value: () => Double): Self = this.set("get_count", js.Any.fromFunction0(value))
    
    @scala.inline
    def setItemAtIndex(value: Double => T): Self = this.set("itemAtIndex", js.Any.fromFunction1(value))
  }
}
