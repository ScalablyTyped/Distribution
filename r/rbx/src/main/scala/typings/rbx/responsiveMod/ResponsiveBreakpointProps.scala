package typings.rbx.responsiveMod

import typings.rbx.anon.Only
import typings.rbx.anon.OnlyValue
import typings.rbx.anon.`3`
import typings.rbx.anon.`4`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResponsiveBreakpointProps extends js.Object {
  
  var display: js.UndefOr[Only] = js.native
  
  var hide: js.UndefOr[OnlyValue] = js.native
  
  var textAlign: js.UndefOr[`3`] = js.native
  
  var textSize: js.UndefOr[`4`] = js.native
}
object ResponsiveBreakpointProps {
  
  @scala.inline
  def apply(): ResponsiveBreakpointProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResponsiveBreakpointProps]
  }
  
  @scala.inline
  implicit class ResponsiveBreakpointPropsOps[Self <: ResponsiveBreakpointProps] (val x: Self) extends AnyVal {
    
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
    def setDisplay(value: Only): Self = this.set("display", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplay: Self = this.set("display", js.undefined)
    
    @scala.inline
    def setHide(value: OnlyValue): Self = this.set("hide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHide: Self = this.set("hide", js.undefined)
    
    @scala.inline
    def setTextAlign(value: `3`): Self = this.set("textAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextAlign: Self = this.set("textAlign", js.undefined)
    
    @scala.inline
    def setTextSize(value: `4`): Self = this.set("textSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextSize: Self = this.set("textSize", js.undefined)
  }
}
