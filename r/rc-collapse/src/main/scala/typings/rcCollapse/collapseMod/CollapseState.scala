package typings.rcCollapse.collapseMod

import typings.react.mod.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CollapseState extends js.Object {
  
  var activeKey: js.Array[Key] = js.native
}
object CollapseState {
  
  @scala.inline
  def apply(activeKey: js.Array[Key]): CollapseState = {
    val __obj = js.Dynamic.literal(activeKey = activeKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[CollapseState]
  }
  
  @scala.inline
  implicit class CollapseStateOps[Self <: CollapseState] (val x: Self) extends AnyVal {
    
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
    def setActiveKeyVarargs(value: Key*): Self = this.set("activeKey", js.Array(value :_*))
    
    @scala.inline
    def setActiveKey(value: js.Array[Key]): Self = this.set("activeKey", value.asInstanceOf[js.Any])
  }
}
