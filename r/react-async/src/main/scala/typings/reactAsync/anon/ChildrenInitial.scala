package typings.reactAsync.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChildrenInitial extends js.Object {
  
  var children: js.Any = js.native
  
  var initial: js.Any = js.native
  
  var state: js.Any = js.native
}
object ChildrenInitial {
  
  @scala.inline
  def apply(children: js.Any, initial: js.Any, state: js.Any): ChildrenInitial = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], initial = initial.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChildrenInitial]
  }
  
  @scala.inline
  implicit class ChildrenInitialOps[Self <: ChildrenInitial] (val x: Self) extends AnyVal {
    
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
    def setChildren(value: js.Any): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitial(value: js.Any): Self = this.set("initial", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: js.Any): Self = this.set("state", value.asInstanceOf[js.Any])
  }
}
