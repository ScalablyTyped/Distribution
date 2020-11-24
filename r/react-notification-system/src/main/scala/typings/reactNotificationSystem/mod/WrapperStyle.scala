package typings.reactNotificationSystem.mod

import typings.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WrapperStyle extends js.Object {
  
  var DefaultStyle: js.UndefOr[CSSProperties] = js.native
}
object WrapperStyle {
  
  @scala.inline
  def apply(): WrapperStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WrapperStyle]
  }
  
  @scala.inline
  implicit class WrapperStyleOps[Self <: WrapperStyle] (val x: Self) extends AnyVal {
    
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
    def setDefaultStyle(value: CSSProperties): Self = this.set("DefaultStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultStyle: Self = this.set("DefaultStyle", js.undefined)
  }
}
