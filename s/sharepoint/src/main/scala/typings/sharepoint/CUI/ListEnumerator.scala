package typings.sharepoint.CUI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListEnumerator[T] extends js.Object {
  
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
  implicit class ListEnumeratorOps[Self <: ListEnumerator[_], T] (val x: Self with ListEnumerator[T]) extends AnyVal {
    
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
    def setGet_current(value: () => T): Self = this.set("get_current", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMoveNext(value: () => Boolean): Self = this.set("moveNext", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMovePrevious(value: () => Boolean): Self = this.set("movePrevious", js.Any.fromFunction0(value))
    
    @scala.inline
    def setReset(value: () => scala.Unit): Self = this.set("reset", js.Any.fromFunction0(value))
  }
}
