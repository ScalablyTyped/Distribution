package typings.rcResizeObserver.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OffsetHeight extends js.Object {
  
  var height: Double = js.native
  
  var offsetHeight: Double = js.native
  
  var offsetWidth: Double = js.native
  
  var width: Double = js.native
}
object OffsetHeight {
  
  @scala.inline
  def apply(height: Double, offsetHeight: Double, offsetWidth: Double, width: Double): OffsetHeight = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], offsetHeight = offsetHeight.asInstanceOf[js.Any], offsetWidth = offsetWidth.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[OffsetHeight]
  }
  
  @scala.inline
  implicit class OffsetHeightOps[Self <: OffsetHeight] (val x: Self) extends AnyVal {
    
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
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetHeight(value: Double): Self = this.set("offsetHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetWidth(value: Double): Self = this.set("offsetWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
  }
}
