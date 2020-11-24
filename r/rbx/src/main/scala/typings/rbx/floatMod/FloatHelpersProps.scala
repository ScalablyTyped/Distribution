package typings.rbx.floatMod

import typings.rbx.rbxStrings.left
import typings.rbx.rbxStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FloatHelpersProps extends js.Object {
  
  var clearfix: js.UndefOr[Boolean] = js.native
  
  var pull: js.UndefOr[left | right] = js.native
}
object FloatHelpersProps {
  
  @scala.inline
  def apply(): FloatHelpersProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FloatHelpersProps]
  }
  
  @scala.inline
  implicit class FloatHelpersPropsOps[Self <: FloatHelpersProps] (val x: Self) extends AnyVal {
    
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
    def setClearfix(value: Boolean): Self = this.set("clearfix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClearfix: Self = this.set("clearfix", js.undefined)
    
    @scala.inline
    def setPull(value: left | right): Self = this.set("pull", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePull: Self = this.set("pull", js.undefined)
  }
}
