package typings.reactCircularProgressbar.typesMod

import typings.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CircularProgressbarStyles extends js.Object {
  
  var background: js.UndefOr[CSSProperties] = js.native
  
  var path: js.UndefOr[CSSProperties] = js.native
  
  var root: js.UndefOr[CSSProperties] = js.native
  
  var text: js.UndefOr[CSSProperties] = js.native
  
  var trail: js.UndefOr[CSSProperties] = js.native
}
object CircularProgressbarStyles {
  
  @scala.inline
  def apply(): CircularProgressbarStyles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CircularProgressbarStyles]
  }
  
  @scala.inline
  implicit class CircularProgressbarStylesOps[Self <: CircularProgressbarStyles] (val x: Self) extends AnyVal {
    
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
    def setBackground(value: CSSProperties): Self = this.set("background", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackground: Self = this.set("background", js.undefined)
    
    @scala.inline
    def setPath(value: CSSProperties): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    
    @scala.inline
    def setRoot(value: CSSProperties): Self = this.set("root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
    
    @scala.inline
    def setText(value: CSSProperties): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    
    @scala.inline
    def setTrail(value: CSSProperties): Self = this.set("trail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrail: Self = this.set("trail", js.undefined)
  }
}
