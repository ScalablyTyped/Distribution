package typings.reResizable.mod

import typings.react.mod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HandleComponent extends js.Object {
  
  var bottom: js.UndefOr[ReactElement] = js.native
  
  var bottomLeft: js.UndefOr[ReactElement] = js.native
  
  var bottomRight: js.UndefOr[ReactElement] = js.native
  
  var left: js.UndefOr[ReactElement] = js.native
  
  var right: js.UndefOr[ReactElement] = js.native
  
  var top: js.UndefOr[ReactElement] = js.native
  
  var topLeft: js.UndefOr[ReactElement] = js.native
  
  var topRight: js.UndefOr[ReactElement] = js.native
}
object HandleComponent {
  
  @scala.inline
  def apply(): HandleComponent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HandleComponent]
  }
  
  @scala.inline
  implicit class HandleComponentOps[Self <: HandleComponent] (val x: Self) extends AnyVal {
    
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
    def setBottom(value: ReactElement): Self = this.set("bottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBottom: Self = this.set("bottom", js.undefined)
    
    @scala.inline
    def setBottomLeft(value: ReactElement): Self = this.set("bottomLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBottomLeft: Self = this.set("bottomLeft", js.undefined)
    
    @scala.inline
    def setBottomRight(value: ReactElement): Self = this.set("bottomRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBottomRight: Self = this.set("bottomRight", js.undefined)
    
    @scala.inline
    def setLeft(value: ReactElement): Self = this.set("left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLeft: Self = this.set("left", js.undefined)
    
    @scala.inline
    def setRight(value: ReactElement): Self = this.set("right", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRight: Self = this.set("right", js.undefined)
    
    @scala.inline
    def setTop(value: ReactElement): Self = this.set("top", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTop: Self = this.set("top", js.undefined)
    
    @scala.inline
    def setTopLeft(value: ReactElement): Self = this.set("topLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTopLeft: Self = this.set("topLeft", js.undefined)
    
    @scala.inline
    def setTopRight(value: ReactElement): Self = this.set("topRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTopRight: Self = this.set("topRight", js.undefined)
  }
}
