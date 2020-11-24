package typings.rcVirtualList.listMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListRef extends js.Object {
  
  var scrollTo: ScrollTo = js.native
}
object ListRef {
  
  @scala.inline
  def apply(scrollTo: /* arg */ Double | ScrollConfig => Unit): ListRef = {
    val __obj = js.Dynamic.literal(scrollTo = js.Any.fromFunction1(scrollTo))
    __obj.asInstanceOf[ListRef]
  }
  
  @scala.inline
  implicit class ListRefOps[Self <: ListRef] (val x: Self) extends AnyVal {
    
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
    def setScrollTo(value: /* arg */ Double | ScrollConfig => Unit): Self = this.set("scrollTo", js.Any.fromFunction1(value))
  }
}
