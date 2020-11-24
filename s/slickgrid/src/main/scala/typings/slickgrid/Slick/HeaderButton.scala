package typings.slickgrid.Slick

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HeaderButton extends js.Object {
  
  var command: js.UndefOr[String] = js.native
  
  var cssClass: js.UndefOr[String] = js.native
  
  var handler: js.UndefOr[js.Function] = js.native
  
  var image: js.UndefOr[String] = js.native
  
  var showOnHover: js.UndefOr[Boolean] = js.native
  
  var tooltip: js.UndefOr[String] = js.native
}
object HeaderButton {
  
  @scala.inline
  def apply(): HeaderButton = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HeaderButton]
  }
  
  @scala.inline
  implicit class HeaderButtonOps[Self <: HeaderButton] (val x: Self) extends AnyVal {
    
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
    def setCommand(value: String): Self = this.set("command", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCommand: Self = this.set("command", js.undefined)
    
    @scala.inline
    def setCssClass(value: String): Self = this.set("cssClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCssClass: Self = this.set("cssClass", js.undefined)
    
    @scala.inline
    def setHandler(value: js.Function): Self = this.set("handler", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHandler: Self = this.set("handler", js.undefined)
    
    @scala.inline
    def setImage(value: String): Self = this.set("image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImage: Self = this.set("image", js.undefined)
    
    @scala.inline
    def setShowOnHover(value: Boolean): Self = this.set("showOnHover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowOnHover: Self = this.set("showOnHover", js.undefined)
    
    @scala.inline
    def setTooltip(value: String): Self = this.set("tooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTooltip: Self = this.set("tooltip", js.undefined)
  }
}
