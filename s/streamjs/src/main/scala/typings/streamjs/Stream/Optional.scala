package typings.streamjs.Stream

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Optional[T] extends js.Object {
  
  def filter(predicate: js.Function1[/* elem */ T, Boolean]): Optional[T] = js.native
  
  def flatMap[U](mapper: js.Function1[/* elem */ T, Optional[U]]): Optional[U] = js.native
  
  def get(): T = js.native
  
  def ifPresent(consumer: js.Function1[/* elem */ T, Unit]): Unit = js.native
  
  def isPresent(): Boolean = js.native
  
  def map[U](mapper: js.Function1[/* elem */ T, U]): Optional[U] = js.native
  
  def orElse(other: T): T = js.native
  
  def orElseGet(supplier: Supplier[T]): T = js.native
  
  def orElseThrow(error: js.Any): T = js.native
}
object Optional {
  
  @scala.inline
  def apply[T](
    filter: js.Function1[/* elem */ T, Boolean] => Optional[T],
    flatMap: js.Function1[/* elem */ T, Optional[js.Any]] => Optional[js.Any],
    get: () => T,
    ifPresent: js.Function1[/* elem */ T, Unit] => Unit,
    isPresent: () => Boolean,
    map: js.Function1[/* elem */ T, js.Any] => Optional[js.Any],
    orElse: T => T,
    orElseGet: Supplier[T] => T,
    orElseThrow: js.Any => T
  ): Optional[T] = {
    val __obj = js.Dynamic.literal(filter = js.Any.fromFunction1(filter), flatMap = js.Any.fromFunction1(flatMap), get = js.Any.fromFunction0(get), ifPresent = js.Any.fromFunction1(ifPresent), isPresent = js.Any.fromFunction0(isPresent), map = js.Any.fromFunction1(map), orElse = js.Any.fromFunction1(orElse), orElseGet = js.Any.fromFunction1(orElseGet), orElseThrow = js.Any.fromFunction1(orElseThrow))
    __obj.asInstanceOf[Optional[T]]
  }
  
  @scala.inline
  implicit class OptionalOps[Self <: Optional[_], T] (val x: Self with Optional[T]) extends AnyVal {
    
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
    def setFilter(value: js.Function1[/* elem */ T, Boolean] => Optional[T]): Self = this.set("filter", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFlatMap(value: js.Function1[/* elem */ T, Optional[js.Any]] => Optional[js.Any]): Self = this.set("flatMap", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGet(value: () => T): Self = this.set("get", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIfPresent(value: js.Function1[/* elem */ T, Unit] => Unit): Self = this.set("ifPresent", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsPresent(value: () => Boolean): Self = this.set("isPresent", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMap(value: js.Function1[/* elem */ T, js.Any] => Optional[js.Any]): Self = this.set("map", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOrElse(value: T => T): Self = this.set("orElse", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOrElseGet(value: Supplier[T] => T): Self = this.set("orElseGet", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOrElseThrow(value: js.Any => T): Self = this.set("orElseThrow", js.Any.fromFunction1(value))
  }
}
