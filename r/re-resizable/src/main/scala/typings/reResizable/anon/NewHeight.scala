package typings.reResizable.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NewHeight extends js.Object {
  
  var newHeight: Double = js.native
  
  var newWidth: Double = js.native
}
object NewHeight {
  
  @scala.inline
  def apply(newHeight: Double, newWidth: Double): NewHeight = {
    val __obj = js.Dynamic.literal(newHeight = newHeight.asInstanceOf[js.Any], newWidth = newWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[NewHeight]
  }
  
  @scala.inline
  implicit class NewHeightOps[Self <: NewHeight] (val x: Self) extends AnyVal {
    
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
    def setNewHeight(value: Double): Self = this.set("newHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewWidth(value: Double): Self = this.set("newWidth", value.asInstanceOf[js.Any])
  }
}
