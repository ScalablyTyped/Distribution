package typings.rax.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConsumerProps[T] extends js.Object {
  
  def children(value: T): RaxNode = js.native
  
  var unstable_observedBits: js.UndefOr[Double] = js.native
}
object ConsumerProps {
  
  @scala.inline
  def apply[T](children: T => RaxNode): ConsumerProps[T] = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    __obj.asInstanceOf[ConsumerProps[T]]
  }
  
  @scala.inline
  implicit class ConsumerPropsOps[Self <: ConsumerProps[_], T] (val x: Self with ConsumerProps[T]) extends AnyVal {
    
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
    def setChildren(value: T => RaxNode): Self = this.set("children", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUnstable_observedBits(value: Double): Self = this.set("unstable_observedBits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnstable_observedBits: Self = this.set("unstable_observedBits", js.undefined)
  }
}
