package typings.rcSlider.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClickFocused extends js.Object {
  
  var clickFocused: Boolean = js.native
}
object ClickFocused {
  
  @scala.inline
  def apply(clickFocused: Boolean): ClickFocused = {
    val __obj = js.Dynamic.literal(clickFocused = clickFocused.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClickFocused]
  }
  
  @scala.inline
  implicit class ClickFocusedOps[Self <: ClickFocused] (val x: Self) extends AnyVal {
    
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
    def setClickFocused(value: Boolean): Self = this.set("clickFocused", value.asInstanceOf[js.Any])
  }
}
