package typings.storybookUi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait A11y extends js.Object {
  
  var a11y: Disable = js.native
  
  var actions: Disable = js.native
}
object A11y {
  
  @scala.inline
  def apply(a11y: Disable, actions: Disable): A11y = {
    val __obj = js.Dynamic.literal(a11y = a11y.asInstanceOf[js.Any], actions = actions.asInstanceOf[js.Any])
    __obj.asInstanceOf[A11y]
  }
  
  @scala.inline
  implicit class A11yOps[Self <: A11y] (val x: Self) extends AnyVal {
    
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
    def setA11y(value: Disable): Self = this.set("a11y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActions(value: Disable): Self = this.set("actions", value.asInstanceOf[js.Any])
  }
}
