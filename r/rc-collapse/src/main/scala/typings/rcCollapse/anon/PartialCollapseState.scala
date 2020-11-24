package typings.rcCollapse.anon

import typings.react.mod.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<rc-collapse.rc-collapse/es/Collapse.CollapseState> */
@js.native
trait PartialCollapseState extends js.Object {
  
  var activeKey: js.UndefOr[js.Array[Key]] = js.native
}
object PartialCollapseState {
  
  @scala.inline
  def apply(): PartialCollapseState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialCollapseState]
  }
  
  @scala.inline
  implicit class PartialCollapseStateOps[Self <: PartialCollapseState] (val x: Self) extends AnyVal {
    
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
    
    @scala.inline
    def deleteActiveKey: Self = this.set("activeKey", js.undefined)
  }
}
