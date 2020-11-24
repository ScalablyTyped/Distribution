package typings.sharepoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IEnumerable[T] extends js.Object {
  
  def getEnumerator(): IEnumerator[T] = js.native
}
object IEnumerable {
  
  @scala.inline
  def apply[T](getEnumerator: () => IEnumerator[T]): IEnumerable[T] = {
    val __obj = js.Dynamic.literal(getEnumerator = js.Any.fromFunction0(getEnumerator))
    __obj.asInstanceOf[IEnumerable[T]]
  }
  
  @scala.inline
  implicit class IEnumerableOps[Self <: IEnumerable[_], T] (val x: Self with IEnumerable[T]) extends AnyVal {
    
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
    def setGetEnumerator(value: () => IEnumerator[T]): Self = this.set("getEnumerator", js.Any.fromFunction0(value))
  }
}
