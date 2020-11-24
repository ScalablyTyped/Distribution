package typings.rbx.visibilityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VisibilityHelpersProps extends js.Object {
  
  var hidden: js.UndefOr[Boolean] = js.native
  
  var invisible: js.UndefOr[Boolean] = js.native
  
  var srOnly: js.UndefOr[Boolean] = js.native
}
object VisibilityHelpersProps {
  
  @scala.inline
  def apply(): VisibilityHelpersProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VisibilityHelpersProps]
  }
  
  @scala.inline
  implicit class VisibilityHelpersPropsOps[Self <: VisibilityHelpersProps] (val x: Self) extends AnyVal {
    
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
    def setHidden(value: Boolean): Self = this.set("hidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHidden: Self = this.set("hidden", js.undefined)
    
    @scala.inline
    def setInvisible(value: Boolean): Self = this.set("invisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInvisible: Self = this.set("invisible", js.undefined)
    
    @scala.inline
    def setSrOnly(value: Boolean): Self = this.set("srOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSrOnly: Self = this.set("srOnly", js.undefined)
  }
}
