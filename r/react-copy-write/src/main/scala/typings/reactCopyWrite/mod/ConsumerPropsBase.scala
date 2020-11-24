package typings.reactCopyWrite.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConsumerPropsBase[T] extends js.Object {
  
  var select: js.UndefOr[js.Array[SelectorFn[T]]] = js.native
}
object ConsumerPropsBase {
  
  @scala.inline
  def apply[T](): ConsumerPropsBase[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConsumerPropsBase[T]]
  }
  
  @scala.inline
  implicit class ConsumerPropsBaseOps[Self <: ConsumerPropsBase[_], T] (val x: Self with ConsumerPropsBase[T]) extends AnyVal {
    
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
    def setSelectVarargs(value: SelectorFn[T]*): Self = this.set("select", js.Array(value :_*))
    
    @scala.inline
    def setSelect(value: js.Array[SelectorFn[T]]): Self = this.set("select", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelect: Self = this.set("select", js.undefined)
  }
}
