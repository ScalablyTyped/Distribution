package typings.reactBroadcast.mod.Broadcast

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DefaultProps[T] extends js.Object {
  
  def compareValues(prevValue: T, nextValue: T): Boolean = js.native
}
object DefaultProps {
  
  @scala.inline
  def apply[T](compareValues: (T, T) => Boolean): DefaultProps[T] = {
    val __obj = js.Dynamic.literal(compareValues = js.Any.fromFunction2(compareValues))
    __obj.asInstanceOf[DefaultProps[T]]
  }
  
  @scala.inline
  implicit class DefaultPropsOps[Self <: DefaultProps[_], T] (val x: Self with DefaultProps[T]) extends AnyVal {
    
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
    def setCompareValues(value: (T, T) => Boolean): Self = this.set("compareValues", js.Any.fromFunction2(value))
  }
}
