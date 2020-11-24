package typings.scrollmagic.mod

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ControllerInfo extends js.Object {
  
  var container: Element | Null = js.native
  
  var isDocument: Boolean = js.native
  
  var scrollDirection: String = js.native
  
  var scrollPos: Double = js.native
  
  var size: Double = js.native
  
  var vertical: Boolean = js.native
}
object ControllerInfo {
  
  @scala.inline
  def apply(isDocument: Boolean, scrollDirection: String, scrollPos: Double, size: Double, vertical: Boolean): ControllerInfo = {
    val __obj = js.Dynamic.literal(isDocument = isDocument.asInstanceOf[js.Any], scrollDirection = scrollDirection.asInstanceOf[js.Any], scrollPos = scrollPos.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], vertical = vertical.asInstanceOf[js.Any])
    __obj.asInstanceOf[ControllerInfo]
  }
  
  @scala.inline
  implicit class ControllerInfoOps[Self <: ControllerInfo] (val x: Self) extends AnyVal {
    
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
    def setIsDocument(value: Boolean): Self = this.set("isDocument", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollDirection(value: String): Self = this.set("scrollDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollPos(value: Double): Self = this.set("scrollPos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVertical(value: Boolean): Self = this.set("vertical", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainer(value: Element): Self = this.set("container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerNull: Self = this.set("container", null)
  }
}
