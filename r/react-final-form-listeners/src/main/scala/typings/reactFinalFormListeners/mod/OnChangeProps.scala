package typings.reactFinalFormListeners.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnChangeProps extends js.Object {
  
  def children(value: js.Any, previous: js.Any): Unit = js.native
  
  var name: String = js.native
}
object OnChangeProps {
  
  @scala.inline
  def apply(children: (js.Any, js.Any) => Unit, name: String): OnChangeProps = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction2(children), name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnChangeProps]
  }
  
  @scala.inline
  implicit class OnChangePropsOps[Self <: OnChangeProps] (val x: Self) extends AnyVal {
    
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
    def setChildren(value: (js.Any, js.Any) => Unit): Self = this.set("children", js.Any.fromFunction2(value))
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
  }
}
