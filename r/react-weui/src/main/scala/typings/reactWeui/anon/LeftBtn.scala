package typings.reactWeui.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LeftBtn extends js.Object {
  
  var leftBtn: String = js.native
  
  var rightBtn: String = js.native
}
object LeftBtn {
  
  @scala.inline
  def apply(leftBtn: String, rightBtn: String): LeftBtn = {
    val __obj = js.Dynamic.literal(leftBtn = leftBtn.asInstanceOf[js.Any], rightBtn = rightBtn.asInstanceOf[js.Any])
    __obj.asInstanceOf[LeftBtn]
  }
  
  @scala.inline
  implicit class LeftBtnOps[Self <: LeftBtn] (val x: Self) extends AnyVal {
    
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
    def setLeftBtn(value: String): Self = this.set("leftBtn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRightBtn(value: String): Self = this.set("rightBtn", value.asInstanceOf[js.Any])
  }
}
