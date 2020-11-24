package typings.reactCalendarTimeline.mod

import typings.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetResizeProps extends js.Object {
  
  var leftClassName: js.UndefOr[String] = js.native
  
  var leftStyle: js.UndefOr[CSSProperties] = js.native
  
  var rightClassName: js.UndefOr[String] = js.native
  
  var rightStyle: js.UndefOr[CSSProperties] = js.native
}
object GetResizeProps {
  
  @scala.inline
  def apply(): GetResizeProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetResizeProps]
  }
  
  @scala.inline
  implicit class GetResizePropsOps[Self <: GetResizeProps] (val x: Self) extends AnyVal {
    
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
    def setLeftClassName(value: String): Self = this.set("leftClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLeftClassName: Self = this.set("leftClassName", js.undefined)
    
    @scala.inline
    def setLeftStyle(value: CSSProperties): Self = this.set("leftStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLeftStyle: Self = this.set("leftStyle", js.undefined)
    
    @scala.inline
    def setRightClassName(value: String): Self = this.set("rightClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRightClassName: Self = this.set("rightClassName", js.undefined)
    
    @scala.inline
    def setRightStyle(value: CSSProperties): Self = this.set("rightStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRightStyle: Self = this.set("rightStyle", js.undefined)
  }
}
